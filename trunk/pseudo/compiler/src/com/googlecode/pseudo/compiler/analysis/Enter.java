package com.googlecode.pseudo.compiler.analysis;

import java.util.ArrayList;
import java.util.Collections;

import code.googlecode.pseudo.compiler.model.Field;
import code.googlecode.pseudo.compiler.model.Record;
import code.googlecode.pseudo.compiler.model.Script;
import code.googlecode.pseudo.compiler.model.Functions.NamedFunction;
import code.googlecode.pseudo.compiler.model.Functions.UserFunction;
import code.googlecode.pseudo.compiler.model.Vars.ParameterVar;

import com.googlecode.pseudo.compiler.LocationMap;
import com.googlecode.pseudo.compiler.Type;
import com.googlecode.pseudo.compiler.LocationMap.Location;
import com.googlecode.pseudo.compiler.Scopes.Table;
import com.googlecode.pseudo.compiler.Types.PrimitiveType;
import com.googlecode.pseudo.compiler.analysis.ErrorReporter.ErrorKind;
import com.googlecode.pseudo.compiler.ast.Block;
import com.googlecode.pseudo.compiler.ast.FunctionDef;
import com.googlecode.pseudo.compiler.ast.FunctionRtype;
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
import com.googlecode.pseudo.compiler.ast.Visitor;

public class Enter extends Visitor<Void, Void, RuntimeException> {
  private final ArrayList<RecordDef> pendingRecordDefs =
    new ArrayList<RecordDef>();
  private final ArrayList<FunctionDef> pendingFunctionDefs =
    new ArrayList<FunctionDef>();
  
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
    enter(start, null);
    
    // enter pending record defs
    for(RecordDef recordDef:pendingRecordDefs) {
      enterPendingRecordDef(recordDef);
    }
    
    // enter pending functions
    for(FunctionDef functionDef:pendingFunctionDefs) {
      enterPendingFunctionDef(functionDef);
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
  
  // --- enter pending records and functions
  
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
  
  private void enterPendingFunctionDef(FunctionDef functionDef) {
    String name = functionDef.getId().getValue();
    Table<Type> typeTable = script.getTypeTable();
    Table<ParameterVar> parameterVarTable = getParameterVarTable(functionDef.getParameters(), enterType, typeTable);
    
    Type returnType;
    FunctionRtype functionRtypeOptional = functionDef.getFunctionRtypeOptional();
    if (functionRtypeOptional != null) {
      returnType = enterType.enterType(functionRtypeOptional.getReturnType(), typeTable);
    } else {
      returnType = PrimitiveType.ANY;
    }
    
    UserFunction function = new UserFunction(name, parameterVarTable, returnType, functionDef.getBlock());
    
    NamedFunction oldfunction = script.getFunctionScope().register(function);
    if (oldfunction != null) {
      errorReporter.error(ErrorKind.duplicate_function, functionDef, name);
      // error recovery
      return;
    }
  }
  
  // ---
  
  public static Table<ParameterVar> getParameterVarTable(Parameters parameters, final EnterType enterType, Table<Type> typeTable) {
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
