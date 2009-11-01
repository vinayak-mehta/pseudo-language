package com.googlecode.pseudo.compiler.ast;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 *  This class is generated - please do not edit it 
 */
public class VisitorCopier<_P,_E extends Exception> extends Visitor<Node,_P,_E> {
     @Override
   public Node visit(PrimitiveTypeBoolean primitive_type_boolean,_P _param) throws _E {
          
     return new PrimitiveTypeBoolean();
   }
      @Override
   public Node visit(PrimitiveTypeChar primitive_type_char,_P _param) throws _E {
          
     return new PrimitiveTypeChar();
   }
      @Override
   public Node visit(PrimitiveTypeInt primitive_type_int,_P _param) throws _E {
          
     return new PrimitiveTypeInt();
   }
      @Override
   public Node visit(PrimitiveTypeDouble primitive_type_double,_P _param) throws _E {
          
     return new PrimitiveTypeDouble();
   }
      @Override
   public Node visit(PrimitiveTypeString primitive_type_string,_P _param) throws _E {
          
     return new PrimitiveTypeString();
   }
      @Override
   public Node visit(PrimitiveTypeAny primitive_type_any,_P _param) throws _E {
          
     return new PrimitiveTypeAny();
   }
      @Override
   public Node visit(TypeId type_id,_P _param) throws _E {
          IdToken id=(IdToken)type_id.getId().accept(this, _param);
          
     return new TypeId(id);
   }
      @Override
   public Node visit(TypeIdDims type_id_dims,_P _param) throws _E {
          IdToken id=(IdToken)type_id_dims.getId().accept(this, _param);
          Dims dims=(Dims)type_id_dims.getDims().accept(this, _param);
          
     return new TypeIdDims(id, dims);
   }
      @Override
   public Node visit(TypePrimitive type_primitive,_P _param) throws _E {
          PrimitiveType primitive_type=(PrimitiveType)type_primitive.getPrimitiveType().accept(this, _param);
          
     return new TypePrimitive(primitive_type);
   }
      @Override
   public Node visit(TypePrimitiveDims type_primitive_dims,_P _param) throws _E {
          PrimitiveType primitive_type=(PrimitiveType)type_primitive_dims.getPrimitiveType().accept(this, _param);
          Dims dims=(Dims)type_primitive_dims.getDims().accept(this, _param);
          
     return new TypePrimitiveDims(primitive_type, dims);
   }
      @Override
   public Node visit(TypeFuntype type_funtype,_P _param) throws _E {
          Funtype funtype=(Funtype)type_funtype.getFuntype().accept(this, _param);
          
     return new TypeFuntype(funtype);
   }
      @Override
   public Node visit(TypeFuntypeDims type_funtype_dims,_P _param) throws _E {
          Funtype funtype=(Funtype)type_funtype_dims.getFuntype().accept(this, _param);
          Dims dims=(Dims)type_funtype_dims.getDims().accept(this, _param);
          
     return new TypeFuntypeDims(funtype, dims);
   }
      @Override
   public Node visit(Funtype funtype,_P _param) throws _E {
          ArrayList<Type> type_star=new ArrayList<Type>();
     for(Iterator<Type> it=funtype.getTypeStar().iterator(); it.hasNext();) {
       type_star.add((Type)it.next().accept(this, _param));
     }
          ReturnType return_type=(ReturnType)funtype.getReturnType().accept(this, _param);
          
     return new Funtype(type_star, return_type);
   }
      @Override
   public Node visit(ReturnTypeType return_type_type,_P _param) throws _E {
          Type type=(Type)return_type_type.getType().accept(this, _param);
          
     return new ReturnTypeType(type);
   }
      @Override
   public Node visit(ReturnTypeVoid return_type_void,_P _param) throws _E {
          
     return new ReturnTypeVoid();
   }
      @Override
   public Node visit(Start start,_P _param) throws _E {
          ArrayList<ScriptMember> script_member_star=new ArrayList<ScriptMember>();
     for(Iterator<ScriptMember> it=start.getScriptMemberStar().iterator(); it.hasNext();) {
       script_member_star.add((ScriptMember)it.next().accept(this, _param));
     }
          
     return new Start(script_member_star);
   }
      @Override
   public Node visit(ScriptMemberRecordDef script_member_record_def,_P _param) throws _E {
          RecordDef record_def=(RecordDef)script_member_record_def.getRecordDef().accept(this, _param);
          
     return new ScriptMemberRecordDef(record_def);
   }
      @Override
   public Node visit(ScriptMemberFunctionDef script_member_function_def,_P _param) throws _E {
          FunctionDef function_def=(FunctionDef)script_member_function_def.getFunctionDef().accept(this, _param);
          
     return new ScriptMemberFunctionDef(function_def);
   }
      @Override
   public Node visit(ScriptMemberBlock script_member_block,_P _param) throws _E {
          Block block=(Block)script_member_block.getBlock().accept(this, _param);
          
     return new ScriptMemberBlock(block);
   }
      @Override
   public Node visit(RecordDef record_def,_P _param) throws _E {
          IdToken id=(IdToken)record_def.getId().accept(this, _param);
          ArrayList<Field> field_star=new ArrayList<Field>();
     for(Iterator<Field> it=record_def.getFieldStar().iterator(); it.hasNext();) {
       field_star.add((Field)it.next().accept(this, _param));
     }
          RecordInit record_init_optional=(RecordInit)record_def.getRecordInitOptional().accept(this, _param);
          
     return new RecordDef(id, field_star, record_init_optional);
   }
      @Override
   public Node visit(RecordInit record_init,_P _param) throws _E {
          Parameters parameters=(Parameters)record_init.getParameters().accept(this, _param);
          Block block=(Block)record_init.getBlock().accept(this, _param);
          
     return new RecordInit(parameters, block);
   }
      @Override
   public Node visit(Field field,_P _param) throws _E {
          Type type=(Type)field.getType().accept(this, _param);
          IdToken id=(IdToken)field.getId().accept(this, _param);
          Semis semis=(Semis)field.getSemis().accept(this, _param);
          
     return new Field(type, id, semis);
   }
      @Override
   public Node visit(FunctionDef function_def,_P _param) throws _E {
          IdToken id=(IdToken)function_def.getId().accept(this, _param);
          Parameters parameters=(Parameters)function_def.getParameters().accept(this, _param);
          FunctionRtype function_rtype_optional=(FunctionRtype)function_def.getFunctionRtypeOptional().accept(this, _param);
          Block block=(Block)function_def.getBlock().accept(this, _param);
          
     return new FunctionDef(id, parameters, function_rtype_optional, block);
   }
      @Override
   public Node visit(FunctionRtype function_rtype,_P _param) throws _E {
          ReturnType return_type=(ReturnType)function_rtype.getReturnType().accept(this, _param);
          
     return new FunctionRtype(return_type);
   }
      @Override
   public Node visit(Parameters parameters,_P _param) throws _E {
          ArrayList<Parameter> parameter_star=new ArrayList<Parameter>();
     for(Iterator<Parameter> it=parameters.getParameterStar().iterator(); it.hasNext();) {
       parameter_star.add((Parameter)it.next().accept(this, _param));
     }
          
     return new Parameters(parameter_star);
   }
      @Override
   public Node visit(ParameterNaked parameter_naked,_P _param) throws _E {
          IdToken id=(IdToken)parameter_naked.getId().accept(this, _param);
          
     return new ParameterNaked(id);
   }
      @Override
   public Node visit(ParameterTyped parameter_typed,_P _param) throws _E {
          Type type=(Type)parameter_typed.getType().accept(this, _param);
          IdToken id=(IdToken)parameter_typed.getId().accept(this, _param);
          
     return new ParameterTyped(type, id);
   }
      @Override
   public Node visit(Arguments arguments,_P _param) throws _E {
          ArrayList<Expr> expr_star=new ArrayList<Expr>();
     for(Iterator<Expr> it=arguments.getExprStar().iterator(); it.hasNext();) {
       expr_star.add((Expr)it.next().accept(this, _param));
     }
          
     return new Arguments(expr_star);
   }
      @Override
   public Node visit(Block block,_P _param) throws _E {
          ArrayList<Instr> instr_star=new ArrayList<Instr>();
     for(Iterator<Instr> it=block.getInstrStar().iterator(); it.hasNext();) {
       instr_star.add((Instr)it.next().accept(this, _param));
     }
          
     return new Block(instr_star);
   }
      @Override
   public Node visit(InstrPrint instr_print,_P _param) throws _E {
          Expr expr=(Expr)instr_print.getExpr().accept(this, _param);
          Semis semis=(Semis)instr_print.getSemis().accept(this, _param);
          
     return new InstrPrint(expr, semis);
   }
      @Override
   public Node visit(InstrScan instr_scan,_P _param) throws _E {
          Primary primary=(Primary)instr_scan.getPrimary().accept(this, _param);
          Semis semis=(Semis)instr_scan.getSemis().accept(this, _param);
          
     return new InstrScan(primary, semis);
   }
      @Override
   public Node visit(InstrDeclaration instr_declaration,_P _param) throws _E {
          Declaration declaration=(Declaration)instr_declaration.getDeclaration().accept(this, _param);
          Semis semis=(Semis)instr_declaration.getSemis().accept(this, _param);
          
     return new InstrDeclaration(declaration, semis);
   }
      @Override
   public Node visit(InstrAssignation instr_assignation,_P _param) throws _E {
          Assignation assignation=(Assignation)instr_assignation.getAssignation().accept(this, _param);
          Semis semis=(Semis)instr_assignation.getSemis().accept(this, _param);
          
     return new InstrAssignation(assignation, semis);
   }
      @Override
   public Node visit(InstrFuncall instr_funcall,_P _param) throws _E {
          Funcall funcall=(Funcall)instr_funcall.getFuncall().accept(this, _param);
          Semis semis=(Semis)instr_funcall.getSemis().accept(this, _param);
          
     return new InstrFuncall(funcall, semis);
   }
      @Override
   public Node visit(InstrConditional instr_conditional,_P _param) throws _E {
          Conditional conditional=(Conditional)instr_conditional.getConditional().accept(this, _param);
          
     return new InstrConditional(conditional);
   }
      @Override
   public Node visit(InstrLoop instr_loop,_P _param) throws _E {
          LoopLabel loop_label_optional=(LoopLabel)instr_loop.getLoopLabelOptional().accept(this, _param);
          Loop loop=(Loop)instr_loop.getLoop().accept(this, _param);
          
     return new InstrLoop(loop_label_optional, loop);
   }
      @Override
   public Node visit(InstrBreak instr_break,_P _param) throws _E {
          IdToken id_optional=(IdToken)instr_break.getIdOptional().accept(this, _param);
          Semis semis=(Semis)instr_break.getSemis().accept(this, _param);
          
     return new InstrBreak(id_optional, semis);
   }
      @Override
   public Node visit(InstrContinue instr_continue,_P _param) throws _E {
          IdToken id_optional=(IdToken)instr_continue.getIdOptional().accept(this, _param);
          Semis semis=(Semis)instr_continue.getSemis().accept(this, _param);
          
     return new InstrContinue(id_optional, semis);
   }
      @Override
   public Node visit(InstrReturn instr_return,_P _param) throws _E {
          Expr expr_optional=(Expr)instr_return.getExprOptional().accept(this, _param);
          Semis semis=(Semis)instr_return.getSemis().accept(this, _param);
          
     return new InstrReturn(expr_optional, semis);
   }
      @Override
   public Node visit(InstrThrow instr_throw,_P _param) throws _E {
          Expr expr=(Expr)instr_throw.getExpr().accept(this, _param);
          Semis semis=(Semis)instr_throw.getSemis().accept(this, _param);
          
     return new InstrThrow(expr, semis);
   }
      @Override
   public Node visit(InstrBlock instr_block,_P _param) throws _E {
          Block block=(Block)instr_block.getBlock().accept(this, _param);
          
     return new InstrBlock(block);
   }
      @Override
   public Node visit(InstrEmpty instr_empty,_P _param) throws _E {
          
     return new InstrEmpty();
   }
      @Override
   public Node visit(SemisSemicolon semis__semicolon,_P _param) throws _E {
          
     return new SemisSemicolon();
   }
      @Override
   public Node visit(SemisEoln semis__eoln,_P _param) throws _E {
          
     return new SemisEoln();
   }
      @Override
   public Node visit(DeclarationId declaration_id,_P _param) throws _E {
          Type type=(Type)declaration_id.getType().accept(this, _param);
          IdToken id=(IdToken)declaration_id.getId().accept(this, _param);
          
     return new DeclarationId(type, id);
   }
      @Override
   public Node visit(DeclarationIdInit declaration_id_init,_P _param) throws _E {
          Type type=(Type)declaration_id_init.getType().accept(this, _param);
          IdToken id=(IdToken)declaration_id_init.getId().accept(this, _param);
          Expr expr=(Expr)declaration_id_init.getExpr().accept(this, _param);
          
     return new DeclarationIdInit(type, id, expr);
   }
      @Override
   public Node visit(FuncallId funcall_id,_P _param) throws _E {
          IdToken id=(IdToken)funcall_id.getId().accept(this, _param);
          Arguments arguments=(Arguments)funcall_id.getArguments().accept(this, _param);
          
     return new FuncallId(id, arguments);
   }
      @Override
   public Node visit(FuncallPrimary funcall_primary,_P _param) throws _E {
          Primary primary=(Primary)funcall_primary.getPrimary().accept(this, _param);
          Arguments arguments=(Arguments)funcall_primary.getArguments().accept(this, _param);
          
     return new FuncallPrimary(primary, arguments);
   }
      @Override
   public Node visit(ConditionalIf conditional_if,_P _param) throws _E {
          Expr expr=(Expr)conditional_if.getExpr().accept(this, _param);
          Block block=(Block)conditional_if.getBlock().accept(this, _param);
          
     return new ConditionalIf(expr, block);
   }
      @Override
   public Node visit(ConditionalIfElse conditional_if_else,_P _param) throws _E {
          Expr expr=(Expr)conditional_if_else.getExpr().accept(this, _param);
          Block block=(Block)conditional_if_else.getBlock().accept(this, _param);
          Block block2=(Block)conditional_if_else.getBlock2().accept(this, _param);
          
     return new ConditionalIfElse(expr, block, block2);
   }
      @Override
   public Node visit(LoopWhile loop_while,_P _param) throws _E {
          Expr expr=(Expr)loop_while.getExpr().accept(this, _param);
          Block block=(Block)loop_while.getBlock().accept(this, _param);
          
     return new LoopWhile(expr, block);
   }
      @Override
   public Node visit(LoopDowhile loop_dowhile,_P _param) throws _E {
          Block block=(Block)loop_dowhile.getBlock().accept(this, _param);
          Expr expr=(Expr)loop_dowhile.getExpr().accept(this, _param);
          
     return new LoopDowhile(block, expr);
   }
      @Override
   public Node visit(LoopFor loop_for,_P _param) throws _E {
          ForLoopInit for_loop_init_optional=(ForLoopInit)loop_for.getForLoopInitOptional().accept(this, _param);
          Expr expr_optional=(Expr)loop_for.getExprOptional().accept(this, _param);
          ForLoopIncr for_loop_incr_optional=(ForLoopIncr)loop_for.getForLoopIncrOptional().accept(this, _param);
          Block block=(Block)loop_for.getBlock().accept(this, _param);
          
     return new LoopFor(for_loop_init_optional, expr_optional, for_loop_incr_optional, block);
   }
      @Override
   public Node visit(ForLoopInitDeclaration for_loop_init_declaration,_P _param) throws _E {
          Declaration declaration=(Declaration)for_loop_init_declaration.getDeclaration().accept(this, _param);
          
     return new ForLoopInitDeclaration(declaration);
   }
      @Override
   public Node visit(ForLoopInitAssignation for_loop_init_assignation,_P _param) throws _E {
          Assignation assignation=(Assignation)for_loop_init_assignation.getAssignation().accept(this, _param);
          
     return new ForLoopInitAssignation(assignation);
   }
      @Override
   public Node visit(ForLoopInitFuncall for_loop_init_funcall,_P _param) throws _E {
          Funcall funcall=(Funcall)for_loop_init_funcall.getFuncall().accept(this, _param);
          
     return new ForLoopInitFuncall(funcall);
   }
      @Override
   public Node visit(ForLoopIncrAssignation for_loop_incr_assignation,_P _param) throws _E {
          Assignation assignation=(Assignation)for_loop_incr_assignation.getAssignation().accept(this, _param);
          
     return new ForLoopIncrAssignation(assignation);
   }
      @Override
   public Node visit(ForLoopIncrFuncall for_loop_incr_funcall,_P _param) throws _E {
          Funcall funcall=(Funcall)for_loop_incr_funcall.getFuncall().accept(this, _param);
          
     return new ForLoopIncrFuncall(funcall);
   }
      @Override
   public Node visit(LoopLabel loop_label,_P _param) throws _E {
          IdToken id=(IdToken)loop_label.getId().accept(this, _param);
          
     return new LoopLabel(id);
   }
      @Override
   public Node visit(Assignation assignation,_P _param) throws _E {
          Lhs lhs=(Lhs)assignation.getLhs().accept(this, _param);
          Expr expr=(Expr)assignation.getExpr().accept(this, _param);
          
     return new Assignation(lhs, expr);
   }
      @Override
   public Node visit(LhsId lhs_id,_P _param) throws _E {
          IdToken id=(IdToken)lhs_id.getId().accept(this, _param);
          
     return new LhsId(id);
   }
      @Override
   public Node visit(LhsFieldAccess lhs_field_access,_P _param) throws _E {
          FieldAccess field_access=(FieldAccess)lhs_field_access.getFieldAccess().accept(this, _param);
          
     return new LhsFieldAccess(field_access);
   }
      @Override
   public Node visit(LhsArrayAccess lhs_array_access,_P _param) throws _E {
          ArrayAccess array_access=(ArrayAccess)lhs_array_access.getArrayAccess().accept(this, _param);
          
     return new LhsArrayAccess(array_access);
   }
      @Override
   public Node visit(PrimaryPrimaryNoArrayCreation primary_primary_no_array_creation,_P _param) throws _E {
          PrimaryNoArrayCreation primary_no_array_creation=(PrimaryNoArrayCreation)primary_primary_no_array_creation.getPrimaryNoArrayCreation().accept(this, _param);
          
     return new PrimaryPrimaryNoArrayCreation(primary_no_array_creation);
   }
      @Override
   public Node visit(PrimaryArrayCreation primary_array_creation,_P _param) throws _E {
          ArrayCreation array_creation=(ArrayCreation)primary_array_creation.getArrayCreation().accept(this, _param);
          
     return new PrimaryArrayCreation(array_creation);
   }
      @Override
   public Node visit(PrimaryFieldAccess primary_field_access,_P _param) throws _E {
          FieldAccess field_access=(FieldAccess)primary_field_access.getFieldAccess().accept(this, _param);
          
     return new PrimaryFieldAccess(field_access);
   }
      @Override
   public Node visit(PrimaryArrayAccess primary_array_access,_P _param) throws _E {
          ArrayAccess array_access=(ArrayAccess)primary_array_access.getArrayAccess().accept(this, _param);
          
     return new PrimaryArrayAccess(array_access);
   }
      @Override
   public Node visit(PrimaryParens primary_parens,_P _param) throws _E {
          Expr expr=(Expr)primary_parens.getExpr().accept(this, _param);
          
     return new PrimaryParens(expr);
   }
      @Override
   public Node visit(PrimaryAllocation primary_allocation,_P _param) throws _E {
          IdToken id=(IdToken)primary_allocation.getId().accept(this, _param);
          Arguments arguments=(Arguments)primary_allocation.getArguments().accept(this, _param);
          
     return new PrimaryAllocation(id, arguments);
   }
      @Override
   public Node visit(PrimaryFuncall primary_funcall,_P _param) throws _E {
          Funcall funcall=(Funcall)primary_funcall.getFuncall().accept(this, _param);
          
     return new PrimaryFuncall(funcall);
   }
      @Override
   public Node visit(ArrayAccessId array_access_id,_P _param) throws _E {
          IdToken id=(IdToken)array_access_id.getId().accept(this, _param);
          Expr expr=(Expr)array_access_id.getExpr().accept(this, _param);
          
     return new ArrayAccessId(id, expr);
   }
      @Override
   public Node visit(ArrayAccessPrimary array_access_primary,_P _param) throws _E {
          PrimaryNoArrayCreation primary_no_array_creation=(PrimaryNoArrayCreation)array_access_primary.getPrimaryNoArrayCreation().accept(this, _param);
          Expr expr=(Expr)array_access_primary.getExpr().accept(this, _param);
          
     return new ArrayAccessPrimary(primary_no_array_creation, expr);
   }
      @Override
   public Node visit(FieldAccessId field_access_id,_P _param) throws _E {
          IdToken id=(IdToken)field_access_id.getId().accept(this, _param);
          IdToken id2=(IdToken)field_access_id.getId2().accept(this, _param);
          
     return new FieldAccessId(id, id2);
   }
      @Override
   public Node visit(FieldAccessPrimary field_access_primary,_P _param) throws _E {
          Primary primary=(Primary)field_access_primary.getPrimary().accept(this, _param);
          IdToken id=(IdToken)field_access_primary.getId().accept(this, _param);
          
     return new FieldAccessPrimary(primary, id);
   }
      @Override
   public Node visit(ArrayCreationPrimitive array_creation_primitive,_P _param) throws _E {
          PrimitiveType primitive_type=(PrimitiveType)array_creation_primitive.getPrimitiveType().accept(this, _param);
          ArrayList<DimExpr> dim_expr_plus=new ArrayList<DimExpr>();
     for(Iterator<DimExpr> it=array_creation_primitive.getDimExprPlus().iterator(); it.hasNext();) {
       dim_expr_plus.add((DimExpr)it.next().accept(this, _param));
     }
          DimsOpt dims_opt=(DimsOpt)array_creation_primitive.getDimsOpt().accept(this, _param);
          
     return new ArrayCreationPrimitive(primitive_type, dim_expr_plus, dims_opt);
   }
      @Override
   public Node visit(ArrayCreationRecord array_creation_record,_P _param) throws _E {
          IdToken id=(IdToken)array_creation_record.getId().accept(this, _param);
          ArrayList<DimExpr> dim_expr_plus=new ArrayList<DimExpr>();
     for(Iterator<DimExpr> it=array_creation_record.getDimExprPlus().iterator(); it.hasNext();) {
       dim_expr_plus.add((DimExpr)it.next().accept(this, _param));
     }
          DimsOpt dims_opt=(DimsOpt)array_creation_record.getDimsOpt().accept(this, _param);
          
     return new ArrayCreationRecord(id, dim_expr_plus, dims_opt);
   }
      @Override
   public Node visit(DimExpr dim_expr,_P _param) throws _E {
          Expr expr=(Expr)dim_expr.getExpr().accept(this, _param);
          
     return new DimExpr(expr);
   }
      @Override
   public Node visit(DimsOptDims dims_opt_dims,_P _param) throws _E {
          Dims dims=(Dims)dims_opt_dims.getDims().accept(this, _param);
          
     return new DimsOptDims(dims);
   }
      @Override
   public Node visit(DimsOptEmpty dims_opt_empty,_P _param) throws _E {
          
     return new DimsOptEmpty();
   }
      @Override
   public Node visit(DimsSingleton dims_singleton,_P _param) throws _E {
          
     return new DimsSingleton();
   }
      @Override
   public Node visit(DimsRecursive dims_recursive,_P _param) throws _E {
          Dims dims=(Dims)dims_recursive.getDims().accept(this, _param);
          
     return new DimsRecursive(dims);
   }
      @Override
   public Node visit(ExprBooleanLiteral expr_boolean_literal,_P _param) throws _E {
          BooleanLiteralToken boolean_literal=(BooleanLiteralToken)expr_boolean_literal.getBooleanLiteral().accept(this, _param);
          
     return new ExprBooleanLiteral(boolean_literal);
   }
      @Override
   public Node visit(ExprCharLiteral expr_char_literal,_P _param) throws _E {
          CharLiteralToken char_literal=(CharLiteralToken)expr_char_literal.getCharLiteral().accept(this, _param);
          
     return new ExprCharLiteral(char_literal);
   }
      @Override
   public Node visit(ExprValueLiteral expr_value_literal,_P _param) throws _E {
          ValueLiteralToken value_literal=(ValueLiteralToken)expr_value_literal.getValueLiteral().accept(this, _param);
          
     return new ExprValueLiteral(value_literal);
   }
      @Override
   public Node visit(ExprStringLiteral expr_string_literal,_P _param) throws _E {
          StringLiteralToken string_literal=(StringLiteralToken)expr_string_literal.getStringLiteral().accept(this, _param);
          
     return new ExprStringLiteral(string_literal);
   }
      @Override
   public Node visit(ExprNullLiteral expr_null_literal,_P _param) throws _E {
          
     return new ExprNullLiteral();
   }
      @Override
   public Node visit(ExprId expr_id,_P _param) throws _E {
          IdToken id=(IdToken)expr_id.getId().accept(this, _param);
          
     return new ExprId(id);
   }
      @Override
   public Node visit(ExprPrimary expr_primary,_P _param) throws _E {
          Primary primary=(Primary)expr_primary.getPrimary().accept(this, _param);
          
     return new ExprPrimary(primary);
   }
      @Override
   public Node visit(ExprLambda expr_lambda,_P _param) throws _E {
          Parameters parameters=(Parameters)expr_lambda.getParameters().accept(this, _param);
          Expr expr=(Expr)expr_lambda.getExpr().accept(this, _param);
          
     return new ExprLambda(parameters, expr);
   }
      @Override
   public Node visit(ExprNeg expr_neg,_P _param) throws _E {
          Expr expr=(Expr)expr_neg.getExpr().accept(this, _param);
          
     return new ExprNeg(expr);
   }
      @Override
   public Node visit(ExprUnaryPlus expr_unary_plus,_P _param) throws _E {
          Expr expr=(Expr)expr_unary_plus.getExpr().accept(this, _param);
          
     return new ExprUnaryPlus(expr);
   }
      @Override
   public Node visit(ExprUnaryMinus expr_unary_minus,_P _param) throws _E {
          Expr expr=(Expr)expr_unary_minus.getExpr().accept(this, _param);
          
     return new ExprUnaryMinus(expr);
   }
      @Override
   public Node visit(ExprEq expr_eq,_P _param) throws _E {
          Expr expr=(Expr)expr_eq.getExpr().accept(this, _param);
          Expr expr2=(Expr)expr_eq.getExpr2().accept(this, _param);
          
     return new ExprEq(expr, expr2);
   }
      @Override
   public Node visit(ExprNe expr_ne,_P _param) throws _E {
          Expr expr=(Expr)expr_ne.getExpr().accept(this, _param);
          Expr expr2=(Expr)expr_ne.getExpr2().accept(this, _param);
          
     return new ExprNe(expr, expr2);
   }
      @Override
   public Node visit(ExprLt expr_lt,_P _param) throws _E {
          Expr expr=(Expr)expr_lt.getExpr().accept(this, _param);
          Expr expr2=(Expr)expr_lt.getExpr2().accept(this, _param);
          
     return new ExprLt(expr, expr2);
   }
      @Override
   public Node visit(ExprLe expr_le,_P _param) throws _E {
          Expr expr=(Expr)expr_le.getExpr().accept(this, _param);
          Expr expr2=(Expr)expr_le.getExpr2().accept(this, _param);
          
     return new ExprLe(expr, expr2);
   }
      @Override
   public Node visit(ExprGt expr_gt,_P _param) throws _E {
          Expr expr=(Expr)expr_gt.getExpr().accept(this, _param);
          Expr expr2=(Expr)expr_gt.getExpr2().accept(this, _param);
          
     return new ExprGt(expr, expr2);
   }
      @Override
   public Node visit(ExprGe expr_ge,_P _param) throws _E {
          Expr expr=(Expr)expr_ge.getExpr().accept(this, _param);
          Expr expr2=(Expr)expr_ge.getExpr2().accept(this, _param);
          
     return new ExprGe(expr, expr2);
   }
      @Override
   public Node visit(ExprBand expr_band,_P _param) throws _E {
          Expr expr=(Expr)expr_band.getExpr().accept(this, _param);
          Expr expr2=(Expr)expr_band.getExpr2().accept(this, _param);
          
     return new ExprBand(expr, expr2);
   }
      @Override
   public Node visit(ExprBor expr_bor,_P _param) throws _E {
          Expr expr=(Expr)expr_bor.getExpr().accept(this, _param);
          Expr expr2=(Expr)expr_bor.getExpr2().accept(this, _param);
          
     return new ExprBor(expr, expr2);
   }
      @Override
   public Node visit(ExprPlus expr_plus,_P _param) throws _E {
          Expr expr=(Expr)expr_plus.getExpr().accept(this, _param);
          Expr expr2=(Expr)expr_plus.getExpr2().accept(this, _param);
          
     return new ExprPlus(expr, expr2);
   }
      @Override
   public Node visit(ExprMinus expr_minus,_P _param) throws _E {
          Expr expr=(Expr)expr_minus.getExpr().accept(this, _param);
          Expr expr2=(Expr)expr_minus.getExpr2().accept(this, _param);
          
     return new ExprMinus(expr, expr2);
   }
      @Override
   public Node visit(ExprStar expr_star,_P _param) throws _E {
          Expr expr=(Expr)expr_star.getExpr().accept(this, _param);
          Expr expr2=(Expr)expr_star.getExpr2().accept(this, _param);
          
     return new ExprStar(expr, expr2);
   }
      @Override
   public Node visit(ExprSlash expr_slash,_P _param) throws _E {
          Expr expr=(Expr)expr_slash.getExpr().accept(this, _param);
          Expr expr2=(Expr)expr_slash.getExpr2().accept(this, _param);
          
     return new ExprSlash(expr, expr2);
   }
      @Override
   public Node visit(ExprMod expr_mod,_P _param) throws _E {
          Expr expr=(Expr)expr_mod.getExpr().accept(this, _param);
          Expr expr2=(Expr)expr_mod.getExpr2().accept(this, _param);
          
     return new ExprMod(expr, expr2);
   }
      @Override
   public Node visit(ExprPow expr_pow,_P _param) throws _E {
          Expr expr=(Expr)expr_pow.getExpr().accept(this, _param);
          Expr expr2=(Expr)expr_pow.getExpr2().accept(this, _param);
          
     return new ExprPow(expr, expr2);
   }
        @Override
   public Node visit(BooleanLiteralToken boolean_literal,_P _param) throws _E {     return new BooleanLiteralToken(boolean_literal.getValue());   }
      @Override
   public Node visit(CharLiteralToken char_literal,_P _param) throws _E {     return new CharLiteralToken(char_literal.getValue());   }
      @Override
   public Node visit(StringLiteralToken string_literal,_P _param) throws _E {     return new StringLiteralToken(string_literal.getValue());   }
      @Override
   public Node visit(ValueLiteralToken value_literal,_P _param) throws _E {     return new ValueLiteralToken(value_literal.getValue());   }
      @Override
   public Node visit(IdToken id,_P _param) throws _E {     return new IdToken(id.getValue());   }
   }
