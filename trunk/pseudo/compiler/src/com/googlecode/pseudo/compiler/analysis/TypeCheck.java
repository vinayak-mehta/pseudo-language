package com.googlecode.pseudo.compiler.analysis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import code.googlecode.pseudo.compiler.model.Field;
import code.googlecode.pseudo.compiler.model.Operators;
import code.googlecode.pseudo.compiler.model.Record;
import code.googlecode.pseudo.compiler.model.Script;
import code.googlecode.pseudo.compiler.model.Var;
import code.googlecode.pseudo.compiler.model.Functions.Lambda;
import code.googlecode.pseudo.compiler.model.Functions.UserFunction;
import code.googlecode.pseudo.compiler.model.Vars.AnyVar;
import code.googlecode.pseudo.compiler.model.Vars.ArrayVar;
import code.googlecode.pseudo.compiler.model.Vars.LocalVar;
import code.googlecode.pseudo.compiler.model.Vars.ParameterVar;

import com.googlecode.pseudo.compiler.Type;
import com.googlecode.pseudo.compiler.Types;
import com.googlecode.pseudo.compiler.Scopes.Scope;
import com.googlecode.pseudo.compiler.Scopes.Table;
import com.googlecode.pseudo.compiler.Types.ArrayType;
import com.googlecode.pseudo.compiler.Types.FunType;
import com.googlecode.pseudo.compiler.Types.PrimitiveType;
import com.googlecode.pseudo.compiler.analysis.ErrorReporter.ErrorKind;
import com.googlecode.pseudo.compiler.ast.Arguments;
import com.googlecode.pseudo.compiler.ast.ArrayAccess;
import com.googlecode.pseudo.compiler.ast.ArrayAccessId;
import com.googlecode.pseudo.compiler.ast.ArrayAccessPrimary;
import com.googlecode.pseudo.compiler.ast.ArrayCreationPrimitive;
import com.googlecode.pseudo.compiler.ast.ArrayCreationRecord;
import com.googlecode.pseudo.compiler.ast.Assignation;
import com.googlecode.pseudo.compiler.ast.Block;
import com.googlecode.pseudo.compiler.ast.ConditionalIf;
import com.googlecode.pseudo.compiler.ast.ConditionalIfElse;
import com.googlecode.pseudo.compiler.ast.DeclarationId;
import com.googlecode.pseudo.compiler.ast.DeclarationIdInit;
import com.googlecode.pseudo.compiler.ast.DimExpr;
import com.googlecode.pseudo.compiler.ast.DimsOpt;
import com.googlecode.pseudo.compiler.ast.Expr;
import com.googlecode.pseudo.compiler.ast.ExprBooleanLiteral;
import com.googlecode.pseudo.compiler.ast.ExprCharLiteral;
import com.googlecode.pseudo.compiler.ast.ExprEq;
import com.googlecode.pseudo.compiler.ast.ExprId;
import com.googlecode.pseudo.compiler.ast.ExprLambda;
import com.googlecode.pseudo.compiler.ast.ExprNe;
import com.googlecode.pseudo.compiler.ast.ExprNullLiteral;
import com.googlecode.pseudo.compiler.ast.ExprPrimary;
import com.googlecode.pseudo.compiler.ast.ExprStringLiteral;
import com.googlecode.pseudo.compiler.ast.ExprValueLiteral;
import com.googlecode.pseudo.compiler.ast.FieldAccess;
import com.googlecode.pseudo.compiler.ast.FieldAccessId;
import com.googlecode.pseudo.compiler.ast.FieldAccessPrimary;
import com.googlecode.pseudo.compiler.ast.ForLoopIncr;
import com.googlecode.pseudo.compiler.ast.ForLoopInit;
import com.googlecode.pseudo.compiler.ast.FuncallId;
import com.googlecode.pseudo.compiler.ast.FuncallPrimary;
import com.googlecode.pseudo.compiler.ast.IdToken;
import com.googlecode.pseudo.compiler.ast.Instr;
import com.googlecode.pseudo.compiler.ast.InstrReturn;
import com.googlecode.pseudo.compiler.ast.InstrScan;
import com.googlecode.pseudo.compiler.ast.LhsArrayAccess;
import com.googlecode.pseudo.compiler.ast.LhsFieldAccess;
import com.googlecode.pseudo.compiler.ast.LhsId;
import com.googlecode.pseudo.compiler.ast.LoopDowhile;
import com.googlecode.pseudo.compiler.ast.LoopFor;
import com.googlecode.pseudo.compiler.ast.LoopWhile;
import com.googlecode.pseudo.compiler.ast.Node;
import com.googlecode.pseudo.compiler.ast.Primary;
import com.googlecode.pseudo.compiler.ast.PrimaryAllocation;
import com.googlecode.pseudo.compiler.ast.PrimaryNoArrayCreation;
import com.googlecode.pseudo.compiler.ast.Visitor;
import com.googlecode.pseudo.compiler.parser.PseudoProductionEnum;

public class TypeCheck extends Visitor<Type, TypeCheckEnv, RuntimeException>{
  private final Script script;
  private final HashMap<Node, Type> typeMap =
    new HashMap<Node, Type>();
  final HashSet<LhsId> autoDeclarationSet =
    new HashSet<LhsId>();
  final HashMap<Node, Invocation> invocationMap =
    new HashMap<Node, Invocation>();
  
  final ErrorReporter errorReporter;
  private final EnterType enterType;
  
  public TypeCheck(Script script, ErrorReporter errorReporter) {
    this.script = script;
    this.errorReporter = errorReporter;
    this.enterType = new EnterType(errorReporter);
  }
  
  public Map<Node, Type> getTypeMap() {
    return typeMap;
  }
  
  public Map<Node, Invocation> getInvocationMap() {
    return invocationMap;
  }
  
  public Set<LhsId> getAutoDeclarationSet() {
    return autoDeclarationSet;
  }
  
  // ---
  
  Type typeCheck(Node node, TypeCheckEnv typeCheckEnv) {
    Type type = node.accept(this, typeCheckEnv);
    if (type != null) {
      typeMap.put(node, type);
    }
    return type;
  }
  
  void typeCheckAllSubNodes(Node node, TypeCheckEnv typeCheckEnv) {
    for(Node child:node.nodeList()) {
      if (child.isToken())
        continue;
      typeCheck(child, typeCheckEnv);
    }
  }
  
  Type typeCheckAllAndDelegateToOne(Node node, TypeCheckEnv typeCheckEnv) {
    Type type = null;
    for(Node child:node.nodeList()) {
      if (child.isToken())
        continue;
      Type childType = typeCheck(child, typeCheckEnv);
      if (type == null) {
        type = childType;
      } else {
        throw new IllegalStateException();
      }
    }
    
    if (type != null)
      return type;
    throw new IllegalStateException();
  }
  
  // --- helpers
  
  void arrayIndexCheck(Expr expr, TypeCheckEnv typeCheckEnv) {
    Type exprType = typeCheck(expr, typeCheckEnv);
    if (!(Types.isAssignableFrom(Types.PrimitiveType.INT, exprType))) {
      errorReporter.error(ErrorKind.type_cherck_array_index, expr, exprType);
      // error recovery
    }
  }
  
  void conditionCheck(Expr expr, TypeCheckEnv typeCheckEnv) {
    Type exprType = typeCheck(expr, typeCheckEnv);
    if (!(Types.isAssignableFrom(Types.PrimitiveType.BOOLEAN, exprType))) {
      errorReporter.error(ErrorKind.type_cherck_condition, expr, exprType);
      // error recovery
    }
  }
  
  Type enterType(Node node) {
    return enterType.enterType(node, script.getTypeTable());
  }
  
  Var varId(IdToken token, boolean allowNull, TypeCheckEnv typeCheckEnv) {
    String name = token.getValue();
    Var var = typeCheckEnv.getVarScope().lookup(name);
    if (var == null && !allowNull) {
      errorReporter.error(ErrorKind.unknown_var, token, name);
      // error recovery
    }
    return var;
  }
  
  // --- default visits
  
  @Override
  protected Type visit(Node node, TypeCheckEnv typeCheckEnv) {
    typeCheckAllSubNodes(node, typeCheckEnv);
    return null;
  }
  
  // --- typeCheck script top level member
  
  public void typeCheck() {
    for(Record record:script.getRecordTable().items()) {
      typeCheck(record);
    }
    
    for(UserFunction function:script.getFunctionScope().getTable().items()) {
      typeCheck(function);
    }
    
    typeCheck(script.getMainBlock());
  }
  
  private void typeCheck(Record record) {
    // typecheck init block
    UserFunction init = record.getInitFunction();
    if (init == null)
      return;
    
    // scope: localVar -> parameter -> field -> function -> builtin 
    Scope<Var,Field> fieldScope = new Scope<Var,Field>(record.getFieldTable(), script.getFunctionScope());
    Scope<Var,ParameterVar> parameterVarScope = new Scope<Var,ParameterVar>(init.getParameterTable(), fieldScope);
    Scope<Var,LocalVar> localVarScope = new Scope<Var,LocalVar>(new Table<LocalVar>(), parameterVarScope);
    
    typeCheck(init.getBlock(), new TypeCheckEnv(localVarScope, PrimitiveType.VOID));
  }
  
  private void typeCheck(UserFunction function) {
    // scope: localVar -> parameter -> function -> builtin
    Scope<Var,ParameterVar> parameterVarScope = new Scope<Var,ParameterVar>(function.getParameterTable(), script.getFunctionScope());
    Scope<Var,LocalVar> localVarScope = new Scope<Var,LocalVar>(new Table<LocalVar>(), parameterVarScope);
    
    typeCheck(function.getBlock(), new TypeCheckEnv(localVarScope, function.getType().getReturnType()));
  }
  
  private void typeCheck(Block mainBlock) {
    // scope: localVar -> function -> builtin
    Scope<Var,LocalVar> localVarScope = new Scope<Var,LocalVar>(new Table<LocalVar>(), script.getFunctionScope());
    
    // register a fake parameter ARGS
    localVarScope.register(new ParameterVar(new ArrayType(PrimitiveType.STRING), "ARGS"));
    
    typeCheck(mainBlock, new TypeCheckEnv(localVarScope, PrimitiveType.VOID));
  }
  
  // --- block
  
  @Override
  public Type visit(Block block, TypeCheckEnv typeCheckEnv) {
    Scope<Var, LocalVar> newLocalVarScope = new Scope<Var, LocalVar>(
      new Table<LocalVar>(), typeCheckEnv.getVarScope());
    TypeCheckEnv newEnv = new TypeCheckEnv(newLocalVarScope, typeCheckEnv.getFunctionReturnType());
    typeCheckAllSubNodes(block, newEnv);
    return null;
  }
  
  // --- instructions
  
  @Override
  protected Type visit(Instr instr, TypeCheckEnv typeCheckEnv) {
    typeCheckAllSubNodes(instr, typeCheckEnv);
    return null;
  }
  
  @Override
  public Type visit(InstrScan instrScan, TypeCheckEnv typeCheckEnv) {
    Primary primary = instrScan.getPrimary();
    Type primaryType = typeCheck(primary, typeCheckEnv);
    
    // scan only accept primitive type that aren't any
    if (!primaryType.isPrimitive() || primaryType == PrimitiveType.ANY) {
      errorReporter.error(ErrorKind.scan_primitive, primary, primaryType);
      // error recovery
    }
    return null;
  }
  
  @Override
  public Type visit(InstrReturn instrReturn, TypeCheckEnv typeCheckEnv) {
    Type exprType;
    Expr expr = instrReturn.getExprOptional();
    if (expr == null) {
      exprType = PrimitiveType.VOID;
    } else {
      exprType = typeCheck(expr, typeCheckEnv);
    }
    
    // check against function return type
    Type functionReturnType = typeCheckEnv.getFunctionReturnType();
    if (!Types.isAssignableFrom(functionReturnType, exprType)) {
      errorReporter.error(ErrorKind.typecheck_return, instrReturn, exprType, functionReturnType);
      // error recovery
    }
    return functionReturnType;
  }
  
  
  // --- conditionals and loop
  
  @Override
  public Type visit(ConditionalIf conditionalIf, TypeCheckEnv typeCheckEnv) {
    conditionCheck(conditionalIf.getExpr(), typeCheckEnv);
    typeCheck(conditionalIf.getBlock(), typeCheckEnv);
    return null;
  }
  
  @Override
  public Type visit(ConditionalIfElse conditionalIfElse, TypeCheckEnv typeCheckEnv) {
    conditionCheck(conditionalIfElse.getExpr(), typeCheckEnv);
    typeCheck(conditionalIfElse.getBlock(), typeCheckEnv);
    typeCheck(conditionalIfElse.getBlock2(), typeCheckEnv);
    return null;
  }
  
  @Override
  public Type visit(LoopWhile loopWhile, TypeCheckEnv typeCheckEnv) {
    conditionCheck(loopWhile.getExpr(), typeCheckEnv);
    typeCheck(loopWhile.getBlock(), typeCheckEnv);
    return null;
  }
  
  @Override
  public Type visit(LoopDowhile loopDowhile, TypeCheckEnv typeCheckEnv) {
    conditionCheck(loopDowhile.getExpr(), typeCheckEnv);
    typeCheck(loopDowhile.getBlock(), typeCheckEnv);
    return null;
  }
  
  @Override
  public Type visit(LoopFor loopFor, TypeCheckEnv typeCheckEnv) {
    Scope<Var,LocalVar> newScope = new Scope<Var, LocalVar>(new Table<LocalVar>(), typeCheckEnv.getVarScope());
    TypeCheckEnv newEnv = new TypeCheckEnv(newScope, typeCheckEnv.getFunctionReturnType());
    
    ForLoopInit initOptional = loopFor.getForLoopInitOptional();
    if (initOptional != null) {
      typeCheck(initOptional, typeCheckEnv);
    }
    
    Expr exprOptional = loopFor.getExprOptional();
    if (exprOptional != null) {
      conditionCheck(exprOptional, newEnv);
    }
    
    ForLoopIncr incrOptional = loopFor.getForLoopIncrOptional();
    if (incrOptional != null) {
      typeCheck(incrOptional, typeCheckEnv);
    }
    
    return null;
  }
  
  
  // --- declaration/assignation
  
  private Type declaration(com.googlecode.pseudo.compiler.ast.Type nodeType, IdToken token, TypeCheckEnv typeCheckEnv) {
    Type type = enterType(nodeType);
    String name = token.getValue();
    LocalVar var = new LocalVar(type, name);
    LocalVar oldVar = typeCheckEnv.getVarScope().register(var);
    if (oldVar != null) {
      errorReporter.error(ErrorKind.duplicate_local_var, token, name);
      // error recovery
    }
    //bindingMap.put(token, var);
    return type;
  }
  
  @Override
  public Type visit(DeclarationId declarationId, TypeCheckEnv typeCheckEnv) {
    return declaration(declarationId.getType(), declarationId.getId(), typeCheckEnv);
  }

  @Override
  public Type visit(DeclarationIdInit declarationIdInit, TypeCheckEnv typeCheckEnv){
    Type exprType = typeCheck(declarationIdInit.getExpr(), typeCheckEnv);
    Type type = declaration(declarationIdInit.getType(), declarationIdInit.getId(), typeCheckEnv);
    
    if (!Types.isAssignableFrom(type, exprType)) {
      errorReporter.error(ErrorKind.typecheck_assign, declarationIdInit, exprType, type);
      // error recovery
    }
    return type;
  }
  
  @Override
  public Type visit(Assignation assignation, TypeCheckEnv typeCheckEnv) {
    Type exprType = typeCheck(assignation.getExpr(), typeCheckEnv);
    
    Var var = lhs(assignation.getLhs(), typeCheckEnv);
    if (var == null) { // error recovery
      return null;
    }
    
    if (!(Types.isAssignableFrom(var.getType(), exprType))) {
      errorReporter.error(ErrorKind.typecheck_assign, assignation.getExpr(), exprType, var.getType());
      // error recovery
    }
    
    return var.getType();
  }
  
  /**
   * @return may return null if var is not found
   */
  Var lhs(Node node, TypeCheckEnv typeCheckEnv) {
    Var var = node.accept(lhsVisitor, typeCheckEnv);
    if (var!= null) {
      typeMap.put(node, var.getType());
    }
    return var;
  }
  
  private final Visitor<Var, TypeCheckEnv, RuntimeException> lhsVisitor =
    new Visitor<Var, TypeCheckEnv, RuntimeException>() {
    
    @Override
    public Var visit(LhsId lhs_id, TypeCheckEnv typeCheckEnv) {
      Var var = varId(lhs_id.getId(), true, typeCheckEnv);
      if (var == null) {
        // unknown var --> create a new one with type any
        LocalVar newVar = new LocalVar(PrimitiveType.ANY, lhs_id.getId().getValue());
        typeCheckEnv.getVarScope().register(newVar);
        var = newVar;
        
        // mark it as auto-declaration for gen pass
        autoDeclarationSet.add(lhs_id);
      }
      return var;
    }
    
    @Override
    public Var visit(LhsFieldAccess lhs_field_access, TypeCheckEnv typeCheckEnv) {
       return lhs(lhs_field_access.getFieldAccess(), typeCheckEnv);
    }
    
    Var fieldAccess(Node receiverNode, Type receiverType, IdToken fieldId) {
      if (receiverType == PrimitiveType.ANY) {  
        return AnyVar.INSTANCE;
      }
      
      String fieldName = fieldId.getValue();
      if (receiverType instanceof Record) {
        Record record = (Record)receiverType;
        Field field = record.getFieldTable().lookup(fieldName);
        if (field == null) {
          errorReporter.error(ErrorKind.unknown_field, fieldId, fieldName);
          // error recovery
          return null;
        }
        return field;
      }
      
      // simulate array.length
      if (receiverType instanceof ArrayType && fieldName.equals("length")) {
        return new Field(PrimitiveType.INT, "length") {
          @Override
          public boolean isReadOnly() {
            return true;
          }
        };
      }
      
      errorReporter.error(ErrorKind.typecheck_var_not_record_or_array, receiverNode, receiverType);
      // error recovery
      return null;
    }
    
    @Override
    public Var visit(FieldAccessId field_access_id, TypeCheckEnv typeCheckEnv) {
      Var var = varId(field_access_id.getId(), false, typeCheckEnv);
      if (var == null) { // error recovery
        return null;
      }
      
      return fieldAccess(field_access_id.getId(), var.getType(), field_access_id.getId2());
    }
    
    @Override
    public Var visit(FieldAccessPrimary field_access_primary, TypeCheckEnv typeCheckEnv) {
      Type primaryType = typeCheck(field_access_primary, typeCheckEnv);
      if (primaryType == null) { // error recovery
        return null;
      }
      
      return fieldAccess(field_access_primary.getPrimary(), primaryType, field_access_primary.getId());
    }
    
    @Override
    public Var visit(LhsArrayAccess lhsArrayAccess, TypeCheckEnv typeCheckEnv) {
      return lhs(lhsArrayAccess.getArrayAccess(), typeCheckEnv);
    }
    
    
    
    private Var arrayAccess(Type callerType, Expr expr, TypeCheckEnv typeCheckEnv) {
      arrayIndexCheck(expr, typeCheckEnv);
      
      if (callerType == PrimitiveType.ANY)
        return AnyVar.INSTANCE;
      
      if (callerType instanceof ArrayType) {
        ArrayType arrayType = (ArrayType)callerType;
        return new ArrayVar(arrayType.getComponentType());  
      }
      
      // error recovery
      return null;
    }
    
    @Override
    public Var visit(ArrayAccessId arrayAccessId, TypeCheckEnv typeCheckEnv) {
      Var var = varId(arrayAccessId.getId(), false, typeCheckEnv);
      return arrayAccess(var.getType(), arrayAccessId.getExpr(), typeCheckEnv);
    }
    
    @Override
    public Var visit(ArrayAccessPrimary arrayAccessPrimary, TypeCheckEnv typeCheckEnv) {
      Type type = typeCheck(arrayAccessPrimary.getPrimaryNoArrayCreation(), typeCheckEnv);
      return arrayAccess(type, arrayAccessPrimary.getExpr(), typeCheckEnv);
    }
  };
  
  // --- funcall
  
  private List<Type> typeCheckArguments(Arguments arguments, TypeCheckEnv typeCheckEnv) {
    List<Expr> argumentExprs = arguments.getExprStar();
    Type[] argumentTypes = new Type[argumentExprs.size()];
    for(int i=0; i<argumentTypes.length; i++) {
      argumentTypes[i] = typeCheck(argumentExprs.get(i), typeCheckEnv);
    }
    return Arrays.asList(argumentTypes);
  }
  
  private Type funcall(Node node, Node caller, UserFunction function, Type callerType, Arguments arguments, TypeCheckEnv typeCheckEnv) {
    List<Type> argumentTypes = typeCheckArguments(arguments, typeCheckEnv);
    
    FunType funType = Types.getFunTypeForCall(callerType, argumentTypes);
    if (funType == null) {
      if (callerType == PrimitiveType.ANY) {
        funType = new FunType(PrimitiveType.ANY, argumentTypes);
      } else {
        if (!callerType.isFunction()) {
          errorReporter.error(ErrorKind.typecheck_call_not_function, caller, callerType);
        } else {
          errorReporter.error(ErrorKind.typecheck_call_arguments, arguments, argumentTypes, callerType);
        }
        // error recovery
        return PrimitiveType.ANY;
      }
    }
    
    invocationMap.put(node, new Invocation(funType, function));
    return funType.getReturnType();
  }
  
  @Override
  public Type visit(FuncallId funcallId, TypeCheckEnv typeCheckEnv) {
    IdToken tokenId = funcallId.getId();
    String name = tokenId.getValue();
    Var var = typeCheckEnv.getVarScope().lookup(name);
    UserFunction function = null;
    Type varType;
    if (var == null) {
      errorReporter.error(ErrorKind.unknown_function, tokenId, name);
      // error recovery
      varType = PrimitiveType.ANY;
    } else {
      varType = var.getType();
      if (var instanceof UserFunction) {
        function = (UserFunction)var;
      }
    }
    
    return funcall(funcallId, tokenId, function, varType, funcallId.getArguments(), typeCheckEnv);
  }
  
  @Override
  public Type visit(FuncallPrimary funcallPrimary, TypeCheckEnv typeCheckEnv) {
    Primary primary = funcallPrimary.getPrimary();
    Type primaryType = typeCheck(primary, typeCheckEnv);
    return funcall(funcallPrimary, primary, null, primaryType, funcallPrimary.getArguments(), typeCheckEnv);
  }
  
  // --- primary
  
  @Override
  protected Type visit(PrimaryNoArrayCreation primaryNoArrayCreation, TypeCheckEnv typeCheckEnv) {
    return typeCheckAllAndDelegateToOne(primaryNoArrayCreation, typeCheckEnv);
  }
  
  @Override
  protected Type visit(Primary primary, TypeCheckEnv typeCheckEnv) {
    return typeCheckAllAndDelegateToOne(primary, typeCheckEnv);
  }
  
  @Override
  public Type visit(PrimaryAllocation primaryAllocation, TypeCheckEnv typeCheckEnv) {
    List<Type> argumentTypes = typeCheckArguments(primaryAllocation.getArguments(), typeCheckEnv);
    
    String recordName = primaryAllocation.getId().getValue();
    Record record = script.getRecordTable().lookup(recordName);
    if (record == null) {
      errorReporter.error(ErrorKind.unknown_record, primaryAllocation.getId(), recordName);
      // error recovery
      return PrimitiveType.ANY;
    }
    
    UserFunction initFunction = record.getInitFunction();
    if (initFunction == null) {
      if (argumentTypes.isEmpty()) {
        errorReporter.error(ErrorKind.typecheck_call_arguments, primaryAllocation.getArguments(), argumentTypes, "()");
        // error recovery
      }
      else {
        // TODO, create the init function here !!
      }
    } else {
      FunType funType = Types.getFunTypeForCall(initFunction.getType(), argumentTypes);
      if (funType != null) {
        invocationMap.put(primaryAllocation, new Invocation(funType, initFunction));
      } else {
        errorReporter.error(ErrorKind.typecheck_call_arguments, primaryAllocation.getArguments(),
            argumentTypes, initFunction.getType());
        // error recovery
      }
    }
    return record;
  }
  
  @Override
  protected Type visit(FieldAccess fieldAccess, TypeCheckEnv typeCheckEnv) {
    Var var = lhs(fieldAccess, typeCheckEnv);
    if (var == null) { // error recovery
      return PrimitiveType.ANY;
    }
    return var.getType();
  }
  @Override
  protected Type visit(ArrayAccess arrayAccess, TypeCheckEnv typeCheckEnv) {
    Var var = lhs(arrayAccess, typeCheckEnv);
    if (var == null) { // error recovery
      return PrimitiveType.ANY;
    }
    return var.getType();
  }
  
  
  private Type arrayCreation(Type type, List<DimExpr> dimExprs, DimsOpt dimsOpt, TypeCheckEnv typeCheckEnv) {
    for(DimExpr dimExpr: dimExprs) {
      arrayIndexCheck(dimExpr.getExpr(), typeCheckEnv);
    }
    
    int dimension = dimExprs.size() + enterType.dimension(dimsOpt);
    return enterType.arrayType(type, dimension);
  }
  
  @Override
  public Type visit(ArrayCreationPrimitive arrayCreationPrimitive, TypeCheckEnv typeCheckEnv) {
    Type primitiveType = enterType(arrayCreationPrimitive.getPrimitiveType());
    return arrayCreation(primitiveType,
      arrayCreationPrimitive.getDimExprPlus(), arrayCreationPrimitive.getDimsOpt(), typeCheckEnv);
  }
  
  @Override
  public Type visit(ArrayCreationRecord arrayCreationRecord, TypeCheckEnv typeCheckEnv) {
    String name = arrayCreationRecord.getId().getValue();
    Type type = enterType.lookupType(arrayCreationRecord.getId(), script.getTypeTable(), name);
    return arrayCreation(type,
        arrayCreationRecord.getDimExprPlus(), arrayCreationRecord.getDimsOpt(), typeCheckEnv);
  }
  
  
  // --- expressions
  
  @Override
  public Type visit(ExprBooleanLiteral exprBooleanLiteral, TypeCheckEnv typeCheckEnv) {
    return PrimitiveType.BOOLEAN;
  }
  @Override
  public Type visit(ExprCharLiteral exprCharLiteral, TypeCheckEnv typeCheckEnv) {
    return PrimitiveType.CHAR;
  }
  @Override
  public Type visit(ExprValueLiteral exprValueLiteral, TypeCheckEnv typeCheckEnv) {
    Object value = exprValueLiteral.getValueLiteral().getValue();
    return (value instanceof Integer)?PrimitiveType.INT:PrimitiveType.DOUBLE;
  }
  @Override
  public Type visit(ExprStringLiteral exprStringLiteral, TypeCheckEnv typeCheckEnv) {
    return PrimitiveType.STRING;
  }
  @Override
  public Type visit(ExprNullLiteral exprNullLiteral, TypeCheckEnv typeCheckEnv) {
    return PrimitiveType.NULL;
  }
  
  @Override
  public Type visit(ExprId exprId, TypeCheckEnv typeCheckEnv) {
    Var var = varId(exprId.getId(), false, typeCheckEnv);
    if (var == null) { // error recovery
      return PrimitiveType.ANY;
    }
    return var.getType();
  }
  
  @Override
  public Type visit(ExprPrimary exprPrimary, TypeCheckEnv typeCheckEnv) {
    return typeCheck(exprPrimary.getPrimary(), typeCheckEnv);
  }
  
  @Override
  public Type visit(ExprLambda exprLambda, TypeCheckEnv typeCheckEnv) {
    Table<ParameterVar> parameterVarTable = Enter.getParameterVarTable(exprLambda.getParameters(), enterType, script.getTypeTable());
    
    // scope: localVar -> parameter -> function -> builtin
    Scope<Var,ParameterVar> parameterScope = new Scope<Var, ParameterVar>(parameterVarTable, script.getFunctionScope());
    Scope<Var,LocalVar> lambdaScope = new Scope<Var, LocalVar>(new Table<LocalVar>(), parameterScope);
    
    Expr expr = exprLambda.getExpr();
    Type returnType = typeCheck(expr, new TypeCheckEnv(lambdaScope, PrimitiveType.ANY));
    
    Lambda lambda = new Lambda(parameterVarTable, returnType, expr);
    //bindingMap.put(exprLambda, lambda);
    return lambda.getType();
  }
  
  // --- operators (expression)
  
  private static final EnumMap<PseudoProductionEnum,String> OPERATOR_MAP;
  static  {
    EnumMap<PseudoProductionEnum,String> map =
      new EnumMap<PseudoProductionEnum, String>(PseudoProductionEnum.class);
    // unary
    map.put(PseudoProductionEnum.expr_neg, "!");
    map.put(PseudoProductionEnum.expr_unary_plus, "+");
    map.put(PseudoProductionEnum.expr_unary_minus, "-");
    
    // binary test
    map.put(PseudoProductionEnum.expr_eq, "==");
    map.put(PseudoProductionEnum.expr_ne, "!=");
    map.put(PseudoProductionEnum.expr_lt, "<");
    map.put(PseudoProductionEnum.expr_le, "<=");
    map.put(PseudoProductionEnum.expr_gt, ">");
    map.put(PseudoProductionEnum.expr_ge, ">=");
   
    // binary boolean
    map.put(PseudoProductionEnum.expr_band, "&&");
    map.put(PseudoProductionEnum.expr_bor, "||");
    
    // binary op
    map.put(PseudoProductionEnum.expr_plus, "+");
    map.put(PseudoProductionEnum.expr_minus, "-");
    map.put(PseudoProductionEnum.expr_star, "*");
    map.put(PseudoProductionEnum.expr_slash, "/");
    map.put(PseudoProductionEnum.expr_mod, "%");
    map.put(PseudoProductionEnum.expr_pow, "^^");
    
    OPERATOR_MAP = map;
  }
  
  @Override
  protected Type visit(Expr expr, TypeCheckEnv typeCheckEnv) {
    String operatorName = OPERATOR_MAP.get(expr.getKind());
    if (operatorName == null) {
      throw new AssertionError("unknown operation production "+expr.getKind());
    }
    
    ArrayList<Type> exprTypes = new ArrayList<Type>();
    for(Node subNode: expr.nodeList()) {
      if (subNode.isToken())
        continue;
      
      Type exprType = typeCheck(subNode, typeCheckEnv);
      exprTypes.add(exprType);
    }
    
    FunType operatorType;
    // check if dynamic
    if (Types.isDynamic(exprTypes)) {
      Type returnType = Operators.getInstance().findCommonReturnType(operatorName, exprTypes.size());
      operatorType = new FunType(returnType, exprTypes);
    } else {
      operatorType = Operators.getInstance().findOperator(operatorName, exprTypes);  
    }
    
    if (operatorType == null) {
      errorReporter.error(ErrorKind.type_check_operator, expr, operatorName, exprTypes);
      // error recovery
      return PrimitiveType.ANY;
    }
    
    invocationMap.put(expr, new Invocation(operatorType, null));
    return operatorType.getReturnType();
  }
  
  private static boolean isTestable(Type type1, Type type2) {
    return Types.isAssignableFrom(type1, type2) ||
           Types.isAssignableFrom(type2, type1);
  }
  
  private Type typecheckEquals(Expr expr, Expr left, Expr right, TypeCheckEnv typeCheckEnv) {
    Type leftType = typeCheck(left, typeCheckEnv);
    Type rightType = typeCheck(right, typeCheckEnv);
    
    if (!isTestable(leftType, rightType)) {
      errorReporter.error(ErrorKind.type_check_not_testable, expr, leftType, rightType);
      // error recovery
    } else {
      FunType operatorType = new FunType(PrimitiveType.BOOLEAN, Arrays.asList(leftType, rightType));
      invocationMap.put(expr, new Invocation(operatorType, null));
    }
    return PrimitiveType.BOOLEAN;
  }
  
  @Override
  public Type visit(ExprEq exprEq, TypeCheckEnv typeCheckEnv) {
    return typecheckEquals(exprEq, exprEq.getExpr(), exprEq.getExpr2(), typeCheckEnv);
  }
  @Override
  public Type visit(ExprNe exprNe, TypeCheckEnv typeCheckEnv) {
    return typecheckEquals(exprNe, exprNe.getExpr(), exprNe.getExpr2(), typeCheckEnv);
  }
}
