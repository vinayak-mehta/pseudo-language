package com.googlecode.pseudo.compiler.parser;

import com.googlecode.pseudo.compiler.parser.PseudoNonTerminalEnum;
import com.googlecode.pseudo.compiler.parser.PseudoProductionEnum;
import com.googlecode.pseudo.compiler.parser.PseudoTerminalEnum;
import fr.umlv.tatoo.runtime.parser.AcceptAction;
import fr.umlv.tatoo.runtime.parser.Action;
import fr.umlv.tatoo.runtime.parser.BranchAction;
import fr.umlv.tatoo.runtime.parser.ErrorAction;
import fr.umlv.tatoo.runtime.parser.ExitAction;
import fr.umlv.tatoo.runtime.parser.ParserTable;
import fr.umlv.tatoo.runtime.parser.ReduceAction;
import fr.umlv.tatoo.runtime.parser.ShiftAction;
import fr.umlv.tatoo.runtime.parser.StateMetadata;
import java.util.EnumMap;

/** 
 *  This class is generated - please do not edit it 
 */
public class PseudoParserDataTable {
  private PseudoParserDataTable() {
   accept = AcceptAction.<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>getInstance();
   exit = ExitAction.<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>getInstance();
    initstartGotoes();
    initparametersGotoes();
    initfor_loop_init_optional_12Gotoes();
    initinstr_star_7Gotoes();
    initdeclarationGotoes();
    initfor_loop_incrGotoes();
    initprimary_no_array_creationGotoes();
    inittype_star_0Gotoes();
    initexpr_star_6Gotoes();
    initsemisGotoes();
    initblockGotoes();
    initfuntypeGotoes();
    initparameter_star_5_subGotoes();
    initarray_accessGotoes();
    initfieldGotoes();
    initdim_exprGotoes();
    initassignationGotoes();
    initparameterGotoes();
    initreturn_typeGotoes();
    initdimsGotoes();
    initfunction_defGotoes();
    initloop_label_optional_8Gotoes();
    initfield_accessGotoes();
    initarray_creationGotoes();
    initlhsGotoes();
    initfield_star_2Gotoes();
    initargumentsGotoes();
    initrecord_initGotoes();
    initrecord_init_optional_3Gotoes();
    initfor_loop_initGotoes();
    inittypeGotoes();
    initexpr_optional_13Gotoes();
    initloopGotoes();
    initexprGotoes();
    initscript_member_star_1Gotoes();
    initconditionalGotoes();
    initrecord_defGotoes();
    initdim_expr_plus_15Gotoes();
    initfunction_rtype_optional_4Gotoes();
    initid_optional_10Gotoes();
    initfor_loop_incr_optional_14Gotoes();
    initdims_optGotoes();
    initinstrGotoes();
    initdim_expr_plus_16Gotoes();
    initfuncallGotoes();
    initexpr_optional_11Gotoes();
    inittype_star_0_subGotoes();
    initfunction_rtypeGotoes();
    initparameter_star_5Gotoes();
    initid_optional_9Gotoes();
    initexpr_star_6_subGotoes();
    initprimaryGotoes();
    initscript_memberGotoes();
    initprimitive_typeGotoes();
    initloop_labelGotoes();
    reduceexpr_le = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.expr_le,3,exprGotoes);
    reduceprimary_allocation = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.primary_allocation,5,primary_no_array_creationGotoes);
    reduceinstr_break = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.instr_break,3,instrGotoes);
    reduceexpr_band = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.expr_band,3,exprGotoes);
    reduceprimary_field_access = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.primary_field_access,1,primary_no_array_creationGotoes);
    reducetype_primitive_dims = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.type_primitive_dims,2,typeGotoes);
    reduceexpr_lt = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.expr_lt,3,exprGotoes);
    reduceparameter_naked = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.parameter_naked,1,parameterGotoes);
    reducetype_id = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.type_id,1,typeGotoes);
    reducefunction_rtype_optional_4_empty = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.function_rtype_optional_4_empty,0,function_rtype_optional_4Gotoes);
    reduceid_optional_9_id = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.id_optional_9_id,1,id_optional_9Gotoes);
    reducefunction_rtype = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.function_rtype,2,function_rtypeGotoes);
    reducefor_loop_incr_funcall = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.for_loop_incr_funcall,1,for_loop_incrGotoes);
    reducetype_star_0_through = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.type_star_0_through,1,type_star_0Gotoes);
    reducedims_singleton = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.dims_singleton,2,dimsGotoes);
    reduceexpr_optional_13_empty = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.expr_optional_13_empty,0,expr_optional_13Gotoes);
    reduceprimary_primary_no_array_creation = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.primary_primary_no_array_creation,1,primaryGotoes);
    reducearray_access_primary = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.array_access_primary,4,array_accessGotoes);
    reduceid_optional_10_empty = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.id_optional_10_empty,0,id_optional_10Gotoes);
    reduceinstr_return = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.instr_return,3,instrGotoes);
    reduceprimitive_type_char = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.primitive_type_char,1,primitive_typeGotoes);
    reduceconditional_if = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.conditional_if,5,conditionalGotoes);
    reducereturn_type_void = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.return_type_void,1,return_typeGotoes);
    reduceprimitive_type_any = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.primitive_type_any,1,primitive_typeGotoes);
    reducedim_expr_plus_16_element = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.dim_expr_plus_16_element,1,dim_expr_plus_16Gotoes);
    reduceid_optional_10_id = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.id_optional_10_id,1,id_optional_10Gotoes);
    reduceassignation = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.assignation,3,assignationGotoes);
    reducerecord_init_optional_3_record_init = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.record_init_optional_3_record_init,1,record_init_optional_3Gotoes);
    reducefield_star_2_rec = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.field_star_2_rec,2,field_star_2Gotoes);
    reducedim_expr = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.dim_expr,3,dim_exprGotoes);
    reduceexpr_char_literal = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.expr_char_literal,1,exprGotoes);
    reduceprimary_array_access = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.primary_array_access,1,primary_no_array_creationGotoes);
    reduceloop_label_optional_8_empty = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.loop_label_optional_8_empty,0,loop_label_optional_8Gotoes);
    reducefor_loop_incr_optional_14_for_loop_incr = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.for_loop_incr_optional_14_for_loop_incr,1,for_loop_incr_optional_14Gotoes);
    reducescript_member_block = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.script_member_block,1,script_memberGotoes);
    reduceexpr_ge = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.expr_ge,3,exprGotoes);
    reduceloop_label = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.loop_label,2,loop_labelGotoes);
    reducearray_access_id = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.array_access_id,4,array_accessGotoes);
    reduceexpr_star = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.expr_star,3,exprGotoes);
    reduceexpr_minus = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.expr_minus,3,exprGotoes);
    reducelhs_id = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.lhs_id,1,lhsGotoes);
    reduceexpr_optional_11_expr = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.expr_optional_11_expr,1,expr_optional_11Gotoes);
    reduceexpr_lambda = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.expr_lambda,6,exprGotoes);
    reduceparameters = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.parameters,1,parametersGotoes);
    reducedim_expr_plus_15_element = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.dim_expr_plus_15_element,1,dim_expr_plus_15Gotoes);
    reducetype_primitive = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.type_primitive,1,typeGotoes);
    reducereturn_type_type = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.return_type_type,1,return_typeGotoes);
    reduceexpr_unary_plus = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.expr_unary_plus,2,exprGotoes);
    reduceexpr_null_literal = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.expr_null_literal,1,exprGotoes);
    reducefor_loop_init_declaration = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.for_loop_init_declaration,1,for_loop_initGotoes);
    reducedeclaration_id = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.declaration_id,2,declarationGotoes);
    reduceexpr_star_6_through = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.expr_star_6_through,1,expr_star_6Gotoes);
    reduceexpr_gt = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.expr_gt,3,exprGotoes);
    reduceloop_while = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.loop_while,5,loopGotoes);
    reduceexpr_neg = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.expr_neg,2,exprGotoes);
    reduceprimary_array_creation = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.primary_array_creation,1,primaryGotoes);
    reducedeclaration_id_init = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.declaration_id_init,4,declarationGotoes);
    reduceexpr_pow = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.expr_pow,3,exprGotoes);
    reduceexpr_bor = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.expr_bor,3,exprGotoes);
    reducetype_star_0_empty = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.type_star_0_empty,0,type_star_0Gotoes);
    reduceexpr_boolean_literal = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.expr_boolean_literal,1,exprGotoes);
    reduceexpr_plus = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.expr_plus,3,exprGotoes);
    reducefor_loop_init_optional_12_for_loop_init = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.for_loop_init_optional_12_for_loop_init,1,for_loop_init_optional_12Gotoes);
    reduceparameter_star_5_through = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.parameter_star_5_through,1,parameter_star_5Gotoes);
    reducefor_loop_init_funcall = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.for_loop_init_funcall,1,for_loop_initGotoes);
    reduceexpr_string_literal = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.expr_string_literal,1,exprGotoes);
    reduceinstr_loop = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.instr_loop,2,instrGotoes);
    reducearguments = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.arguments,1,argumentsGotoes);
    reduceinstr_declaration = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.instr_declaration,2,instrGotoes);
    reducearray_creation_record = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.array_creation_record,4,array_creationGotoes);
    reducedim_expr_plus_16_rec = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.dim_expr_plus_16_rec,2,dim_expr_plus_16Gotoes);
    reducefor_loop_incr_assignation = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.for_loop_incr_assignation,1,for_loop_incrGotoes);
    reducefield_star_2_empty = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.field_star_2_empty,0,field_star_2Gotoes);
    reducearray_creation_primitive = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.array_creation_primitive,4,array_creationGotoes);
    reduceinstr_assignation = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.instr_assignation,2,instrGotoes);
    reducefunction_def = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.function_def,7,function_defGotoes);
    reducedims_recursive = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.dims_recursive,3,dimsGotoes);
    reduceblock = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.block,3,blockGotoes);
    reduceinstr_star_7_empty = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.instr_star_7_empty,0,instr_star_7Gotoes);
    reducedim_expr_plus_15_rec = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.dim_expr_plus_15_rec,2,dim_expr_plus_15Gotoes);
    reduceinstr_scan = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.instr_scan,3,instrGotoes);
    reducedims_opt_dims = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.dims_opt_dims,1,dims_optGotoes);
    reducescript_member_function_def = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.script_member_function_def,1,script_memberGotoes);
    reducerecord_init_optional_3_empty = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.record_init_optional_3_empty,0,record_init_optional_3Gotoes);
    reduceparameter_star_5_rec = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.parameter_star_5_rec,3,parameter_star_5_subGotoes);
    reduceloop_dowhile = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.loop_dowhile,6,loopGotoes);
    reduceinstr_conditional = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.instr_conditional,1,instrGotoes);
    reduceinstr_print = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.instr_print,3,instrGotoes);
    reducefuncall_primary = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.funcall_primary,4,funcallGotoes);
    reducetype_id_dims = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.type_id_dims,2,typeGotoes);
    reduceprimary_parens = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.primary_parens,3,primary_no_array_creationGotoes);
    reducedims_opt_empty = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.dims_opt_empty,0,dims_optGotoes);
    reduceinstr_block = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.instr_block,1,instrGotoes);
    reduceprimitive_type_int = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.primitive_type_int,1,primitive_typeGotoes);
    reducesemis__eoln = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.semis__eoln,1,semisGotoes);
    reducefuncall_id = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.funcall_id,4,funcallGotoes);
    reducefor_loop_init_assignation = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.for_loop_init_assignation,1,for_loop_initGotoes);
    reduceexpr_eq = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.expr_eq,3,exprGotoes);
    reduceid_optional_9_empty = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.id_optional_9_empty,0,id_optional_9Gotoes);
    reduceexpr_id = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.expr_id,1,exprGotoes);
    reducefuntype = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.funtype,5,funtypeGotoes);
    reduceexpr_star_6_rec = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.expr_star_6_rec,3,expr_star_6_subGotoes);
    reduceinstr_empty = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.instr_empty,1,instrGotoes);
    reducelhs_field_access = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.lhs_field_access,1,lhsGotoes);
    reducelhs_array_access = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.lhs_array_access,1,lhsGotoes);
    reduceexpr_primary = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.expr_primary,1,exprGotoes);
    reduceexpr_slash = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.expr_slash,3,exprGotoes);
    reducescript_member_star_1_rec = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.script_member_star_1_rec,2,script_member_star_1Gotoes);
    reducetype_funtype = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.type_funtype,1,typeGotoes);
    reduceprimitive_type_boolean = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.primitive_type_boolean,1,primitive_typeGotoes);
    reducerecord_init = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.record_init,5,record_initGotoes);
    reduceinstr_continue = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.instr_continue,3,instrGotoes);
    reducescript_member_star_1_empty = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.script_member_star_1_empty,0,script_member_star_1Gotoes);
    reduceexpr_optional_13_expr = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.expr_optional_13_expr,1,expr_optional_13Gotoes);
    reducetype_funtype_dims = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.type_funtype_dims,2,typeGotoes);
    reduceloop_for = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.loop_for,9,loopGotoes);
    reduceparameter_star_5_empty = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.parameter_star_5_empty,0,parameter_star_5Gotoes);
    reducescript_member_record_def = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.script_member_record_def,1,script_memberGotoes);
    reducetype_star_0_element = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.type_star_0_element,1,type_star_0_subGotoes);
    reducestart = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.start,1,startGotoes);
    reduceexpr_star_6_element = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.expr_star_6_element,1,expr_star_6_subGotoes);
    reducetype_star_0_rec = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.type_star_0_rec,3,type_star_0_subGotoes);
    reduceexpr_optional_11_empty = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.expr_optional_11_empty,0,expr_optional_11Gotoes);
    reducerecord_def = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.record_def,6,record_defGotoes);
    reduceprimitive_type_double = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.primitive_type_double,1,primitive_typeGotoes);
    reducefunction_rtype_optional_4_function_rtype = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.function_rtype_optional_4_function_rtype,1,function_rtype_optional_4Gotoes);
    reducefield_access_primary = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.field_access_primary,3,field_accessGotoes);
    reduceexpr_star_6_empty = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.expr_star_6_empty,0,expr_star_6Gotoes);
    reduceconditional_if_else = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.conditional_if_else,7,conditionalGotoes);
    reducefor_loop_incr_optional_14_empty = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.for_loop_incr_optional_14_empty,0,for_loop_incr_optional_14Gotoes);
    reduceprimitive_type_string = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.primitive_type_string,1,primitive_typeGotoes);
    reducefield = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.field,3,fieldGotoes);
    reducefor_loop_init_optional_12_empty = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.for_loop_init_optional_12_empty,0,for_loop_init_optional_12Gotoes);
    reduceexpr_mod = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.expr_mod,3,exprGotoes);
    reduceparameter_star_5_element = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.parameter_star_5_element,1,parameter_star_5_subGotoes);
    reduceexpr_unary_minus = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.expr_unary_minus,2,exprGotoes);
    reduceparameter_typed = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.parameter_typed,2,parameterGotoes);
    reduceinstr_throw = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.instr_throw,3,instrGotoes);
    reduceprimary_funcall = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.primary_funcall,1,primary_no_array_creationGotoes);
    reduceinstr_star_7_rec = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.instr_star_7_rec,2,instr_star_7Gotoes);
    reducesemis__semicolon = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.semis__semicolon,1,semisGotoes);
    reduceloop_label_optional_8_loop_label = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.loop_label_optional_8_loop_label,1,loop_label_optional_8Gotoes);
    reduceexpr_ne = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.expr_ne,3,exprGotoes);
    reduceexpr_value_literal = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.expr_value_literal,1,exprGotoes);
    reduceinstr_funcall = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.instr_funcall,2,instrGotoes);
    reducefield_access_id = new ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(PseudoProductionEnum.field_access_id,3,field_accessGotoes);
    shift63 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(63);
    shift190 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(190);
    shift166 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(166);
    shift222 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(222);
    shift178 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(178);
    shift42 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(42);
    shift4 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(4);
    shift54 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(54);
    shift155 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(155);
    shift45 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(45);
    shift133 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(133);
    shift203 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(203);
    shift5 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(5);
    shift91 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(91);
    shift119 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(119);
    shift210 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(210);
    shift212 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(212);
    shift170 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(170);
    shift209 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(209);
    shift213 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(213);
    shift202 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(202);
    shift131 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(131);
    shift59 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(59);
    shift75 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(75);
    shift79 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(79);
    shift23 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(23);
    shift147 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(147);
    shift130 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(130);
    shift34 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(34);
    shift243 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(243);
    shift159 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(159);
    shift237 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(237);
    shift97 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(97);
    shift14 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(14);
    shift95 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(95);
    shift247 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(247);
    shift126 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(126);
    shift112 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(112);
    shift47 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(47);
    shift12 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(12);
    shift35 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(35);
    shift37 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(37);
    shift60 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(60);
    shift36 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(36);
    shift244 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(244);
    shift72 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(72);
    shift93 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(93);
    shift50 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(50);
    shift49 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(49);
    shift81 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(81);
    shift145 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(145);
    shift104 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(104);
    shift160 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(160);
    shift135 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(135);
    shift158 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(158);
    shift68 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(68);
    shift108 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(108);
    shift13 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(13);
    shift110 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(110);
    shift58 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(58);
    shift148 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(148);
    shift114 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(114);
    shift57 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(57);
    shift39 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(39);
    shift89 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(89);
    shift150 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(150);
    shift70 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(70);
    shift189 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(189);
    shift10 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(10);
    shift174 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(174);
    shift41 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(41);
    shift162 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(162);
    shift246 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(246);
    shift157 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(157);
    shift83 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(83);
    shift11 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(11);
    shift99 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(99);
    shift240 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(240);
    shift223 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(223);
    shift77 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(77);
    shift117 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(117);
    shift173 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(173);
    shift20 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(20);
    shift167 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(167);
    shift17 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(17);
    shift6 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(6);
    shift220 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(220);
    shift51 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(51);
    shift85 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(85);
    shift101 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(101);
    shift16 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(16);
    shift175 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(175);
    shift151 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(151);
    shift87 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(87);
    shift30 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(30);
    shift214 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(214);
    shift61 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(61);
    shift115 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(115);
    shift31 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(31);
    shift207 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(207);
    shift56 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(56);
    shift62 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(62);
    shift46 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(46);
    shift19 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(19);
    shift226 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(226);
    shift154 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(154);
    shift52 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(52);
    shift156 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(156);
    shift118 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(118);
    shift48 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(48);
    shift107 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(107);
    shift55 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(55);
    shift44 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(44);
    shift18 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(18);
    shift215 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(215);
    shift9 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(9);
    shift185 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(185);
    shift164 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(164);
    shift205 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(205);
    shift8 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(8);
    shift242 = new ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(242);
    error0 = new ErrorAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>("parse error");
    branch0 = new BranchAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>("parse error");
    initboolean_literalArray();
    initbangArray();
    initstring_literalArray();
    init_ifArray();
    initassignArray();
    init_continueArray();
    initvalue_literalArray();
    init_whileArray();
    initloptArray();
    initnull_literalArray();
    initarrowArray();
    initplusArray();
    initbandArray();
    initmodArray();
    init_voidArray();
    init_elseArray();
    initlambdaArray();
    init_doubleArray();
    initgeArray();
    initlparArray();
    initdefArray();
    init_booleanArray();
    initstarArray();
    initcolonArray();
    initsemicolonArray();
    initslashArray();
    init_breakArray();
    init_intArray();
    init_returnArray();
    initpowArray();
    initdotArray();
    initanyArray();
    initcommaArray();
    initscanArray();
    initidArray();
    init_throwArray();
    initinitArray();
    initltArray();
    init_charArray();
    initrparArray();
    initgtArray();
    initlcurlArray();
    init_newArray();
    initneqArray();
    initborArray();
    initchar_literalArray();
    initroptArray();
    initprintArray();
    initrcurlArray();
    initeolnArray();
    init_doArray();
    init_forArray();
    initstringArray();
    initrecordArray();
    initeqArray();
    initminusArray();
    init__eof__Array();
    initleArray();
    EnumMap<PseudoTerminalEnum,Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[]> tableMap =
      new EnumMap<PseudoTerminalEnum,Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[]>(PseudoTerminalEnum.class);
      
    tableMap.put(PseudoTerminalEnum.boolean_literal,boolean_literalArray);
    tableMap.put(PseudoTerminalEnum.bang,bangArray);
    tableMap.put(PseudoTerminalEnum.string_literal,string_literalArray);
    tableMap.put(PseudoTerminalEnum._if,_ifArray);
    tableMap.put(PseudoTerminalEnum.assign,assignArray);
    tableMap.put(PseudoTerminalEnum._continue,_continueArray);
    tableMap.put(PseudoTerminalEnum.value_literal,value_literalArray);
    tableMap.put(PseudoTerminalEnum._while,_whileArray);
    tableMap.put(PseudoTerminalEnum.lopt,loptArray);
    tableMap.put(PseudoTerminalEnum.null_literal,null_literalArray);
    tableMap.put(PseudoTerminalEnum.arrow,arrowArray);
    tableMap.put(PseudoTerminalEnum.plus,plusArray);
    tableMap.put(PseudoTerminalEnum.band,bandArray);
    tableMap.put(PseudoTerminalEnum.mod,modArray);
    tableMap.put(PseudoTerminalEnum._void,_voidArray);
    tableMap.put(PseudoTerminalEnum._else,_elseArray);
    tableMap.put(PseudoTerminalEnum.lambda,lambdaArray);
    tableMap.put(PseudoTerminalEnum._double,_doubleArray);
    tableMap.put(PseudoTerminalEnum.ge,geArray);
    tableMap.put(PseudoTerminalEnum.lpar,lparArray);
    tableMap.put(PseudoTerminalEnum.def,defArray);
    tableMap.put(PseudoTerminalEnum._boolean,_booleanArray);
    tableMap.put(PseudoTerminalEnum.star,starArray);
    tableMap.put(PseudoTerminalEnum.colon,colonArray);
    tableMap.put(PseudoTerminalEnum.semicolon,semicolonArray);
    tableMap.put(PseudoTerminalEnum.slash,slashArray);
    tableMap.put(PseudoTerminalEnum._break,_breakArray);
    tableMap.put(PseudoTerminalEnum._int,_intArray);
    tableMap.put(PseudoTerminalEnum._return,_returnArray);
    tableMap.put(PseudoTerminalEnum.pow,powArray);
    tableMap.put(PseudoTerminalEnum.dot,dotArray);
    tableMap.put(PseudoTerminalEnum.any,anyArray);
    tableMap.put(PseudoTerminalEnum.comma,commaArray);
    tableMap.put(PseudoTerminalEnum.scan,scanArray);
    tableMap.put(PseudoTerminalEnum.id,idArray);
    tableMap.put(PseudoTerminalEnum._throw,_throwArray);
    tableMap.put(PseudoTerminalEnum.init,initArray);
    tableMap.put(PseudoTerminalEnum.lt,ltArray);
    tableMap.put(PseudoTerminalEnum._char,_charArray);
    tableMap.put(PseudoTerminalEnum.rpar,rparArray);
    tableMap.put(PseudoTerminalEnum.gt,gtArray);
    tableMap.put(PseudoTerminalEnum.lcurl,lcurlArray);
    tableMap.put(PseudoTerminalEnum._new,_newArray);
    tableMap.put(PseudoTerminalEnum.neq,neqArray);
    tableMap.put(PseudoTerminalEnum.bor,borArray);
    tableMap.put(PseudoTerminalEnum.char_literal,char_literalArray);
    tableMap.put(PseudoTerminalEnum.ropt,roptArray);
    tableMap.put(PseudoTerminalEnum.print,printArray);
    tableMap.put(PseudoTerminalEnum.rcurl,rcurlArray);
    tableMap.put(PseudoTerminalEnum.eoln,eolnArray);
    tableMap.put(PseudoTerminalEnum._do,_doArray);
    tableMap.put(PseudoTerminalEnum._for,_forArray);
    tableMap.put(PseudoTerminalEnum.string,stringArray);
    tableMap.put(PseudoTerminalEnum.record,recordArray);
    tableMap.put(PseudoTerminalEnum.eq,eqArray);
    tableMap.put(PseudoTerminalEnum.minus,minusArray);
    tableMap.put(PseudoTerminalEnum.__eof__,__eof__Array);
    tableMap.put(PseudoTerminalEnum.le,leArray);
    initBranchArrayTable();
    
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[] tableMetadata = createStateMetadataTable();
    
    EnumMap<PseudoNonTerminalEnum,Integer> tableStarts =
      new EnumMap<PseudoNonTerminalEnum,Integer>(PseudoNonTerminalEnum.class);
    tableStarts.put(PseudoNonTerminalEnum.start,0);
    table = new ParserTable<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>(tableMap,branchArrayTable,tableMetadata,tableStarts,PseudoVersionEnum.values(),256,PseudoTerminalEnum.__eof__,null);
  } 

  @SuppressWarnings("unchecked")
  private StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[] createStateMetadataTable() {
         
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0record_init_optional_3_metadata0null = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithNonTerminal(PseudoNonTerminalEnum.record_init_optional_3,null);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0_int_metadata0reduceprimitive_type_int = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithTerminal(PseudoTerminalEnum._int,reduceprimitive_type_int);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0script_member_star_1_metadata0null = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithNonTerminal(PseudoNonTerminalEnum.script_member_star_1,null);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0semis_metadata0reduceinstr_break = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithNonTerminal(PseudoNonTerminalEnum.semis,reduceinstr_break);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0band_metadata0null = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithTerminal(PseudoTerminalEnum.band,null);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0dim_expr_metadata0reducedim_expr_plus_15_element = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithNonTerminal(PseudoNonTerminalEnum.dim_expr,reducedim_expr_plus_15_element);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0loop_label_optional_8_metadata0null = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithNonTerminal(PseudoNonTerminalEnum.loop_label_optional_8,null);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0for_loop_init_optional_12_metadata0null = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithNonTerminal(PseudoNonTerminalEnum.for_loop_init_optional_12,null);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0parameter_metadata0reduceparameter_star_5_element = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithNonTerminal(PseudoNonTerminalEnum.parameter,reduceparameter_star_5_element);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0parameters_metadata0null = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithNonTerminal(PseudoNonTerminalEnum.parameters,null);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0funcall_metadata0null = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithNonTerminal(PseudoNonTerminalEnum.funcall,null);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0type_metadata0reducetype_star_0_rec = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithNonTerminal(PseudoNonTerminalEnum.type,reducetype_star_0_rec);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0_throw_metadata0null = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithTerminal(PseudoTerminalEnum._throw,null);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0expr_optional_11_metadata0null = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithNonTerminal(PseudoNonTerminalEnum.expr_optional_11,null);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0type_metadata0reducereturn_type_type = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithNonTerminal(PseudoNonTerminalEnum.type,reducereturn_type_type);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0bor_metadata0null = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithTerminal(PseudoTerminalEnum.bor,null);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0for_loop_incr_optional_14_metadata0null = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithNonTerminal(PseudoNonTerminalEnum.for_loop_incr_optional_14,null);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0semis_metadata0reduceinstr_assignation = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithNonTerminal(PseudoNonTerminalEnum.semis,reduceinstr_assignation);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0_boolean_metadata0reduceprimitive_type_boolean = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithTerminal(PseudoTerminalEnum._boolean,reduceprimitive_type_boolean);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0block_metadata0reduceconditional_if_else = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithNonTerminal(PseudoNonTerminalEnum.block,reduceconditional_if_else);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0colon_metadata0reduceloop_label = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithTerminal(PseudoTerminalEnum.colon,reduceloop_label);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0rpar_metadata0reducefuntype = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithTerminal(PseudoTerminalEnum.rpar,reducefuntype);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0_double_metadata0reduceprimitive_type_double = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithTerminal(PseudoTerminalEnum._double,reduceprimitive_type_double);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0ge_metadata0null = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithTerminal(PseudoTerminalEnum.ge,null);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0_new_metadata0null = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithTerminal(PseudoTerminalEnum._new,null);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0funtype_metadata0null = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithNonTerminal(PseudoNonTerminalEnum.funtype,null);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0lhs_metadata0null = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithNonTerminal(PseudoNonTerminalEnum.lhs,null);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0char_literal_metadata0reduceexpr_char_literal = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithTerminal(PseudoTerminalEnum.char_literal,reduceexpr_char_literal);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0_void_metadata0reducereturn_type_void = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithTerminal(PseudoTerminalEnum._void,reducereturn_type_void);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0id_metadata0reducefield_access_id = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithTerminal(PseudoTerminalEnum.id,reducefield_access_id);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0semicolon_metadata0reduceinstr_empty = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithTerminal(PseudoTerminalEnum.semicolon,reduceinstr_empty);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0rpar_metadata0reduceloop_dowhile = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithTerminal(PseudoTerminalEnum.rpar,reduceloop_dowhile);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0semicolon_metadata0reducesemis__semicolon = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithTerminal(PseudoTerminalEnum.semicolon,reducesemis__semicolon);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0_do_metadata0null = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithTerminal(PseudoTerminalEnum._do,null);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0pow_metadata0null = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithTerminal(PseudoTerminalEnum.pow,null);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0declaration_metadata0reducefor_loop_init_declaration = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithNonTerminal(PseudoNonTerminalEnum.declaration,reducefor_loop_init_declaration);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0field_metadata0reducefield_star_2_rec = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithNonTerminal(PseudoNonTerminalEnum.field,reducefield_star_2_rec);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0_return_metadata0null = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithTerminal(PseudoTerminalEnum._return,null);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0semis_metadata0reduceinstr_throw = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithNonTerminal(PseudoNonTerminalEnum.semis,reduceinstr_throw);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0lopt_metadata0null = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithTerminal(PseudoTerminalEnum.lopt,null);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0declaration_metadata0null = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithNonTerminal(PseudoNonTerminalEnum.declaration,null);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0dim_expr_metadata0reducedim_expr_plus_16_rec = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithNonTerminal(PseudoNonTerminalEnum.dim_expr,reducedim_expr_plus_16_rec);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0rpar_metadata0reducefuncall_primary = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithTerminal(PseudoTerminalEnum.rpar,reducefuncall_primary);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0array_access_metadata0null = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithNonTerminal(PseudoNonTerminalEnum.array_access,null);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0semis_metadata0reduceinstr_continue = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithNonTerminal(PseudoNonTerminalEnum.semis,reduceinstr_continue);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0_continue_metadata0null = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithTerminal(PseudoTerminalEnum._continue,null);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0semis_metadata0reduceinstr_scan = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithNonTerminal(PseudoNonTerminalEnum.semis,reduceinstr_scan);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0lpar_metadata0null = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithTerminal(PseudoTerminalEnum.lpar,null);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0_for_metadata0null = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithTerminal(PseudoTerminalEnum._for,null);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0primary_metadata0null = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithNonTerminal(PseudoNonTerminalEnum.primary,null);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0rpar_metadata0reduceprimary_parens = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithTerminal(PseudoTerminalEnum.rpar,reduceprimary_parens);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0ropt_metadata0reducedim_expr = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithTerminal(PseudoTerminalEnum.ropt,reducedim_expr);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0rpar_metadata0null = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithTerminal(PseudoTerminalEnum.rpar,null);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0dot_metadata0null = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithTerminal(PseudoTerminalEnum.dot,null);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0record_init_metadata0reducerecord_init_optional_3_record_init = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithNonTerminal(PseudoNonTerminalEnum.record_init,reducerecord_init_optional_3_record_init);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0function_rtype_metadata0reducefunction_rtype_optional_4_function_rtype = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithNonTerminal(PseudoNonTerminalEnum.function_rtype,reducefunction_rtype_optional_4_function_rtype);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0eq_metadata0null = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithTerminal(PseudoTerminalEnum.eq,null);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0parameter_star_5_sub_metadata0null = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithNonTerminal(PseudoNonTerminalEnum.parameter_star_5_sub,null);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0lcurl_metadata0reduceinstr_star_7_empty = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithTerminal(PseudoTerminalEnum.lcurl,reduceinstr_star_7_empty);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0string_metadata0reduceprimitive_type_string = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithTerminal(PseudoTerminalEnum.string,reduceprimitive_type_string);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0id_optional_9_metadata0null = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithNonTerminal(PseudoNonTerminalEnum.id_optional_9,null);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0type_star_0_metadata0null = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithNonTerminal(PseudoNonTerminalEnum.type_star_0,null);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0dims_opt_metadata0reducearray_creation_record = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithNonTerminal(PseudoNonTerminalEnum.dims_opt,reducearray_creation_record);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0block_metadata0reducefunction_def = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithNonTerminal(PseudoNonTerminalEnum.block,reducefunction_def);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0gt_metadata0null = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithTerminal(PseudoTerminalEnum.gt,null);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0lcurl_metadata0reducefield_star_2_empty = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithTerminal(PseudoTerminalEnum.lcurl,reducefield_star_2_empty);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0dim_expr_plus_16_metadata0null = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithNonTerminal(PseudoNonTerminalEnum.dim_expr_plus_16,null);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0dim_expr_metadata0reducedim_expr_plus_15_rec = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithNonTerminal(PseudoNonTerminalEnum.dim_expr,reducedim_expr_plus_15_rec);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0_if_metadata0null = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithTerminal(PseudoTerminalEnum._if,null);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0init_metadata0null = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithTerminal(PseudoTerminalEnum.init,null);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0print_metadata0null = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithTerminal(PseudoTerminalEnum.print,null);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0def_metadata0null = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithTerminal(PseudoTerminalEnum.def,null);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0id_metadata0reduceid_optional_9_id = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithTerminal(PseudoTerminalEnum.id,reduceid_optional_9_id);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0arguments_metadata0null = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithNonTerminal(PseudoNonTerminalEnum.arguments,null);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0return_type_metadata0null = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithNonTerminal(PseudoNonTerminalEnum.return_type,null);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0dims_metadata0null = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithNonTerminal(PseudoNonTerminalEnum.dims,null);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0function_rtype_optional_4_metadata0null = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithNonTerminal(PseudoNonTerminalEnum.function_rtype_optional_4,null);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0minus_metadata0null = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithTerminal(PseudoTerminalEnum.minus,null);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0primitive_type_metadata0null = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithNonTerminal(PseudoNonTerminalEnum.primitive_type,null);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0ropt_metadata0reducearray_access_id = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithTerminal(PseudoTerminalEnum.ropt,reducearray_access_id);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0le_metadata0null = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithTerminal(PseudoTerminalEnum.le,null);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0id_metadata0reduceid_optional_10_id = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithTerminal(PseudoTerminalEnum.id,reduceid_optional_10_id);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0arrow_metadata0null = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithTerminal(PseudoTerminalEnum.arrow,null);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0semis_metadata0reduceinstr_print = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithNonTerminal(PseudoNonTerminalEnum.semis,reduceinstr_print);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0semicolon_metadata0null = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithTerminal(PseudoTerminalEnum.semicolon,null);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0field_star_2_metadata0null = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithNonTerminal(PseudoNonTerminalEnum.field_star_2,null);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0start_metadata0null = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithNonTerminal(PseudoNonTerminalEnum.start,null);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0bang_metadata0null = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithTerminal(PseudoTerminalEnum.bang,null);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0colon_metadata0null = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithTerminal(PseudoTerminalEnum.colon,null);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0field_access_metadata0null = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithNonTerminal(PseudoNonTerminalEnum.field_access,null);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0semis_metadata0reduceinstr_funcall = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithNonTerminal(PseudoNonTerminalEnum.semis,reduceinstr_funcall);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0for_loop_init_metadata0reducefor_loop_init_optional_12_for_loop_init = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithNonTerminal(PseudoNonTerminalEnum.for_loop_init,reducefor_loop_init_optional_12_for_loop_init);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0semis_metadata0reduceinstr_declaration = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithNonTerminal(PseudoNonTerminalEnum.semis,reduceinstr_declaration);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0type_star_0_sub_metadata0null = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithNonTerminal(PseudoNonTerminalEnum.type_star_0_sub,null);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0conditional_metadata0reduceinstr_conditional = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithNonTerminal(PseudoNonTerminalEnum.conditional,reduceinstr_conditional);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0null_literal_metadata0reduceexpr_null_literal = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithTerminal(PseudoTerminalEnum.null_literal,reduceexpr_null_literal);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0ropt_metadata0reducearray_access_primary = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithTerminal(PseudoTerminalEnum.ropt,reducearray_access_primary);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0record_def_metadata0reducescript_member_record_def = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithNonTerminal(PseudoNonTerminalEnum.record_def,reducescript_member_record_def);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0id_metadata0reducefield_access_primary = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithTerminal(PseudoTerminalEnum.id,reducefield_access_primary);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0dims_opt_metadata0reducearray_creation_primitive = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithNonTerminal(PseudoNonTerminalEnum.dims_opt,reducearray_creation_primitive);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0_char_metadata0reduceprimitive_type_char = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithTerminal(PseudoTerminalEnum._char,reduceprimitive_type_char);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0dim_expr_plus_15_metadata0null = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithNonTerminal(PseudoNonTerminalEnum.dim_expr_plus_15,null);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0block_metadata0reducerecord_init = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithNonTerminal(PseudoNonTerminalEnum.block,reducerecord_init);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0assignation_metadata0null = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithNonTerminal(PseudoNonTerminalEnum.assignation,null);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0_while_metadata0null = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithTerminal(PseudoTerminalEnum._while,null);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0ropt_metadata0reducedims_recursive = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithTerminal(PseudoTerminalEnum.ropt,reducedims_recursive);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0value_literal_metadata0reduceexpr_value_literal = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithTerminal(PseudoTerminalEnum.value_literal,reduceexpr_value_literal);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0type_metadata0reducetype_star_0_element = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithNonTerminal(PseudoNonTerminalEnum.type,reducetype_star_0_element);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0array_access_metadata0reduceprimary_array_access = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithNonTerminal(PseudoNonTerminalEnum.array_access,reduceprimary_array_access);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0for_loop_incr_metadata0reducefor_loop_incr_optional_14_for_loop_incr = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithNonTerminal(PseudoNonTerminalEnum.for_loop_incr,reducefor_loop_incr_optional_14_for_loop_incr);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0expr_optional_13_metadata0null = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithNonTerminal(PseudoNonTerminalEnum.expr_optional_13,null);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0parameter_metadata0reduceparameter_star_5_rec = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithNonTerminal(PseudoNonTerminalEnum.parameter,reduceparameter_star_5_rec);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0expr_star_6_sub_metadata0null = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithNonTerminal(PseudoNonTerminalEnum.expr_star_6_sub,null);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0lambda_metadata0null = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithTerminal(PseudoTerminalEnum.lambda,null);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0dim_expr_metadata0reducedim_expr_plus_16_element = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithNonTerminal(PseudoNonTerminalEnum.dim_expr,reducedim_expr_plus_16_element);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0boolean_literal_metadata0reduceexpr_boolean_literal = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithTerminal(PseudoTerminalEnum.boolean_literal,reduceexpr_boolean_literal);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0id_optional_10_metadata0null = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithNonTerminal(PseudoNonTerminalEnum.id_optional_10,null);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0rpar_metadata0reducefuncall_id = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithTerminal(PseudoTerminalEnum.rpar,reducefuncall_id);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0primary_no_array_creation_metadata0null = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithNonTerminal(PseudoNonTerminalEnum.primary_no_array_creation,null);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0funcall_metadata0reduceprimary_funcall = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithNonTerminal(PseudoNonTerminalEnum.funcall,reduceprimary_funcall);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0field_access_metadata0reduceprimary_field_access = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithNonTerminal(PseudoNonTerminalEnum.field_access,reduceprimary_field_access);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0neq_metadata0null = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithTerminal(PseudoTerminalEnum.neq,null);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0record_metadata0null = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithTerminal(PseudoTerminalEnum.record,null);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0rcurl_metadata0reducerecord_def = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithTerminal(PseudoTerminalEnum.rcurl,reducerecord_def);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0assignation_metadata0reducefor_loop_incr_assignation = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithNonTerminal(PseudoNonTerminalEnum.assignation,reducefor_loop_incr_assignation);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0block_metadata0reduceloop_while = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithNonTerminal(PseudoNonTerminalEnum.block,reduceloop_while);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0type_metadata0null = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithNonTerminal(PseudoNonTerminalEnum.type,null);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0instr_star_7_metadata0null = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithNonTerminal(PseudoNonTerminalEnum.instr_star_7,null);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0script_member_metadata0reducescript_member_star_1_rec = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithNonTerminal(PseudoNonTerminalEnum.script_member,reducescript_member_star_1_rec);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0ropt_metadata0reducedims_singleton = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithTerminal(PseudoTerminalEnum.ropt,reducedims_singleton);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0array_creation_metadata0reduceprimary_array_creation = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithNonTerminal(PseudoNonTerminalEnum.array_creation,reduceprimary_array_creation);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0mod_metadata0null = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithTerminal(PseudoTerminalEnum.mod,null);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0comma_metadata0null = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithTerminal(PseudoTerminalEnum.comma,null);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0parameter_star_5_metadata0reduceparameters = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithNonTerminal(PseudoNonTerminalEnum.parameter_star_5,reduceparameters);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0block_metadata0reduceinstr_block = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithNonTerminal(PseudoNonTerminalEnum.block,reduceinstr_block);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0id_metadata0null = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithTerminal(PseudoTerminalEnum.id,null);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0block_metadata0reducescript_member_block = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithNonTerminal(PseudoNonTerminalEnum.block,reducescript_member_block);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0block_metadata0null = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithNonTerminal(PseudoNonTerminalEnum.block,null);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0semis_metadata0reduceinstr_return = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithNonTerminal(PseudoNonTerminalEnum.semis,reduceinstr_return);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0function_def_metadata0reducescript_member_function_def = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithNonTerminal(PseudoNonTerminalEnum.function_def,reducescript_member_function_def);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0lt_metadata0null = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithTerminal(PseudoTerminalEnum.lt,null);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0assign_metadata0null = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithTerminal(PseudoTerminalEnum.assign,null);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0expr_metadata0null = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithNonTerminal(PseudoNonTerminalEnum.expr,null);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0expr_star_6_metadata0reducearguments = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithNonTerminal(PseudoNonTerminalEnum.expr_star_6,reducearguments);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0rpar_metadata0reduceprimary_allocation = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithTerminal(PseudoTerminalEnum.rpar,reduceprimary_allocation);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0eoln_metadata0reducesemis__eoln = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithTerminal(PseudoTerminalEnum.eoln,reducesemis__eoln);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0null_metadata0reducescript_member_star_1_empty = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithNonTerminal(null,reducescript_member_star_1_empty);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0loop_metadata0reduceinstr_loop = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithNonTerminal(PseudoNonTerminalEnum.loop,reduceinstr_loop);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0assignation_metadata0reducefor_loop_init_assignation = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithNonTerminal(PseudoNonTerminalEnum.assignation,reducefor_loop_init_assignation);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0string_literal_metadata0reduceexpr_string_literal = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithTerminal(PseudoTerminalEnum.string_literal,reduceexpr_string_literal);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0_break_metadata0null = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithTerminal(PseudoTerminalEnum._break,null);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0return_type_metadata0reducefunction_rtype = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithNonTerminal(PseudoNonTerminalEnum.return_type,reducefunction_rtype);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0semis_metadata0reducefield = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithNonTerminal(PseudoNonTerminalEnum.semis,reducefield);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0_else_metadata0null = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithTerminal(PseudoTerminalEnum._else,null);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0expr_metadata0reduceexpr_pow = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithNonTerminal(PseudoNonTerminalEnum.expr,reduceexpr_pow);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0rcurl_metadata0reduceblock = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithTerminal(PseudoTerminalEnum.rcurl,reduceblock);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0__eof___metadata0null = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithTerminal(PseudoTerminalEnum.__eof__,null);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0star_metadata0null = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithTerminal(PseudoTerminalEnum.star,null);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0plus_metadata0null = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithTerminal(PseudoTerminalEnum.plus,null);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0scan_metadata0null = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithTerminal(PseudoTerminalEnum.scan,null);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0block_metadata0reduceloop_for = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithNonTerminal(PseudoNonTerminalEnum.block,reduceloop_for);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0instr_metadata0reduceinstr_star_7_rec = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithNonTerminal(PseudoNonTerminalEnum.instr,reduceinstr_star_7_rec);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0id_metadata0reduceparameter_typed = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithTerminal(PseudoTerminalEnum.id,reduceparameter_typed);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0loop_label_metadata0reduceloop_label_optional_8_loop_label = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithNonTerminal(PseudoNonTerminalEnum.loop_label,reduceloop_label_optional_8_loop_label);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0any_metadata0reduceprimitive_type_any = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithTerminal(PseudoTerminalEnum.any,reduceprimitive_type_any);
     
    StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> metadata0slash_metadata0null = StateMetadata.<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>createAllVersionWithTerminal(PseudoTerminalEnum.slash,null);

    return (StateMetadata<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[])new StateMetadata<?,?,?,?>[]{metadata0null_metadata0reducescript_member_star_1_empty,metadata0start_metadata0null,metadata0__eof___metadata0null,metadata0script_member_star_1_metadata0null,metadata0record_metadata0null,metadata0id_metadata0null,metadata0lcurl_metadata0reducefield_star_2_empty,metadata0field_star_2_metadata0null,metadata0string_metadata0reduceprimitive_type_string,metadata0_char_metadata0reduceprimitive_type_char,metadata0_int_metadata0reduceprimitive_type_int,metadata0_double_metadata0reduceprimitive_type_double,metadata0id_metadata0null,metadata0lopt_metadata0null,metadata0ropt_metadata0reducedims_singleton,metadata0dims_metadata0null,metadata0lopt_metadata0null,metadata0ropt_metadata0reducedims_recursive,metadata0lpar_metadata0null,metadata0_boolean_metadata0reduceprimitive_type_boolean,metadata0any_metadata0reduceprimitive_type_any,metadata0type_metadata0reducetype_star_0_element,metadata0type_star_0_sub_metadata0null,metadata0comma_metadata0null,metadata0type_metadata0reducetype_star_0_rec,metadata0primitive_type_metadata0null,metadata0dims_metadata0null,metadata0funtype_metadata0null,metadata0dims_metadata0null,metadata0type_star_0_metadata0null,metadata0colon_metadata0null,metadata0_void_metadata0reducereturn_type_void,metadata0type_metadata0reducereturn_type_type,metadata0return_type_metadata0null,metadata0rpar_metadata0reducefuntype,metadata0init_metadata0null,metadata0lpar_metadata0null,metadata0id_metadata0null,metadata0type_metadata0null,metadata0id_metadata0reduceparameter_typed,metadata0parameters_metadata0null,metadata0rpar_metadata0null,metadata0lcurl_metadata0reduceinstr_star_7_empty,metadata0instr_star_7_metadata0null,metadata0scan_metadata0null,metadata0_new_metadata0null,metadata0id_metadata0null,metadata0lopt_metadata0null,metadata0value_literal_metadata0reduceexpr_value_literal,metadata0boolean_literal_metadata0reduceexpr_boolean_literal,metadata0bang_metadata0null,metadata0lambda_metadata0null,metadata0lpar_metadata0null,metadata0parameters_metadata0null,metadata0rpar_metadata0null,metadata0arrow_metadata0null,metadata0null_literal_metadata0reduceexpr_null_literal,metadata0char_literal_metadata0reduceexpr_char_literal,metadata0string_literal_metadata0reduceexpr_string_literal,metadata0plus_metadata0null,metadata0minus_metadata0null,metadata0id_metadata0null,metadata0lopt_metadata0null,metadata0lpar_metadata0null,metadata0field_access_metadata0reduceprimary_field_access,metadata0array_access_metadata0reduceprimary_array_access,metadata0array_creation_metadata0reduceprimary_array_creation,metadata0primary_no_array_creation_metadata0null,metadata0lopt_metadata0null,metadata0primary_metadata0null,metadata0lpar_metadata0null,metadata0expr_star_6_sub_metadata0null,metadata0comma_metadata0null,metadata0funcall_metadata0reduceprimary_funcall,metadata0expr_metadata0null,metadata0neq_metadata0null,metadata0expr_metadata0null,metadata0bor_metadata0null,metadata0expr_metadata0null,metadata0ge_metadata0null,metadata0expr_metadata0null,metadata0star_metadata0null,metadata0expr_metadata0null,metadata0lt_metadata0null,metadata0expr_metadata0null,metadata0slash_metadata0null,metadata0expr_metadata0null,metadata0gt_metadata0null,metadata0expr_metadata0null,metadata0pow_metadata0null,metadata0expr_metadata0reduceexpr_pow,metadata0eq_metadata0null,metadata0expr_metadata0null,metadata0plus_metadata0null,metadata0expr_metadata0null,metadata0minus_metadata0null,metadata0expr_metadata0null,metadata0le_metadata0null,metadata0expr_metadata0null,metadata0mod_metadata0null,metadata0expr_metadata0null,metadata0band_metadata0null,metadata0expr_metadata0null,metadata0arguments_metadata0null,metadata0rpar_metadata0reducefuncall_primary,metadata0expr_star_6_metadata0reducearguments,metadata0expr_metadata0null,metadata0dot_metadata0null,metadata0id_metadata0reducefield_access_primary,metadata0expr_metadata0null,metadata0ropt_metadata0reducearray_access_primary,metadata0expr_metadata0null,metadata0rpar_metadata0reduceprimary_parens,metadata0expr_metadata0null,metadata0ropt_metadata0reducearray_access_id,metadata0lpar_metadata0null,metadata0arguments_metadata0null,metadata0rpar_metadata0reducefuncall_id,metadata0dot_metadata0null,metadata0id_metadata0reducefield_access_id,metadata0expr_metadata0null,metadata0expr_metadata0null,metadata0expr_metadata0null,metadata0parameter_star_5_metadata0reduceparameters,metadata0parameter_metadata0reduceparameter_star_5_element,metadata0parameter_star_5_sub_metadata0null,metadata0comma_metadata0null,metadata0parameter_metadata0reduceparameter_star_5_rec,metadata0expr_metadata0null,metadata0expr_metadata0null,metadata0ropt_metadata0reducedim_expr,metadata0lpar_metadata0null,metadata0arguments_metadata0null,metadata0rpar_metadata0reduceprimary_allocation,metadata0dim_expr_plus_16_metadata0null,metadata0lopt_metadata0null,metadata0dims_opt_metadata0reducearray_creation_record,metadata0dim_expr_metadata0reducedim_expr_plus_16_rec,metadata0dims_metadata0null,metadata0dim_expr_metadata0reducedim_expr_plus_16_element,metadata0primitive_type_metadata0null,metadata0dim_expr_metadata0reducedim_expr_plus_15_element,metadata0dim_expr_plus_15_metadata0null,metadata0dims_opt_metadata0reducearray_creation_primitive,metadata0dim_expr_metadata0reducedim_expr_plus_15_rec,metadata0id_metadata0null,metadata0primary_metadata0null,metadata0semicolon_metadata0reducesemis__semicolon,metadata0eoln_metadata0reducesemis__eoln,metadata0semis_metadata0reduceinstr_scan,metadata0rcurl_metadata0reduceblock,metadata0print_metadata0null,metadata0expr_metadata0null,metadata0semis_metadata0reduceinstr_print,metadata0id_metadata0null,metadata0colon_metadata0reduceloop_label,metadata0lopt_metadata0null,metadata0lpar_metadata0null,metadata0id_metadata0null,metadata0_if_metadata0null,metadata0lpar_metadata0null,metadata0expr_metadata0null,metadata0rpar_metadata0null,metadata0block_metadata0null,metadata0_else_metadata0null,metadata0block_metadata0reduceconditional_if_else,metadata0_continue_metadata0null,metadata0id_metadata0reduceid_optional_10_id,metadata0id_optional_10_metadata0null,metadata0semis_metadata0reduceinstr_continue,metadata0_throw_metadata0null,metadata0expr_metadata0null,metadata0semis_metadata0reduceinstr_throw,metadata0semicolon_metadata0reduceinstr_empty,metadata0_break_metadata0null,metadata0id_metadata0reduceid_optional_9_id,metadata0id_optional_9_metadata0null,metadata0semis_metadata0reduceinstr_break,metadata0_return_metadata0null,metadata0expr_optional_11_metadata0null,metadata0semis_metadata0reduceinstr_return,metadata0expr_metadata0null,metadata0array_access_metadata0null,metadata0field_access_metadata0null,metadata0lhs_metadata0null,metadata0assign_metadata0null,metadata0expr_metadata0null,metadata0instr_metadata0reduceinstr_star_7_rec,metadata0type_metadata0null,metadata0id_metadata0null,metadata0assign_metadata0null,metadata0expr_metadata0null,metadata0assignation_metadata0null,metadata0semis_metadata0reduceinstr_assignation,metadata0funcall_metadata0null,metadata0semis_metadata0reduceinstr_funcall,metadata0declaration_metadata0null,metadata0semis_metadata0reduceinstr_declaration,metadata0conditional_metadata0reduceinstr_conditional,metadata0primary_metadata0null,metadata0block_metadata0reduceinstr_block,metadata0loop_label_optional_8_metadata0null,metadata0_while_metadata0null,metadata0lpar_metadata0null,metadata0expr_metadata0null,metadata0rpar_metadata0null,metadata0block_metadata0reduceloop_while,metadata0_do_metadata0null,metadata0block_metadata0null,metadata0_while_metadata0null,metadata0lpar_metadata0null,metadata0expr_metadata0null,metadata0rpar_metadata0reduceloop_dowhile,metadata0_for_metadata0null,metadata0lpar_metadata0null,metadata0id_metadata0null,metadata0for_loop_init_metadata0reducefor_loop_init_optional_12_for_loop_init,metadata0funcall_metadata0null,metadata0assignation_metadata0reducefor_loop_init_assignation,metadata0for_loop_init_optional_12_metadata0null,metadata0semicolon_metadata0null,metadata0expr_optional_13_metadata0null,metadata0semicolon_metadata0null,metadata0id_metadata0null,metadata0for_loop_incr_metadata0reducefor_loop_incr_optional_14_for_loop_incr,metadata0for_loop_incr_optional_14_metadata0null,metadata0rpar_metadata0null,metadata0block_metadata0reduceloop_for,metadata0assignation_metadata0reducefor_loop_incr_assignation,metadata0funcall_metadata0null,metadata0expr_metadata0null,metadata0declaration_metadata0reducefor_loop_init_declaration,metadata0loop_metadata0reduceinstr_loop,metadata0loop_label_metadata0reduceloop_label_optional_8_loop_label,metadata0block_metadata0reducerecord_init,metadata0record_init_metadata0reducerecord_init_optional_3_record_init,metadata0record_init_optional_3_metadata0null,metadata0rcurl_metadata0reducerecord_def,metadata0field_metadata0reducefield_star_2_rec,metadata0type_metadata0null,metadata0id_metadata0null,metadata0semis_metadata0reducefield,metadata0def_metadata0null,metadata0id_metadata0null,metadata0lpar_metadata0null,metadata0parameters_metadata0null,metadata0rpar_metadata0null,metadata0colon_metadata0null,metadata0return_type_metadata0reducefunction_rtype,metadata0function_rtype_metadata0reducefunction_rtype_optional_4_function_rtype,metadata0function_rtype_optional_4_metadata0null,metadata0block_metadata0reducefunction_def,metadata0record_def_metadata0reducescript_member_record_def,metadata0function_def_metadata0reducescript_member_function_def,metadata0block_metadata0reducescript_member_block,metadata0script_member_metadata0reducescript_member_star_1_rec};
  }

  
  private int[] startGotoes;

  private void initstartGotoes() {
    startGotoes = 
      new int[]{1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] parametersGotoes;

  private void initparametersGotoes() {
    parametersGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,40,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,53,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,245,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] for_loop_init_optional_12Gotoes;

  private void initfor_loop_init_optional_12Gotoes() {
    for_loop_init_optional_12Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,219,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] instr_star_7Gotoes;

  private void initinstr_star_7Gotoes() {
    instr_star_7Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,43,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] declarationGotoes;

  private void initdeclarationGotoes() {
    declarationGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,196,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,231,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] for_loop_incrGotoes;

  private void initfor_loop_incrGotoes() {
    for_loop_incrGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,224,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] primary_no_array_creationGotoes;

  private void initprimary_no_array_creationGotoes() {
    primary_no_array_creationGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,67,67,-1,-1,67,-1,-1,67,-1,-1,-1,-1,67,-1,-1,-1,67,67,-1,67,67,-1,-1,-1,-1,67,-1,67,-1,67,-1,-1,67,-1,67,-1,67,-1,67,-1,67,-1,67,-1,67,-1,67,-1,67,-1,67,-1,67,-1,67,-1,67,-1,67,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,67,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,67,-1,-1,-1,67,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,67,-1,-1,-1,-1,67,67,-1,-1,67,-1,-1,-1,-1,-1,-1,-1,-1,-1,67,-1,-1,-1,-1,-1,-1,-1,67,-1,-1,-1,-1,-1,-1,67,-1,-1,-1,-1,67,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,67,-1,-1,-1,-1,-1,-1,67,-1,-1,-1,67,-1,-1,-1,-1,-1,67,-1,67,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] type_star_0Gotoes;

  private void inittype_star_0Gotoes() {
    type_star_0Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,29,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,29,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] expr_star_6Gotoes;

  private void initexpr_star_6Gotoes() {
    expr_star_6Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,105,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,105,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,105,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] semisGotoes;

  private void initsemisGotoes() {
    semisGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,149,-1,-1,-1,-1,-1,153,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,169,-1,-1,172,-1,-1,-1,-1,177,-1,-1,180,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,193,-1,195,-1,197,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,241,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] blockGotoes;

  private void initblockGotoes() {
    blockGotoes = 
      new int[]{-1,-1,-1,254,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,234,-1,200,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,163,-1,165,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,206,-1,208,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,227,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,251,-1,-1,-1,-1,-1};
  }
  
  private int[] funtypeGotoes;

  private void initfuntypeGotoes() {
    funtypeGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,27,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,27,-1,-1,-1,-1,27,-1,-1,-1,-1,-1,-1,27,-1,-1,-1,-1,-1,27,-1,-1,-1,-1,-1,-1,27,-1,-1,-1,-1,-1,-1,-1,-1,27,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,27,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,27,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,27,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,27,-1,-1,27,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] parameter_star_5_subGotoes;

  private void initparameter_star_5_subGotoes() {
    parameter_star_5_subGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,125,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,125,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,125,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] array_accessGotoes;

  private void initarray_accessGotoes() {
    array_accessGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,182,65,-1,-1,65,-1,-1,65,-1,-1,-1,-1,65,-1,-1,-1,65,65,-1,65,65,-1,-1,-1,-1,65,-1,65,-1,65,-1,-1,65,-1,65,-1,65,-1,65,-1,65,-1,65,-1,65,-1,65,-1,65,-1,65,-1,65,-1,65,-1,65,-1,65,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,65,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,65,-1,-1,-1,65,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,65,-1,-1,-1,-1,65,65,-1,-1,65,-1,-1,-1,-1,-1,-1,-1,-1,-1,65,-1,-1,-1,-1,-1,-1,-1,65,-1,-1,-1,-1,-1,-1,65,-1,-1,-1,-1,65,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,65,-1,-1,-1,-1,-1,-1,65,-1,-1,-1,182,-1,-1,-1,-1,-1,65,-1,182,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] fieldGotoes;

  private void initfieldGotoes() {
    fieldGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,238,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] dim_exprGotoes;

  private void initdim_exprGotoes() {
    dim_exprGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,139,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,137,-1,-1,-1,-1,-1,141,-1,144,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] assignationGotoes;

  private void initassignationGotoes() {
    assignationGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,192,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,218,-1,-1,-1,-1,-1,-1,-1,228,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] parameterGotoes;

  private void initparameterGotoes() {
    parameterGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,124,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,124,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,127,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,124,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] return_typeGotoes;

  private void initreturn_typeGotoes() {
    return_typeGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,33,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,248,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] dimsGotoes;

  private void initdimsGotoes() {
    dimsGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,15,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,26,-1,28,-1,-1,-1,-1,-1,-1,-1,-1,-1,15,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,138,-1,-1,-1,-1,-1,-1,-1,138,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,15,-1,-1,-1,15,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,15,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] function_defGotoes;

  private void initfunction_defGotoes() {
    function_defGotoes = 
      new int[]{-1,-1,-1,253,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] loop_label_optional_8Gotoes;

  private void initloop_label_optional_8Gotoes() {
    loop_label_optional_8Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,201,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] field_accessGotoes;

  private void initfield_accessGotoes() {
    field_accessGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,183,64,-1,-1,64,-1,-1,64,-1,-1,-1,-1,64,-1,-1,-1,64,64,-1,64,64,-1,-1,-1,-1,64,-1,64,-1,64,-1,-1,64,-1,64,-1,64,-1,64,-1,64,-1,64,-1,64,-1,64,-1,64,-1,64,-1,64,-1,64,-1,64,-1,64,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,64,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,64,-1,-1,-1,64,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,64,-1,-1,-1,-1,64,64,-1,-1,64,-1,-1,-1,-1,-1,-1,-1,-1,-1,64,-1,-1,-1,-1,-1,-1,-1,64,-1,-1,-1,-1,-1,-1,64,-1,-1,-1,-1,64,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,64,-1,-1,-1,-1,-1,-1,64,-1,-1,-1,183,-1,-1,-1,-1,-1,64,-1,183,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] array_creationGotoes;

  private void initarray_creationGotoes() {
    array_creationGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,66,66,-1,-1,66,-1,-1,66,-1,-1,-1,-1,66,-1,-1,-1,66,66,-1,66,66,-1,-1,-1,-1,66,-1,66,-1,66,-1,-1,66,-1,66,-1,66,-1,66,-1,66,-1,66,-1,66,-1,66,-1,66,-1,66,-1,66,-1,66,-1,66,-1,66,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,66,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,66,-1,-1,-1,66,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,66,-1,-1,-1,-1,66,66,-1,-1,66,-1,-1,-1,-1,-1,-1,-1,-1,-1,66,-1,-1,-1,-1,-1,-1,-1,66,-1,-1,-1,-1,-1,-1,66,-1,-1,-1,-1,66,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,66,-1,-1,-1,-1,-1,-1,66,-1,-1,-1,66,-1,-1,-1,-1,-1,66,-1,66,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] lhsGotoes;

  private void initlhsGotoes() {
    lhsGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,184,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,184,-1,-1,-1,-1,-1,-1,-1,184,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] field_star_2Gotoes;

  private void initfield_star_2Gotoes() {
    field_star_2Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,7,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] argumentsGotoes;

  private void initargumentsGotoes() {
    argumentsGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,103,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,116,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,132,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] record_initGotoes;

  private void initrecord_initGotoes() {
    record_initGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,235,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] record_init_optional_3Gotoes;

  private void initrecord_init_optional_3Gotoes() {
    record_init_optional_3Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,236,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] for_loop_initGotoes;

  private void initfor_loop_initGotoes() {
    for_loop_initGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,216,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] typeGotoes;

  private void inittypeGotoes() {
    typeGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,239,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,21,-1,-1,-1,-1,24,-1,-1,-1,-1,-1,-1,32,-1,-1,-1,-1,-1,38,-1,-1,-1,-1,-1,-1,188,-1,-1,-1,-1,-1,-1,-1,-1,38,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,38,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,21,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,188,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,38,-1,-1,32,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] expr_optional_13Gotoes;

  private void initexpr_optional_13Gotoes() {
    expr_optional_13Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,221,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] loopGotoes;

  private void initloopGotoes() {
    loopGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,232,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] exprGotoes;

  private void initexprGotoes() {
    exprGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,129,-1,-1,128,-1,-1,-1,-1,122,-1,-1,-1,121,120,-1,113,111,-1,-1,-1,-1,109,-1,106,-1,74,-1,-1,76,-1,78,-1,80,-1,82,-1,84,-1,86,-1,88,-1,90,-1,92,-1,94,-1,96,-1,98,-1,100,-1,102,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,106,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,106,-1,-1,-1,129,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,152,-1,-1,-1,-1,113,111,-1,-1,161,-1,-1,-1,-1,-1,-1,-1,-1,-1,171,-1,-1,-1,-1,-1,-1,-1,181,-1,-1,-1,-1,-1,-1,186,-1,-1,-1,-1,191,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,204,-1,-1,-1,-1,-1,-1,211,-1,-1,-1,-1,-1,-1,-1,-1,-1,230,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] script_member_star_1Gotoes;

  private void initscript_member_star_1Gotoes() {
    script_member_star_1Gotoes = 
      new int[]{3,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] conditionalGotoes;

  private void initconditionalGotoes() {
    conditionalGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,198,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] record_defGotoes;

  private void initrecord_defGotoes() {
    record_defGotoes = 
      new int[]{-1,-1,-1,252,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] dim_expr_plus_15Gotoes;

  private void initdim_expr_plus_15Gotoes() {
    dim_expr_plus_15Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,142,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] function_rtype_optional_4Gotoes;

  private void initfunction_rtype_optional_4Gotoes() {
    function_rtype_optional_4Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,250,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] id_optional_10Gotoes;

  private void initid_optional_10Gotoes() {
    id_optional_10Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,168,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] for_loop_incr_optional_14Gotoes;

  private void initfor_loop_incr_optional_14Gotoes() {
    for_loop_incr_optional_14Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,225,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] dims_optGotoes;

  private void initdims_optGotoes() {
    dims_optGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,136,-1,-1,-1,-1,-1,-1,-1,143,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] instrGotoes;

  private void initinstrGotoes() {
    instrGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,187,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] dim_expr_plus_16Gotoes;

  private void initdim_expr_plus_16Gotoes() {
    dim_expr_plus_16Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,134,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] funcallGotoes;

  private void initfuncallGotoes() {
    funcallGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,194,73,-1,-1,73,-1,-1,73,-1,-1,-1,-1,73,-1,-1,-1,73,73,-1,73,73,-1,-1,-1,-1,73,-1,73,-1,73,-1,-1,73,-1,73,-1,73,-1,73,-1,73,-1,73,-1,73,-1,73,-1,73,-1,73,-1,73,-1,73,-1,73,-1,73,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,73,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,73,-1,-1,-1,73,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,73,-1,-1,-1,-1,73,73,-1,-1,73,-1,-1,-1,-1,-1,-1,-1,-1,-1,73,-1,-1,-1,-1,-1,-1,-1,73,-1,-1,-1,-1,-1,-1,73,-1,-1,-1,-1,73,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,73,-1,-1,-1,-1,-1,-1,73,-1,-1,-1,217,-1,-1,-1,-1,-1,73,-1,229,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] expr_optional_11Gotoes;

  private void initexpr_optional_11Gotoes() {
    expr_optional_11Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,179,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] type_star_0_subGotoes;

  private void inittype_star_0_subGotoes() {
    type_star_0_subGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,22,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,22,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] function_rtypeGotoes;

  private void initfunction_rtypeGotoes() {
    function_rtypeGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,249,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] parameter_star_5Gotoes;

  private void initparameter_star_5Gotoes() {
    parameter_star_5Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,123,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,123,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,123,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] id_optional_9Gotoes;

  private void initid_optional_9Gotoes() {
    id_optional_9Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,176,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] expr_star_6_subGotoes;

  private void initexpr_star_6_subGotoes() {
    expr_star_6_subGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,71,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,71,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,71,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] primaryGotoes;

  private void initprimaryGotoes() {
    primaryGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,199,146,-1,-1,69,-1,-1,69,-1,-1,-1,-1,69,-1,-1,-1,69,69,-1,69,69,-1,-1,-1,-1,69,-1,69,-1,69,-1,-1,69,-1,69,-1,69,-1,69,-1,69,-1,69,-1,69,-1,69,-1,69,-1,69,-1,69,-1,69,-1,69,-1,69,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,69,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,69,-1,-1,-1,69,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,69,-1,-1,-1,-1,69,69,-1,-1,69,-1,-1,-1,-1,-1,-1,-1,-1,-1,69,-1,-1,-1,-1,-1,-1,-1,69,-1,-1,-1,-1,-1,-1,69,-1,-1,-1,-1,69,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,69,-1,-1,-1,-1,-1,-1,69,-1,-1,-1,199,-1,-1,-1,-1,-1,69,-1,199,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] script_memberGotoes;

  private void initscript_memberGotoes() {
    script_memberGotoes = 
      new int[]{-1,-1,-1,255,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] primitive_typeGotoes;

  private void initprimitive_typeGotoes() {
    primitive_typeGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,25,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,25,-1,-1,-1,-1,25,-1,-1,-1,-1,-1,-1,25,-1,-1,-1,-1,-1,25,-1,-1,-1,-1,-1,-1,25,-1,140,-1,-1,-1,-1,-1,-1,25,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,25,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,25,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,25,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,25,-1,-1,25,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] loop_labelGotoes;

  private void initloop_labelGotoes() {
    loop_labelGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,233,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }

  private Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[] boolean_literalArray;
  @SuppressWarnings("unchecked")
  private void initboolean_literalArray() {
    boolean_literalArray=(Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift49,branch0,branch0,shift49,branch0,branch0,branch0,branch0,shift49,branch0,branch0,branch0,shift49,shift49,branch0,shift49,shift49,branch0,branch0,branch0,branch0,shift49,branch0,shift49,branch0,shift49,branch0,branch0,shift49,branch0,shift49,branch0,shift49,branch0,shift49,branch0,shift49,branch0,shift49,branch0,shift49,branch0,shift49,branch0,shift49,branch0,shift49,branch0,shift49,branch0,shift49,branch0,shift49,branch0,shift49,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift49,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift49,branch0,branch0,branch0,shift49,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift49,branch0,branch0,branch0,branch0,shift49,shift49,branch0,branch0,shift49,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift49,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift49,branch0,branch0,branch0,branch0,branch0,branch0,shift49,branch0,branch0,branch0,branch0,shift49,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift49,branch0,branch0,branch0,branch0,branch0,branch0,shift49,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift49,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[] bangArray;
  @SuppressWarnings("unchecked")
  private void initbangArray() {
    bangArray=(Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift50,branch0,branch0,shift50,branch0,branch0,branch0,branch0,shift50,branch0,branch0,branch0,shift50,shift50,branch0,shift50,shift50,branch0,branch0,branch0,branch0,shift50,branch0,shift50,branch0,shift50,branch0,branch0,shift50,branch0,shift50,branch0,shift50,branch0,shift50,branch0,shift50,branch0,shift50,branch0,shift50,branch0,shift50,branch0,shift50,branch0,shift50,branch0,shift50,branch0,shift50,branch0,shift50,branch0,shift50,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift50,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift50,branch0,branch0,branch0,shift50,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift50,branch0,branch0,branch0,branch0,shift50,shift50,branch0,branch0,shift50,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift50,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift50,branch0,branch0,branch0,branch0,branch0,branch0,shift50,branch0,branch0,branch0,branch0,shift50,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift50,branch0,branch0,branch0,branch0,branch0,branch0,shift50,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift50,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[] string_literalArray;
  @SuppressWarnings("unchecked")
  private void initstring_literalArray() {
    string_literalArray=(Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift58,branch0,branch0,shift58,branch0,branch0,branch0,branch0,shift58,branch0,branch0,branch0,shift58,shift58,branch0,shift58,shift58,branch0,branch0,branch0,branch0,shift58,branch0,shift58,branch0,shift58,branch0,branch0,shift58,branch0,shift58,branch0,shift58,branch0,shift58,branch0,shift58,branch0,shift58,branch0,shift58,branch0,shift58,branch0,shift58,branch0,shift58,branch0,shift58,branch0,shift58,branch0,shift58,branch0,shift58,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift58,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift58,branch0,branch0,branch0,shift58,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift58,branch0,branch0,branch0,branch0,shift58,shift58,branch0,branch0,shift58,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift58,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift58,branch0,branch0,branch0,branch0,branch0,branch0,shift58,branch0,branch0,branch0,branch0,shift58,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift58,branch0,branch0,branch0,branch0,branch0,branch0,shift58,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift58,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[] _ifArray;
  @SuppressWarnings("unchecked")
  private void init_ifArray() {
    _ifArray=(Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_7_empty,shift159,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducesemis__semicolon,reducesemis__eoln,reduceinstr_scan,reduceblock,branch0,branch0,reduceinstr_print,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceconditional_if,branch0,reduceconditional_if_else,branch0,branch0,branch0,reduceinstr_continue,branch0,branch0,reduceinstr_throw,reduceinstr_empty,branch0,branch0,branch0,reduceinstr_break,branch0,branch0,reduceinstr_return,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_7_rec,branch0,branch0,branch0,branch0,branch0,reduceinstr_assignation,branch0,reduceinstr_funcall,branch0,reduceinstr_declaration,reduceinstr_conditional,branch0,reduceinstr_block,branch0,branch0,branch0,branch0,branch0,reduceloop_while,branch0,branch0,branch0,branch0,branch0,reduceloop_dowhile,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceloop_for,branch0,branch0,branch0,branch0,reduceinstr_loop,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[] assignArray;
  @SuppressWarnings("unchecked")
  private void initassignArray() {
    assignArray=(Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducefield_access_primary,branch0,reducearray_access_primary,branch0,branch0,branch0,reducearray_access_id,branch0,branch0,branch0,branch0,reducefield_access_id,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducelhs_id,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducelhs_array_access,reducelhs_field_access,shift185,branch0,branch0,branch0,branch0,shift190,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducelhs_id,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducelhs_id,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[] _continueArray;
  @SuppressWarnings("unchecked")
  private void init_continueArray() {
    _continueArray=(Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_7_empty,shift166,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducesemis__semicolon,reducesemis__eoln,reduceinstr_scan,reduceblock,branch0,branch0,reduceinstr_print,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceconditional_if,branch0,reduceconditional_if_else,branch0,branch0,branch0,reduceinstr_continue,branch0,branch0,reduceinstr_throw,reduceinstr_empty,branch0,branch0,branch0,reduceinstr_break,branch0,branch0,reduceinstr_return,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_7_rec,branch0,branch0,branch0,branch0,branch0,reduceinstr_assignation,branch0,reduceinstr_funcall,branch0,reduceinstr_declaration,reduceinstr_conditional,branch0,reduceinstr_block,branch0,branch0,branch0,branch0,branch0,reduceloop_while,branch0,branch0,branch0,branch0,branch0,reduceloop_dowhile,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceloop_for,branch0,branch0,branch0,branch0,reduceinstr_loop,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[] value_literalArray;
  @SuppressWarnings("unchecked")
  private void initvalue_literalArray() {
    value_literalArray=(Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift48,branch0,branch0,shift48,branch0,branch0,branch0,branch0,shift48,branch0,branch0,branch0,shift48,shift48,branch0,shift48,shift48,branch0,branch0,branch0,branch0,shift48,branch0,shift48,branch0,shift48,branch0,branch0,shift48,branch0,shift48,branch0,shift48,branch0,shift48,branch0,shift48,branch0,shift48,branch0,shift48,branch0,shift48,branch0,shift48,branch0,shift48,branch0,shift48,branch0,shift48,branch0,shift48,branch0,shift48,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift48,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift48,branch0,branch0,branch0,shift48,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift48,branch0,branch0,branch0,branch0,shift48,shift48,branch0,branch0,shift48,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift48,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift48,branch0,branch0,branch0,branch0,branch0,branch0,shift48,branch0,branch0,branch0,branch0,shift48,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift48,branch0,branch0,branch0,branch0,branch0,branch0,shift48,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift48,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[] _whileArray;
  @SuppressWarnings("unchecked")
  private void init_whileArray() {
    _whileArray=(Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_7_empty,reduceloop_label_optional_8_empty,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducesemis__semicolon,reducesemis__eoln,reduceinstr_scan,reduceblock,branch0,branch0,reduceinstr_print,branch0,reduceloop_label,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceconditional_if,branch0,reduceconditional_if_else,branch0,branch0,branch0,reduceinstr_continue,branch0,branch0,reduceinstr_throw,reduceinstr_empty,branch0,branch0,branch0,reduceinstr_break,branch0,branch0,reduceinstr_return,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_7_rec,branch0,branch0,branch0,branch0,branch0,reduceinstr_assignation,branch0,reduceinstr_funcall,branch0,reduceinstr_declaration,reduceinstr_conditional,branch0,reduceinstr_block,shift202,branch0,branch0,branch0,branch0,reduceloop_while,branch0,shift209,branch0,branch0,branch0,reduceloop_dowhile,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceloop_for,branch0,branch0,branch0,branch0,reduceinstr_loop,reduceloop_label_optional_8_loop_label,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[] loptArray;
  @SuppressWarnings("unchecked")
  private void initloptArray() {
    loptArray=(Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceprimitive_type_string,reduceprimitive_type_char,reduceprimitive_type_int,reduceprimitive_type_double,shift13,branch0,reducedims_singleton,shift16,branch0,reducedims_recursive,branch0,reduceprimitive_type_boolean,reduceprimitive_type_any,branch0,branch0,branch0,branch0,shift13,shift16,shift13,shift16,branch0,branch0,branch0,branch0,branch0,reducefuntype,branch0,branch0,shift13,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift47,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift62,branch0,branch0,reduceprimary_field_access,reduceprimary_array_access,branch0,shift68,branch0,branch0,branch0,branch0,branch0,reduceprimary_funcall,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducefuncall_primary,branch0,branch0,branch0,reducefield_access_primary,branch0,reducearray_access_primary,branch0,reduceprimary_parens,branch0,reducearray_access_id,branch0,branch0,reducefuncall_id,branch0,reducefield_access_id,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducedim_expr,branch0,branch0,reduceprimary_allocation,shift135,branch0,branch0,reducedim_expr_plus_16_rec,shift16,reducedim_expr_plus_16_element,shift47,reducedim_expr_plus_15_element,shift135,branch0,reducedim_expr_plus_15_rec,shift62,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift156,branch0,branch0,branch0,shift156,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceprimary_array_access,reduceprimary_field_access,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceprimary_funcall,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift156,branch0,reduceprimary_funcall,branch0,branch0,branch0,branch0,branch0,shift62,branch0,branch0,branch0,branch0,branch0,reduceprimary_funcall,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[] null_literalArray;
  @SuppressWarnings("unchecked")
  private void initnull_literalArray() {
    null_literalArray=(Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift56,branch0,branch0,shift56,branch0,branch0,branch0,branch0,shift56,branch0,branch0,branch0,shift56,shift56,branch0,shift56,shift56,branch0,branch0,branch0,branch0,shift56,branch0,shift56,branch0,shift56,branch0,branch0,shift56,branch0,shift56,branch0,shift56,branch0,shift56,branch0,shift56,branch0,shift56,branch0,shift56,branch0,shift56,branch0,shift56,branch0,shift56,branch0,shift56,branch0,shift56,branch0,shift56,branch0,shift56,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift56,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift56,branch0,branch0,branch0,shift56,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift56,branch0,branch0,branch0,branch0,shift56,shift56,branch0,branch0,shift56,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift56,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift56,branch0,branch0,branch0,branch0,branch0,branch0,shift56,branch0,branch0,branch0,branch0,shift56,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift56,branch0,branch0,branch0,branch0,branch0,branch0,shift56,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift56,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[] arrowArray;
  @SuppressWarnings("unchecked")
  private void initarrowArray() {
    arrowArray=(Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift55,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[] plusArray;
  @SuppressWarnings("unchecked")
  private void initplusArray() {
    plusArray=(Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducedims_singleton,branch0,branch0,reducedims_recursive,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift59,reduceexpr_value_literal,reduceexpr_boolean_literal,shift59,branch0,branch0,branch0,branch0,shift59,reduceexpr_null_literal,reduceexpr_char_literal,reduceexpr_string_literal,shift59,shift59,reduceexpr_id,shift59,shift59,reduceprimary_field_access,reduceprimary_array_access,reduceprimary_array_creation,reduceprimary_primary_no_array_creation,shift59,reduceexpr_primary,shift59,branch0,shift59,reduceprimary_funcall,shift93,shift59,shift93,shift59,shift93,shift59,shift93,shift59,reduceexpr_star,shift59,shift93,shift59,reduceexpr_slash,shift59,shift93,shift59,reduceexpr_pow,shift59,shift93,shift59,reduceexpr_plus,shift59,reduceexpr_minus,shift59,shift93,shift59,reduceexpr_mod,shift59,shift93,branch0,reducefuncall_primary,branch0,shift93,branch0,reducefield_access_primary,shift93,reducearray_access_primary,shift93,reduceprimary_parens,shift93,reducearray_access_id,shift59,branch0,reducefuncall_id,branch0,reducefield_access_id,shift93,shift93,shift93,branch0,branch0,branch0,branch0,branch0,shift93,shift93,reducedim_expr,shift59,branch0,reduceprimary_allocation,reducedims_opt_empty,shift59,reducearray_creation_record,reducedim_expr_plus_16_rec,reducedims_opt_dims,reducedim_expr_plus_16_element,branch0,reducedim_expr_plus_15_element,reducedims_opt_empty,reducearray_creation_primitive,reducedim_expr_plus_15_rec,branch0,branch0,branch0,branch0,branch0,branch0,shift59,shift93,branch0,branch0,branch0,shift59,shift59,reduceexpr_id,branch0,shift59,shift93,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift59,shift93,branch0,branch0,branch0,branch0,branch0,branch0,shift59,branch0,branch0,shift93,branch0,branch0,branch0,shift59,shift93,branch0,branch0,branch0,shift59,shift93,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift59,shift93,branch0,branch0,branch0,branch0,branch0,shift59,shift93,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift59,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift93,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[] bandArray;
  @SuppressWarnings("unchecked")
  private void initbandArray() {
    bandArray=(Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducedims_singleton,branch0,branch0,reducedims_recursive,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_value_literal,reduceexpr_boolean_literal,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_null_literal,reduceexpr_char_literal,reduceexpr_string_literal,branch0,branch0,reduceexpr_id,branch0,branch0,reduceprimary_field_access,reduceprimary_array_access,reduceprimary_array_creation,reduceprimary_primary_no_array_creation,branch0,reduceexpr_primary,branch0,branch0,branch0,reduceprimary_funcall,shift101,branch0,reduceexpr_ne,branch0,reduceexpr_bor,branch0,reduceexpr_ge,branch0,reduceexpr_star,branch0,reduceexpr_lt,branch0,reduceexpr_slash,branch0,reduceexpr_gt,branch0,reduceexpr_pow,branch0,reduceexpr_eq,branch0,reduceexpr_plus,branch0,reduceexpr_minus,branch0,reduceexpr_le,branch0,reduceexpr_mod,branch0,reduceexpr_band,branch0,reducefuncall_primary,branch0,shift101,branch0,reducefield_access_primary,shift101,reducearray_access_primary,shift101,reduceprimary_parens,shift101,reducearray_access_id,branch0,branch0,reducefuncall_id,branch0,reducefield_access_id,shift101,shift101,shift101,branch0,branch0,branch0,branch0,branch0,shift101,shift101,reducedim_expr,branch0,branch0,reduceprimary_allocation,reducedims_opt_empty,branch0,reducearray_creation_record,reducedim_expr_plus_16_rec,reducedims_opt_dims,reducedim_expr_plus_16_element,branch0,reducedim_expr_plus_15_element,reducedims_opt_empty,reducearray_creation_primitive,reducedim_expr_plus_15_rec,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift101,branch0,branch0,branch0,branch0,branch0,reduceexpr_id,branch0,branch0,shift101,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift101,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift101,branch0,branch0,branch0,branch0,shift101,branch0,branch0,branch0,branch0,shift101,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift101,branch0,branch0,branch0,branch0,branch0,branch0,shift101,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift101,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[] modArray;
  @SuppressWarnings("unchecked")
  private void initmodArray() {
    modArray=(Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducedims_singleton,branch0,branch0,reducedims_recursive,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_value_literal,reduceexpr_boolean_literal,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_null_literal,reduceexpr_char_literal,reduceexpr_string_literal,branch0,branch0,reduceexpr_id,branch0,branch0,reduceprimary_field_access,reduceprimary_array_access,reduceprimary_array_creation,reduceprimary_primary_no_array_creation,branch0,reduceexpr_primary,branch0,branch0,branch0,reduceprimary_funcall,shift99,branch0,shift99,branch0,shift99,branch0,shift99,branch0,reduceexpr_star,branch0,shift99,branch0,reduceexpr_slash,branch0,shift99,branch0,reduceexpr_pow,branch0,shift99,branch0,shift99,branch0,shift99,branch0,shift99,branch0,reduceexpr_mod,branch0,shift99,branch0,reducefuncall_primary,branch0,shift99,branch0,reducefield_access_primary,shift99,reducearray_access_primary,shift99,reduceprimary_parens,shift99,reducearray_access_id,branch0,branch0,reducefuncall_id,branch0,reducefield_access_id,shift99,shift99,shift99,branch0,branch0,branch0,branch0,branch0,shift99,shift99,reducedim_expr,branch0,branch0,reduceprimary_allocation,reducedims_opt_empty,branch0,reducearray_creation_record,reducedim_expr_plus_16_rec,reducedims_opt_dims,reducedim_expr_plus_16_element,branch0,reducedim_expr_plus_15_element,reducedims_opt_empty,reducearray_creation_primitive,reducedim_expr_plus_15_rec,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift99,branch0,branch0,branch0,branch0,branch0,reduceexpr_id,branch0,branch0,shift99,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift99,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift99,branch0,branch0,branch0,branch0,shift99,branch0,branch0,branch0,branch0,shift99,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift99,branch0,branch0,branch0,branch0,branch0,branch0,shift99,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift99,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[] _voidArray;
  @SuppressWarnings("unchecked")
  private void init_voidArray() {
    _voidArray=(Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift31,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift31,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[] _elseArray;
  @SuppressWarnings("unchecked")
  private void init_elseArray() {
    _elseArray=(Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceblock,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift164,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[] lambdaArray;
  @SuppressWarnings("unchecked")
  private void initlambdaArray() {
    lambdaArray=(Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift51,branch0,branch0,shift51,branch0,branch0,branch0,branch0,shift51,branch0,branch0,branch0,shift51,shift51,branch0,shift51,shift51,branch0,branch0,branch0,branch0,shift51,branch0,shift51,branch0,shift51,branch0,branch0,shift51,branch0,shift51,branch0,shift51,branch0,shift51,branch0,shift51,branch0,shift51,branch0,shift51,branch0,shift51,branch0,shift51,branch0,shift51,branch0,shift51,branch0,shift51,branch0,shift51,branch0,shift51,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift51,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift51,branch0,branch0,branch0,shift51,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift51,branch0,branch0,branch0,branch0,shift51,shift51,branch0,branch0,shift51,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift51,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift51,branch0,branch0,branch0,branch0,branch0,branch0,shift51,branch0,branch0,branch0,branch0,shift51,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift51,branch0,branch0,branch0,branch0,branch0,branch0,shift51,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift51,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[] _doubleArray;
  @SuppressWarnings("unchecked")
  private void init_doubleArray() {
    _doubleArray=(Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,reducefield_star_2_empty,shift11,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift11,branch0,branch0,branch0,branch0,shift11,branch0,branch0,branch0,branch0,branch0,branch0,shift11,branch0,branch0,branch0,branch0,branch0,shift11,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_7_empty,shift11,branch0,shift11,branch0,branch0,branch0,branch0,branch0,branch0,shift11,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift11,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducesemis__semicolon,reducesemis__eoln,reduceinstr_scan,reduceblock,branch0,branch0,reduceinstr_print,branch0,branch0,branch0,shift11,branch0,branch0,branch0,branch0,branch0,reduceconditional_if,branch0,reduceconditional_if_else,branch0,branch0,branch0,reduceinstr_continue,branch0,branch0,reduceinstr_throw,reduceinstr_empty,branch0,branch0,branch0,reduceinstr_break,branch0,branch0,reduceinstr_return,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_7_rec,branch0,branch0,branch0,branch0,branch0,reduceinstr_assignation,branch0,reduceinstr_funcall,branch0,reduceinstr_declaration,reduceinstr_conditional,branch0,reduceinstr_block,branch0,branch0,branch0,branch0,branch0,reduceloop_while,branch0,branch0,branch0,branch0,branch0,reduceloop_dowhile,branch0,shift11,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceloop_for,branch0,branch0,branch0,branch0,reduceinstr_loop,branch0,branch0,branch0,branch0,branch0,reducefield_star_2_rec,branch0,branch0,reducefield,branch0,branch0,shift11,branch0,branch0,shift11,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[] geArray;
  @SuppressWarnings("unchecked")
  private void initgeArray() {
    geArray=(Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducedims_singleton,branch0,branch0,reducedims_recursive,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_value_literal,reduceexpr_boolean_literal,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_null_literal,reduceexpr_char_literal,reduceexpr_string_literal,branch0,branch0,reduceexpr_id,branch0,branch0,reduceprimary_field_access,reduceprimary_array_access,reduceprimary_array_creation,reduceprimary_primary_no_array_creation,branch0,reduceexpr_primary,branch0,branch0,branch0,reduceprimary_funcall,shift79,branch0,reduceexpr_ne,branch0,shift79,branch0,reduceexpr_ge,branch0,reduceexpr_star,branch0,reduceexpr_lt,branch0,reduceexpr_slash,branch0,reduceexpr_gt,branch0,reduceexpr_pow,branch0,reduceexpr_eq,branch0,reduceexpr_plus,branch0,reduceexpr_minus,branch0,reduceexpr_le,branch0,reduceexpr_mod,branch0,shift79,branch0,reducefuncall_primary,branch0,shift79,branch0,reducefield_access_primary,shift79,reducearray_access_primary,shift79,reduceprimary_parens,shift79,reducearray_access_id,branch0,branch0,reducefuncall_id,branch0,reducefield_access_id,shift79,shift79,shift79,branch0,branch0,branch0,branch0,branch0,shift79,shift79,reducedim_expr,branch0,branch0,reduceprimary_allocation,reducedims_opt_empty,branch0,reducearray_creation_record,reducedim_expr_plus_16_rec,reducedims_opt_dims,reducedim_expr_plus_16_element,branch0,reducedim_expr_plus_15_element,reducedims_opt_empty,reducearray_creation_primitive,reducedim_expr_plus_15_rec,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift79,branch0,branch0,branch0,branch0,branch0,reduceexpr_id,branch0,branch0,shift79,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift79,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift79,branch0,branch0,branch0,branch0,shift79,branch0,branch0,branch0,branch0,shift79,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift79,branch0,branch0,branch0,branch0,branch0,branch0,shift79,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift79,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[] lparArray;
  @SuppressWarnings("unchecked")
  private void initlparArray() {
    lparArray=(Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,reducefield_star_2_empty,shift18,branch0,branch0,branch0,branch0,branch0,branch0,reducedims_singleton,branch0,branch0,reducedims_recursive,shift18,branch0,branch0,branch0,branch0,shift18,branch0,branch0,branch0,branch0,branch0,branch0,shift18,branch0,branch0,branch0,branch0,shift36,shift18,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_7_empty,shift157,shift63,branch0,shift131,shift63,branch0,branch0,shift63,shift52,shift18,branch0,branch0,shift63,branch0,branch0,branch0,shift63,shift63,shift115,shift63,shift63,reduceprimary_field_access,reduceprimary_array_access,reduceprimary_array_creation,reduceprimary_primary_no_array_creation,shift63,shift70,shift63,branch0,shift63,reduceprimary_funcall,branch0,shift63,branch0,shift63,branch0,shift63,branch0,shift63,branch0,shift63,branch0,shift63,branch0,shift63,branch0,shift63,branch0,shift63,branch0,shift63,branch0,shift63,branch0,shift63,branch0,shift63,branch0,shift63,branch0,branch0,reducefuncall_primary,branch0,branch0,branch0,reducefield_access_primary,branch0,reducearray_access_primary,branch0,reduceprimary_parens,branch0,reducearray_access_id,shift63,branch0,reducefuncall_id,branch0,reducefield_access_id,branch0,branch0,branch0,branch0,branch0,branch0,shift18,branch0,branch0,branch0,reducedim_expr,shift63,branch0,reduceprimary_allocation,reducedims_opt_empty,shift63,reducearray_creation_record,reducedim_expr_plus_16_rec,reducedims_opt_dims,reducedim_expr_plus_16_element,branch0,reducedim_expr_plus_15_element,reducedims_opt_empty,reducearray_creation_primitive,reducedim_expr_plus_15_rec,shift115,shift70,reducesemis__semicolon,reducesemis__eoln,reduceinstr_scan,reduceblock,shift63,branch0,reduceinstr_print,shift115,branch0,shift63,shift157,shift115,shift160,shift63,branch0,branch0,reduceconditional_if,branch0,reduceconditional_if_else,branch0,branch0,branch0,reduceinstr_continue,shift63,branch0,reduceinstr_throw,reduceinstr_empty,branch0,branch0,branch0,reduceinstr_break,shift63,branch0,reduceinstr_return,branch0,reduceprimary_array_access,reduceprimary_field_access,branch0,shift63,branch0,reduceinstr_star_7_rec,branch0,branch0,shift63,branch0,branch0,reduceinstr_assignation,reduceprimary_funcall,reduceinstr_funcall,branch0,reduceinstr_declaration,reduceinstr_conditional,shift70,reduceinstr_block,branch0,shift203,shift63,branch0,branch0,reduceloop_while,branch0,branch0,shift210,shift63,branch0,reduceloop_dowhile,shift214,shift157,shift115,branch0,reduceprimary_funcall,branch0,branch0,shift63,branch0,shift63,shift115,branch0,branch0,branch0,reduceloop_for,branch0,reduceprimary_funcall,branch0,branch0,reduceinstr_loop,branch0,branch0,branch0,branch0,branch0,reducefield_star_2_rec,branch0,branch0,reducefield,branch0,shift244,shift18,branch0,branch0,shift18,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[] defArray;
  @SuppressWarnings("unchecked")
  private void initdefArray() {
    defArray=(Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[])new Action<?,?,?>[]{reducescript_member_star_1_empty,branch0,branch0,shift242,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceblock,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducerecord_def,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducefunction_def,reducescript_member_record_def,reducescript_member_function_def,reducescript_member_block,reducescript_member_star_1_rec};
  }
  private Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[] _booleanArray;
  @SuppressWarnings("unchecked")
  private void init_booleanArray() {
    _booleanArray=(Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,reducefield_star_2_empty,shift19,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift19,branch0,branch0,branch0,branch0,shift19,branch0,branch0,branch0,branch0,branch0,branch0,shift19,branch0,branch0,branch0,branch0,branch0,shift19,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_7_empty,shift19,branch0,shift19,branch0,branch0,branch0,branch0,branch0,branch0,shift19,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift19,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducesemis__semicolon,reducesemis__eoln,reduceinstr_scan,reduceblock,branch0,branch0,reduceinstr_print,branch0,branch0,branch0,shift19,branch0,branch0,branch0,branch0,branch0,reduceconditional_if,branch0,reduceconditional_if_else,branch0,branch0,branch0,reduceinstr_continue,branch0,branch0,reduceinstr_throw,reduceinstr_empty,branch0,branch0,branch0,reduceinstr_break,branch0,branch0,reduceinstr_return,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_7_rec,branch0,branch0,branch0,branch0,branch0,reduceinstr_assignation,branch0,reduceinstr_funcall,branch0,reduceinstr_declaration,reduceinstr_conditional,branch0,reduceinstr_block,branch0,branch0,branch0,branch0,branch0,reduceloop_while,branch0,branch0,branch0,branch0,branch0,reduceloop_dowhile,branch0,shift19,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceloop_for,branch0,branch0,branch0,branch0,reduceinstr_loop,branch0,branch0,branch0,branch0,branch0,reducefield_star_2_rec,branch0,branch0,reducefield,branch0,branch0,shift19,branch0,branch0,shift19,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[] starArray;
  @SuppressWarnings("unchecked")
  private void initstarArray() {
    starArray=(Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducedims_singleton,branch0,branch0,reducedims_recursive,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_value_literal,reduceexpr_boolean_literal,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_null_literal,reduceexpr_char_literal,reduceexpr_string_literal,branch0,branch0,reduceexpr_id,branch0,branch0,reduceprimary_field_access,reduceprimary_array_access,reduceprimary_array_creation,reduceprimary_primary_no_array_creation,branch0,reduceexpr_primary,branch0,branch0,branch0,reduceprimary_funcall,shift81,branch0,shift81,branch0,shift81,branch0,shift81,branch0,reduceexpr_star,branch0,shift81,branch0,reduceexpr_slash,branch0,shift81,branch0,reduceexpr_pow,branch0,shift81,branch0,shift81,branch0,shift81,branch0,shift81,branch0,reduceexpr_mod,branch0,shift81,branch0,reducefuncall_primary,branch0,shift81,branch0,reducefield_access_primary,shift81,reducearray_access_primary,shift81,reduceprimary_parens,shift81,reducearray_access_id,branch0,branch0,reducefuncall_id,branch0,reducefield_access_id,shift81,shift81,shift81,branch0,branch0,branch0,branch0,branch0,shift81,shift81,reducedim_expr,branch0,branch0,reduceprimary_allocation,reducedims_opt_empty,branch0,reducearray_creation_record,reducedim_expr_plus_16_rec,reducedims_opt_dims,reducedim_expr_plus_16_element,branch0,reducedim_expr_plus_15_element,reducedims_opt_empty,reducearray_creation_primitive,reducedim_expr_plus_15_rec,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift81,branch0,branch0,branch0,branch0,branch0,reduceexpr_id,branch0,branch0,shift81,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift81,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift81,branch0,branch0,branch0,branch0,shift81,branch0,branch0,branch0,branch0,shift81,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift81,branch0,branch0,branch0,branch0,branch0,branch0,shift81,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift81,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[] colonArray;
  @SuppressWarnings("unchecked")
  private void initcolonArray() {
    colonArray=(Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceprimitive_type_string,reduceprimitive_type_char,reduceprimitive_type_int,reduceprimitive_type_double,reducetype_id,branch0,reducedims_singleton,reducetype_id_dims,branch0,reducedims_recursive,reducetype_star_0_empty,reduceprimitive_type_boolean,reduceprimitive_type_any,reducetype_star_0_element,reducetype_star_0_through,branch0,reducetype_star_0_rec,reducetype_primitive,reducetype_primitive_dims,reducetype_funtype,reducetype_funtype_dims,shift30,branch0,branch0,branch0,branch0,reducefuntype,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift155,branch0,branch0,reducetype_star_0_empty,reducetype_id,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift247,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[] semicolonArray;
  @SuppressWarnings("unchecked")
  private void initsemicolonArray() {
    semicolonArray=(Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducedims_singleton,branch0,branch0,reducedims_recursive,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_7_empty,shift173,branch0,branch0,branch0,branch0,reduceexpr_value_literal,reduceexpr_boolean_literal,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_null_literal,reduceexpr_char_literal,reduceexpr_string_literal,branch0,branch0,reduceexpr_id,branch0,branch0,reduceprimary_field_access,reduceprimary_array_access,reduceprimary_array_creation,reduceprimary_primary_no_array_creation,branch0,reduceexpr_primary,branch0,branch0,branch0,reduceprimary_funcall,branch0,branch0,reduceexpr_ne,branch0,reduceexpr_bor,branch0,reduceexpr_ge,branch0,reduceexpr_star,branch0,reduceexpr_lt,branch0,reduceexpr_slash,branch0,reduceexpr_gt,branch0,reduceexpr_pow,branch0,reduceexpr_eq,branch0,reduceexpr_plus,branch0,reduceexpr_minus,branch0,reduceexpr_le,branch0,reduceexpr_mod,branch0,reduceexpr_band,branch0,reducefuncall_primary,branch0,branch0,branch0,reducefield_access_primary,branch0,reducearray_access_primary,branch0,reduceprimary_parens,branch0,reducearray_access_id,branch0,branch0,reducefuncall_id,branch0,reducefield_access_id,reduceexpr_unary_minus,reduceexpr_unary_plus,reduceexpr_lambda,branch0,branch0,branch0,branch0,branch0,reduceexpr_neg,branch0,reducedim_expr,branch0,branch0,reduceprimary_allocation,reducedims_opt_empty,branch0,reducearray_creation_record,reducedim_expr_plus_16_rec,reducedims_opt_dims,reducedim_expr_plus_16_element,branch0,reducedim_expr_plus_15_element,reducedims_opt_empty,reducearray_creation_primitive,reducedim_expr_plus_15_rec,branch0,shift147,reducesemis__semicolon,reducesemis__eoln,reduceinstr_scan,reduceblock,branch0,shift147,reduceinstr_print,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceconditional_if,branch0,reduceconditional_if_else,reduceid_optional_10_empty,reduceid_optional_10_id,shift147,reduceinstr_continue,branch0,shift147,reduceinstr_throw,reduceinstr_empty,reduceid_optional_9_empty,reduceid_optional_9_id,shift147,reduceinstr_break,reduceexpr_optional_11_empty,shift147,reduceinstr_return,reduceexpr_optional_11_expr,branch0,branch0,branch0,branch0,reduceassignation,reduceinstr_star_7_rec,branch0,reducedeclaration_id,branch0,reducedeclaration_id_init,shift147,reduceinstr_assignation,shift147,reduceinstr_funcall,shift147,reduceinstr_declaration,reduceinstr_conditional,branch0,reduceinstr_block,branch0,branch0,branch0,branch0,branch0,reduceloop_while,branch0,branch0,branch0,branch0,branch0,reduceloop_dowhile,branch0,reducefor_loop_init_optional_12_empty,branch0,reducefor_loop_init_optional_12_for_loop_init,reducefor_loop_init_funcall,reducefor_loop_init_assignation,shift220,reduceexpr_optional_13_empty,shift222,branch0,branch0,branch0,branch0,branch0,reduceloop_for,branch0,branch0,reduceexpr_optional_13_expr,reducefor_loop_init_declaration,reduceinstr_loop,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift147,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[] slashArray;
  @SuppressWarnings("unchecked")
  private void initslashArray() {
    slashArray=(Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducedims_singleton,branch0,branch0,reducedims_recursive,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_value_literal,reduceexpr_boolean_literal,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_null_literal,reduceexpr_char_literal,reduceexpr_string_literal,branch0,branch0,reduceexpr_id,branch0,branch0,reduceprimary_field_access,reduceprimary_array_access,reduceprimary_array_creation,reduceprimary_primary_no_array_creation,branch0,reduceexpr_primary,branch0,branch0,branch0,reduceprimary_funcall,shift85,branch0,shift85,branch0,shift85,branch0,shift85,branch0,reduceexpr_star,branch0,shift85,branch0,reduceexpr_slash,branch0,shift85,branch0,reduceexpr_pow,branch0,shift85,branch0,shift85,branch0,shift85,branch0,shift85,branch0,reduceexpr_mod,branch0,shift85,branch0,reducefuncall_primary,branch0,shift85,branch0,reducefield_access_primary,shift85,reducearray_access_primary,shift85,reduceprimary_parens,shift85,reducearray_access_id,branch0,branch0,reducefuncall_id,branch0,reducefield_access_id,shift85,shift85,shift85,branch0,branch0,branch0,branch0,branch0,shift85,shift85,reducedim_expr,branch0,branch0,reduceprimary_allocation,reducedims_opt_empty,branch0,reducearray_creation_record,reducedim_expr_plus_16_rec,reducedims_opt_dims,reducedim_expr_plus_16_element,branch0,reducedim_expr_plus_15_element,reducedims_opt_empty,reducearray_creation_primitive,reducedim_expr_plus_15_rec,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift85,branch0,branch0,branch0,branch0,branch0,reduceexpr_id,branch0,branch0,shift85,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift85,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift85,branch0,branch0,branch0,branch0,shift85,branch0,branch0,branch0,branch0,shift85,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift85,branch0,branch0,branch0,branch0,branch0,branch0,shift85,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift85,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[] _breakArray;
  @SuppressWarnings("unchecked")
  private void init_breakArray() {
    _breakArray=(Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_7_empty,shift174,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducesemis__semicolon,reducesemis__eoln,reduceinstr_scan,reduceblock,branch0,branch0,reduceinstr_print,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceconditional_if,branch0,reduceconditional_if_else,branch0,branch0,branch0,reduceinstr_continue,branch0,branch0,reduceinstr_throw,reduceinstr_empty,branch0,branch0,branch0,reduceinstr_break,branch0,branch0,reduceinstr_return,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_7_rec,branch0,branch0,branch0,branch0,branch0,reduceinstr_assignation,branch0,reduceinstr_funcall,branch0,reduceinstr_declaration,reduceinstr_conditional,branch0,reduceinstr_block,branch0,branch0,branch0,branch0,branch0,reduceloop_while,branch0,branch0,branch0,branch0,branch0,reduceloop_dowhile,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceloop_for,branch0,branch0,branch0,branch0,reduceinstr_loop,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[] _intArray;
  @SuppressWarnings("unchecked")
  private void init_intArray() {
    _intArray=(Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,reducefield_star_2_empty,shift10,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift10,branch0,branch0,branch0,branch0,shift10,branch0,branch0,branch0,branch0,branch0,branch0,shift10,branch0,branch0,branch0,branch0,branch0,shift10,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_7_empty,shift10,branch0,shift10,branch0,branch0,branch0,branch0,branch0,branch0,shift10,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift10,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducesemis__semicolon,reducesemis__eoln,reduceinstr_scan,reduceblock,branch0,branch0,reduceinstr_print,branch0,branch0,branch0,shift10,branch0,branch0,branch0,branch0,branch0,reduceconditional_if,branch0,reduceconditional_if_else,branch0,branch0,branch0,reduceinstr_continue,branch0,branch0,reduceinstr_throw,reduceinstr_empty,branch0,branch0,branch0,reduceinstr_break,branch0,branch0,reduceinstr_return,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_7_rec,branch0,branch0,branch0,branch0,branch0,reduceinstr_assignation,branch0,reduceinstr_funcall,branch0,reduceinstr_declaration,reduceinstr_conditional,branch0,reduceinstr_block,branch0,branch0,branch0,branch0,branch0,reduceloop_while,branch0,branch0,branch0,branch0,branch0,reduceloop_dowhile,branch0,shift10,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceloop_for,branch0,branch0,branch0,branch0,reduceinstr_loop,branch0,branch0,branch0,branch0,branch0,reducefield_star_2_rec,branch0,branch0,reducefield,branch0,branch0,shift10,branch0,branch0,shift10,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[] _returnArray;
  @SuppressWarnings("unchecked")
  private void init_returnArray() {
    _returnArray=(Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_7_empty,shift178,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducesemis__semicolon,reducesemis__eoln,reduceinstr_scan,reduceblock,branch0,branch0,reduceinstr_print,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceconditional_if,branch0,reduceconditional_if_else,branch0,branch0,branch0,reduceinstr_continue,branch0,branch0,reduceinstr_throw,reduceinstr_empty,branch0,branch0,branch0,reduceinstr_break,branch0,branch0,reduceinstr_return,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_7_rec,branch0,branch0,branch0,branch0,branch0,reduceinstr_assignation,branch0,reduceinstr_funcall,branch0,reduceinstr_declaration,reduceinstr_conditional,branch0,reduceinstr_block,branch0,branch0,branch0,branch0,branch0,reduceloop_while,branch0,branch0,branch0,branch0,branch0,reduceloop_dowhile,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceloop_for,branch0,branch0,branch0,branch0,reduceinstr_loop,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[] powArray;
  @SuppressWarnings("unchecked")
  private void initpowArray() {
    powArray=(Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducedims_singleton,branch0,branch0,reducedims_recursive,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_value_literal,reduceexpr_boolean_literal,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_null_literal,reduceexpr_char_literal,reduceexpr_string_literal,branch0,branch0,reduceexpr_id,branch0,branch0,reduceprimary_field_access,reduceprimary_array_access,reduceprimary_array_creation,reduceprimary_primary_no_array_creation,branch0,reduceexpr_primary,branch0,branch0,branch0,reduceprimary_funcall,shift89,branch0,shift89,branch0,shift89,branch0,shift89,branch0,shift89,branch0,shift89,branch0,shift89,branch0,shift89,branch0,reduceexpr_pow,branch0,shift89,branch0,shift89,branch0,shift89,branch0,shift89,branch0,shift89,branch0,shift89,branch0,reducefuncall_primary,branch0,shift89,branch0,reducefield_access_primary,shift89,reducearray_access_primary,shift89,reduceprimary_parens,shift89,reducearray_access_id,branch0,branch0,reducefuncall_id,branch0,reducefield_access_id,shift89,shift89,shift89,branch0,branch0,branch0,branch0,branch0,shift89,shift89,reducedim_expr,branch0,branch0,reduceprimary_allocation,reducedims_opt_empty,branch0,reducearray_creation_record,reducedim_expr_plus_16_rec,reducedims_opt_dims,reducedim_expr_plus_16_element,branch0,reducedim_expr_plus_15_element,reducedims_opt_empty,reducearray_creation_primitive,reducedim_expr_plus_15_rec,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift89,branch0,branch0,branch0,branch0,branch0,reduceexpr_id,branch0,branch0,shift89,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift89,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift89,branch0,branch0,branch0,branch0,shift89,branch0,branch0,branch0,branch0,shift89,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift89,branch0,branch0,branch0,branch0,branch0,branch0,shift89,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift89,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[] dotArray;
  @SuppressWarnings("unchecked")
  private void initdotArray() {
    dotArray=(Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducedims_singleton,branch0,branch0,reducedims_recursive,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift118,branch0,branch0,reduceprimary_field_access,reduceprimary_array_access,reduceprimary_array_creation,reduceprimary_primary_no_array_creation,branch0,shift107,branch0,branch0,branch0,reduceprimary_funcall,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducefuncall_primary,branch0,branch0,branch0,reducefield_access_primary,branch0,reducearray_access_primary,branch0,reduceprimary_parens,branch0,reducearray_access_id,branch0,branch0,reducefuncall_id,branch0,reducefield_access_id,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducedim_expr,branch0,branch0,reduceprimary_allocation,reducedims_opt_empty,branch0,reducearray_creation_record,reducedim_expr_plus_16_rec,reducedims_opt_dims,reducedim_expr_plus_16_element,branch0,reducedim_expr_plus_15_element,reducedims_opt_empty,reducearray_creation_primitive,reducedim_expr_plus_15_rec,shift118,shift107,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift118,branch0,branch0,branch0,shift118,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceprimary_array_access,reduceprimary_field_access,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceprimary_funcall,branch0,branch0,branch0,branch0,shift107,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift118,branch0,reduceprimary_funcall,branch0,branch0,branch0,branch0,branch0,shift118,branch0,branch0,branch0,branch0,branch0,reduceprimary_funcall,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[] anyArray;
  @SuppressWarnings("unchecked")
  private void initanyArray() {
    anyArray=(Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,reducefield_star_2_empty,shift20,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift20,branch0,branch0,branch0,branch0,shift20,branch0,branch0,branch0,branch0,branch0,branch0,shift20,branch0,branch0,branch0,branch0,branch0,shift20,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_7_empty,shift20,branch0,shift20,branch0,branch0,branch0,branch0,branch0,branch0,shift20,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift20,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducesemis__semicolon,reducesemis__eoln,reduceinstr_scan,reduceblock,branch0,branch0,reduceinstr_print,branch0,branch0,branch0,shift20,branch0,branch0,branch0,branch0,branch0,reduceconditional_if,branch0,reduceconditional_if_else,branch0,branch0,branch0,reduceinstr_continue,branch0,branch0,reduceinstr_throw,reduceinstr_empty,branch0,branch0,branch0,reduceinstr_break,branch0,branch0,reduceinstr_return,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_7_rec,branch0,branch0,branch0,branch0,branch0,reduceinstr_assignation,branch0,reduceinstr_funcall,branch0,reduceinstr_declaration,reduceinstr_conditional,branch0,reduceinstr_block,branch0,branch0,branch0,branch0,branch0,reduceloop_while,branch0,branch0,branch0,branch0,branch0,reduceloop_dowhile,branch0,shift20,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceloop_for,branch0,branch0,branch0,branch0,reduceinstr_loop,branch0,branch0,branch0,branch0,branch0,reducefield_star_2_rec,branch0,branch0,reducefield,branch0,branch0,shift20,branch0,branch0,shift20,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[] commaArray;
  @SuppressWarnings("unchecked")
  private void initcommaArray() {
    commaArray=(Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceprimitive_type_string,reduceprimitive_type_char,reduceprimitive_type_int,reduceprimitive_type_double,reducetype_id,branch0,reducedims_singleton,reducetype_id_dims,branch0,reducedims_recursive,branch0,reduceprimitive_type_boolean,reduceprimitive_type_any,reducetype_star_0_element,shift23,branch0,reducetype_star_0_rec,reducetype_primitive,reducetype_primitive_dims,reducetype_funtype,reducetype_funtype_dims,branch0,branch0,branch0,branch0,branch0,reducefuntype,branch0,branch0,reduceparameter_naked,branch0,reduceparameter_typed,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_value_literal,reduceexpr_boolean_literal,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_null_literal,reduceexpr_char_literal,reduceexpr_string_literal,branch0,branch0,reduceexpr_id,branch0,branch0,reduceprimary_field_access,reduceprimary_array_access,reduceprimary_array_creation,reduceprimary_primary_no_array_creation,branch0,reduceexpr_primary,branch0,shift72,branch0,reduceprimary_funcall,reduceexpr_star_6_rec,branch0,reduceexpr_ne,branch0,reduceexpr_bor,branch0,reduceexpr_ge,branch0,reduceexpr_star,branch0,reduceexpr_lt,branch0,reduceexpr_slash,branch0,reduceexpr_gt,branch0,reduceexpr_pow,branch0,reduceexpr_eq,branch0,reduceexpr_plus,branch0,reduceexpr_minus,branch0,reduceexpr_le,branch0,reduceexpr_mod,branch0,reduceexpr_band,branch0,reducefuncall_primary,branch0,reduceexpr_star_6_element,branch0,reducefield_access_primary,branch0,reducearray_access_primary,branch0,reduceprimary_parens,branch0,reducearray_access_id,branch0,branch0,reducefuncall_id,branch0,reducefield_access_id,reduceexpr_unary_minus,reduceexpr_unary_plus,reduceexpr_lambda,branch0,reduceparameter_star_5_element,shift126,branch0,reduceparameter_star_5_rec,reduceexpr_neg,branch0,reducedim_expr,branch0,branch0,reduceprimary_allocation,reducedims_opt_empty,branch0,reducearray_creation_record,reducedim_expr_plus_16_rec,reducedims_opt_dims,reducedim_expr_plus_16_element,branch0,reducedim_expr_plus_15_element,reducedims_opt_empty,reducearray_creation_primitive,reducedim_expr_plus_15_rec,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducetype_id,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[] scanArray;
  @SuppressWarnings("unchecked")
  private void initscanArray() {
    scanArray=(Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_7_empty,shift44,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducesemis__semicolon,reducesemis__eoln,reduceinstr_scan,reduceblock,branch0,branch0,reduceinstr_print,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceconditional_if,branch0,reduceconditional_if_else,branch0,branch0,branch0,reduceinstr_continue,branch0,branch0,reduceinstr_throw,reduceinstr_empty,branch0,branch0,branch0,reduceinstr_break,branch0,branch0,reduceinstr_return,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_7_rec,branch0,branch0,branch0,branch0,branch0,reduceinstr_assignation,branch0,reduceinstr_funcall,branch0,reduceinstr_declaration,reduceinstr_conditional,branch0,reduceinstr_block,branch0,branch0,branch0,branch0,branch0,reduceloop_while,branch0,branch0,branch0,branch0,branch0,reduceloop_dowhile,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceloop_for,branch0,branch0,branch0,branch0,reduceinstr_loop,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[] idArray;
  @SuppressWarnings("unchecked")
  private void initidArray() {
    idArray=(Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,shift5,branch0,reducefield_star_2_empty,shift12,reduceprimitive_type_string,reduceprimitive_type_char,reduceprimitive_type_int,reduceprimitive_type_double,reducetype_id,branch0,reducedims_singleton,reducetype_id_dims,branch0,reducedims_recursive,shift12,reduceprimitive_type_boolean,reduceprimitive_type_any,branch0,branch0,shift12,branch0,reducetype_primitive,reducetype_primitive_dims,reducetype_funtype,reducetype_funtype_dims,branch0,shift12,branch0,branch0,branch0,reducefuntype,branch0,shift37,reducetype_id,shift39,branch0,branch0,branch0,reduceinstr_star_7_empty,shift154,shift145,shift46,branch0,shift61,branch0,branch0,shift61,branch0,shift37,branch0,branch0,shift61,branch0,branch0,branch0,shift61,shift61,branch0,shift61,shift61,branch0,branch0,branch0,branch0,shift61,branch0,shift61,branch0,shift61,branch0,branch0,shift61,branch0,shift61,branch0,shift61,branch0,shift61,branch0,shift61,branch0,shift61,branch0,shift61,branch0,shift61,branch0,shift61,branch0,shift61,branch0,shift61,branch0,shift61,branch0,shift61,branch0,shift61,branch0,branch0,branch0,branch0,branch0,shift108,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift61,branch0,branch0,shift119,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift37,branch0,branch0,branch0,branch0,shift61,branch0,branch0,branch0,shift61,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducesemis__semicolon,reducesemis__eoln,reduceinstr_scan,reduceblock,shift61,branch0,reduceinstr_print,reducetype_id,branch0,shift61,shift158,branch0,branch0,shift61,branch0,branch0,reduceconditional_if,branch0,reduceconditional_if_else,shift167,branch0,branch0,reduceinstr_continue,shift61,branch0,reduceinstr_throw,reduceinstr_empty,shift175,branch0,branch0,reduceinstr_break,shift61,branch0,reduceinstr_return,branch0,branch0,branch0,branch0,shift61,branch0,reduceinstr_star_7_rec,shift189,branch0,shift61,branch0,branch0,reduceinstr_assignation,branch0,reduceinstr_funcall,branch0,reduceinstr_declaration,reduceinstr_conditional,branch0,reduceinstr_block,branch0,branch0,shift61,branch0,branch0,reduceloop_while,branch0,branch0,branch0,shift61,branch0,reduceloop_dowhile,branch0,shift215,reducetype_id,branch0,branch0,branch0,branch0,shift61,branch0,shift223,branch0,branch0,branch0,branch0,reduceloop_for,branch0,branch0,branch0,branch0,reduceinstr_loop,branch0,branch0,branch0,branch0,branch0,reducefield_star_2_rec,shift240,branch0,reducefield,shift243,branch0,shift37,branch0,branch0,shift12,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[] _throwArray;
  @SuppressWarnings("unchecked")
  private void init_throwArray() {
    _throwArray=(Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_7_empty,shift170,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducesemis__semicolon,reducesemis__eoln,reduceinstr_scan,reduceblock,branch0,branch0,reduceinstr_print,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceconditional_if,branch0,reduceconditional_if_else,branch0,branch0,branch0,reduceinstr_continue,branch0,branch0,reduceinstr_throw,reduceinstr_empty,branch0,branch0,branch0,reduceinstr_break,branch0,branch0,reduceinstr_return,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_7_rec,branch0,branch0,branch0,branch0,branch0,reduceinstr_assignation,branch0,reduceinstr_funcall,branch0,reduceinstr_declaration,reduceinstr_conditional,branch0,reduceinstr_block,branch0,branch0,branch0,branch0,branch0,reduceloop_while,branch0,branch0,branch0,branch0,branch0,reduceloop_dowhile,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceloop_for,branch0,branch0,branch0,branch0,reduceinstr_loop,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[] initArray;
  @SuppressWarnings("unchecked")
  private void initinitArray() {
    initArray=(Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,reducefield_star_2_empty,shift35,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducesemis__semicolon,reducesemis__eoln,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducefield_star_2_rec,branch0,branch0,reducefield,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[] ltArray;
  @SuppressWarnings("unchecked")
  private void initltArray() {
    ltArray=(Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducedims_singleton,branch0,branch0,reducedims_recursive,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_value_literal,reduceexpr_boolean_literal,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_null_literal,reduceexpr_char_literal,reduceexpr_string_literal,branch0,branch0,reduceexpr_id,branch0,branch0,reduceprimary_field_access,reduceprimary_array_access,reduceprimary_array_creation,reduceprimary_primary_no_array_creation,branch0,reduceexpr_primary,branch0,branch0,branch0,reduceprimary_funcall,shift83,branch0,reduceexpr_ne,branch0,shift83,branch0,reduceexpr_ge,branch0,reduceexpr_star,branch0,reduceexpr_lt,branch0,reduceexpr_slash,branch0,reduceexpr_gt,branch0,reduceexpr_pow,branch0,reduceexpr_eq,branch0,reduceexpr_plus,branch0,reduceexpr_minus,branch0,reduceexpr_le,branch0,reduceexpr_mod,branch0,shift83,branch0,reducefuncall_primary,branch0,shift83,branch0,reducefield_access_primary,shift83,reducearray_access_primary,shift83,reduceprimary_parens,shift83,reducearray_access_id,branch0,branch0,reducefuncall_id,branch0,reducefield_access_id,shift83,shift83,shift83,branch0,branch0,branch0,branch0,branch0,shift83,shift83,reducedim_expr,branch0,branch0,reduceprimary_allocation,reducedims_opt_empty,branch0,reducearray_creation_record,reducedim_expr_plus_16_rec,reducedims_opt_dims,reducedim_expr_plus_16_element,branch0,reducedim_expr_plus_15_element,reducedims_opt_empty,reducearray_creation_primitive,reducedim_expr_plus_15_rec,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift83,branch0,branch0,branch0,branch0,branch0,reduceexpr_id,branch0,branch0,shift83,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift83,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift83,branch0,branch0,branch0,branch0,shift83,branch0,branch0,branch0,branch0,shift83,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift83,branch0,branch0,branch0,branch0,branch0,branch0,shift83,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift83,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[] _charArray;
  @SuppressWarnings("unchecked")
  private void init_charArray() {
    _charArray=(Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,reducefield_star_2_empty,shift9,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift9,branch0,branch0,branch0,branch0,shift9,branch0,branch0,branch0,branch0,branch0,branch0,shift9,branch0,branch0,branch0,branch0,branch0,shift9,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_7_empty,shift9,branch0,shift9,branch0,branch0,branch0,branch0,branch0,branch0,shift9,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift9,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducesemis__semicolon,reducesemis__eoln,reduceinstr_scan,reduceblock,branch0,branch0,reduceinstr_print,branch0,branch0,branch0,shift9,branch0,branch0,branch0,branch0,branch0,reduceconditional_if,branch0,reduceconditional_if_else,branch0,branch0,branch0,reduceinstr_continue,branch0,branch0,reduceinstr_throw,reduceinstr_empty,branch0,branch0,branch0,reduceinstr_break,branch0,branch0,reduceinstr_return,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_7_rec,branch0,branch0,branch0,branch0,branch0,reduceinstr_assignation,branch0,reduceinstr_funcall,branch0,reduceinstr_declaration,reduceinstr_conditional,branch0,reduceinstr_block,branch0,branch0,branch0,branch0,branch0,reduceloop_while,branch0,branch0,branch0,branch0,branch0,reduceloop_dowhile,branch0,shift9,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceloop_for,branch0,branch0,branch0,branch0,reduceinstr_loop,branch0,branch0,branch0,branch0,branch0,reducefield_star_2_rec,branch0,branch0,reducefield,branch0,branch0,shift9,branch0,branch0,shift9,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[] rparArray;
  @SuppressWarnings("unchecked")
  private void initrparArray() {
    rparArray=(Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceprimitive_type_string,reduceprimitive_type_char,reduceprimitive_type_int,reduceprimitive_type_double,reducetype_id,branch0,reducedims_singleton,reducetype_id_dims,branch0,reducedims_recursive,branch0,reduceprimitive_type_boolean,reduceprimitive_type_any,branch0,branch0,branch0,branch0,reducetype_primitive,reducetype_primitive_dims,reducetype_funtype,reducetype_funtype_dims,branch0,branch0,reducereturn_type_void,reducereturn_type_type,shift34,reducefuntype,branch0,reduceparameter_star_5_empty,reduceparameter_naked,branch0,reduceparameter_typed,shift41,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_value_literal,reduceexpr_boolean_literal,branch0,branch0,reduceparameter_star_5_empty,shift54,branch0,branch0,reduceexpr_null_literal,reduceexpr_char_literal,reduceexpr_string_literal,branch0,branch0,reduceexpr_id,branch0,branch0,reduceprimary_field_access,reduceprimary_array_access,reduceprimary_array_creation,reduceprimary_primary_no_array_creation,branch0,reduceexpr_primary,reduceexpr_star_6_empty,reduceexpr_star_6_through,branch0,reduceprimary_funcall,reduceexpr_star_6_rec,branch0,reduceexpr_ne,branch0,reduceexpr_bor,branch0,reduceexpr_ge,branch0,reduceexpr_star,branch0,reduceexpr_lt,branch0,reduceexpr_slash,branch0,reduceexpr_gt,branch0,reduceexpr_pow,branch0,reduceexpr_eq,branch0,reduceexpr_plus,branch0,reduceexpr_minus,branch0,reduceexpr_le,branch0,reduceexpr_mod,branch0,reduceexpr_band,shift104,reducefuncall_primary,reducearguments,reduceexpr_star_6_element,branch0,reducefield_access_primary,branch0,reducearray_access_primary,shift112,reduceprimary_parens,branch0,reducearray_access_id,reduceexpr_star_6_empty,shift117,reducefuncall_id,branch0,reducefield_access_id,reduceexpr_unary_minus,reduceexpr_unary_plus,reduceexpr_lambda,reduceparameters,reduceparameter_star_5_element,reduceparameter_star_5_through,branch0,reduceparameter_star_5_rec,reduceexpr_neg,branch0,reducedim_expr,reduceexpr_star_6_empty,shift133,reduceprimary_allocation,reducedims_opt_empty,branch0,reducearray_creation_record,reducedim_expr_plus_16_rec,reducedims_opt_dims,reducedim_expr_plus_16_element,branch0,reducedim_expr_plus_15_element,reducedims_opt_empty,reducearray_creation_primitive,reducedim_expr_plus_15_rec,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_id,branch0,branch0,shift162,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceassignation,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift205,branch0,branch0,branch0,branch0,branch0,branch0,shift212,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducefor_loop_incr_optional_14_empty,branch0,reducefor_loop_incr_optional_14_for_loop_incr,shift226,branch0,branch0,reducefor_loop_incr_assignation,reducefor_loop_incr_funcall,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceparameter_star_5_empty,shift246,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[] gtArray;
  @SuppressWarnings("unchecked")
  private void initgtArray() {
    gtArray=(Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducedims_singleton,branch0,branch0,reducedims_recursive,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_value_literal,reduceexpr_boolean_literal,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_null_literal,reduceexpr_char_literal,reduceexpr_string_literal,branch0,branch0,reduceexpr_id,branch0,branch0,reduceprimary_field_access,reduceprimary_array_access,reduceprimary_array_creation,reduceprimary_primary_no_array_creation,branch0,reduceexpr_primary,branch0,branch0,branch0,reduceprimary_funcall,shift87,branch0,reduceexpr_ne,branch0,shift87,branch0,reduceexpr_ge,branch0,reduceexpr_star,branch0,reduceexpr_lt,branch0,reduceexpr_slash,branch0,reduceexpr_gt,branch0,reduceexpr_pow,branch0,reduceexpr_eq,branch0,reduceexpr_plus,branch0,reduceexpr_minus,branch0,reduceexpr_le,branch0,reduceexpr_mod,branch0,shift87,branch0,reducefuncall_primary,branch0,shift87,branch0,reducefield_access_primary,shift87,reducearray_access_primary,shift87,reduceprimary_parens,shift87,reducearray_access_id,branch0,branch0,reducefuncall_id,branch0,reducefield_access_id,shift87,shift87,shift87,branch0,branch0,branch0,branch0,branch0,shift87,shift87,reducedim_expr,branch0,branch0,reduceprimary_allocation,reducedims_opt_empty,branch0,reducearray_creation_record,reducedim_expr_plus_16_rec,reducedims_opt_dims,reducedim_expr_plus_16_element,branch0,reducedim_expr_plus_15_element,reducedims_opt_empty,reducearray_creation_primitive,reducedim_expr_plus_15_rec,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift87,branch0,branch0,branch0,branch0,branch0,reduceexpr_id,branch0,branch0,shift87,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift87,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift87,branch0,branch0,branch0,branch0,shift87,branch0,branch0,branch0,branch0,shift87,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift87,branch0,branch0,branch0,branch0,branch0,branch0,shift87,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift87,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[] lcurlArray;
  @SuppressWarnings("unchecked")
  private void initlcurlArray() {
    lcurlArray=(Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[])new Action<?,?,?>[]{reducescript_member_star_1_empty,branch0,branch0,shift42,branch0,shift6,branch0,branch0,reduceprimitive_type_string,reduceprimitive_type_char,reduceprimitive_type_int,reduceprimitive_type_double,reducetype_id,branch0,reducedims_singleton,reducetype_id_dims,branch0,reducedims_recursive,branch0,reduceprimitive_type_boolean,reduceprimitive_type_any,branch0,branch0,branch0,branch0,reducetype_primitive,reducetype_primitive_dims,reducetype_funtype,reducetype_funtype_dims,branch0,branch0,reducereturn_type_void,reducereturn_type_type,branch0,reducefuntype,branch0,branch0,branch0,branch0,branch0,branch0,shift42,reduceinstr_star_7_empty,shift42,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducesemis__semicolon,reducesemis__eoln,reduceinstr_scan,reduceblock,branch0,branch0,reduceinstr_print,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift42,reduceconditional_if,shift42,reduceconditional_if_else,branch0,branch0,branch0,reduceinstr_continue,branch0,branch0,reduceinstr_throw,reduceinstr_empty,branch0,branch0,branch0,reduceinstr_break,branch0,branch0,reduceinstr_return,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_7_rec,branch0,branch0,branch0,branch0,branch0,reduceinstr_assignation,branch0,reduceinstr_funcall,branch0,reduceinstr_declaration,reduceinstr_conditional,branch0,reduceinstr_block,branch0,branch0,branch0,branch0,shift42,reduceloop_while,shift42,branch0,branch0,branch0,branch0,reduceloop_dowhile,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift42,reduceloop_for,branch0,branch0,branch0,branch0,reduceinstr_loop,branch0,branch0,branch0,branch0,reducerecord_def,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducefunction_rtype_optional_4_empty,branch0,reducefunction_rtype,reducefunction_rtype_optional_4_function_rtype,shift42,reducefunction_def,reducescript_member_record_def,reducescript_member_function_def,reducescript_member_block,reducescript_member_star_1_rec};
  }
  private Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[] _newArray;
  @SuppressWarnings("unchecked")
  private void init_newArray() {
    _newArray=(Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_7_empty,shift45,shift45,branch0,branch0,shift45,branch0,branch0,shift45,branch0,branch0,branch0,branch0,shift45,branch0,branch0,branch0,shift45,shift45,branch0,shift45,shift45,branch0,branch0,branch0,branch0,shift45,branch0,shift45,branch0,shift45,branch0,branch0,shift45,branch0,shift45,branch0,shift45,branch0,shift45,branch0,shift45,branch0,shift45,branch0,shift45,branch0,shift45,branch0,shift45,branch0,shift45,branch0,shift45,branch0,shift45,branch0,shift45,branch0,shift45,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift45,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift45,branch0,branch0,branch0,shift45,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducesemis__semicolon,reducesemis__eoln,reduceinstr_scan,reduceblock,shift45,branch0,reduceinstr_print,branch0,branch0,shift45,shift45,branch0,branch0,shift45,branch0,branch0,reduceconditional_if,branch0,reduceconditional_if_else,branch0,branch0,branch0,reduceinstr_continue,shift45,branch0,reduceinstr_throw,reduceinstr_empty,branch0,branch0,branch0,reduceinstr_break,shift45,branch0,reduceinstr_return,branch0,branch0,branch0,branch0,shift45,branch0,reduceinstr_star_7_rec,branch0,branch0,shift45,branch0,branch0,reduceinstr_assignation,branch0,reduceinstr_funcall,branch0,reduceinstr_declaration,reduceinstr_conditional,branch0,reduceinstr_block,branch0,branch0,shift45,branch0,branch0,reduceloop_while,branch0,branch0,branch0,shift45,branch0,reduceloop_dowhile,branch0,shift45,branch0,branch0,branch0,branch0,branch0,shift45,branch0,shift45,branch0,branch0,branch0,branch0,reduceloop_for,branch0,branch0,branch0,branch0,reduceinstr_loop,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[] neqArray;
  @SuppressWarnings("unchecked")
  private void initneqArray() {
    neqArray=(Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducedims_singleton,branch0,branch0,reducedims_recursive,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_value_literal,reduceexpr_boolean_literal,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_null_literal,reduceexpr_char_literal,reduceexpr_string_literal,branch0,branch0,reduceexpr_id,branch0,branch0,reduceprimary_field_access,reduceprimary_array_access,reduceprimary_array_creation,reduceprimary_primary_no_array_creation,branch0,reduceexpr_primary,branch0,branch0,branch0,reduceprimary_funcall,shift75,branch0,reduceexpr_ne,branch0,shift75,branch0,reduceexpr_ge,branch0,reduceexpr_star,branch0,reduceexpr_lt,branch0,reduceexpr_slash,branch0,reduceexpr_gt,branch0,reduceexpr_pow,branch0,reduceexpr_eq,branch0,reduceexpr_plus,branch0,reduceexpr_minus,branch0,reduceexpr_le,branch0,reduceexpr_mod,branch0,shift75,branch0,reducefuncall_primary,branch0,shift75,branch0,reducefield_access_primary,shift75,reducearray_access_primary,shift75,reduceprimary_parens,shift75,reducearray_access_id,branch0,branch0,reducefuncall_id,branch0,reducefield_access_id,shift75,shift75,shift75,branch0,branch0,branch0,branch0,branch0,shift75,shift75,reducedim_expr,branch0,branch0,reduceprimary_allocation,reducedims_opt_empty,branch0,reducearray_creation_record,reducedim_expr_plus_16_rec,reducedims_opt_dims,reducedim_expr_plus_16_element,branch0,reducedim_expr_plus_15_element,reducedims_opt_empty,reducearray_creation_primitive,reducedim_expr_plus_15_rec,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift75,branch0,branch0,branch0,branch0,branch0,reduceexpr_id,branch0,branch0,shift75,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift75,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift75,branch0,branch0,branch0,branch0,shift75,branch0,branch0,branch0,branch0,shift75,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift75,branch0,branch0,branch0,branch0,branch0,branch0,shift75,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift75,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[] borArray;
  @SuppressWarnings("unchecked")
  private void initborArray() {
    borArray=(Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducedims_singleton,branch0,branch0,reducedims_recursive,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_value_literal,reduceexpr_boolean_literal,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_null_literal,reduceexpr_char_literal,reduceexpr_string_literal,branch0,branch0,reduceexpr_id,branch0,branch0,reduceprimary_field_access,reduceprimary_array_access,reduceprimary_array_creation,reduceprimary_primary_no_array_creation,branch0,reduceexpr_primary,branch0,branch0,branch0,reduceprimary_funcall,shift77,branch0,reduceexpr_ne,branch0,reduceexpr_bor,branch0,reduceexpr_ge,branch0,reduceexpr_star,branch0,reduceexpr_lt,branch0,reduceexpr_slash,branch0,reduceexpr_gt,branch0,reduceexpr_pow,branch0,reduceexpr_eq,branch0,reduceexpr_plus,branch0,reduceexpr_minus,branch0,reduceexpr_le,branch0,reduceexpr_mod,branch0,reduceexpr_band,branch0,reducefuncall_primary,branch0,shift77,branch0,reducefield_access_primary,shift77,reducearray_access_primary,shift77,reduceprimary_parens,shift77,reducearray_access_id,branch0,branch0,reducefuncall_id,branch0,reducefield_access_id,shift77,shift77,shift77,branch0,branch0,branch0,branch0,branch0,shift77,shift77,reducedim_expr,branch0,branch0,reduceprimary_allocation,reducedims_opt_empty,branch0,reducearray_creation_record,reducedim_expr_plus_16_rec,reducedims_opt_dims,reducedim_expr_plus_16_element,branch0,reducedim_expr_plus_15_element,reducedims_opt_empty,reducearray_creation_primitive,reducedim_expr_plus_15_rec,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift77,branch0,branch0,branch0,branch0,branch0,reduceexpr_id,branch0,branch0,shift77,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift77,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift77,branch0,branch0,branch0,branch0,shift77,branch0,branch0,branch0,branch0,shift77,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift77,branch0,branch0,branch0,branch0,branch0,branch0,shift77,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift77,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[] char_literalArray;
  @SuppressWarnings("unchecked")
  private void initchar_literalArray() {
    char_literalArray=(Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift57,branch0,branch0,shift57,branch0,branch0,branch0,branch0,shift57,branch0,branch0,branch0,shift57,shift57,branch0,shift57,shift57,branch0,branch0,branch0,branch0,shift57,branch0,shift57,branch0,shift57,branch0,branch0,shift57,branch0,shift57,branch0,shift57,branch0,shift57,branch0,shift57,branch0,shift57,branch0,shift57,branch0,shift57,branch0,shift57,branch0,shift57,branch0,shift57,branch0,shift57,branch0,shift57,branch0,shift57,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift57,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift57,branch0,branch0,branch0,shift57,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift57,branch0,branch0,branch0,branch0,shift57,shift57,branch0,branch0,shift57,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift57,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift57,branch0,branch0,branch0,branch0,branch0,branch0,shift57,branch0,branch0,branch0,branch0,shift57,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift57,branch0,branch0,branch0,branch0,branch0,branch0,shift57,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift57,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[] roptArray;
  @SuppressWarnings("unchecked")
  private void initroptArray() {
    roptArray=(Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift14,reducedims_singleton,branch0,shift17,reducedims_recursive,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_value_literal,reduceexpr_boolean_literal,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_null_literal,reduceexpr_char_literal,reduceexpr_string_literal,branch0,branch0,reduceexpr_id,branch0,branch0,reduceprimary_field_access,reduceprimary_array_access,reduceprimary_array_creation,reduceprimary_primary_no_array_creation,branch0,reduceexpr_primary,branch0,branch0,branch0,reduceprimary_funcall,branch0,branch0,reduceexpr_ne,branch0,reduceexpr_bor,branch0,reduceexpr_ge,branch0,reduceexpr_star,branch0,reduceexpr_lt,branch0,reduceexpr_slash,branch0,reduceexpr_gt,branch0,reduceexpr_pow,branch0,reduceexpr_eq,branch0,reduceexpr_plus,branch0,reduceexpr_minus,branch0,reduceexpr_le,branch0,reduceexpr_mod,branch0,reduceexpr_band,branch0,reducefuncall_primary,branch0,branch0,branch0,reducefield_access_primary,shift110,reducearray_access_primary,branch0,reduceprimary_parens,shift114,reducearray_access_id,branch0,branch0,reducefuncall_id,branch0,reducefield_access_id,reduceexpr_unary_minus,reduceexpr_unary_plus,reduceexpr_lambda,branch0,branch0,branch0,branch0,branch0,reduceexpr_neg,shift130,reducedim_expr,branch0,branch0,reduceprimary_allocation,reducedims_opt_empty,shift14,reducearray_creation_record,reducedim_expr_plus_16_rec,reducedims_opt_dims,reducedim_expr_plus_16_element,branch0,reducedim_expr_plus_15_element,reducedims_opt_empty,reducearray_creation_primitive,reducedim_expr_plus_15_rec,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift14,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[] printArray;
  @SuppressWarnings("unchecked")
  private void initprintArray() {
    printArray=(Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_7_empty,shift151,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducesemis__semicolon,reducesemis__eoln,reduceinstr_scan,reduceblock,branch0,branch0,reduceinstr_print,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceconditional_if,branch0,reduceconditional_if_else,branch0,branch0,branch0,reduceinstr_continue,branch0,branch0,reduceinstr_throw,reduceinstr_empty,branch0,branch0,branch0,reduceinstr_break,branch0,branch0,reduceinstr_return,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_7_rec,branch0,branch0,branch0,branch0,branch0,reduceinstr_assignation,branch0,reduceinstr_funcall,branch0,reduceinstr_declaration,reduceinstr_conditional,branch0,reduceinstr_block,branch0,branch0,branch0,branch0,branch0,reduceloop_while,branch0,branch0,branch0,branch0,branch0,reduceloop_dowhile,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceloop_for,branch0,branch0,branch0,branch0,reduceinstr_loop,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[] rcurlArray;
  @SuppressWarnings("unchecked")
  private void initrcurlArray() {
    rcurlArray=(Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,reducefield_star_2_empty,reducerecord_init_optional_3_empty,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_7_empty,shift150,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducesemis__semicolon,reducesemis__eoln,reduceinstr_scan,reduceblock,branch0,branch0,reduceinstr_print,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceconditional_if,branch0,reduceconditional_if_else,branch0,branch0,branch0,reduceinstr_continue,branch0,branch0,reduceinstr_throw,reduceinstr_empty,branch0,branch0,branch0,reduceinstr_break,branch0,branch0,reduceinstr_return,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_7_rec,branch0,branch0,branch0,branch0,branch0,reduceinstr_assignation,branch0,reduceinstr_funcall,branch0,reduceinstr_declaration,reduceinstr_conditional,branch0,reduceinstr_block,branch0,branch0,branch0,branch0,branch0,reduceloop_while,branch0,branch0,branch0,branch0,branch0,reduceloop_dowhile,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceloop_for,branch0,branch0,branch0,branch0,reduceinstr_loop,branch0,reducerecord_init,reducerecord_init_optional_3_record_init,shift237,branch0,reducefield_star_2_rec,branch0,branch0,reducefield,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[] eolnArray;
  @SuppressWarnings("unchecked")
  private void initeolnArray() {
    eolnArray=(Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducedims_singleton,branch0,branch0,reducedims_recursive,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_value_literal,reduceexpr_boolean_literal,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_null_literal,reduceexpr_char_literal,reduceexpr_string_literal,branch0,branch0,reduceexpr_id,branch0,branch0,reduceprimary_field_access,reduceprimary_array_access,reduceprimary_array_creation,reduceprimary_primary_no_array_creation,branch0,reduceexpr_primary,branch0,branch0,branch0,reduceprimary_funcall,branch0,branch0,reduceexpr_ne,branch0,reduceexpr_bor,branch0,reduceexpr_ge,branch0,reduceexpr_star,branch0,reduceexpr_lt,branch0,reduceexpr_slash,branch0,reduceexpr_gt,branch0,reduceexpr_pow,branch0,reduceexpr_eq,branch0,reduceexpr_plus,branch0,reduceexpr_minus,branch0,reduceexpr_le,branch0,reduceexpr_mod,branch0,reduceexpr_band,branch0,reducefuncall_primary,branch0,branch0,branch0,reducefield_access_primary,branch0,reducearray_access_primary,branch0,reduceprimary_parens,branch0,reducearray_access_id,branch0,branch0,reducefuncall_id,branch0,reducefield_access_id,reduceexpr_unary_minus,reduceexpr_unary_plus,reduceexpr_lambda,branch0,branch0,branch0,branch0,branch0,reduceexpr_neg,branch0,reducedim_expr,branch0,branch0,reduceprimary_allocation,reducedims_opt_empty,branch0,reducearray_creation_record,reducedim_expr_plus_16_rec,reducedims_opt_dims,reducedim_expr_plus_16_element,branch0,reducedim_expr_plus_15_element,reducedims_opt_empty,reducearray_creation_primitive,reducedim_expr_plus_15_rec,branch0,shift148,branch0,branch0,branch0,branch0,branch0,shift148,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceid_optional_10_empty,reduceid_optional_10_id,shift148,branch0,branch0,shift148,branch0,branch0,reduceid_optional_9_empty,reduceid_optional_9_id,shift148,branch0,reduceexpr_optional_11_empty,shift148,branch0,reduceexpr_optional_11_expr,branch0,branch0,branch0,branch0,reduceassignation,branch0,branch0,reducedeclaration_id,branch0,reducedeclaration_id_init,shift148,branch0,shift148,branch0,shift148,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift148,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[] _doArray;
  @SuppressWarnings("unchecked")
  private void init_doArray() {
    _doArray=(Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_7_empty,reduceloop_label_optional_8_empty,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducesemis__semicolon,reducesemis__eoln,reduceinstr_scan,reduceblock,branch0,branch0,reduceinstr_print,branch0,reduceloop_label,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceconditional_if,branch0,reduceconditional_if_else,branch0,branch0,branch0,reduceinstr_continue,branch0,branch0,reduceinstr_throw,reduceinstr_empty,branch0,branch0,branch0,reduceinstr_break,branch0,branch0,reduceinstr_return,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_7_rec,branch0,branch0,branch0,branch0,branch0,reduceinstr_assignation,branch0,reduceinstr_funcall,branch0,reduceinstr_declaration,reduceinstr_conditional,branch0,reduceinstr_block,shift207,branch0,branch0,branch0,branch0,reduceloop_while,branch0,branch0,branch0,branch0,branch0,reduceloop_dowhile,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceloop_for,branch0,branch0,branch0,branch0,reduceinstr_loop,reduceloop_label_optional_8_loop_label,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[] _forArray;
  @SuppressWarnings("unchecked")
  private void init_forArray() {
    _forArray=(Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_7_empty,reduceloop_label_optional_8_empty,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducesemis__semicolon,reducesemis__eoln,reduceinstr_scan,reduceblock,branch0,branch0,reduceinstr_print,branch0,reduceloop_label,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceconditional_if,branch0,reduceconditional_if_else,branch0,branch0,branch0,reduceinstr_continue,branch0,branch0,reduceinstr_throw,reduceinstr_empty,branch0,branch0,branch0,reduceinstr_break,branch0,branch0,reduceinstr_return,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_7_rec,branch0,branch0,branch0,branch0,branch0,reduceinstr_assignation,branch0,reduceinstr_funcall,branch0,reduceinstr_declaration,reduceinstr_conditional,branch0,reduceinstr_block,shift213,branch0,branch0,branch0,branch0,reduceloop_while,branch0,branch0,branch0,branch0,branch0,reduceloop_dowhile,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceloop_for,branch0,branch0,branch0,branch0,reduceinstr_loop,reduceloop_label_optional_8_loop_label,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[] stringArray;
  @SuppressWarnings("unchecked")
  private void initstringArray() {
    stringArray=(Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,reducefield_star_2_empty,shift8,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift8,branch0,branch0,branch0,branch0,shift8,branch0,branch0,branch0,branch0,branch0,branch0,shift8,branch0,branch0,branch0,branch0,branch0,shift8,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_7_empty,shift8,branch0,shift8,branch0,branch0,branch0,branch0,branch0,branch0,shift8,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift8,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducesemis__semicolon,reducesemis__eoln,reduceinstr_scan,reduceblock,branch0,branch0,reduceinstr_print,branch0,branch0,branch0,shift8,branch0,branch0,branch0,branch0,branch0,reduceconditional_if,branch0,reduceconditional_if_else,branch0,branch0,branch0,reduceinstr_continue,branch0,branch0,reduceinstr_throw,reduceinstr_empty,branch0,branch0,branch0,reduceinstr_break,branch0,branch0,reduceinstr_return,branch0,branch0,branch0,branch0,branch0,branch0,reduceinstr_star_7_rec,branch0,branch0,branch0,branch0,branch0,reduceinstr_assignation,branch0,reduceinstr_funcall,branch0,reduceinstr_declaration,reduceinstr_conditional,branch0,reduceinstr_block,branch0,branch0,branch0,branch0,branch0,reduceloop_while,branch0,branch0,branch0,branch0,branch0,reduceloop_dowhile,branch0,shift8,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceloop_for,branch0,branch0,branch0,branch0,reduceinstr_loop,branch0,branch0,branch0,branch0,branch0,reducefield_star_2_rec,branch0,branch0,reducefield,branch0,branch0,shift8,branch0,branch0,shift8,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[] recordArray;
  @SuppressWarnings("unchecked")
  private void initrecordArray() {
    recordArray=(Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[])new Action<?,?,?>[]{reducescript_member_star_1_empty,branch0,branch0,shift4,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceblock,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducerecord_def,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducefunction_def,reducescript_member_record_def,reducescript_member_function_def,reducescript_member_block,reducescript_member_star_1_rec};
  }
  private Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[] eqArray;
  @SuppressWarnings("unchecked")
  private void initeqArray() {
    eqArray=(Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducedims_singleton,branch0,branch0,reducedims_recursive,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_value_literal,reduceexpr_boolean_literal,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_null_literal,reduceexpr_char_literal,reduceexpr_string_literal,branch0,branch0,reduceexpr_id,branch0,branch0,reduceprimary_field_access,reduceprimary_array_access,reduceprimary_array_creation,reduceprimary_primary_no_array_creation,branch0,reduceexpr_primary,branch0,branch0,branch0,reduceprimary_funcall,shift91,branch0,reduceexpr_ne,branch0,shift91,branch0,reduceexpr_ge,branch0,reduceexpr_star,branch0,reduceexpr_lt,branch0,reduceexpr_slash,branch0,reduceexpr_gt,branch0,reduceexpr_pow,branch0,reduceexpr_eq,branch0,reduceexpr_plus,branch0,reduceexpr_minus,branch0,reduceexpr_le,branch0,reduceexpr_mod,branch0,shift91,branch0,reducefuncall_primary,branch0,shift91,branch0,reducefield_access_primary,shift91,reducearray_access_primary,shift91,reduceprimary_parens,shift91,reducearray_access_id,branch0,branch0,reducefuncall_id,branch0,reducefield_access_id,shift91,shift91,shift91,branch0,branch0,branch0,branch0,branch0,shift91,shift91,reducedim_expr,branch0,branch0,reduceprimary_allocation,reducedims_opt_empty,branch0,reducearray_creation_record,reducedim_expr_plus_16_rec,reducedims_opt_dims,reducedim_expr_plus_16_element,branch0,reducedim_expr_plus_15_element,reducedims_opt_empty,reducearray_creation_primitive,reducedim_expr_plus_15_rec,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift91,branch0,branch0,branch0,branch0,branch0,reduceexpr_id,branch0,branch0,shift91,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift91,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift91,branch0,branch0,branch0,branch0,shift91,branch0,branch0,branch0,branch0,shift91,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift91,branch0,branch0,branch0,branch0,branch0,branch0,shift91,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift91,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[] minusArray;
  @SuppressWarnings("unchecked")
  private void initminusArray() {
    minusArray=(Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducedims_singleton,branch0,branch0,reducedims_recursive,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift60,reduceexpr_value_literal,reduceexpr_boolean_literal,shift60,branch0,branch0,branch0,branch0,shift60,reduceexpr_null_literal,reduceexpr_char_literal,reduceexpr_string_literal,shift60,shift60,reduceexpr_id,shift60,shift60,reduceprimary_field_access,reduceprimary_array_access,reduceprimary_array_creation,reduceprimary_primary_no_array_creation,shift60,reduceexpr_primary,shift60,branch0,shift60,reduceprimary_funcall,shift95,shift60,shift95,shift60,shift95,shift60,shift95,shift60,reduceexpr_star,shift60,shift95,shift60,reduceexpr_slash,shift60,shift95,shift60,reduceexpr_pow,shift60,shift95,shift60,reduceexpr_plus,shift60,reduceexpr_minus,shift60,shift95,shift60,reduceexpr_mod,shift60,shift95,branch0,reducefuncall_primary,branch0,shift95,branch0,reducefield_access_primary,shift95,reducearray_access_primary,shift95,reduceprimary_parens,shift95,reducearray_access_id,shift60,branch0,reducefuncall_id,branch0,reducefield_access_id,shift95,shift95,shift95,branch0,branch0,branch0,branch0,branch0,shift95,shift95,reducedim_expr,shift60,branch0,reduceprimary_allocation,reducedims_opt_empty,shift60,reducearray_creation_record,reducedim_expr_plus_16_rec,reducedims_opt_dims,reducedim_expr_plus_16_element,branch0,reducedim_expr_plus_15_element,reducedims_opt_empty,reducearray_creation_primitive,reducedim_expr_plus_15_rec,branch0,branch0,branch0,branch0,branch0,branch0,shift60,shift95,branch0,branch0,branch0,shift60,shift60,reduceexpr_id,branch0,shift60,shift95,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift60,shift95,branch0,branch0,branch0,branch0,branch0,branch0,shift60,branch0,branch0,shift95,branch0,branch0,branch0,shift60,shift95,branch0,branch0,branch0,shift60,shift95,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift60,shift95,branch0,branch0,branch0,branch0,branch0,shift60,shift95,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift60,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift95,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[] __eof__Array;
  @SuppressWarnings("unchecked")
  private void init__eof__Array() {
    __eof__Array=(Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[])new Action<?,?,?>[]{reducescript_member_star_1_empty,accept,accept,reducestart,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceblock,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducerecord_def,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducefunction_def,reducescript_member_record_def,reducescript_member_function_def,reducescript_member_block,reducescript_member_star_1_rec};
  }
  private Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[] leArray;
  @SuppressWarnings("unchecked")
  private void initleArray() {
    leArray=(Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducedims_singleton,branch0,branch0,reducedims_recursive,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_value_literal,reduceexpr_boolean_literal,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_null_literal,reduceexpr_char_literal,reduceexpr_string_literal,branch0,branch0,reduceexpr_id,branch0,branch0,reduceprimary_field_access,reduceprimary_array_access,reduceprimary_array_creation,reduceprimary_primary_no_array_creation,branch0,reduceexpr_primary,branch0,branch0,branch0,reduceprimary_funcall,shift97,branch0,reduceexpr_ne,branch0,shift97,branch0,reduceexpr_ge,branch0,reduceexpr_star,branch0,reduceexpr_lt,branch0,reduceexpr_slash,branch0,reduceexpr_gt,branch0,reduceexpr_pow,branch0,reduceexpr_eq,branch0,reduceexpr_plus,branch0,reduceexpr_minus,branch0,reduceexpr_le,branch0,reduceexpr_mod,branch0,shift97,branch0,reducefuncall_primary,branch0,shift97,branch0,reducefield_access_primary,shift97,reducearray_access_primary,shift97,reduceprimary_parens,shift97,reducearray_access_id,branch0,branch0,reducefuncall_id,branch0,reducefield_access_id,shift97,shift97,shift97,branch0,branch0,branch0,branch0,branch0,shift97,shift97,reducedim_expr,branch0,branch0,reduceprimary_allocation,reducedims_opt_empty,branch0,reducearray_creation_record,reducedim_expr_plus_16_rec,reducedims_opt_dims,reducedim_expr_plus_16_element,branch0,reducedim_expr_plus_15_element,reducedims_opt_empty,reducearray_creation_primitive,reducedim_expr_plus_15_rec,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift97,branch0,branch0,branch0,branch0,branch0,reduceexpr_id,branch0,branch0,shift97,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift97,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift97,branch0,branch0,branch0,branch0,shift97,branch0,branch0,branch0,branch0,shift97,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift97,branch0,branch0,branch0,branch0,branch0,branch0,shift97,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift97,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }

  private Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[] branchArrayTable;
  @SuppressWarnings("unchecked")
  private void initBranchArrayTable() {
    branchArrayTable=(Action<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum>[])new Action<?,?,?>[]{reducescript_member_star_1_empty,exit,exit,reducestart,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,reduceblock,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,reducerecord_def,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,reducefunction_def,reducescript_member_record_def,reducescript_member_function_def,reducescript_member_block,reducescript_member_star_1_rec};
  }

  private final ParserTable<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> table;
  
  public static final ParserTable<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> createTable() {
    return new PseudoParserDataTable().table;
  }

  private final AcceptAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> accept;
  private final ExitAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> exit;

  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reduceexpr_le;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reduceprimary_allocation;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reduceinstr_break;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reduceexpr_band;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reduceprimary_field_access;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reducetype_primitive_dims;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reduceexpr_lt;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reduceparameter_naked;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reducetype_id;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reducefunction_rtype_optional_4_empty;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reduceid_optional_9_id;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reducefunction_rtype;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reducefor_loop_incr_funcall;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reducetype_star_0_through;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reducedims_singleton;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reduceexpr_optional_13_empty;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reduceprimary_primary_no_array_creation;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reducearray_access_primary;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reduceid_optional_10_empty;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reduceinstr_return;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reduceprimitive_type_char;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reduceconditional_if;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reducereturn_type_void;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reduceprimitive_type_any;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reducedim_expr_plus_16_element;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reduceid_optional_10_id;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reduceassignation;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reducerecord_init_optional_3_record_init;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reducefield_star_2_rec;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reducedim_expr;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reduceexpr_char_literal;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reduceprimary_array_access;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reduceloop_label_optional_8_empty;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reducefor_loop_incr_optional_14_for_loop_incr;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reducescript_member_block;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reduceexpr_ge;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reduceloop_label;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reducearray_access_id;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reduceexpr_star;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reduceexpr_minus;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reducelhs_id;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reduceexpr_optional_11_expr;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reduceexpr_lambda;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reduceparameters;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reducedim_expr_plus_15_element;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reducetype_primitive;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reducereturn_type_type;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reduceexpr_unary_plus;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reduceexpr_null_literal;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reducefor_loop_init_declaration;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reducedeclaration_id;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reduceexpr_star_6_through;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reduceexpr_gt;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reduceloop_while;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reduceexpr_neg;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reduceprimary_array_creation;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reducedeclaration_id_init;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reduceexpr_pow;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reduceexpr_bor;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reducetype_star_0_empty;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reduceexpr_boolean_literal;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reduceexpr_plus;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reducefor_loop_init_optional_12_for_loop_init;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reduceparameter_star_5_through;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reducefor_loop_init_funcall;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reduceexpr_string_literal;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reduceinstr_loop;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reducearguments;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reduceinstr_declaration;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reducearray_creation_record;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reducedim_expr_plus_16_rec;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reducefor_loop_incr_assignation;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reducefield_star_2_empty;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reducearray_creation_primitive;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reduceinstr_assignation;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reducefunction_def;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reducedims_recursive;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reduceblock;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reduceinstr_star_7_empty;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reducedim_expr_plus_15_rec;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reduceinstr_scan;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reducedims_opt_dims;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reducescript_member_function_def;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reducerecord_init_optional_3_empty;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reduceparameter_star_5_rec;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reduceloop_dowhile;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reduceinstr_conditional;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reduceinstr_print;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reducefuncall_primary;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reducetype_id_dims;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reduceprimary_parens;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reducedims_opt_empty;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reduceinstr_block;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reduceprimitive_type_int;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reducesemis__eoln;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reducefuncall_id;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reducefor_loop_init_assignation;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reduceexpr_eq;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reduceid_optional_9_empty;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reduceexpr_id;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reducefuntype;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reduceexpr_star_6_rec;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reduceinstr_empty;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reducelhs_field_access;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reducelhs_array_access;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reduceexpr_primary;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reduceexpr_slash;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reducescript_member_star_1_rec;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reducetype_funtype;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reduceprimitive_type_boolean;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reducerecord_init;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reduceinstr_continue;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reducescript_member_star_1_empty;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reduceexpr_optional_13_expr;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reducetype_funtype_dims;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reduceloop_for;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reduceparameter_star_5_empty;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reducescript_member_record_def;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reducetype_star_0_element;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reducestart;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reduceexpr_star_6_element;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reducetype_star_0_rec;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reduceexpr_optional_11_empty;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reducerecord_def;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reduceprimitive_type_double;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reducefunction_rtype_optional_4_function_rtype;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reducefield_access_primary;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reduceexpr_star_6_empty;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reduceconditional_if_else;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reducefor_loop_incr_optional_14_empty;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reduceprimitive_type_string;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reducefield;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reducefor_loop_init_optional_12_empty;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reduceexpr_mod;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reduceparameter_star_5_element;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reduceexpr_unary_minus;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reduceparameter_typed;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reduceinstr_throw;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reduceprimary_funcall;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reduceinstr_star_7_rec;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reducesemis__semicolon;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reduceloop_label_optional_8_loop_label;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reduceexpr_ne;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reduceexpr_value_literal;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reduceinstr_funcall;
  private final ReduceAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> reducefield_access_id;

  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift63;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift190;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift166;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift222;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift178;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift42;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift4;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift54;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift155;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift45;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift133;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift203;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift5;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift91;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift119;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift210;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift212;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift170;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift209;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift213;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift202;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift131;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift59;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift75;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift79;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift23;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift147;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift130;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift34;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift243;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift159;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift237;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift97;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift14;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift95;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift247;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift126;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift112;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift47;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift12;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift35;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift37;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift60;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift36;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift244;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift72;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift93;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift50;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift49;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift81;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift145;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift104;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift160;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift135;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift158;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift68;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift108;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift13;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift110;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift58;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift148;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift114;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift57;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift39;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift89;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift150;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift70;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift189;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift10;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift174;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift41;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift162;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift246;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift157;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift83;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift11;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift99;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift240;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift223;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift77;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift117;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift173;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift20;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift167;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift17;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift6;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift220;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift51;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift85;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift101;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift16;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift175;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift151;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift87;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift30;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift214;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift61;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift115;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift31;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift207;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift56;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift62;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift46;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift19;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift226;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift154;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift52;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift156;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift118;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift48;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift107;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift55;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift44;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift18;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift215;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift9;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift185;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift164;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift205;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift8;
  private final ShiftAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> shift242;


  private final ErrorAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> error0;

  private final BranchAction<PseudoTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> branch0;

}
