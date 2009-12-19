package com.googlecode.pseudo.compiler.analysis;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;


import com.googlecode.pseudo.compiler.LocationMap;
import com.googlecode.pseudo.compiler.Type;
import com.googlecode.pseudo.compiler.LocationMap.Location;
import com.googlecode.pseudo.compiler.Scopes.Scope;
import com.googlecode.pseudo.compiler.Scopes.Table;
import com.googlecode.pseudo.compiler.Types.PrimitiveType;
import com.googlecode.pseudo.compiler.analysis.ErrorReporter.ErrorKind;
import com.googlecode.pseudo.compiler.ast.Block;
import com.googlecode.pseudo.compiler.ast.ConstDef;
import com.googlecode.pseudo.compiler.ast.FunctionDef;
import com.googlecode.pseudo.compiler.ast.FunctionId;
import com.googlecode.pseudo.compiler.ast.FunctionIdId;
import com.googlecode.pseudo.compiler.ast.FunctionIdReturn;
import com.googlecode.pseudo.compiler.ast.Instr;
import com.googlecode.pseudo.compiler.ast.InstrBlock;
import com.googlecode.pseudo.compiler.ast.Node;
import com.googlecode.pseudo.compiler.ast.Parameter;
import com.googlecode.pseudo.compiler.ast.ParameterNaked;
import com.googlecode.pseudo.compiler.ast.ParameterTyped;
import com.googlecode.pseudo.compiler.ast.Parameters;
import com.googlecode.pseudo.compiler.ast.RecordDef;
import com.googlecode.pseudo.compiler.ast.RecordInit;
import com.googlecode.pseudo.compiler.ast.Start;
import com.googlecode.pseudo.compiler.ast.UsingDef;
import com.googlecode.pseudo.compiler.ast.Visitor;
import com.googlecode.pseudo.compiler.model.Constant;
import com.googlecode.pseudo.compiler.model.Field;
import com.googlecode.pseudo.compiler.model.Record;
import com.googlecode.pseudo.compiler.model.Script;
import com.googlecode.pseudo.compiler.model.Functions.Builtin;
import com.googlecode.pseudo.compiler.model.Functions.UserFunction;
import com.googlecode.pseudo.compiler.model.Vars.MemberVar;
import com.googlecode.pseudo.compiler.model.Vars.ParameterVar;
import com.googlecode.pseudo.runtime.lib.Bits;
import com.googlecode.pseudo.runtime.lib.Builtins;
import com.googlecode.pseudo.runtime.lib.IO;
import com.googlecode.pseudo.runtime.lib.MathExtra;

public class Enter extends Visitor<Void, Void, RuntimeException> {
  private final ArrayList<RecordDef> pendingRecordDefs =
    new ArrayList<RecordDef>();
  private final ArrayList<FunctionDef> pendingFunctionDefs =
    new ArrayList<FunctionDef>();
  private final ArrayList<ConstDef> pendingConstDefs =
    new ArrayList<ConstDef>();
  
  private final Script script;
   
  final ErrorReporter errorReporter;
  private final LocationMap locationMap;
  final EnterType enterType;
  
  public Enter(Script script, ErrorReporter errorReporter, LocationMap locationMap) {
    this.script = script;
    this.errorReporter = errorReporter;
    this.locationMap = locationMap;
    this.enterType = new EnterType(errorReporter);
  }
  
  // --- main entry
  
  public void enter(Start start) {
    // enter default builtins
    ClassImporter.importClass(start, Builtins.class, script.getUsingTable(), errorReporter);
    
    // enter usings and types
    enter(start, null);
    
    // enter pending records
    for(RecordDef recordDef:pendingRecordDefs) {
      enterPendingRecordDef(recordDef);
    }
    
    // enter pending functions
    Scope<MemberVar,UserFunction> functionScope =
      new Scope<MemberVar, UserFunction>(script.getFunctionTable(),
          new Scope<MemberVar, Builtin>(script.getUsingTable(), null));
    for(FunctionDef functionDef:pendingFunctionDefs) {
      enterPendingFunctionDef(functionDef, functionScope);
    }
    
    // enter pending constants
    Scope<MemberVar,Constant> constantScope =
      new Scope<MemberVar, Constant>(script.getConstantTable(), functionScope);
    for(ConstDef constDef:pendingConstDefs) {
      enterPendingConstDef(constDef, constantScope);
    }
    
    script.setGlobalScope(constantScope);
    
    // if main block location is not defined, i.e. if there is no block
    Block mainBlock = script.getMainBlock();
    if (locationMap.getLocation(mainBlock) == null) {
      locationMap.setLocation(mainBlock, locationMap.getLocation(start));
    }
  }
  
  void enter(Node node, Void unused) {
    node.accept(this, unused);
  }
  
  void enterAll(Node node, Void unused) {
    for(Node n:node.nodeList()) {
      if (n.isToken())
        continue;
      enter(n, unused);
    }
  }
  
  
  // --- default visit
  
  @Override
  protected Void visit(Node node, Void unused) {
    enterAll(node, unused);
    return null;
  }
  
  
  // --- visit script top level member
  
  @Override
  public Void visit(UsingDef usingDef, Void unused) {
    String name = usingDef.getId().getValue();
    if ("math".equals(name)) {
      ClassImporter.importClass(usingDef, Math.class, script.getUsingTable(), errorReporter);
      ClassImporter.importClass(usingDef, MathExtra.class, script.getUsingTable(), errorReporter);
    } else
    if ("bits".equals(name)) {
      ClassImporter.importClass(usingDef, Bits.class, script.getUsingTable(), errorReporter);
    } else
    if ("io".equals(name)) {
      ClassImporter.importClass(usingDef, IO.class, script.getUsingTable(), errorReporter);
    }
    else {
      errorReporter.error(ErrorKind.unknown_using, usingDef, name);
      // error recovery
    }
    return null;
  }
  
  @Override
  public Void visit(RecordDef recordDef, Void unused) {
    String name = recordDef.getId().getValue();
    Record record = new Record(name, recordDef);
    
    Type oldType = script.getTypeTable().register(record);
    if (oldType != null) {
      errorReporter.error(ErrorKind.dupricate_record, recordDef, name);
      // error recovery
      return null;
    } 
      
    script.getRecordTable().register(record);
    pendingRecordDefs.add(recordDef);  
    return null;
  }
  
  @Override
  public Void visit(FunctionDef functionDef, Void unused) {
    pendingFunctionDefs.add(functionDef);
    return null;
  }
  
  @Override
  public Void visit(ConstDef constDef, Void unused) {
    pendingConstDefs.add(constDef);
    return null;
  }
  
  @Override
  public Void visit(Block block, Void unused) {
    // store all top-level blocks in a unique main block
    InstrBlock instrBlock = new InstrBlock(block);
    Location location = locationMap.getLocation(block);
    locationMap.setLocation(instrBlock, location);
    
    Block mainBlock = script.getMainBlock();
    if (locationMap.getLocation(mainBlock) == null) {
      locationMap.setLocation(mainBlock, location);
    }
    mainBlock.getInstrStar().add(instrBlock);
    return null;
  }
  
  // --- enter pending records, functions and constants
  
  public void enterPendingRecordDef(RecordDef recordDef) {
    String name = recordDef.getId().getValue();
    Record record = script.getRecordTable().lookup(name);
    if (record == null) { // error recovery
      return;
    }
    
    // enter fields
    Table<Type> typeTable = script.getTypeTable();
    for(com.googlecode.pseudo.compiler.ast.Field fieldNode: recordDef.getFieldStar()) {
      String fieldName = fieldNode.getId().getValue();
      
      Type fieldType = enterType.enterType(fieldNode.getType(), typeTable);
      Field field = new Field(fieldType, fieldName);
      Field oldField = record.getFieldTable().register(field);
      if (oldField != null) {
        errorReporter.error(ErrorKind.duplicate_field, fieldNode, fieldName);
        continue;
      }
    }
    
    // enter init function
    RecordInit init = recordDef.getRecordInitOptional();
    UserFunction initFunction;
    if (init != null) {
      Table<ParameterVar> parameterVarTable = getParameterVarTable(init.getParameters(), enterType, typeTable);
      initFunction = new UserFunction("<init>", parameterVarTable, PrimitiveType.VOID, init.getBlock());
    } else {
      // create an empty init function
      Block block = new Block(Collections.<Instr>emptyList());
      locationMap.setLocation(block, locationMap.getLocation(recordDef));
      
      initFunction = new UserFunction(name, new Table<ParameterVar>(), PrimitiveType.VOID, block);
    }
    record.setInitFunction(initFunction);
  }
  
  void enterPendingFunctionDef(FunctionDef functionDef, Scope<MemberVar,UserFunction> functionScope) {
    Table<Type> typeTable = script.getTypeTable();
    Table<ParameterVar> parameterVarTable = getParameterVarTable(functionDef.getParameters(), enterType, typeTable);
    
    Entry<String, Type> entry = getFunctionNameAndReturnType(functionDef.getFunctionId(), enterType, typeTable);
    String name = entry.getKey();
    Type returnType = entry.getValue();
    
    UserFunction function = new UserFunction(name, parameterVarTable, returnType, functionDef.getBlock());
    
    UserFunction oldFunction = functionScope.register(function);
    if (oldFunction != null) {
      errorReporter.error(ErrorKind.duplicate_function, functionDef, name);
      // error recovery
      return;
    }
  }
  
  void enterPendingConstDef(ConstDef constDef, Scope<MemberVar,Constant> constantScope) {
    String name = constDef.getId().getValue();
    
    Constant constant = new Constant(name, constDef);
    Constant oldConstant = constantScope.register(constant);
    if (oldConstant != null) {
      errorReporter.error(ErrorKind.duplicate_member_variable, constDef, name);
      // error recovery
      return;
    }
  }
  
  
  // ---
  
  static Entry<String, Type> getFunctionNameAndReturnType(FunctionId functionId, final EnterType enterType, Table<Type> typeTable) {
    Visitor<Entry<String, Type>, Table<Type>, RuntimeException> functionIdVisitor =
      new Visitor<Entry<String,Type>, Table<Type>, RuntimeException>() {
    
      @Override
      public Entry<String, Type> visit(FunctionIdId function_id_id, Table<Type> typeTable) {
        String name = function_id_id.getId().getValue();
        return new AbstractMap.SimpleImmutableEntry<String, Type>(name, PrimitiveType.ANY);
      }
      @Override
        public Entry<String, Type> visit(FunctionIdReturn function_id_return, Table<Type> typeTable) {
        String name = function_id_return.getId().getValue();
        Type type = enterType.enterType(function_id_return.getReturnType(), typeTable);
        return new AbstractMap.SimpleImmutableEntry<String, Type>(name, type);
      }
    };
    
    return functionId.accept(functionIdVisitor, typeTable);
  }
  
  static Table<ParameterVar> getParameterVarTable(Parameters parameters, final EnterType enterType, Table<Type> typeTable) {
    Visitor<ParameterVar, Table<Type>, RuntimeException> visitorParameterVar =
      new Visitor<ParameterVar, Table<Type>, RuntimeException>() {
      
      @Override
      public ParameterVar visit(ParameterNaked parameter_naked, Table<Type> typeTable) {
        String name = parameter_naked.getId().getValue();
        return new ParameterVar(PrimitiveType.ANY, name);
      }
      @Override
      public ParameterVar visit(ParameterTyped parameter_typed, Table<Type> typeTable) {
        String name = parameter_typed.getId().getValue();
        Type type = enterType.enterType(parameter_typed.getType(), typeTable);
        return new ParameterVar(type, name);
      }
    };
    
    Table<ParameterVar> parameterVars = new Table<ParameterVar>();
    for(Parameter parameter: parameters.getParameterStar()) {
      ParameterVar var = parameter.accept(visitorParameterVar, typeTable);
      ParameterVar oldVar = parameterVars.register(var);
      if (oldVar != null) {
        enterType.getErrorReporter().error(ErrorKind.duplicate_parameter, parameter, var.getName());
      }
    }
    return parameterVars;
  }
}
