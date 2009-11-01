package com.googlecode.pseudo.compiler.ast;

/**
 *
 *  This class is generated - please do not edit it 
 */
public class Visitor<_R,_P,_E extends Exception> {
     public _R visit(PrimitiveTypeBoolean primitive_type_boolean,_P _param) throws _E {
     return visit((PrimitiveType)primitive_type_boolean,_param);
   }
      public _R visit(PrimitiveTypeChar primitive_type_char,_P _param) throws _E {
     return visit((PrimitiveType)primitive_type_char,_param);
   }
      public _R visit(PrimitiveTypeInt primitive_type_int,_P _param) throws _E {
     return visit((PrimitiveType)primitive_type_int,_param);
   }
      public _R visit(PrimitiveTypeDouble primitive_type_double,_P _param) throws _E {
     return visit((PrimitiveType)primitive_type_double,_param);
   }
      public _R visit(PrimitiveTypeString primitive_type_string,_P _param) throws _E {
     return visit((PrimitiveType)primitive_type_string,_param);
   }
      public _R visit(PrimitiveTypeAny primitive_type_any,_P _param) throws _E {
     return visit((PrimitiveType)primitive_type_any,_param);
   }
      public _R visit(TypeId type_id,_P _param) throws _E {
     return visit((Type)type_id,_param);
   }
      public _R visit(TypeIdDims type_id_dims,_P _param) throws _E {
     return visit((Type)type_id_dims,_param);
   }
      public _R visit(TypePrimitive type_primitive,_P _param) throws _E {
     return visit((Type)type_primitive,_param);
   }
      public _R visit(TypePrimitiveDims type_primitive_dims,_P _param) throws _E {
     return visit((Type)type_primitive_dims,_param);
   }
      public _R visit(TypeFuntype type_funtype,_P _param) throws _E {
     return visit((Type)type_funtype,_param);
   }
      public _R visit(TypeFuntypeDims type_funtype_dims,_P _param) throws _E {
     return visit((Type)type_funtype_dims,_param);
   }
      public _R visit(Funtype funtype,_P _param) throws _E {
     return visit((Node)funtype,_param);
   }
      public _R visit(ReturnTypeType return_type_type,_P _param) throws _E {
     return visit((ReturnType)return_type_type,_param);
   }
      public _R visit(ReturnTypeVoid return_type_void,_P _param) throws _E {
     return visit((ReturnType)return_type_void,_param);
   }
      public _R visit(Start start,_P _param) throws _E {
     return visit((Node)start,_param);
   }
      public _R visit(ScriptMemberRecordDef script_member_record_def,_P _param) throws _E {
     return visit((ScriptMember)script_member_record_def,_param);
   }
      public _R visit(ScriptMemberFunctionDef script_member_function_def,_P _param) throws _E {
     return visit((ScriptMember)script_member_function_def,_param);
   }
      public _R visit(ScriptMemberBlock script_member_block,_P _param) throws _E {
     return visit((ScriptMember)script_member_block,_param);
   }
      public _R visit(RecordDef record_def,_P _param) throws _E {
     return visit((Node)record_def,_param);
   }
      public _R visit(RecordInit record_init,_P _param) throws _E {
     return visit((Node)record_init,_param);
   }
      public _R visit(Field field,_P _param) throws _E {
     return visit((Node)field,_param);
   }
      public _R visit(FunctionDef function_def,_P _param) throws _E {
     return visit((Node)function_def,_param);
   }
      public _R visit(FunctionRtype function_rtype,_P _param) throws _E {
     return visit((Node)function_rtype,_param);
   }
      public _R visit(Parameters parameters,_P _param) throws _E {
     return visit((Node)parameters,_param);
   }
      public _R visit(ParameterNaked parameter_naked,_P _param) throws _E {
     return visit((Parameter)parameter_naked,_param);
   }
      public _R visit(ParameterTyped parameter_typed,_P _param) throws _E {
     return visit((Parameter)parameter_typed,_param);
   }
      public _R visit(Arguments arguments,_P _param) throws _E {
     return visit((Node)arguments,_param);
   }
      public _R visit(Block block,_P _param) throws _E {
     return visit((Node)block,_param);
   }
      public _R visit(InstrPrint instr_print,_P _param) throws _E {
     return visit((Instr)instr_print,_param);
   }
      public _R visit(InstrScan instr_scan,_P _param) throws _E {
     return visit((Instr)instr_scan,_param);
   }
      public _R visit(InstrDeclaration instr_declaration,_P _param) throws _E {
     return visit((Instr)instr_declaration,_param);
   }
      public _R visit(InstrAssignation instr_assignation,_P _param) throws _E {
     return visit((Instr)instr_assignation,_param);
   }
      public _R visit(InstrFuncall instr_funcall,_P _param) throws _E {
     return visit((Instr)instr_funcall,_param);
   }
      public _R visit(InstrConditional instr_conditional,_P _param) throws _E {
     return visit((Instr)instr_conditional,_param);
   }
      public _R visit(InstrLoop instr_loop,_P _param) throws _E {
     return visit((Instr)instr_loop,_param);
   }
      public _R visit(InstrBreak instr_break,_P _param) throws _E {
     return visit((Instr)instr_break,_param);
   }
      public _R visit(InstrContinue instr_continue,_P _param) throws _E {
     return visit((Instr)instr_continue,_param);
   }
      public _R visit(InstrReturn instr_return,_P _param) throws _E {
     return visit((Instr)instr_return,_param);
   }
      public _R visit(InstrThrow instr_throw,_P _param) throws _E {
     return visit((Instr)instr_throw,_param);
   }
      public _R visit(InstrBlock instr_block,_P _param) throws _E {
     return visit((Instr)instr_block,_param);
   }
      public _R visit(InstrEmpty instr_empty,_P _param) throws _E {
     return visit((Instr)instr_empty,_param);
   }
      public _R visit(SemisSemicolon semis__semicolon,_P _param) throws _E {
     return visit((Semis)semis__semicolon,_param);
   }
      public _R visit(SemisEoln semis__eoln,_P _param) throws _E {
     return visit((Semis)semis__eoln,_param);
   }
      public _R visit(DeclarationId declaration_id,_P _param) throws _E {
     return visit((Declaration)declaration_id,_param);
   }
      public _R visit(DeclarationIdInit declaration_id_init,_P _param) throws _E {
     return visit((Declaration)declaration_id_init,_param);
   }
      public _R visit(FuncallId funcall_id,_P _param) throws _E {
     return visit((Funcall)funcall_id,_param);
   }
      public _R visit(FuncallPrimary funcall_primary,_P _param) throws _E {
     return visit((Funcall)funcall_primary,_param);
   }
      public _R visit(ConditionalIf conditional_if,_P _param) throws _E {
     return visit((Conditional)conditional_if,_param);
   }
      public _R visit(ConditionalIfElse conditional_if_else,_P _param) throws _E {
     return visit((Conditional)conditional_if_else,_param);
   }
      public _R visit(LoopWhile loop_while,_P _param) throws _E {
     return visit((Loop)loop_while,_param);
   }
      public _R visit(LoopDowhile loop_dowhile,_P _param) throws _E {
     return visit((Loop)loop_dowhile,_param);
   }
      public _R visit(LoopFor loop_for,_P _param) throws _E {
     return visit((Loop)loop_for,_param);
   }
      public _R visit(ForLoopInitDeclaration for_loop_init_declaration,_P _param) throws _E {
     return visit((ForLoopInit)for_loop_init_declaration,_param);
   }
      public _R visit(ForLoopInitAssignation for_loop_init_assignation,_P _param) throws _E {
     return visit((ForLoopInit)for_loop_init_assignation,_param);
   }
      public _R visit(ForLoopInitFuncall for_loop_init_funcall,_P _param) throws _E {
     return visit((ForLoopInit)for_loop_init_funcall,_param);
   }
      public _R visit(ForLoopIncrAssignation for_loop_incr_assignation,_P _param) throws _E {
     return visit((ForLoopIncr)for_loop_incr_assignation,_param);
   }
      public _R visit(ForLoopIncrFuncall for_loop_incr_funcall,_P _param) throws _E {
     return visit((ForLoopIncr)for_loop_incr_funcall,_param);
   }
      public _R visit(LoopLabel loop_label,_P _param) throws _E {
     return visit((Node)loop_label,_param);
   }
      public _R visit(Assignation assignation,_P _param) throws _E {
     return visit((Node)assignation,_param);
   }
      public _R visit(LhsId lhs_id,_P _param) throws _E {
     return visit((Lhs)lhs_id,_param);
   }
      public _R visit(LhsFieldAccess lhs_field_access,_P _param) throws _E {
     return visit((Lhs)lhs_field_access,_param);
   }
      public _R visit(LhsArrayAccess lhs_array_access,_P _param) throws _E {
     return visit((Lhs)lhs_array_access,_param);
   }
      public _R visit(PrimaryPrimaryNoArrayCreation primary_primary_no_array_creation,_P _param) throws _E {
     return visit((Primary)primary_primary_no_array_creation,_param);
   }
      public _R visit(PrimaryArrayCreation primary_array_creation,_P _param) throws _E {
     return visit((Primary)primary_array_creation,_param);
   }
      public _R visit(PrimaryFieldAccess primary_field_access,_P _param) throws _E {
     return visit((PrimaryNoArrayCreation)primary_field_access,_param);
   }
      public _R visit(PrimaryArrayAccess primary_array_access,_P _param) throws _E {
     return visit((PrimaryNoArrayCreation)primary_array_access,_param);
   }
      public _R visit(PrimaryParens primary_parens,_P _param) throws _E {
     return visit((PrimaryNoArrayCreation)primary_parens,_param);
   }
      public _R visit(PrimaryAllocation primary_allocation,_P _param) throws _E {
     return visit((PrimaryNoArrayCreation)primary_allocation,_param);
   }
      public _R visit(PrimaryFuncall primary_funcall,_P _param) throws _E {
     return visit((PrimaryNoArrayCreation)primary_funcall,_param);
   }
      public _R visit(ArrayAccessId array_access_id,_P _param) throws _E {
     return visit((ArrayAccess)array_access_id,_param);
   }
      public _R visit(ArrayAccessPrimary array_access_primary,_P _param) throws _E {
     return visit((ArrayAccess)array_access_primary,_param);
   }
      public _R visit(FieldAccessId field_access_id,_P _param) throws _E {
     return visit((FieldAccess)field_access_id,_param);
   }
      public _R visit(FieldAccessPrimary field_access_primary,_P _param) throws _E {
     return visit((FieldAccess)field_access_primary,_param);
   }
      public _R visit(ArrayCreationPrimitive array_creation_primitive,_P _param) throws _E {
     return visit((ArrayCreation)array_creation_primitive,_param);
   }
      public _R visit(ArrayCreationRecord array_creation_record,_P _param) throws _E {
     return visit((ArrayCreation)array_creation_record,_param);
   }
      public _R visit(DimExpr dim_expr,_P _param) throws _E {
     return visit((Node)dim_expr,_param);
   }
      public _R visit(DimsOptDims dims_opt_dims,_P _param) throws _E {
     return visit((DimsOpt)dims_opt_dims,_param);
   }
      public _R visit(DimsOptEmpty dims_opt_empty,_P _param) throws _E {
     return visit((DimsOpt)dims_opt_empty,_param);
   }
      public _R visit(DimsSingleton dims_singleton,_P _param) throws _E {
     return visit((Dims)dims_singleton,_param);
   }
      public _R visit(DimsRecursive dims_recursive,_P _param) throws _E {
     return visit((Dims)dims_recursive,_param);
   }
      public _R visit(ExprBooleanLiteral expr_boolean_literal,_P _param) throws _E {
     return visit((Expr)expr_boolean_literal,_param);
   }
      public _R visit(ExprCharLiteral expr_char_literal,_P _param) throws _E {
     return visit((Expr)expr_char_literal,_param);
   }
      public _R visit(ExprValueLiteral expr_value_literal,_P _param) throws _E {
     return visit((Expr)expr_value_literal,_param);
   }
      public _R visit(ExprStringLiteral expr_string_literal,_P _param) throws _E {
     return visit((Expr)expr_string_literal,_param);
   }
      public _R visit(ExprNullLiteral expr_null_literal,_P _param) throws _E {
     return visit((Expr)expr_null_literal,_param);
   }
      public _R visit(ExprId expr_id,_P _param) throws _E {
     return visit((Expr)expr_id,_param);
   }
      public _R visit(ExprPrimary expr_primary,_P _param) throws _E {
     return visit((Expr)expr_primary,_param);
   }
      public _R visit(ExprLambda expr_lambda,_P _param) throws _E {
     return visit((Expr)expr_lambda,_param);
   }
      public _R visit(ExprNeg expr_neg,_P _param) throws _E {
     return visit((Expr)expr_neg,_param);
   }
      public _R visit(ExprUnaryPlus expr_unary_plus,_P _param) throws _E {
     return visit((Expr)expr_unary_plus,_param);
   }
      public _R visit(ExprUnaryMinus expr_unary_minus,_P _param) throws _E {
     return visit((Expr)expr_unary_minus,_param);
   }
      public _R visit(ExprEq expr_eq,_P _param) throws _E {
     return visit((Expr)expr_eq,_param);
   }
      public _R visit(ExprNe expr_ne,_P _param) throws _E {
     return visit((Expr)expr_ne,_param);
   }
      public _R visit(ExprLt expr_lt,_P _param) throws _E {
     return visit((Expr)expr_lt,_param);
   }
      public _R visit(ExprLe expr_le,_P _param) throws _E {
     return visit((Expr)expr_le,_param);
   }
      public _R visit(ExprGt expr_gt,_P _param) throws _E {
     return visit((Expr)expr_gt,_param);
   }
      public _R visit(ExprGe expr_ge,_P _param) throws _E {
     return visit((Expr)expr_ge,_param);
   }
      public _R visit(ExprBand expr_band,_P _param) throws _E {
     return visit((Expr)expr_band,_param);
   }
      public _R visit(ExprBor expr_bor,_P _param) throws _E {
     return visit((Expr)expr_bor,_param);
   }
      public _R visit(ExprPlus expr_plus,_P _param) throws _E {
     return visit((Expr)expr_plus,_param);
   }
      public _R visit(ExprMinus expr_minus,_P _param) throws _E {
     return visit((Expr)expr_minus,_param);
   }
      public _R visit(ExprStar expr_star,_P _param) throws _E {
     return visit((Expr)expr_star,_param);
   }
      public _R visit(ExprSlash expr_slash,_P _param) throws _E {
     return visit((Expr)expr_slash,_param);
   }
      public _R visit(ExprMod expr_mod,_P _param) throws _E {
     return visit((Expr)expr_mod,_param);
   }
      public _R visit(ExprPow expr_pow,_P _param) throws _E {
     return visit((Expr)expr_pow,_param);
   }
        protected _R visit(PrimitiveType primitive_type,_P _param) throws _E {
     return visit((Node)primitive_type,_param);
   }
      protected _R visit(Type type,_P _param) throws _E {
     return visit((Node)type,_param);
   }
      protected _R visit(ReturnType return_type,_P _param) throws _E {
     return visit((Node)return_type,_param);
   }
      protected _R visit(ScriptMember script_member,_P _param) throws _E {
     return visit((Node)script_member,_param);
   }
      protected _R visit(Parameter parameter,_P _param) throws _E {
     return visit((Node)parameter,_param);
   }
      protected _R visit(Instr instr,_P _param) throws _E {
     return visit((Node)instr,_param);
   }
      protected _R visit(Semis semis,_P _param) throws _E {
     return visit((Node)semis,_param);
   }
      protected _R visit(Declaration declaration,_P _param) throws _E {
     return visit((Node)declaration,_param);
   }
      protected _R visit(Funcall funcall,_P _param) throws _E {
     return visit((Node)funcall,_param);
   }
      protected _R visit(Conditional conditional,_P _param) throws _E {
     return visit((Node)conditional,_param);
   }
      protected _R visit(Loop loop,_P _param) throws _E {
     return visit((Node)loop,_param);
   }
      protected _R visit(ForLoopInit for_loop_init,_P _param) throws _E {
     return visit((Node)for_loop_init,_param);
   }
      protected _R visit(ForLoopIncr for_loop_incr,_P _param) throws _E {
     return visit((Node)for_loop_incr,_param);
   }
      protected _R visit(Lhs lhs,_P _param) throws _E {
     return visit((Node)lhs,_param);
   }
      protected _R visit(Primary primary,_P _param) throws _E {
     return visit((Node)primary,_param);
   }
      protected _R visit(PrimaryNoArrayCreation primary_no_array_creation,_P _param) throws _E {
     return visit((Node)primary_no_array_creation,_param);
   }
      protected _R visit(ArrayAccess array_access,_P _param) throws _E {
     return visit((Node)array_access,_param);
   }
      protected _R visit(FieldAccess field_access,_P _param) throws _E {
     return visit((Node)field_access,_param);
   }
      protected _R visit(ArrayCreation array_creation,_P _param) throws _E {
     return visit((Node)array_creation,_param);
   }
      protected _R visit(DimsOpt dims_opt,_P _param) throws _E {
     return visit((Node)dims_opt,_param);
   }
      protected _R visit(Dims dims,_P _param) throws _E {
     return visit((Node)dims,_param);
   }
      protected _R visit(Expr expr,_P _param) throws _E {
     return visit((Node)expr,_param);
   }
        public _R visit(BooleanLiteralToken boolean_literal,_P _param) throws _E {
     return visit((Node)boolean_literal,_param);
   }
      public _R visit(CharLiteralToken char_literal,_P _param) throws _E {
     return visit((Node)char_literal,_param);
   }
      public _R visit(StringLiteralToken string_literal,_P _param) throws _E {
     return visit((Node)string_literal,_param);
   }
      public _R visit(ValueLiteralToken value_literal,_P _param) throws _E {
     return visit((Node)value_literal,_param);
   }
      public _R visit(IdToken id,_P _param) throws _E {
     return visit((Node)id,_param);
   }
     /** Default type visitor.
     *  The implementation always throws an {@link AssertionError}.
     * 
     * @param node the visited node.
     * @param _param a parameter value.
     * @return a return value.
     * @throws _E an exception (runtime or not).
     */
  protected _R visit(Node node,_P _param) throws _E {
     throw new AssertionError("default visit not defined");
  }
}
