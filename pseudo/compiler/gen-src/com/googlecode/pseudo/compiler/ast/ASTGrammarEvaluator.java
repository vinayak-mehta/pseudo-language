package com.googlecode.pseudo.compiler.ast;

import com.googlecode.pseudo.compiler.ast.Arguments;
import com.googlecode.pseudo.compiler.ast.ArrayAccess;
import com.googlecode.pseudo.compiler.ast.ArrayAccessId;
import com.googlecode.pseudo.compiler.ast.ArrayAccessPrimary;
import com.googlecode.pseudo.compiler.ast.ArrayCreation;
import com.googlecode.pseudo.compiler.ast.ArrayCreationPrimitive;
import com.googlecode.pseudo.compiler.ast.ArrayCreationRecord;
import com.googlecode.pseudo.compiler.ast.Assignation;
import com.googlecode.pseudo.compiler.ast.Block;
import com.googlecode.pseudo.compiler.ast.BooleanLiteralToken;
import com.googlecode.pseudo.compiler.ast.CharLiteralToken;
import com.googlecode.pseudo.compiler.ast.Conditional;
import com.googlecode.pseudo.compiler.ast.ConditionalIf;
import com.googlecode.pseudo.compiler.ast.ConditionalIfElse;
import com.googlecode.pseudo.compiler.ast.Declaration;
import com.googlecode.pseudo.compiler.ast.DeclarationId;
import com.googlecode.pseudo.compiler.ast.DeclarationIdInit;
import com.googlecode.pseudo.compiler.ast.DimExpr;
import com.googlecode.pseudo.compiler.ast.Dims;
import com.googlecode.pseudo.compiler.ast.DimsOpt;
import com.googlecode.pseudo.compiler.ast.DimsOptDims;
import com.googlecode.pseudo.compiler.ast.DimsOptEmpty;
import com.googlecode.pseudo.compiler.ast.DimsRecursive;
import com.googlecode.pseudo.compiler.ast.DimsSingleton;
import com.googlecode.pseudo.compiler.ast.Expr;
import com.googlecode.pseudo.compiler.ast.ExprBand;
import com.googlecode.pseudo.compiler.ast.ExprBooleanLiteral;
import com.googlecode.pseudo.compiler.ast.ExprBor;
import com.googlecode.pseudo.compiler.ast.ExprCharLiteral;
import com.googlecode.pseudo.compiler.ast.ExprEq;
import com.googlecode.pseudo.compiler.ast.ExprGe;
import com.googlecode.pseudo.compiler.ast.ExprGt;
import com.googlecode.pseudo.compiler.ast.ExprId;
import com.googlecode.pseudo.compiler.ast.ExprLambda;
import com.googlecode.pseudo.compiler.ast.ExprLe;
import com.googlecode.pseudo.compiler.ast.ExprLt;
import com.googlecode.pseudo.compiler.ast.ExprMinus;
import com.googlecode.pseudo.compiler.ast.ExprMod;
import com.googlecode.pseudo.compiler.ast.ExprNe;
import com.googlecode.pseudo.compiler.ast.ExprNeg;
import com.googlecode.pseudo.compiler.ast.ExprNullLiteral;
import com.googlecode.pseudo.compiler.ast.ExprPlus;
import com.googlecode.pseudo.compiler.ast.ExprPow;
import com.googlecode.pseudo.compiler.ast.ExprPrimary;
import com.googlecode.pseudo.compiler.ast.ExprSlash;
import com.googlecode.pseudo.compiler.ast.ExprStar;
import com.googlecode.pseudo.compiler.ast.ExprStringLiteral;
import com.googlecode.pseudo.compiler.ast.ExprUnaryMinus;
import com.googlecode.pseudo.compiler.ast.ExprUnaryPlus;
import com.googlecode.pseudo.compiler.ast.ExprValueLiteral;
import com.googlecode.pseudo.compiler.ast.Field;
import com.googlecode.pseudo.compiler.ast.FieldAccess;
import com.googlecode.pseudo.compiler.ast.FieldAccessId;
import com.googlecode.pseudo.compiler.ast.FieldAccessPrimary;
import com.googlecode.pseudo.compiler.ast.ForLoopIncr;
import com.googlecode.pseudo.compiler.ast.ForLoopIncrAssignation;
import com.googlecode.pseudo.compiler.ast.ForLoopIncrFuncall;
import com.googlecode.pseudo.compiler.ast.ForLoopInit;
import com.googlecode.pseudo.compiler.ast.ForLoopInitAssignation;
import com.googlecode.pseudo.compiler.ast.ForLoopInitDeclaration;
import com.googlecode.pseudo.compiler.ast.ForLoopInitFuncall;
import com.googlecode.pseudo.compiler.ast.Funcall;
import com.googlecode.pseudo.compiler.ast.FuncallId;
import com.googlecode.pseudo.compiler.ast.FuncallPrimary;
import com.googlecode.pseudo.compiler.ast.FunctionDef;
import com.googlecode.pseudo.compiler.ast.FunctionRtype;
import com.googlecode.pseudo.compiler.ast.Funtype;
import com.googlecode.pseudo.compiler.ast.IdToken;
import com.googlecode.pseudo.compiler.ast.Instr;
import com.googlecode.pseudo.compiler.ast.InstrAssignation;
import com.googlecode.pseudo.compiler.ast.InstrBlock;
import com.googlecode.pseudo.compiler.ast.InstrBreak;
import com.googlecode.pseudo.compiler.ast.InstrConditional;
import com.googlecode.pseudo.compiler.ast.InstrContinue;
import com.googlecode.pseudo.compiler.ast.InstrDeclaration;
import com.googlecode.pseudo.compiler.ast.InstrEmpty;
import com.googlecode.pseudo.compiler.ast.InstrFuncall;
import com.googlecode.pseudo.compiler.ast.InstrLoop;
import com.googlecode.pseudo.compiler.ast.InstrPrint;
import com.googlecode.pseudo.compiler.ast.InstrReturn;
import com.googlecode.pseudo.compiler.ast.InstrScan;
import com.googlecode.pseudo.compiler.ast.InstrThrow;
import com.googlecode.pseudo.compiler.ast.Lhs;
import com.googlecode.pseudo.compiler.ast.LhsArrayAccess;
import com.googlecode.pseudo.compiler.ast.LhsFieldAccess;
import com.googlecode.pseudo.compiler.ast.LhsId;
import com.googlecode.pseudo.compiler.ast.Loop;
import com.googlecode.pseudo.compiler.ast.LoopDowhile;
import com.googlecode.pseudo.compiler.ast.LoopFor;
import com.googlecode.pseudo.compiler.ast.LoopLabel;
import com.googlecode.pseudo.compiler.ast.LoopWhile;
import com.googlecode.pseudo.compiler.ast.Parameter;
import com.googlecode.pseudo.compiler.ast.ParameterNaked;
import com.googlecode.pseudo.compiler.ast.ParameterTyped;
import com.googlecode.pseudo.compiler.ast.Parameters;
import com.googlecode.pseudo.compiler.ast.Primary;
import com.googlecode.pseudo.compiler.ast.PrimaryAllocation;
import com.googlecode.pseudo.compiler.ast.PrimaryArrayAccess;
import com.googlecode.pseudo.compiler.ast.PrimaryArrayCreation;
import com.googlecode.pseudo.compiler.ast.PrimaryFieldAccess;
import com.googlecode.pseudo.compiler.ast.PrimaryFuncall;
import com.googlecode.pseudo.compiler.ast.PrimaryNoArrayCreation;
import com.googlecode.pseudo.compiler.ast.PrimaryParens;
import com.googlecode.pseudo.compiler.ast.PrimaryPrimaryNoArrayCreation;
import com.googlecode.pseudo.compiler.ast.PrimitiveType;
import com.googlecode.pseudo.compiler.ast.PrimitiveTypeAny;
import com.googlecode.pseudo.compiler.ast.PrimitiveTypeBoolean;
import com.googlecode.pseudo.compiler.ast.PrimitiveTypeChar;
import com.googlecode.pseudo.compiler.ast.PrimitiveTypeDouble;
import com.googlecode.pseudo.compiler.ast.PrimitiveTypeInt;
import com.googlecode.pseudo.compiler.ast.PrimitiveTypeString;
import com.googlecode.pseudo.compiler.ast.RecordDef;
import com.googlecode.pseudo.compiler.ast.RecordInit;
import com.googlecode.pseudo.compiler.ast.ReturnType;
import com.googlecode.pseudo.compiler.ast.ReturnTypeType;
import com.googlecode.pseudo.compiler.ast.ReturnTypeVoid;
import com.googlecode.pseudo.compiler.ast.ScriptMember;
import com.googlecode.pseudo.compiler.ast.ScriptMemberBlock;
import com.googlecode.pseudo.compiler.ast.ScriptMemberFunctionDef;
import com.googlecode.pseudo.compiler.ast.ScriptMemberRecordDef;
import com.googlecode.pseudo.compiler.ast.Semis;
import com.googlecode.pseudo.compiler.ast.SemisEoln;
import com.googlecode.pseudo.compiler.ast.SemisSemicolon;
import com.googlecode.pseudo.compiler.ast.Start;
import com.googlecode.pseudo.compiler.ast.StringLiteralToken;
import com.googlecode.pseudo.compiler.ast.Type;
import com.googlecode.pseudo.compiler.ast.TypeFuntype;
import com.googlecode.pseudo.compiler.ast.TypeFuntypeDims;
import com.googlecode.pseudo.compiler.ast.TypeId;
import com.googlecode.pseudo.compiler.ast.TypeIdDims;
import com.googlecode.pseudo.compiler.ast.TypePrimitive;
import com.googlecode.pseudo.compiler.ast.TypePrimitiveDims;
import com.googlecode.pseudo.compiler.ast.ValueLiteralToken;
import java.util.List;
import com.googlecode.pseudo.compiler.tools.PseudoGrammarEvaluator;
import fr.umlv.tatoo.runtime.ast.RootNodeProvider;

/** 
 *  This class is generated - please do not edit it 
 */
public class ASTGrammarEvaluator implements PseudoGrammarEvaluator, RootNodeProvider {
  /** This methods is called after the reduction of the non terminal primitive_type
   *  by the grammar production primitive_type_boolean.
   *  <code>primitive_type ::= _boolean</code>
   */
  public PrimitiveType primitive_type_boolean() {
      PrimitiveTypeBoolean primitive_type_boolean = new PrimitiveTypeBoolean();
     computeAnnotation(primitive_type_boolean);
     return primitive_type_boolean;
   }
  /** This methods is called after the reduction of the non terminal primitive_type
   *  by the grammar production primitive_type_char.
   *  <code>primitive_type ::= _char</code>
   */
  public PrimitiveType primitive_type_char() {
      PrimitiveTypeChar primitive_type_char = new PrimitiveTypeChar();
     computeAnnotation(primitive_type_char);
     return primitive_type_char;
   }
  /** This methods is called after the reduction of the non terminal primitive_type
   *  by the grammar production primitive_type_int.
   *  <code>primitive_type ::= _int</code>
   */
  public PrimitiveType primitive_type_int() {
      PrimitiveTypeInt primitive_type_int = new PrimitiveTypeInt();
     computeAnnotation(primitive_type_int);
     return primitive_type_int;
   }
  /** This methods is called after the reduction of the non terminal primitive_type
   *  by the grammar production primitive_type_double.
   *  <code>primitive_type ::= _double</code>
   */
  public PrimitiveType primitive_type_double() {
      PrimitiveTypeDouble primitive_type_double = new PrimitiveTypeDouble();
     computeAnnotation(primitive_type_double);
     return primitive_type_double;
   }
  /** This methods is called after the reduction of the non terminal primitive_type
   *  by the grammar production primitive_type_string.
   *  <code>primitive_type ::= string</code>
   */
  public PrimitiveType primitive_type_string() {
      PrimitiveTypeString primitive_type_string = new PrimitiveTypeString();
     computeAnnotation(primitive_type_string);
     return primitive_type_string;
   }
  /** This methods is called after the reduction of the non terminal primitive_type
   *  by the grammar production primitive_type_any.
   *  <code>primitive_type ::= any</code>
   */
  public PrimitiveType primitive_type_any() {
      PrimitiveTypeAny primitive_type_any = new PrimitiveTypeAny();
     computeAnnotation(primitive_type_any);
     return primitive_type_any;
   }
  /** This methods is called after the reduction of the non terminal type
   *  by the grammar production type_id.
   *  <code>type ::= id</code>
   */
  public Type type_id(IdToken id) {
      TypeId type_id = new TypeId(id);
     computeAnnotation(type_id);
     return type_id;
   }
  /** This methods is called after the reduction of the non terminal type
   *  by the grammar production type_id_dims.
   *  <code>type ::= id dims</code>
   */
  public Type type_id_dims(IdToken id,Dims dims) {
      TypeIdDims type_id_dims = new TypeIdDims(id,dims);
     computeAnnotation(type_id_dims);
     return type_id_dims;
   }
  /** This methods is called after the reduction of the non terminal type
   *  by the grammar production type_primitive.
   *  <code>type ::= primitive_type</code>
   */
  public Type type_primitive(PrimitiveType primitive_type) {
      TypePrimitive type_primitive = new TypePrimitive(primitive_type);
     computeAnnotation(type_primitive);
     return type_primitive;
   }
  /** This methods is called after the reduction of the non terminal type
   *  by the grammar production type_primitive_dims.
   *  <code>type ::= primitive_type dims</code>
   */
  public Type type_primitive_dims(PrimitiveType primitive_type,Dims dims) {
      TypePrimitiveDims type_primitive_dims = new TypePrimitiveDims(primitive_type,dims);
     computeAnnotation(type_primitive_dims);
     return type_primitive_dims;
   }
  /** This methods is called after the reduction of the non terminal type
   *  by the grammar production type_funtype.
   *  <code>type ::= funtype</code>
   */
  public Type type_funtype(Funtype funtype) {
      TypeFuntype type_funtype = new TypeFuntype(funtype);
     computeAnnotation(type_funtype);
     return type_funtype;
   }
  /** This methods is called after the reduction of the non terminal type
   *  by the grammar production type_funtype_dims.
   *  <code>type ::= funtype dims</code>
   */
  public Type type_funtype_dims(Funtype funtype,Dims dims) {
      TypeFuntypeDims type_funtype_dims = new TypeFuntypeDims(funtype,dims);
     computeAnnotation(type_funtype_dims);
     return type_funtype_dims;
   }
  /** This methods is called after the reduction of the non terminal funtype
   *  by the grammar production funtype.
   *  <code>funtype ::= lpar type_star_0 colon return_type rpar</code>
   */
  public Funtype funtype(List<Type> type_star_0,ReturnType return_type) {
      Funtype funtype = new Funtype(type_star_0,return_type);
     computeAnnotation(funtype);
     return funtype;
   }
  /** This methods is called after the reduction of the non terminal return_type
   *  by the grammar production return_type_type.
   *  <code>return_type ::= type</code>
   */
  public ReturnType return_type_type(Type type) {
      ReturnTypeType return_type_type = new ReturnTypeType(type);
     computeAnnotation(return_type_type);
     return return_type_type;
   }
  /** This methods is called after the reduction of the non terminal return_type
   *  by the grammar production return_type_void.
   *  <code>return_type ::= _void</code>
   */
  public ReturnType return_type_void() {
      ReturnTypeVoid return_type_void = new ReturnTypeVoid();
     computeAnnotation(return_type_void);
     return return_type_void;
   }
  /** This methods is called after the reduction of the non terminal start
   *  by the grammar production start.
   *  <code>start ::= script_member_star_1</code>
   */
  public Start start(List<ScriptMember> script_member_star_1) {
      Start start = new Start(script_member_star_1);
     computeAnnotation(start);
     return start;
   }
  /** This methods is called after the reduction of the non terminal script_member
   *  by the grammar production script_member_record_def.
   *  <code>script_member ::= record_def</code>
   */
  public ScriptMember script_member_record_def(RecordDef record_def) {
      ScriptMemberRecordDef script_member_record_def = new ScriptMemberRecordDef(record_def);
     computeAnnotation(script_member_record_def);
     return script_member_record_def;
   }
  /** This methods is called after the reduction of the non terminal script_member
   *  by the grammar production script_member_function_def.
   *  <code>script_member ::= function_def</code>
   */
  public ScriptMember script_member_function_def(FunctionDef function_def) {
      ScriptMemberFunctionDef script_member_function_def = new ScriptMemberFunctionDef(function_def);
     computeAnnotation(script_member_function_def);
     return script_member_function_def;
   }
  /** This methods is called after the reduction of the non terminal script_member
   *  by the grammar production script_member_block.
   *  <code>script_member ::= block</code>
   */
  public ScriptMember script_member_block(Block block) {
      ScriptMemberBlock script_member_block = new ScriptMemberBlock(block);
     computeAnnotation(script_member_block);
     return script_member_block;
   }
  /** This methods is called after the reduction of the non terminal record_def
   *  by the grammar production record_def.
   *  <code>record_def ::= record id lcurl field_star_2 record_init_optional_3 rcurl</code>
   */
  public RecordDef record_def(IdToken id,List<Field> field_star_2,RecordInit record_init_optional_3) {
      RecordDef record_def = new RecordDef(id,field_star_2,record_init_optional_3);
     computeAnnotation(record_def);
     return record_def;
   }
  /** This methods is called after the reduction of the non terminal record_init
   *  by the grammar production record_init.
   *  <code>record_init ::= init lpar parameters rpar block</code>
   */
  public RecordInit record_init(Parameters parameters,Block block) {
      RecordInit record_init = new RecordInit(parameters,block);
     computeAnnotation(record_init);
     return record_init;
   }
  /** This methods is called after the reduction of the non terminal field
   *  by the grammar production field.
   *  <code>field ::= type id semis</code>
   */
  public Field field(Type type,IdToken id,Semis semis) {
      Field field = new Field(type,id,semis);
     computeAnnotation(field);
     return field;
   }
  /** This methods is called after the reduction of the non terminal function_def
   *  by the grammar production function_def.
   *  <code>function_def ::= def id lpar parameters rpar function_rtype_optional_4 block</code>
   */
  public FunctionDef function_def(IdToken id,Parameters parameters,FunctionRtype function_rtype_optional_4,Block block) {
      FunctionDef function_def = new FunctionDef(id,parameters,function_rtype_optional_4,block);
     computeAnnotation(function_def);
     return function_def;
   }
  /** This methods is called after the reduction of the non terminal function_rtype
   *  by the grammar production function_rtype.
   *  <code>function_rtype ::= colon return_type</code>
   */
  public FunctionRtype function_rtype(ReturnType return_type) {
      FunctionRtype function_rtype = new FunctionRtype(return_type);
     computeAnnotation(function_rtype);
     return function_rtype;
   }
  /** This methods is called after the reduction of the non terminal parameters
   *  by the grammar production parameters.
   *  <code>parameters ::= parameter_star_5</code>
   */
  public Parameters parameters(List<Parameter> parameter_star_5) {
      Parameters parameters = new Parameters(parameter_star_5);
     computeAnnotation(parameters);
     return parameters;
   }
  /** This methods is called after the reduction of the non terminal parameter
   *  by the grammar production parameter_naked.
   *  <code>parameter ::= id</code>
   */
  public Parameter parameter_naked(IdToken id) {
      ParameterNaked parameter_naked = new ParameterNaked(id);
     computeAnnotation(parameter_naked);
     return parameter_naked;
   }
  /** This methods is called after the reduction of the non terminal parameter
   *  by the grammar production parameter_typed.
   *  <code>parameter ::= type id</code>
   */
  public Parameter parameter_typed(Type type,IdToken id) {
      ParameterTyped parameter_typed = new ParameterTyped(type,id);
     computeAnnotation(parameter_typed);
     return parameter_typed;
   }
  /** This methods is called after the reduction of the non terminal arguments
   *  by the grammar production arguments.
   *  <code>arguments ::= expr_star_6</code>
   */
  public Arguments arguments(List<Expr> expr_star_6) {
      Arguments arguments = new Arguments(expr_star_6);
     computeAnnotation(arguments);
     return arguments;
   }
  /** This methods is called after the reduction of the non terminal block
   *  by the grammar production block.
   *  <code>block ::= lcurl instr_star_7 rcurl</code>
   */
  public Block block(List<Instr> instr_star_7) {
      Block block = new Block(instr_star_7);
     computeAnnotation(block);
     return block;
   }
  /** This methods is called after the reduction of the non terminal instr
   *  by the grammar production instr_print.
   *  <code>instr ::= print expr semis</code>
   */
  public Instr instr_print(Expr expr,Semis semis) {
      InstrPrint instr_print = new InstrPrint(expr,semis);
     computeAnnotation(instr_print);
     return instr_print;
   }
  /** This methods is called after the reduction of the non terminal instr
   *  by the grammar production instr_scan.
   *  <code>instr ::= scan primary semis</code>
   */
  public Instr instr_scan(Primary primary,Semis semis) {
      InstrScan instr_scan = new InstrScan(primary,semis);
     computeAnnotation(instr_scan);
     return instr_scan;
   }
  /** This methods is called after the reduction of the non terminal instr
   *  by the grammar production instr_declaration.
   *  <code>instr ::= declaration semis</code>
   */
  public Instr instr_declaration(Declaration declaration,Semis semis) {
      InstrDeclaration instr_declaration = new InstrDeclaration(declaration,semis);
     computeAnnotation(instr_declaration);
     return instr_declaration;
   }
  /** This methods is called after the reduction of the non terminal instr
   *  by the grammar production instr_assignation.
   *  <code>instr ::= assignation semis</code>
   */
  public Instr instr_assignation(Assignation assignation,Semis semis) {
      InstrAssignation instr_assignation = new InstrAssignation(assignation,semis);
     computeAnnotation(instr_assignation);
     return instr_assignation;
   }
  /** This methods is called after the reduction of the non terminal instr
   *  by the grammar production instr_funcall.
   *  <code>instr ::= funcall semis</code>
   */
  public Instr instr_funcall(Funcall funcall,Semis semis) {
      InstrFuncall instr_funcall = new InstrFuncall(funcall,semis);
     computeAnnotation(instr_funcall);
     return instr_funcall;
   }
  /** This methods is called after the reduction of the non terminal instr
   *  by the grammar production instr_conditional.
   *  <code>instr ::= conditional</code>
   */
  public Instr instr_conditional(Conditional conditional) {
      InstrConditional instr_conditional = new InstrConditional(conditional);
     computeAnnotation(instr_conditional);
     return instr_conditional;
   }
  /** This methods is called after the reduction of the non terminal instr
   *  by the grammar production instr_loop.
   *  <code>instr ::= loop_label_optional_8 loop</code>
   */
  public Instr instr_loop(LoopLabel loop_label_optional_8,Loop loop) {
      InstrLoop instr_loop = new InstrLoop(loop_label_optional_8,loop);
     computeAnnotation(instr_loop);
     return instr_loop;
   }
  /** This methods is called after the reduction of the non terminal instr
   *  by the grammar production instr_break.
   *  <code>instr ::= _break id_optional_9 semis</code>
   */
  public Instr instr_break(IdToken id_optional_9,Semis semis) {
      InstrBreak instr_break = new InstrBreak(id_optional_9,semis);
     computeAnnotation(instr_break);
     return instr_break;
   }
  /** This methods is called after the reduction of the non terminal instr
   *  by the grammar production instr_continue.
   *  <code>instr ::= _continue id_optional_10 semis</code>
   */
  public Instr instr_continue(IdToken id_optional_10,Semis semis) {
      InstrContinue instr_continue = new InstrContinue(id_optional_10,semis);
     computeAnnotation(instr_continue);
     return instr_continue;
   }
  /** This methods is called after the reduction of the non terminal instr
   *  by the grammar production instr_return.
   *  <code>instr ::= _return expr_optional_11 semis</code>
   */
  public Instr instr_return(Expr expr_optional_11,Semis semis) {
      InstrReturn instr_return = new InstrReturn(expr_optional_11,semis);
     computeAnnotation(instr_return);
     return instr_return;
   }
  /** This methods is called after the reduction of the non terminal instr
   *  by the grammar production instr_throw.
   *  <code>instr ::= _throw expr semis</code>
   */
  public Instr instr_throw(Expr expr,Semis semis) {
      InstrThrow instr_throw = new InstrThrow(expr,semis);
     computeAnnotation(instr_throw);
     return instr_throw;
   }
  /** This methods is called after the reduction of the non terminal instr
   *  by the grammar production instr_block.
   *  <code>instr ::= block</code>
   */
  public Instr instr_block(Block block) {
      InstrBlock instr_block = new InstrBlock(block);
     computeAnnotation(instr_block);
     return instr_block;
   }
  /** This methods is called after the reduction of the non terminal instr
   *  by the grammar production instr_empty.
   *  <code>instr ::= semicolon</code>
   */
  public Instr instr_empty() {
      InstrEmpty instr_empty = new InstrEmpty();
     computeAnnotation(instr_empty);
     return instr_empty;
   }
  /** This methods is called after the reduction of the non terminal semis
   *  by the grammar production semis__semicolon.
   *  <code>semis ::= semicolon</code>
   */
  public Semis semis__semicolon() {
      SemisSemicolon semis__semicolon = new SemisSemicolon();
     computeAnnotation(semis__semicolon);
     return semis__semicolon;
   }
  /** This methods is called after the reduction of the non terminal semis
   *  by the grammar production semis__eoln.
   *  <code>semis ::= eoln</code>
   */
  public Semis semis__eoln() {
      SemisEoln semis__eoln = new SemisEoln();
     computeAnnotation(semis__eoln);
     return semis__eoln;
   }
  /** This methods is called after the reduction of the non terminal declaration
   *  by the grammar production declaration_id.
   *  <code>declaration ::= type id</code>
   */
  public Declaration declaration_id(Type type,IdToken id) {
      DeclarationId declaration_id = new DeclarationId(type,id);
     computeAnnotation(declaration_id);
     return declaration_id;
   }
  /** This methods is called after the reduction of the non terminal declaration
   *  by the grammar production declaration_id_init.
   *  <code>declaration ::= type id assign expr</code>
   */
  public Declaration declaration_id_init(Type type,IdToken id,Expr expr) {
      DeclarationIdInit declaration_id_init = new DeclarationIdInit(type,id,expr);
     computeAnnotation(declaration_id_init);
     return declaration_id_init;
   }
  /** This methods is called after the reduction of the non terminal funcall
   *  by the grammar production funcall_id.
   *  <code>funcall ::= id lpar arguments rpar</code>
   */
  public Funcall funcall_id(IdToken id,Arguments arguments) {
      FuncallId funcall_id = new FuncallId(id,arguments);
     computeAnnotation(funcall_id);
     return funcall_id;
   }
  /** This methods is called after the reduction of the non terminal funcall
   *  by the grammar production funcall_primary.
   *  <code>funcall ::= primary lpar arguments rpar</code>
   */
  public Funcall funcall_primary(Primary primary,Arguments arguments) {
      FuncallPrimary funcall_primary = new FuncallPrimary(primary,arguments);
     computeAnnotation(funcall_primary);
     return funcall_primary;
   }
  /** This methods is called after the reduction of the non terminal conditional
   *  by the grammar production conditional_if.
   *  <code>conditional ::= _if lpar expr rpar block</code>
   */
  public Conditional conditional_if(Expr expr,Block block) {
      ConditionalIf conditional_if = new ConditionalIf(expr,block);
     computeAnnotation(conditional_if);
     return conditional_if;
   }
  /** This methods is called after the reduction of the non terminal conditional
   *  by the grammar production conditional_if_else.
   *  <code>conditional ::= _if lpar expr rpar block _else block</code>
   */
  public Conditional conditional_if_else(Expr expr,Block block,Block block2) {
      ConditionalIfElse conditional_if_else = new ConditionalIfElse(expr,block,block2);
     computeAnnotation(conditional_if_else);
     return conditional_if_else;
   }
  /** This methods is called after the reduction of the non terminal loop
   *  by the grammar production loop_while.
   *  <code>loop ::= _while lpar expr rpar block</code>
   */
  public Loop loop_while(Expr expr,Block block) {
      LoopWhile loop_while = new LoopWhile(expr,block);
     computeAnnotation(loop_while);
     return loop_while;
   }
  /** This methods is called after the reduction of the non terminal loop
   *  by the grammar production loop_dowhile.
   *  <code>loop ::= _do block _while lpar expr rpar</code>
   */
  public Loop loop_dowhile(Block block,Expr expr) {
      LoopDowhile loop_dowhile = new LoopDowhile(block,expr);
     computeAnnotation(loop_dowhile);
     return loop_dowhile;
   }
  /** This methods is called after the reduction of the non terminal loop
   *  by the grammar production loop_for.
   *  <code>loop ::= _for lpar for_loop_init_optional_12 semicolon expr_optional_13 semicolon for_loop_incr_optional_14 rpar block</code>
   */
  public Loop loop_for(ForLoopInit for_loop_init_optional_12,Expr expr_optional_13,ForLoopIncr for_loop_incr_optional_14,Block block) {
      LoopFor loop_for = new LoopFor(for_loop_init_optional_12,expr_optional_13,for_loop_incr_optional_14,block);
     computeAnnotation(loop_for);
     return loop_for;
   }
  /** This methods is called after the reduction of the non terminal for_loop_init
   *  by the grammar production for_loop_init_declaration.
   *  <code>for_loop_init ::= declaration</code>
   */
  public ForLoopInit for_loop_init_declaration(Declaration declaration) {
      ForLoopInitDeclaration for_loop_init_declaration = new ForLoopInitDeclaration(declaration);
     computeAnnotation(for_loop_init_declaration);
     return for_loop_init_declaration;
   }
  /** This methods is called after the reduction of the non terminal for_loop_init
   *  by the grammar production for_loop_init_assignation.
   *  <code>for_loop_init ::= assignation</code>
   */
  public ForLoopInit for_loop_init_assignation(Assignation assignation) {
      ForLoopInitAssignation for_loop_init_assignation = new ForLoopInitAssignation(assignation);
     computeAnnotation(for_loop_init_assignation);
     return for_loop_init_assignation;
   }
  /** This methods is called after the reduction of the non terminal for_loop_init
   *  by the grammar production for_loop_init_funcall.
   *  <code>for_loop_init ::= funcall</code>
   */
  public ForLoopInit for_loop_init_funcall(Funcall funcall) {
      ForLoopInitFuncall for_loop_init_funcall = new ForLoopInitFuncall(funcall);
     computeAnnotation(for_loop_init_funcall);
     return for_loop_init_funcall;
   }
  /** This methods is called after the reduction of the non terminal for_loop_incr
   *  by the grammar production for_loop_incr_assignation.
   *  <code>for_loop_incr ::= assignation</code>
   */
  public ForLoopIncr for_loop_incr_assignation(Assignation assignation) {
      ForLoopIncrAssignation for_loop_incr_assignation = new ForLoopIncrAssignation(assignation);
     computeAnnotation(for_loop_incr_assignation);
     return for_loop_incr_assignation;
   }
  /** This methods is called after the reduction of the non terminal for_loop_incr
   *  by the grammar production for_loop_incr_funcall.
   *  <code>for_loop_incr ::= funcall</code>
   */
  public ForLoopIncr for_loop_incr_funcall(Funcall funcall) {
      ForLoopIncrFuncall for_loop_incr_funcall = new ForLoopIncrFuncall(funcall);
     computeAnnotation(for_loop_incr_funcall);
     return for_loop_incr_funcall;
   }
  /** This methods is called after the reduction of the non terminal loop_label
   *  by the grammar production loop_label.
   *  <code>loop_label ::= id colon</code>
   */
  public LoopLabel loop_label(IdToken id) {
      LoopLabel loop_label = new LoopLabel(id);
     computeAnnotation(loop_label);
     return loop_label;
   }
  /** This methods is called after the reduction of the non terminal assignation
   *  by the grammar production assignation.
   *  <code>assignation ::= lhs assign expr</code>
   */
  public Assignation assignation(Lhs lhs,Expr expr) {
      Assignation assignation = new Assignation(lhs,expr);
     computeAnnotation(assignation);
     return assignation;
   }
  /** This methods is called after the reduction of the non terminal lhs
   *  by the grammar production lhs_id.
   *  <code>lhs ::= id</code>
   */
  public Lhs lhs_id(IdToken id) {
      LhsId lhs_id = new LhsId(id);
     computeAnnotation(lhs_id);
     return lhs_id;
   }
  /** This methods is called after the reduction of the non terminal lhs
   *  by the grammar production lhs_field_access.
   *  <code>lhs ::= field_access</code>
   */
  public Lhs lhs_field_access(FieldAccess field_access) {
      LhsFieldAccess lhs_field_access = new LhsFieldAccess(field_access);
     computeAnnotation(lhs_field_access);
     return lhs_field_access;
   }
  /** This methods is called after the reduction of the non terminal lhs
   *  by the grammar production lhs_array_access.
   *  <code>lhs ::= array_access</code>
   */
  public Lhs lhs_array_access(ArrayAccess array_access) {
      LhsArrayAccess lhs_array_access = new LhsArrayAccess(array_access);
     computeAnnotation(lhs_array_access);
     return lhs_array_access;
   }
  /** This methods is called after the reduction of the non terminal primary
   *  by the grammar production primary_primary_no_array_creation.
   *  <code>primary ::= primary_no_array_creation</code>
   */
  public Primary primary_primary_no_array_creation(PrimaryNoArrayCreation primary_no_array_creation) {
      PrimaryPrimaryNoArrayCreation primary_primary_no_array_creation = new PrimaryPrimaryNoArrayCreation(primary_no_array_creation);
     computeAnnotation(primary_primary_no_array_creation);
     return primary_primary_no_array_creation;
   }
  /** This methods is called after the reduction of the non terminal primary
   *  by the grammar production primary_array_creation.
   *  <code>primary ::= array_creation</code>
   */
  public Primary primary_array_creation(ArrayCreation array_creation) {
      PrimaryArrayCreation primary_array_creation = new PrimaryArrayCreation(array_creation);
     computeAnnotation(primary_array_creation);
     return primary_array_creation;
   }
  /** This methods is called after the reduction of the non terminal primary_no_array_creation
   *  by the grammar production primary_field_access.
   *  <code>primary_no_array_creation ::= field_access</code>
   */
  public PrimaryNoArrayCreation primary_field_access(FieldAccess field_access) {
      PrimaryFieldAccess primary_field_access = new PrimaryFieldAccess(field_access);
     computeAnnotation(primary_field_access);
     return primary_field_access;
   }
  /** This methods is called after the reduction of the non terminal primary_no_array_creation
   *  by the grammar production primary_array_access.
   *  <code>primary_no_array_creation ::= array_access</code>
   */
  public PrimaryNoArrayCreation primary_array_access(ArrayAccess array_access) {
      PrimaryArrayAccess primary_array_access = new PrimaryArrayAccess(array_access);
     computeAnnotation(primary_array_access);
     return primary_array_access;
   }
  /** This methods is called after the reduction of the non terminal primary_no_array_creation
   *  by the grammar production primary_parens.
   *  <code>primary_no_array_creation ::= lpar expr rpar</code>
   */
  public PrimaryNoArrayCreation primary_parens(Expr expr) {
      PrimaryParens primary_parens = new PrimaryParens(expr);
     computeAnnotation(primary_parens);
     return primary_parens;
   }
  /** This methods is called after the reduction of the non terminal primary_no_array_creation
   *  by the grammar production primary_allocation.
   *  <code>primary_no_array_creation ::= _new id lpar arguments rpar</code>
   */
  public PrimaryNoArrayCreation primary_allocation(IdToken id,Arguments arguments) {
      PrimaryAllocation primary_allocation = new PrimaryAllocation(id,arguments);
     computeAnnotation(primary_allocation);
     return primary_allocation;
   }
  /** This methods is called after the reduction of the non terminal primary_no_array_creation
   *  by the grammar production primary_funcall.
   *  <code>primary_no_array_creation ::= funcall</code>
   */
  public PrimaryNoArrayCreation primary_funcall(Funcall funcall) {
      PrimaryFuncall primary_funcall = new PrimaryFuncall(funcall);
     computeAnnotation(primary_funcall);
     return primary_funcall;
   }
  /** This methods is called after the reduction of the non terminal array_access
   *  by the grammar production array_access_id.
   *  <code>array_access ::= id lopt expr ropt</code>
   */
  public ArrayAccess array_access_id(IdToken id,Expr expr) {
      ArrayAccessId array_access_id = new ArrayAccessId(id,expr);
     computeAnnotation(array_access_id);
     return array_access_id;
   }
  /** This methods is called after the reduction of the non terminal array_access
   *  by the grammar production array_access_primary.
   *  <code>array_access ::= primary_no_array_creation lopt expr ropt</code>
   */
  public ArrayAccess array_access_primary(PrimaryNoArrayCreation primary_no_array_creation,Expr expr) {
      ArrayAccessPrimary array_access_primary = new ArrayAccessPrimary(primary_no_array_creation,expr);
     computeAnnotation(array_access_primary);
     return array_access_primary;
   }
  /** This methods is called after the reduction of the non terminal field_access
   *  by the grammar production field_access_id.
   *  <code>field_access ::= id dot id</code>
   */
  public FieldAccess field_access_id(IdToken id,IdToken id2) {
      FieldAccessId field_access_id = new FieldAccessId(id,id2);
     computeAnnotation(field_access_id);
     return field_access_id;
   }
  /** This methods is called after the reduction of the non terminal field_access
   *  by the grammar production field_access_primary.
   *  <code>field_access ::= primary dot id</code>
   */
  public FieldAccess field_access_primary(Primary primary,IdToken id) {
      FieldAccessPrimary field_access_primary = new FieldAccessPrimary(primary,id);
     computeAnnotation(field_access_primary);
     return field_access_primary;
   }
  /** This methods is called after the reduction of the non terminal array_creation
   *  by the grammar production array_creation_primitive.
   *  <code>array_creation ::= _new primitive_type dim_expr_plus_15 dims_opt</code>
   */
  public ArrayCreation array_creation_primitive(PrimitiveType primitive_type,List<DimExpr> dim_expr_plus_15,DimsOpt dims_opt) {
      ArrayCreationPrimitive array_creation_primitive = new ArrayCreationPrimitive(primitive_type,dim_expr_plus_15,dims_opt);
     computeAnnotation(array_creation_primitive);
     return array_creation_primitive;
   }
  /** This methods is called after the reduction of the non terminal array_creation
   *  by the grammar production array_creation_record.
   *  <code>array_creation ::= _new id dim_expr_plus_16 dims_opt</code>
   */
  public ArrayCreation array_creation_record(IdToken id,List<DimExpr> dim_expr_plus_16,DimsOpt dims_opt) {
      ArrayCreationRecord array_creation_record = new ArrayCreationRecord(id,dim_expr_plus_16,dims_opt);
     computeAnnotation(array_creation_record);
     return array_creation_record;
   }
  /** This methods is called after the reduction of the non terminal dim_expr
   *  by the grammar production dim_expr.
   *  <code>dim_expr ::= lopt expr ropt</code>
   */
  public DimExpr dim_expr(Expr expr) {
      DimExpr dim_expr = new DimExpr(expr);
     computeAnnotation(dim_expr);
     return dim_expr;
   }
  /** This methods is called after the reduction of the non terminal dims_opt
   *  by the grammar production dims_opt_dims.
   *  <code>dims_opt ::= dims</code>
   */
  public DimsOpt dims_opt_dims(Dims dims) {
      DimsOptDims dims_opt_dims = new DimsOptDims(dims);
     computeAnnotation(dims_opt_dims);
     return dims_opt_dims;
   }
  /** This methods is called after the reduction of the non terminal dims_opt
   *  by the grammar production dims_opt_empty.
   *  <code>dims_opt ::=</code>
   */
  public DimsOpt dims_opt_empty() {
      DimsOptEmpty dims_opt_empty = new DimsOptEmpty();
     computeAnnotation(dims_opt_empty);
     return dims_opt_empty;
   }
  /** This methods is called after the reduction of the non terminal dims
   *  by the grammar production dims_singleton.
   *  <code>dims ::= lopt ropt</code>
   */
  public Dims dims_singleton() {
      DimsSingleton dims_singleton = new DimsSingleton();
     computeAnnotation(dims_singleton);
     return dims_singleton;
   }
  /** This methods is called after the reduction of the non terminal dims
   *  by the grammar production dims_recursive.
   *  <code>dims ::= dims lopt ropt</code>
   */
  public Dims dims_recursive(Dims dims) {
      DimsRecursive dims_recursive = new DimsRecursive(dims);
     computeAnnotation(dims_recursive);
     return dims_recursive;
   }
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_boolean_literal.
   *  <code>expr ::= boolean_literal</code>
   */
  public Expr expr_boolean_literal(BooleanLiteralToken boolean_literal) {
      ExprBooleanLiteral expr_boolean_literal = new ExprBooleanLiteral(boolean_literal);
     computeAnnotation(expr_boolean_literal);
     return expr_boolean_literal;
   }
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_char_literal.
   *  <code>expr ::= char_literal</code>
   */
  public Expr expr_char_literal(CharLiteralToken char_literal) {
      ExprCharLiteral expr_char_literal = new ExprCharLiteral(char_literal);
     computeAnnotation(expr_char_literal);
     return expr_char_literal;
   }
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_value_literal.
   *  <code>expr ::= value_literal</code>
   */
  public Expr expr_value_literal(ValueLiteralToken value_literal) {
      ExprValueLiteral expr_value_literal = new ExprValueLiteral(value_literal);
     computeAnnotation(expr_value_literal);
     return expr_value_literal;
   }
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_string_literal.
   *  <code>expr ::= string_literal</code>
   */
  public Expr expr_string_literal(StringLiteralToken string_literal) {
      ExprStringLiteral expr_string_literal = new ExprStringLiteral(string_literal);
     computeAnnotation(expr_string_literal);
     return expr_string_literal;
   }
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_null_literal.
   *  <code>expr ::= null_literal</code>
   */
  public Expr expr_null_literal() {
      ExprNullLiteral expr_null_literal = new ExprNullLiteral();
     computeAnnotation(expr_null_literal);
     return expr_null_literal;
   }
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_id.
   *  <code>expr ::= id</code>
   */
  public Expr expr_id(IdToken id) {
      ExprId expr_id = new ExprId(id);
     computeAnnotation(expr_id);
     return expr_id;
   }
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_primary.
   *  <code>expr ::= primary</code>
   */
  public Expr expr_primary(Primary primary) {
      ExprPrimary expr_primary = new ExprPrimary(primary);
     computeAnnotation(expr_primary);
     return expr_primary;
   }
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_lambda.
   *  <code>expr ::= lambda lpar parameters rpar arrow expr</code>
   */
  public Expr expr_lambda(Parameters parameters,Expr expr) {
      ExprLambda expr_lambda = new ExprLambda(parameters,expr);
     computeAnnotation(expr_lambda);
     return expr_lambda;
   }
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_neg.
   *  <code>expr ::= bang expr</code>
   */
  public Expr expr_neg(Expr expr) {
      ExprNeg expr_neg = new ExprNeg(expr);
     computeAnnotation(expr_neg);
     return expr_neg;
   }
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_unary_plus.
   *  <code>expr ::= plus expr</code>
   */
  public Expr expr_unary_plus(Expr expr) {
      ExprUnaryPlus expr_unary_plus = new ExprUnaryPlus(expr);
     computeAnnotation(expr_unary_plus);
     return expr_unary_plus;
   }
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_unary_minus.
   *  <code>expr ::= minus expr</code>
   */
  public Expr expr_unary_minus(Expr expr) {
      ExprUnaryMinus expr_unary_minus = new ExprUnaryMinus(expr);
     computeAnnotation(expr_unary_minus);
     return expr_unary_minus;
   }
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_eq.
   *  <code>expr ::= expr eq expr</code>
   */
  public Expr expr_eq(Expr expr,Expr expr2) {
      ExprEq expr_eq = new ExprEq(expr,expr2);
     computeAnnotation(expr_eq);
     return expr_eq;
   }
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_ne.
   *  <code>expr ::= expr neq expr</code>
   */
  public Expr expr_ne(Expr expr,Expr expr2) {
      ExprNe expr_ne = new ExprNe(expr,expr2);
     computeAnnotation(expr_ne);
     return expr_ne;
   }
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_lt.
   *  <code>expr ::= expr lt expr</code>
   */
  public Expr expr_lt(Expr expr,Expr expr2) {
      ExprLt expr_lt = new ExprLt(expr,expr2);
     computeAnnotation(expr_lt);
     return expr_lt;
   }
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_le.
   *  <code>expr ::= expr le expr</code>
   */
  public Expr expr_le(Expr expr,Expr expr2) {
      ExprLe expr_le = new ExprLe(expr,expr2);
     computeAnnotation(expr_le);
     return expr_le;
   }
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_gt.
   *  <code>expr ::= expr gt expr</code>
   */
  public Expr expr_gt(Expr expr,Expr expr2) {
      ExprGt expr_gt = new ExprGt(expr,expr2);
     computeAnnotation(expr_gt);
     return expr_gt;
   }
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_ge.
   *  <code>expr ::= expr ge expr</code>
   */
  public Expr expr_ge(Expr expr,Expr expr2) {
      ExprGe expr_ge = new ExprGe(expr,expr2);
     computeAnnotation(expr_ge);
     return expr_ge;
   }
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_band.
   *  <code>expr ::= expr band expr</code>
   */
  public Expr expr_band(Expr expr,Expr expr2) {
      ExprBand expr_band = new ExprBand(expr,expr2);
     computeAnnotation(expr_band);
     return expr_band;
   }
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_bor.
   *  <code>expr ::= expr bor expr</code>
   */
  public Expr expr_bor(Expr expr,Expr expr2) {
      ExprBor expr_bor = new ExprBor(expr,expr2);
     computeAnnotation(expr_bor);
     return expr_bor;
   }
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_plus.
   *  <code>expr ::= expr plus expr</code>
   */
  public Expr expr_plus(Expr expr,Expr expr2) {
      ExprPlus expr_plus = new ExprPlus(expr,expr2);
     computeAnnotation(expr_plus);
     return expr_plus;
   }
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_minus.
   *  <code>expr ::= expr minus expr</code>
   */
  public Expr expr_minus(Expr expr,Expr expr2) {
      ExprMinus expr_minus = new ExprMinus(expr,expr2);
     computeAnnotation(expr_minus);
     return expr_minus;
   }
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_star.
   *  <code>expr ::= expr star expr</code>
   */
  public Expr expr_star(Expr expr,Expr expr2) {
      ExprStar expr_star = new ExprStar(expr,expr2);
     computeAnnotation(expr_star);
     return expr_star;
   }
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_slash.
   *  <code>expr ::= expr slash expr</code>
   */
  public Expr expr_slash(Expr expr,Expr expr2) {
      ExprSlash expr_slash = new ExprSlash(expr,expr2);
     computeAnnotation(expr_slash);
     return expr_slash;
   }
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_mod.
   *  <code>expr ::= expr mod expr</code>
   */
  public Expr expr_mod(Expr expr,Expr expr2) {
      ExprMod expr_mod = new ExprMod(expr,expr2);
     computeAnnotation(expr_mod);
     return expr_mod;
   }
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_pow.
   *  <code>expr ::= expr pow expr</code>
   */
  public Expr expr_pow(Expr expr,Expr expr2) {
      ExprPow expr_pow = new ExprPow(expr,expr2);
     computeAnnotation(expr_pow);
     return expr_pow;
   }

  public void acceptStart(Start start) {
     this.start=start;
  }
  public Start getStart() {
     return start;
  }
  private Start start;

  public <N> N getRootNode(Class<N> nonTerminalType) {
    if (nonTerminalType==Start.class)
      return nonTerminalType.cast(getStart());
    throw new IllegalArgumentException("invalid type for a start non-terminal "+nonTerminalType);
  }

  /**  This method is called each time a node is created and can
   *   be overridden to compute values when constructing a node.
   *   This implementation does nothing.
   * @param node the created node.
   */
  protected void computeAnnotation(Node node) {
    // do nothing
  }
}
