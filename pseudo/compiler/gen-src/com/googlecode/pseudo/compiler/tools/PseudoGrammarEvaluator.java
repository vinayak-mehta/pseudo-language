package com.googlecode.pseudo.compiler.tools;

import com.googlecode.pseudo.compiler.ast.Arguments;
import com.googlecode.pseudo.compiler.ast.ArrayAccess;
import com.googlecode.pseudo.compiler.ast.ArrayCreation;
import com.googlecode.pseudo.compiler.ast.Assignation;
import com.googlecode.pseudo.compiler.ast.Block;
import com.googlecode.pseudo.compiler.ast.BooleanLiteralToken;
import com.googlecode.pseudo.compiler.ast.CharLiteralToken;
import com.googlecode.pseudo.compiler.ast.Conditional;
import com.googlecode.pseudo.compiler.ast.Declaration;
import com.googlecode.pseudo.compiler.ast.DimExpr;
import com.googlecode.pseudo.compiler.ast.Dims;
import com.googlecode.pseudo.compiler.ast.DimsOpt;
import com.googlecode.pseudo.compiler.ast.Expr;
import com.googlecode.pseudo.compiler.ast.Field;
import com.googlecode.pseudo.compiler.ast.FieldAccess;
import com.googlecode.pseudo.compiler.ast.ForLoopIncr;
import com.googlecode.pseudo.compiler.ast.ForLoopInit;
import com.googlecode.pseudo.compiler.ast.Funcall;
import com.googlecode.pseudo.compiler.ast.FunctionDef;
import com.googlecode.pseudo.compiler.ast.FunctionRtype;
import com.googlecode.pseudo.compiler.ast.Funtype;
import com.googlecode.pseudo.compiler.ast.IdToken;
import com.googlecode.pseudo.compiler.ast.Instr;
import com.googlecode.pseudo.compiler.ast.Lhs;
import com.googlecode.pseudo.compiler.ast.Loop;
import com.googlecode.pseudo.compiler.ast.LoopLabel;
import com.googlecode.pseudo.compiler.ast.Parameter;
import com.googlecode.pseudo.compiler.ast.Parameters;
import com.googlecode.pseudo.compiler.ast.Primary;
import com.googlecode.pseudo.compiler.ast.PrimaryNoArrayCreation;
import com.googlecode.pseudo.compiler.ast.PrimitiveType;
import com.googlecode.pseudo.compiler.ast.RecordDef;
import com.googlecode.pseudo.compiler.ast.RecordInit;
import com.googlecode.pseudo.compiler.ast.ReturnType;
import com.googlecode.pseudo.compiler.ast.ScriptMember;
import com.googlecode.pseudo.compiler.ast.Semis;
import com.googlecode.pseudo.compiler.ast.Start;
import com.googlecode.pseudo.compiler.ast.StringLiteralToken;
import com.googlecode.pseudo.compiler.ast.Type;
import com.googlecode.pseudo.compiler.ast.ValueLiteralToken;
import java.util.List;

/** 
 *  This class is generated - please do not edit it 
 */
public interface PseudoGrammarEvaluator {
  /** This methods is called after the reduction of the non terminal primitive_type
   *  by the grammar production primitive_type_boolean.
   *  <code>primitive_type ::= _boolean</code>
   */
  public PrimitiveType primitive_type_boolean();
  /** This methods is called after the reduction of the non terminal primitive_type
   *  by the grammar production primitive_type_char.
   *  <code>primitive_type ::= _char</code>
   */
  public PrimitiveType primitive_type_char();
  /** This methods is called after the reduction of the non terminal primitive_type
   *  by the grammar production primitive_type_int.
   *  <code>primitive_type ::= _int</code>
   */
  public PrimitiveType primitive_type_int();
  /** This methods is called after the reduction of the non terminal primitive_type
   *  by the grammar production primitive_type_double.
   *  <code>primitive_type ::= _double</code>
   */
  public PrimitiveType primitive_type_double();
  /** This methods is called after the reduction of the non terminal primitive_type
   *  by the grammar production primitive_type_string.
   *  <code>primitive_type ::= string</code>
   */
  public PrimitiveType primitive_type_string();
  /** This methods is called after the reduction of the non terminal primitive_type
   *  by the grammar production primitive_type_any.
   *  <code>primitive_type ::= any</code>
   */
  public PrimitiveType primitive_type_any();
  /** This methods is called after the reduction of the non terminal type
   *  by the grammar production type_id.
   *  <code>type ::= id</code>
   */
  public Type type_id(IdToken id);
  /** This methods is called after the reduction of the non terminal type
   *  by the grammar production type_id_dims.
   *  <code>type ::= id dims</code>
   */
  public Type type_id_dims(IdToken id,Dims dims);
  /** This methods is called after the reduction of the non terminal type
   *  by the grammar production type_primitive.
   *  <code>type ::= primitive_type</code>
   */
  public Type type_primitive(PrimitiveType primitive_type);
  /** This methods is called after the reduction of the non terminal type
   *  by the grammar production type_primitive_dims.
   *  <code>type ::= primitive_type dims</code>
   */
  public Type type_primitive_dims(PrimitiveType primitive_type,Dims dims);
  /** This methods is called after the reduction of the non terminal type
   *  by the grammar production type_funtype.
   *  <code>type ::= funtype</code>
   */
  public Type type_funtype(Funtype funtype);
  /** This methods is called after the reduction of the non terminal type
   *  by the grammar production type_funtype_dims.
   *  <code>type ::= funtype dims</code>
   */
  public Type type_funtype_dims(Funtype funtype,Dims dims);
  /** This methods is called after the reduction of the non terminal funtype
   *  by the grammar production funtype.
   *  <code>funtype ::= lpar type_star_0 colon return_type rpar</code>
   */
  public Funtype funtype(List<Type> type_star,ReturnType return_type);
  /** This methods is called after the reduction of the non terminal return_type
   *  by the grammar production return_type_type.
   *  <code>return_type ::= type</code>
   */
  public ReturnType return_type_type(Type type);
  /** This methods is called after the reduction of the non terminal return_type
   *  by the grammar production return_type_void.
   *  <code>return_type ::= _void</code>
   */
  public ReturnType return_type_void();
  /** This methods is called after the reduction of the non terminal start
   *  by the grammar production start.
   *  <code>start ::= script_member_star_1</code>
   */
  public Start start(List<ScriptMember> script_member_star);
  /** This methods is called after the reduction of the non terminal script_member
   *  by the grammar production script_member_record_def.
   *  <code>script_member ::= record_def</code>
   */
  public ScriptMember script_member_record_def(RecordDef record_def);
  /** This methods is called after the reduction of the non terminal script_member
   *  by the grammar production script_member_function_def.
   *  <code>script_member ::= function_def</code>
   */
  public ScriptMember script_member_function_def(FunctionDef function_def);
  /** This methods is called after the reduction of the non terminal script_member
   *  by the grammar production script_member_block.
   *  <code>script_member ::= block</code>
   */
  public ScriptMember script_member_block(Block block);
  /** This methods is called after the reduction of the non terminal record_def
   *  by the grammar production record_def.
   *  <code>record_def ::= record id lcurl field_star_2 record_init_optional_3 rcurl</code>
   */
  public RecordDef record_def(IdToken id,List<Field> field_star,RecordInit record_init_optional);
  /** This methods is called after the reduction of the non terminal record_init
   *  by the grammar production record_init.
   *  <code>record_init ::= init lpar parameters rpar block</code>
   */
  public RecordInit record_init(Parameters parameters,Block block);
  /** This methods is called after the reduction of the non terminal field
   *  by the grammar production field.
   *  <code>field ::= type id semis</code>
   */
  public Field field(Type type,IdToken id,Semis semis);
  /** This methods is called after the reduction of the non terminal function_def
   *  by the grammar production function_def.
   *  <code>function_def ::= def id lpar parameters rpar function_rtype_optional_4 block</code>
   */
  public FunctionDef function_def(IdToken id,Parameters parameters,FunctionRtype function_rtype_optional,Block block);
  /** This methods is called after the reduction of the non terminal function_rtype
   *  by the grammar production function_rtype.
   *  <code>function_rtype ::= colon return_type</code>
   */
  public FunctionRtype function_rtype(ReturnType return_type);
  /** This methods is called after the reduction of the non terminal parameters
   *  by the grammar production parameters.
   *  <code>parameters ::= parameter_star_5</code>
   */
  public Parameters parameters(List<Parameter> parameter_star);
  /** This methods is called after the reduction of the non terminal parameter
   *  by the grammar production parameter_naked.
   *  <code>parameter ::= id</code>
   */
  public Parameter parameter_naked(IdToken id);
  /** This methods is called after the reduction of the non terminal parameter
   *  by the grammar production parameter_typed.
   *  <code>parameter ::= type id</code>
   */
  public Parameter parameter_typed(Type type,IdToken id);
  /** This methods is called after the reduction of the non terminal arguments
   *  by the grammar production arguments.
   *  <code>arguments ::= expr_star_6</code>
   */
  public Arguments arguments(List<Expr> expr_star);
  /** This methods is called after the reduction of the non terminal block
   *  by the grammar production block.
   *  <code>block ::= lcurl instr_star_7 rcurl</code>
   */
  public Block block(List<Instr> instr_star);
  /** This methods is called after the reduction of the non terminal instr
   *  by the grammar production instr_print.
   *  <code>instr ::= print expr semis</code>
   */
  public Instr instr_print(Expr expr,Semis semis);
  /** This methods is called after the reduction of the non terminal instr
   *  by the grammar production instr_scan.
   *  <code>instr ::= scan primary semis</code>
   */
  public Instr instr_scan(Primary primary,Semis semis);
  /** This methods is called after the reduction of the non terminal instr
   *  by the grammar production instr_declaration.
   *  <code>instr ::= declaration semis</code>
   */
  public Instr instr_declaration(Declaration declaration,Semis semis);
  /** This methods is called after the reduction of the non terminal instr
   *  by the grammar production instr_assignation.
   *  <code>instr ::= assignation semis</code>
   */
  public Instr instr_assignation(Assignation assignation,Semis semis);
  /** This methods is called after the reduction of the non terminal instr
   *  by the grammar production instr_funcall.
   *  <code>instr ::= funcall semis</code>
   */
  public Instr instr_funcall(Funcall funcall,Semis semis);
  /** This methods is called after the reduction of the non terminal instr
   *  by the grammar production instr_conditional.
   *  <code>instr ::= conditional</code>
   */
  public Instr instr_conditional(Conditional conditional);
  /** This methods is called after the reduction of the non terminal instr
   *  by the grammar production instr_loop.
   *  <code>instr ::= loop_label_optional_8 loop</code>
   */
  public Instr instr_loop(LoopLabel loop_label_optional,Loop loop);
  /** This methods is called after the reduction of the non terminal instr
   *  by the grammar production instr_break.
   *  <code>instr ::= _break id_optional_9 semis</code>
   */
  public Instr instr_break(IdToken id_optional,Semis semis);
  /** This methods is called after the reduction of the non terminal instr
   *  by the grammar production instr_continue.
   *  <code>instr ::= _continue id_optional_10 semis</code>
   */
  public Instr instr_continue(IdToken id_optional,Semis semis);
  /** This methods is called after the reduction of the non terminal instr
   *  by the grammar production instr_return.
   *  <code>instr ::= _return expr_optional_11 semis</code>
   */
  public Instr instr_return(Expr expr_optional,Semis semis);
  /** This methods is called after the reduction of the non terminal instr
   *  by the grammar production instr_throw.
   *  <code>instr ::= _throw expr semis</code>
   */
  public Instr instr_throw(Expr expr,Semis semis);
  /** This methods is called after the reduction of the non terminal instr
   *  by the grammar production instr_block.
   *  <code>instr ::= block</code>
   */
  public Instr instr_block(Block block);
  /** This methods is called after the reduction of the non terminal instr
   *  by the grammar production instr_empty.
   *  <code>instr ::= semicolon</code>
   */
  public Instr instr_empty();
  /** This methods is called after the reduction of the non terminal semis
   *  by the grammar production semis__semicolon.
   *  <code>semis ::= semicolon</code>
   */
  public Semis semis__semicolon();
  /** This methods is called after the reduction of the non terminal semis
   *  by the grammar production semis__eoln.
   *  <code>semis ::= eoln</code>
   */
  public Semis semis__eoln();
  /** This methods is called after the reduction of the non terminal declaration
   *  by the grammar production declaration_id.
   *  <code>declaration ::= type id</code>
   */
  public Declaration declaration_id(Type type,IdToken id);
  /** This methods is called after the reduction of the non terminal declaration
   *  by the grammar production declaration_id_init.
   *  <code>declaration ::= type id assign expr</code>
   */
  public Declaration declaration_id_init(Type type,IdToken id,Expr expr);
  /** This methods is called after the reduction of the non terminal funcall
   *  by the grammar production funcall_id.
   *  <code>funcall ::= id lpar arguments rpar</code>
   */
  public Funcall funcall_id(IdToken id,Arguments arguments);
  /** This methods is called after the reduction of the non terminal funcall
   *  by the grammar production funcall_primary.
   *  <code>funcall ::= primary lpar arguments rpar</code>
   */
  public Funcall funcall_primary(Primary primary,Arguments arguments);
  /** This methods is called after the reduction of the non terminal conditional
   *  by the grammar production conditional_if.
   *  <code>conditional ::= _if lpar expr rpar block</code>
   */
  public Conditional conditional_if(Expr expr,Block block);
  /** This methods is called after the reduction of the non terminal conditional
   *  by the grammar production conditional_if_else.
   *  <code>conditional ::= _if lpar expr rpar block _else block</code>
   */
  public Conditional conditional_if_else(Expr expr,Block block,Block block2);
  /** This methods is called after the reduction of the non terminal loop
   *  by the grammar production loop_while.
   *  <code>loop ::= _while lpar expr rpar block</code>
   */
  public Loop loop_while(Expr expr,Block block);
  /** This methods is called after the reduction of the non terminal loop
   *  by the grammar production loop_dowhile.
   *  <code>loop ::= _do block _while lpar expr rpar</code>
   */
  public Loop loop_dowhile(Block block,Expr expr);
  /** This methods is called after the reduction of the non terminal loop
   *  by the grammar production loop_for.
   *  <code>loop ::= _for lpar for_loop_init_optional_12 semicolon expr_optional_13 semicolon for_loop_incr_optional_14 rpar block</code>
   */
  public Loop loop_for(ForLoopInit for_loop_init_optional,Expr expr_optional,ForLoopIncr for_loop_incr_optional,Block block);
  /** This methods is called after the reduction of the non terminal for_loop_init
   *  by the grammar production for_loop_init_declaration.
   *  <code>for_loop_init ::= declaration</code>
   */
  public ForLoopInit for_loop_init_declaration(Declaration declaration);
  /** This methods is called after the reduction of the non terminal for_loop_init
   *  by the grammar production for_loop_init_assignation.
   *  <code>for_loop_init ::= assignation</code>
   */
  public ForLoopInit for_loop_init_assignation(Assignation assignation);
  /** This methods is called after the reduction of the non terminal for_loop_init
   *  by the grammar production for_loop_init_funcall.
   *  <code>for_loop_init ::= funcall</code>
   */
  public ForLoopInit for_loop_init_funcall(Funcall funcall);
  /** This methods is called after the reduction of the non terminal for_loop_incr
   *  by the grammar production for_loop_incr_assignation.
   *  <code>for_loop_incr ::= assignation</code>
   */
  public ForLoopIncr for_loop_incr_assignation(Assignation assignation);
  /** This methods is called after the reduction of the non terminal for_loop_incr
   *  by the grammar production for_loop_incr_funcall.
   *  <code>for_loop_incr ::= funcall</code>
   */
  public ForLoopIncr for_loop_incr_funcall(Funcall funcall);
  /** This methods is called after the reduction of the non terminal loop_label
   *  by the grammar production loop_label.
   *  <code>loop_label ::= id colon</code>
   */
  public LoopLabel loop_label(IdToken id);
  /** This methods is called after the reduction of the non terminal assignation
   *  by the grammar production assignation.
   *  <code>assignation ::= lhs assign expr</code>
   */
  public Assignation assignation(Lhs lhs,Expr expr);
  /** This methods is called after the reduction of the non terminal lhs
   *  by the grammar production lhs_id.
   *  <code>lhs ::= id</code>
   */
  public Lhs lhs_id(IdToken id);
  /** This methods is called after the reduction of the non terminal lhs
   *  by the grammar production lhs_field_access.
   *  <code>lhs ::= field_access</code>
   */
  public Lhs lhs_field_access(FieldAccess field_access);
  /** This methods is called after the reduction of the non terminal lhs
   *  by the grammar production lhs_array_access.
   *  <code>lhs ::= array_access</code>
   */
  public Lhs lhs_array_access(ArrayAccess array_access);
  /** This methods is called after the reduction of the non terminal primary
   *  by the grammar production primary_primary_no_array_creation.
   *  <code>primary ::= primary_no_array_creation</code>
   */
  public Primary primary_primary_no_array_creation(PrimaryNoArrayCreation primary_no_array_creation);
  /** This methods is called after the reduction of the non terminal primary
   *  by the grammar production primary_array_creation.
   *  <code>primary ::= array_creation</code>
   */
  public Primary primary_array_creation(ArrayCreation array_creation);
  /** This methods is called after the reduction of the non terminal primary_no_array_creation
   *  by the grammar production primary_field_access.
   *  <code>primary_no_array_creation ::= field_access</code>
   */
  public PrimaryNoArrayCreation primary_field_access(FieldAccess field_access);
  /** This methods is called after the reduction of the non terminal primary_no_array_creation
   *  by the grammar production primary_array_access.
   *  <code>primary_no_array_creation ::= array_access</code>
   */
  public PrimaryNoArrayCreation primary_array_access(ArrayAccess array_access);
  /** This methods is called after the reduction of the non terminal primary_no_array_creation
   *  by the grammar production primary_parens.
   *  <code>primary_no_array_creation ::= lpar expr rpar</code>
   */
  public PrimaryNoArrayCreation primary_parens(Expr expr);
  /** This methods is called after the reduction of the non terminal primary_no_array_creation
   *  by the grammar production primary_allocation.
   *  <code>primary_no_array_creation ::= _new id lpar arguments rpar</code>
   */
  public PrimaryNoArrayCreation primary_allocation(IdToken id,Arguments arguments);
  /** This methods is called after the reduction of the non terminal primary_no_array_creation
   *  by the grammar production primary_funcall.
   *  <code>primary_no_array_creation ::= funcall</code>
   */
  public PrimaryNoArrayCreation primary_funcall(Funcall funcall);
  /** This methods is called after the reduction of the non terminal array_access
   *  by the grammar production array_access_id.
   *  <code>array_access ::= id lopt expr ropt</code>
   */
  public ArrayAccess array_access_id(IdToken id,Expr expr);
  /** This methods is called after the reduction of the non terminal array_access
   *  by the grammar production array_access_primary.
   *  <code>array_access ::= primary_no_array_creation lopt expr ropt</code>
   */
  public ArrayAccess array_access_primary(PrimaryNoArrayCreation primary_no_array_creation,Expr expr);
  /** This methods is called after the reduction of the non terminal field_access
   *  by the grammar production field_access_id.
   *  <code>field_access ::= id dot id</code>
   */
  public FieldAccess field_access_id(IdToken id,IdToken id2);
  /** This methods is called after the reduction of the non terminal field_access
   *  by the grammar production field_access_primary.
   *  <code>field_access ::= primary dot id</code>
   */
  public FieldAccess field_access_primary(Primary primary,IdToken id);
  /** This methods is called after the reduction of the non terminal array_creation
   *  by the grammar production array_creation_primitive.
   *  <code>array_creation ::= _new primitive_type dim_expr_plus_15 dims_opt</code>
   */
  public ArrayCreation array_creation_primitive(PrimitiveType primitive_type,List<DimExpr> dim_expr_plus,DimsOpt dims_opt);
  /** This methods is called after the reduction of the non terminal array_creation
   *  by the grammar production array_creation_record.
   *  <code>array_creation ::= _new id dim_expr_plus_16 dims_opt</code>
   */
  public ArrayCreation array_creation_record(IdToken id,List<DimExpr> dim_expr_plus,DimsOpt dims_opt);
  /** This methods is called after the reduction of the non terminal dim_expr
   *  by the grammar production dim_expr.
   *  <code>dim_expr ::= lopt expr ropt</code>
   */
  public DimExpr dim_expr(Expr expr);
  /** This methods is called after the reduction of the non terminal dims_opt
   *  by the grammar production dims_opt_dims.
   *  <code>dims_opt ::= dims</code>
   */
  public DimsOpt dims_opt_dims(Dims dims);
  /** This methods is called after the reduction of the non terminal dims_opt
   *  by the grammar production dims_opt_empty.
   *  <code>dims_opt ::=</code>
   */
  public DimsOpt dims_opt_empty();
  /** This methods is called after the reduction of the non terminal dims
   *  by the grammar production dims_singleton.
   *  <code>dims ::= lopt ropt</code>
   */
  public Dims dims_singleton();
  /** This methods is called after the reduction of the non terminal dims
   *  by the grammar production dims_recursive.
   *  <code>dims ::= dims lopt ropt</code>
   */
  public Dims dims_recursive(Dims dims);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_boolean_literal.
   *  <code>expr ::= boolean_literal</code>
   */
  public Expr expr_boolean_literal(BooleanLiteralToken boolean_literal);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_char_literal.
   *  <code>expr ::= char_literal</code>
   */
  public Expr expr_char_literal(CharLiteralToken char_literal);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_value_literal.
   *  <code>expr ::= value_literal</code>
   */
  public Expr expr_value_literal(ValueLiteralToken value_literal);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_string_literal.
   *  <code>expr ::= string_literal</code>
   */
  public Expr expr_string_literal(StringLiteralToken string_literal);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_null_literal.
   *  <code>expr ::= null_literal</code>
   */
  public Expr expr_null_literal();
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_id.
   *  <code>expr ::= id</code>
   */
  public Expr expr_id(IdToken id);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_primary.
   *  <code>expr ::= primary</code>
   */
  public Expr expr_primary(Primary primary);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_lambda.
   *  <code>expr ::= lambda lpar parameters rpar arrow expr</code>
   */
  public Expr expr_lambda(Parameters parameters,Expr expr);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_neg.
   *  <code>expr ::= bang expr</code>
   */
  public Expr expr_neg(Expr expr);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_unary_plus.
   *  <code>expr ::= plus expr</code>
   */
  public Expr expr_unary_plus(Expr expr);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_unary_minus.
   *  <code>expr ::= minus expr</code>
   */
  public Expr expr_unary_minus(Expr expr);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_eq.
   *  <code>expr ::= expr eq expr</code>
   */
  public Expr expr_eq(Expr expr,Expr expr2);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_ne.
   *  <code>expr ::= expr neq expr</code>
   */
  public Expr expr_ne(Expr expr,Expr expr2);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_lt.
   *  <code>expr ::= expr lt expr</code>
   */
  public Expr expr_lt(Expr expr,Expr expr2);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_le.
   *  <code>expr ::= expr le expr</code>
   */
  public Expr expr_le(Expr expr,Expr expr2);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_gt.
   *  <code>expr ::= expr gt expr</code>
   */
  public Expr expr_gt(Expr expr,Expr expr2);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_ge.
   *  <code>expr ::= expr ge expr</code>
   */
  public Expr expr_ge(Expr expr,Expr expr2);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_band.
   *  <code>expr ::= expr band expr</code>
   */
  public Expr expr_band(Expr expr,Expr expr2);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_bor.
   *  <code>expr ::= expr bor expr</code>
   */
  public Expr expr_bor(Expr expr,Expr expr2);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_plus.
   *  <code>expr ::= expr plus expr</code>
   */
  public Expr expr_plus(Expr expr,Expr expr2);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_minus.
   *  <code>expr ::= expr minus expr</code>
   */
  public Expr expr_minus(Expr expr,Expr expr2);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_star.
   *  <code>expr ::= expr star expr</code>
   */
  public Expr expr_star(Expr expr,Expr expr2);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_slash.
   *  <code>expr ::= expr slash expr</code>
   */
  public Expr expr_slash(Expr expr,Expr expr2);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_mod.
   *  <code>expr ::= expr mod expr</code>
   */
  public Expr expr_mod(Expr expr,Expr expr2);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_pow.
   *  <code>expr ::= expr pow expr</code>
   */
  public Expr expr_pow(Expr expr,Expr expr2);

  public void acceptStart(Start start);
}
