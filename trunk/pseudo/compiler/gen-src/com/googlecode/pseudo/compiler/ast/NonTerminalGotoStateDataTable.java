package com.googlecode.pseudo.compiler.ast;

import com.googlecode.pseudo.compiler.parser.PseudoNonTerminalEnum;

import fr.umlv.tatoo.runtime.ast.NonTerminalGotoStateTable;

public class NonTerminalGotoStateDataTable {
  private NonTerminalGotoStateDataTable() {
    // helper class
  }
  
    
  private static void init_dims_opt(NonTerminalGotoStateTable<PseudoNonTerminalEnum> nonTerminalGotoStateTable) {
       nonTerminalGotoStateTable.setGotoState(137, PseudoNonTerminalEnum.dims_opt, 139);
      nonTerminalGotoStateTable.setGotoState(144, PseudoNonTerminalEnum.dims_opt, 145);
  }
  
    
  private static void init_parameter_star_5(NonTerminalGotoStateTable<PseudoNonTerminalEnum> nonTerminalGotoStateTable) {
       nonTerminalGotoStateTable.setGotoState(6, PseudoNonTerminalEnum.parameter_star_5, 121);
      nonTerminalGotoStateTable.setGotoState(56, PseudoNonTerminalEnum.parameter_star_5, 121);
      nonTerminalGotoStateTable.setGotoState(241, PseudoNonTerminalEnum.parameter_star_5, 121);
  }
  
    
  private static void init_funtype(NonTerminalGotoStateTable<PseudoNonTerminalEnum> nonTerminalGotoStateTable) {
       nonTerminalGotoStateTable.setGotoState(6, PseudoNonTerminalEnum.funtype, 22);
      nonTerminalGotoStateTable.setGotoState(10, PseudoNonTerminalEnum.funtype, 22);
      nonTerminalGotoStateTable.setGotoState(25, PseudoNonTerminalEnum.funtype, 22);
      nonTerminalGotoStateTable.setGotoState(29, PseudoNonTerminalEnum.funtype, 22);
      nonTerminalGotoStateTable.setGotoState(37, PseudoNonTerminalEnum.funtype, 22);
      nonTerminalGotoStateTable.setGotoState(42, PseudoNonTerminalEnum.funtype, 22);
      nonTerminalGotoStateTable.setGotoState(56, PseudoNonTerminalEnum.funtype, 22);
      nonTerminalGotoStateTable.setGotoState(123, PseudoNonTerminalEnum.funtype, 22);
      nonTerminalGotoStateTable.setGotoState(174, PseudoNonTerminalEnum.funtype, 22);
      nonTerminalGotoStateTable.setGotoState(205, PseudoNonTerminalEnum.funtype, 22);
      nonTerminalGotoStateTable.setGotoState(239, PseudoNonTerminalEnum.funtype, 22);
      nonTerminalGotoStateTable.setGotoState(241, PseudoNonTerminalEnum.funtype, 22);
  }
  
    
  private static void init_declaration(NonTerminalGotoStateTable<PseudoNonTerminalEnum> nonTerminalGotoStateTable) {
       nonTerminalGotoStateTable.setGotoState(42, PseudoNonTerminalEnum.declaration, 184);
      nonTerminalGotoStateTable.setGotoState(205, PseudoNonTerminalEnum.declaration, 207);
  }
  
    
  private static void init_expr_star_6_sub(NonTerminalGotoStateTable<PseudoNonTerminalEnum> nonTerminalGotoStateTable) {
       nonTerminalGotoStateTable.setGotoState(47, PseudoNonTerminalEnum.expr_star_6_sub, 102);
      nonTerminalGotoStateTable.setGotoState(63, PseudoNonTerminalEnum.expr_star_6_sub, 102);
      nonTerminalGotoStateTable.setGotoState(70, PseudoNonTerminalEnum.expr_star_6_sub, 102);
  }
  
    
  private static void init_function_rtype_optional_4(NonTerminalGotoStateTable<PseudoNonTerminalEnum> nonTerminalGotoStateTable) {
       nonTerminalGotoStateTable.setGotoState(36, PseudoNonTerminalEnum.function_rtype_optional_4, 40);
  }
  
    
  private static void init_parameter(NonTerminalGotoStateTable<PseudoNonTerminalEnum> nonTerminalGotoStateTable) {
       nonTerminalGotoStateTable.setGotoState(6, PseudoNonTerminalEnum.parameter, 127);
      nonTerminalGotoStateTable.setGotoState(56, PseudoNonTerminalEnum.parameter, 127);
      nonTerminalGotoStateTable.setGotoState(123, PseudoNonTerminalEnum.parameter, 126);
      nonTerminalGotoStateTable.setGotoState(241, PseudoNonTerminalEnum.parameter, 127);
  }
  
    
  private static void init_funcall(NonTerminalGotoStateTable<PseudoNonTerminalEnum> nonTerminalGotoStateTable) {
       nonTerminalGotoStateTable.setGotoState(42, PseudoNonTerminalEnum.funcall, 188);
      nonTerminalGotoStateTable.setGotoState(44, PseudoNonTerminalEnum.funcall, 100);
      nonTerminalGotoStateTable.setGotoState(47, PseudoNonTerminalEnum.funcall, 100);
      nonTerminalGotoStateTable.setGotoState(49, PseudoNonTerminalEnum.funcall, 100);
      nonTerminalGotoStateTable.setGotoState(51, PseudoNonTerminalEnum.funcall, 100);
      nonTerminalGotoStateTable.setGotoState(52, PseudoNonTerminalEnum.funcall, 100);
      nonTerminalGotoStateTable.setGotoState(59, PseudoNonTerminalEnum.funcall, 100);
      nonTerminalGotoStateTable.setGotoState(60, PseudoNonTerminalEnum.funcall, 100);
      nonTerminalGotoStateTable.setGotoState(63, PseudoNonTerminalEnum.funcall, 100);
      nonTerminalGotoStateTable.setGotoState(68, PseudoNonTerminalEnum.funcall, 100);
      nonTerminalGotoStateTable.setGotoState(70, PseudoNonTerminalEnum.funcall, 100);
      nonTerminalGotoStateTable.setGotoState(72, PseudoNonTerminalEnum.funcall, 100);
      nonTerminalGotoStateTable.setGotoState(74, PseudoNonTerminalEnum.funcall, 100);
      nonTerminalGotoStateTable.setGotoState(76, PseudoNonTerminalEnum.funcall, 100);
      nonTerminalGotoStateTable.setGotoState(78, PseudoNonTerminalEnum.funcall, 100);
      nonTerminalGotoStateTable.setGotoState(80, PseudoNonTerminalEnum.funcall, 100);
      nonTerminalGotoStateTable.setGotoState(82, PseudoNonTerminalEnum.funcall, 100);
      nonTerminalGotoStateTable.setGotoState(84, PseudoNonTerminalEnum.funcall, 100);
      nonTerminalGotoStateTable.setGotoState(86, PseudoNonTerminalEnum.funcall, 100);
      nonTerminalGotoStateTable.setGotoState(88, PseudoNonTerminalEnum.funcall, 100);
      nonTerminalGotoStateTable.setGotoState(90, PseudoNonTerminalEnum.funcall, 100);
      nonTerminalGotoStateTable.setGotoState(92, PseudoNonTerminalEnum.funcall, 100);
      nonTerminalGotoStateTable.setGotoState(94, PseudoNonTerminalEnum.funcall, 100);
      nonTerminalGotoStateTable.setGotoState(96, PseudoNonTerminalEnum.funcall, 100);
      nonTerminalGotoStateTable.setGotoState(98, PseudoNonTerminalEnum.funcall, 100);
      nonTerminalGotoStateTable.setGotoState(103, PseudoNonTerminalEnum.funcall, 100);
      nonTerminalGotoStateTable.setGotoState(115, PseudoNonTerminalEnum.funcall, 100);
      nonTerminalGotoStateTable.setGotoState(133, PseudoNonTerminalEnum.funcall, 100);
      nonTerminalGotoStateTable.setGotoState(138, PseudoNonTerminalEnum.funcall, 100);
      nonTerminalGotoStateTable.setGotoState(152, PseudoNonTerminalEnum.funcall, 100);
      nonTerminalGotoStateTable.setGotoState(165, PseudoNonTerminalEnum.funcall, 100);
      nonTerminalGotoStateTable.setGotoState(170, PseudoNonTerminalEnum.funcall, 100);
      nonTerminalGotoStateTable.setGotoState(174, PseudoNonTerminalEnum.funcall, 100);
      nonTerminalGotoStateTable.setGotoState(177, PseudoNonTerminalEnum.funcall, 100);
      nonTerminalGotoStateTable.setGotoState(180, PseudoNonTerminalEnum.funcall, 100);
      nonTerminalGotoStateTable.setGotoState(196, PseudoNonTerminalEnum.funcall, 100);
      nonTerminalGotoStateTable.setGotoState(200, PseudoNonTerminalEnum.funcall, 100);
      nonTerminalGotoStateTable.setGotoState(205, PseudoNonTerminalEnum.funcall, 209);
      nonTerminalGotoStateTable.setGotoState(211, PseudoNonTerminalEnum.funcall, 100);
      nonTerminalGotoStateTable.setGotoState(214, PseudoNonTerminalEnum.funcall, 221);
      nonTerminalGotoStateTable.setGotoState(223, PseudoNonTerminalEnum.funcall, 100);
      nonTerminalGotoStateTable.setGotoState(228, PseudoNonTerminalEnum.funcall, 100);
  }
  
    
  private static void init_start(NonTerminalGotoStateTable<PseudoNonTerminalEnum> nonTerminalGotoStateTable) {
       nonTerminalGotoStateTable.setGotoState(0, PseudoNonTerminalEnum.start, 1);
  }
  
    
  private static void init_loop_label_optional_8(NonTerminalGotoStateTable<PseudoNonTerminalEnum> nonTerminalGotoStateTable) {
       nonTerminalGotoStateTable.setGotoState(42, PseudoNonTerminalEnum.loop_label_optional_8, 192);
  }
  
    
  private static void init_function_def(NonTerminalGotoStateTable<PseudoNonTerminalEnum> nonTerminalGotoStateTable) {
       nonTerminalGotoStateTable.setGotoState(3, PseudoNonTerminalEnum.function_def, 252);
  }
  
    
  private static void init_array_creation(NonTerminalGotoStateTable<PseudoNonTerminalEnum> nonTerminalGotoStateTable) {
       nonTerminalGotoStateTable.setGotoState(42, PseudoNonTerminalEnum.array_creation, 101);
      nonTerminalGotoStateTable.setGotoState(44, PseudoNonTerminalEnum.array_creation, 101);
      nonTerminalGotoStateTable.setGotoState(47, PseudoNonTerminalEnum.array_creation, 101);
      nonTerminalGotoStateTable.setGotoState(49, PseudoNonTerminalEnum.array_creation, 101);
      nonTerminalGotoStateTable.setGotoState(51, PseudoNonTerminalEnum.array_creation, 101);
      nonTerminalGotoStateTable.setGotoState(52, PseudoNonTerminalEnum.array_creation, 101);
      nonTerminalGotoStateTable.setGotoState(59, PseudoNonTerminalEnum.array_creation, 101);
      nonTerminalGotoStateTable.setGotoState(60, PseudoNonTerminalEnum.array_creation, 101);
      nonTerminalGotoStateTable.setGotoState(63, PseudoNonTerminalEnum.array_creation, 101);
      nonTerminalGotoStateTable.setGotoState(68, PseudoNonTerminalEnum.array_creation, 101);
      nonTerminalGotoStateTable.setGotoState(70, PseudoNonTerminalEnum.array_creation, 101);
      nonTerminalGotoStateTable.setGotoState(72, PseudoNonTerminalEnum.array_creation, 101);
      nonTerminalGotoStateTable.setGotoState(74, PseudoNonTerminalEnum.array_creation, 101);
      nonTerminalGotoStateTable.setGotoState(76, PseudoNonTerminalEnum.array_creation, 101);
      nonTerminalGotoStateTable.setGotoState(78, PseudoNonTerminalEnum.array_creation, 101);
      nonTerminalGotoStateTable.setGotoState(80, PseudoNonTerminalEnum.array_creation, 101);
      nonTerminalGotoStateTable.setGotoState(82, PseudoNonTerminalEnum.array_creation, 101);
      nonTerminalGotoStateTable.setGotoState(84, PseudoNonTerminalEnum.array_creation, 101);
      nonTerminalGotoStateTable.setGotoState(86, PseudoNonTerminalEnum.array_creation, 101);
      nonTerminalGotoStateTable.setGotoState(88, PseudoNonTerminalEnum.array_creation, 101);
      nonTerminalGotoStateTable.setGotoState(90, PseudoNonTerminalEnum.array_creation, 101);
      nonTerminalGotoStateTable.setGotoState(92, PseudoNonTerminalEnum.array_creation, 101);
      nonTerminalGotoStateTable.setGotoState(94, PseudoNonTerminalEnum.array_creation, 101);
      nonTerminalGotoStateTable.setGotoState(96, PseudoNonTerminalEnum.array_creation, 101);
      nonTerminalGotoStateTable.setGotoState(98, PseudoNonTerminalEnum.array_creation, 101);
      nonTerminalGotoStateTable.setGotoState(103, PseudoNonTerminalEnum.array_creation, 101);
      nonTerminalGotoStateTable.setGotoState(115, PseudoNonTerminalEnum.array_creation, 101);
      nonTerminalGotoStateTable.setGotoState(133, PseudoNonTerminalEnum.array_creation, 101);
      nonTerminalGotoStateTable.setGotoState(138, PseudoNonTerminalEnum.array_creation, 101);
      nonTerminalGotoStateTable.setGotoState(152, PseudoNonTerminalEnum.array_creation, 101);
      nonTerminalGotoStateTable.setGotoState(165, PseudoNonTerminalEnum.array_creation, 101);
      nonTerminalGotoStateTable.setGotoState(170, PseudoNonTerminalEnum.array_creation, 101);
      nonTerminalGotoStateTable.setGotoState(174, PseudoNonTerminalEnum.array_creation, 101);
      nonTerminalGotoStateTable.setGotoState(177, PseudoNonTerminalEnum.array_creation, 101);
      nonTerminalGotoStateTable.setGotoState(180, PseudoNonTerminalEnum.array_creation, 101);
      nonTerminalGotoStateTable.setGotoState(196, PseudoNonTerminalEnum.array_creation, 101);
      nonTerminalGotoStateTable.setGotoState(200, PseudoNonTerminalEnum.array_creation, 101);
      nonTerminalGotoStateTable.setGotoState(205, PseudoNonTerminalEnum.array_creation, 101);
      nonTerminalGotoStateTable.setGotoState(211, PseudoNonTerminalEnum.array_creation, 101);
      nonTerminalGotoStateTable.setGotoState(214, PseudoNonTerminalEnum.array_creation, 101);
      nonTerminalGotoStateTable.setGotoState(223, PseudoNonTerminalEnum.array_creation, 101);
      nonTerminalGotoStateTable.setGotoState(228, PseudoNonTerminalEnum.array_creation, 101);
  }
  
    
  private static void init_id_optional_10(NonTerminalGotoStateTable<PseudoNonTerminalEnum> nonTerminalGotoStateTable) {
       nonTerminalGotoStateTable.setGotoState(159, PseudoNonTerminalEnum.id_optional_10, 161);
  }
  
    
  private static void init_record_init(NonTerminalGotoStateTable<PseudoNonTerminalEnum> nonTerminalGotoStateTable) {
       nonTerminalGotoStateTable.setGotoState(239, PseudoNonTerminalEnum.record_init, 245);
  }
  
    
  private static void init_type_star_0_sub(NonTerminalGotoStateTable<PseudoNonTerminalEnum> nonTerminalGotoStateTable) {
       nonTerminalGotoStateTable.setGotoState(10, PseudoNonTerminalEnum.type_star_0_sub, 24);
      nonTerminalGotoStateTable.setGotoState(174, PseudoNonTerminalEnum.type_star_0_sub, 24);
  }
  
    
  private static void init_for_loop_init(NonTerminalGotoStateTable<PseudoNonTerminalEnum> nonTerminalGotoStateTable) {
       nonTerminalGotoStateTable.setGotoState(205, PseudoNonTerminalEnum.for_loop_init, 208);
  }
  
    
  private static void init_dim_expr_plus_15(NonTerminalGotoStateTable<PseudoNonTerminalEnum> nonTerminalGotoStateTable) {
       nonTerminalGotoStateTable.setGotoState(142, PseudoNonTerminalEnum.dim_expr_plus_15, 144);
  }
  
    
  private static void init_for_loop_init_optional_12(NonTerminalGotoStateTable<PseudoNonTerminalEnum> nonTerminalGotoStateTable) {
       nonTerminalGotoStateTable.setGotoState(205, PseudoNonTerminalEnum.for_loop_init_optional_12, 210);
  }
  
    
  private static void init_array_access(NonTerminalGotoStateTable<PseudoNonTerminalEnum> nonTerminalGotoStateTable) {
       nonTerminalGotoStateTable.setGotoState(42, PseudoNonTerminalEnum.array_access, 191);
      nonTerminalGotoStateTable.setGotoState(44, PseudoNonTerminalEnum.array_access, 65);
      nonTerminalGotoStateTable.setGotoState(47, PseudoNonTerminalEnum.array_access, 65);
      nonTerminalGotoStateTable.setGotoState(49, PseudoNonTerminalEnum.array_access, 65);
      nonTerminalGotoStateTable.setGotoState(51, PseudoNonTerminalEnum.array_access, 65);
      nonTerminalGotoStateTable.setGotoState(52, PseudoNonTerminalEnum.array_access, 65);
      nonTerminalGotoStateTable.setGotoState(59, PseudoNonTerminalEnum.array_access, 65);
      nonTerminalGotoStateTable.setGotoState(60, PseudoNonTerminalEnum.array_access, 65);
      nonTerminalGotoStateTable.setGotoState(63, PseudoNonTerminalEnum.array_access, 65);
      nonTerminalGotoStateTable.setGotoState(68, PseudoNonTerminalEnum.array_access, 65);
      nonTerminalGotoStateTable.setGotoState(70, PseudoNonTerminalEnum.array_access, 65);
      nonTerminalGotoStateTable.setGotoState(72, PseudoNonTerminalEnum.array_access, 65);
      nonTerminalGotoStateTable.setGotoState(74, PseudoNonTerminalEnum.array_access, 65);
      nonTerminalGotoStateTable.setGotoState(76, PseudoNonTerminalEnum.array_access, 65);
      nonTerminalGotoStateTable.setGotoState(78, PseudoNonTerminalEnum.array_access, 65);
      nonTerminalGotoStateTable.setGotoState(80, PseudoNonTerminalEnum.array_access, 65);
      nonTerminalGotoStateTable.setGotoState(82, PseudoNonTerminalEnum.array_access, 65);
      nonTerminalGotoStateTable.setGotoState(84, PseudoNonTerminalEnum.array_access, 65);
      nonTerminalGotoStateTable.setGotoState(86, PseudoNonTerminalEnum.array_access, 65);
      nonTerminalGotoStateTable.setGotoState(88, PseudoNonTerminalEnum.array_access, 65);
      nonTerminalGotoStateTable.setGotoState(90, PseudoNonTerminalEnum.array_access, 65);
      nonTerminalGotoStateTable.setGotoState(92, PseudoNonTerminalEnum.array_access, 65);
      nonTerminalGotoStateTable.setGotoState(94, PseudoNonTerminalEnum.array_access, 65);
      nonTerminalGotoStateTable.setGotoState(96, PseudoNonTerminalEnum.array_access, 65);
      nonTerminalGotoStateTable.setGotoState(98, PseudoNonTerminalEnum.array_access, 65);
      nonTerminalGotoStateTable.setGotoState(103, PseudoNonTerminalEnum.array_access, 65);
      nonTerminalGotoStateTable.setGotoState(115, PseudoNonTerminalEnum.array_access, 65);
      nonTerminalGotoStateTable.setGotoState(133, PseudoNonTerminalEnum.array_access, 65);
      nonTerminalGotoStateTable.setGotoState(138, PseudoNonTerminalEnum.array_access, 65);
      nonTerminalGotoStateTable.setGotoState(152, PseudoNonTerminalEnum.array_access, 65);
      nonTerminalGotoStateTable.setGotoState(165, PseudoNonTerminalEnum.array_access, 65);
      nonTerminalGotoStateTable.setGotoState(170, PseudoNonTerminalEnum.array_access, 65);
      nonTerminalGotoStateTable.setGotoState(174, PseudoNonTerminalEnum.array_access, 65);
      nonTerminalGotoStateTable.setGotoState(177, PseudoNonTerminalEnum.array_access, 65);
      nonTerminalGotoStateTable.setGotoState(180, PseudoNonTerminalEnum.array_access, 65);
      nonTerminalGotoStateTable.setGotoState(196, PseudoNonTerminalEnum.array_access, 65);
      nonTerminalGotoStateTable.setGotoState(200, PseudoNonTerminalEnum.array_access, 65);
      nonTerminalGotoStateTable.setGotoState(205, PseudoNonTerminalEnum.array_access, 191);
      nonTerminalGotoStateTable.setGotoState(211, PseudoNonTerminalEnum.array_access, 65);
      nonTerminalGotoStateTable.setGotoState(214, PseudoNonTerminalEnum.array_access, 191);
      nonTerminalGotoStateTable.setGotoState(223, PseudoNonTerminalEnum.array_access, 65);
      nonTerminalGotoStateTable.setGotoState(228, PseudoNonTerminalEnum.array_access, 65);
  }
  
    
  private static void init_for_loop_incr(NonTerminalGotoStateTable<PseudoNonTerminalEnum> nonTerminalGotoStateTable) {
       nonTerminalGotoStateTable.setGotoState(214, PseudoNonTerminalEnum.for_loop_incr, 216);
  }
  
    
  private static void init_dim_expr(NonTerminalGotoStateTable<PseudoNonTerminalEnum> nonTerminalGotoStateTable) {
       nonTerminalGotoStateTable.setGotoState(46, PseudoNonTerminalEnum.dim_expr, 136);
      nonTerminalGotoStateTable.setGotoState(137, PseudoNonTerminalEnum.dim_expr, 140);
      nonTerminalGotoStateTable.setGotoState(142, PseudoNonTerminalEnum.dim_expr, 143);
      nonTerminalGotoStateTable.setGotoState(144, PseudoNonTerminalEnum.dim_expr, 146);
  }
  
    
  private static void init_assignation(NonTerminalGotoStateTable<PseudoNonTerminalEnum> nonTerminalGotoStateTable) {
       nonTerminalGotoStateTable.setGotoState(42, PseudoNonTerminalEnum.assignation, 231);
      nonTerminalGotoStateTable.setGotoState(205, PseudoNonTerminalEnum.assignation, 225);
      nonTerminalGotoStateTable.setGotoState(214, PseudoNonTerminalEnum.assignation, 220);
  }
  
    
  private static void init_arguments(NonTerminalGotoStateTable<PseudoNonTerminalEnum> nonTerminalGotoStateTable) {
       nonTerminalGotoStateTable.setGotoState(47, PseudoNonTerminalEnum.arguments, 131);
      nonTerminalGotoStateTable.setGotoState(63, PseudoNonTerminalEnum.arguments, 111);
      nonTerminalGotoStateTable.setGotoState(70, PseudoNonTerminalEnum.arguments, 105);
  }
  
    
  private static void init_type_star_0(NonTerminalGotoStateTable<PseudoNonTerminalEnum> nonTerminalGotoStateTable) {
       nonTerminalGotoStateTable.setGotoState(10, PseudoNonTerminalEnum.type_star_0, 28);
      nonTerminalGotoStateTable.setGotoState(174, PseudoNonTerminalEnum.type_star_0, 28);
  }
  
    
  private static void init_record_def(NonTerminalGotoStateTable<PseudoNonTerminalEnum> nonTerminalGotoStateTable) {
       nonTerminalGotoStateTable.setGotoState(3, PseudoNonTerminalEnum.record_def, 255);
  }
  
    
  private static void init_id_optional_9(NonTerminalGotoStateTable<PseudoNonTerminalEnum> nonTerminalGotoStateTable) {
       nonTerminalGotoStateTable.setGotoState(166, PseudoNonTerminalEnum.id_optional_9, 168);
  }
  
    
  private static void init_parameter_star_5_sub(NonTerminalGotoStateTable<PseudoNonTerminalEnum> nonTerminalGotoStateTable) {
       nonTerminalGotoStateTable.setGotoState(6, PseudoNonTerminalEnum.parameter_star_5_sub, 122);
      nonTerminalGotoStateTable.setGotoState(56, PseudoNonTerminalEnum.parameter_star_5_sub, 122);
      nonTerminalGotoStateTable.setGotoState(241, PseudoNonTerminalEnum.parameter_star_5_sub, 122);
  }
  
    
  private static void init_for_loop_incr_optional_14(NonTerminalGotoStateTable<PseudoNonTerminalEnum> nonTerminalGotoStateTable) {
       nonTerminalGotoStateTable.setGotoState(214, PseudoNonTerminalEnum.for_loop_incr_optional_14, 217);
  }
  
    
  private static void init_expr_optional_11(NonTerminalGotoStateTable<PseudoNonTerminalEnum> nonTerminalGotoStateTable) {
       nonTerminalGotoStateTable.setGotoState(170, PseudoNonTerminalEnum.expr_optional_11, 171);
  }
  
    
  private static void init_dim_expr_plus_16(NonTerminalGotoStateTable<PseudoNonTerminalEnum> nonTerminalGotoStateTable) {
       nonTerminalGotoStateTable.setGotoState(46, PseudoNonTerminalEnum.dim_expr_plus_16, 137);
  }
  
    
  private static void init_script_member(NonTerminalGotoStateTable<PseudoNonTerminalEnum> nonTerminalGotoStateTable) {
       nonTerminalGotoStateTable.setGotoState(3, PseudoNonTerminalEnum.script_member, 253);
  }
  
    
  private static void init_script_member_star_1(NonTerminalGotoStateTable<PseudoNonTerminalEnum> nonTerminalGotoStateTable) {
       nonTerminalGotoStateTable.setGotoState(0, PseudoNonTerminalEnum.script_member_star_1, 3);
  }
  
    
  private static void init_field_star_2(NonTerminalGotoStateTable<PseudoNonTerminalEnum> nonTerminalGotoStateTable) {
       nonTerminalGotoStateTable.setGotoState(238, PseudoNonTerminalEnum.field_star_2, 239);
  }
  
    
  private static void init_dims(NonTerminalGotoStateTable<PseudoNonTerminalEnum> nonTerminalGotoStateTable) {
       nonTerminalGotoStateTable.setGotoState(13, PseudoNonTerminalEnum.dims, 16);
      nonTerminalGotoStateTable.setGotoState(20, PseudoNonTerminalEnum.dims, 21);
      nonTerminalGotoStateTable.setGotoState(22, PseudoNonTerminalEnum.dims, 23);
      nonTerminalGotoStateTable.setGotoState(34, PseudoNonTerminalEnum.dims, 16);
      nonTerminalGotoStateTable.setGotoState(137, PseudoNonTerminalEnum.dims, 141);
      nonTerminalGotoStateTable.setGotoState(144, PseudoNonTerminalEnum.dims, 141);
      nonTerminalGotoStateTable.setGotoState(163, PseudoNonTerminalEnum.dims, 16);
      nonTerminalGotoStateTable.setGotoState(175, PseudoNonTerminalEnum.dims, 16);
      nonTerminalGotoStateTable.setGotoState(206, PseudoNonTerminalEnum.dims, 16);
  }
  
    
  private static void init_record_init_optional_3(NonTerminalGotoStateTable<PseudoNonTerminalEnum> nonTerminalGotoStateTable) {
       nonTerminalGotoStateTable.setGotoState(239, PseudoNonTerminalEnum.record_init_optional_3, 250);
  }
  
    
  private static void init_parameters(NonTerminalGotoStateTable<PseudoNonTerminalEnum> nonTerminalGotoStateTable) {
       nonTerminalGotoStateTable.setGotoState(6, PseudoNonTerminalEnum.parameters, 35);
      nonTerminalGotoStateTable.setGotoState(56, PseudoNonTerminalEnum.parameters, 57);
      nonTerminalGotoStateTable.setGotoState(241, PseudoNonTerminalEnum.parameters, 242);
  }
  
    
  private static void init_function_rtype(NonTerminalGotoStateTable<PseudoNonTerminalEnum> nonTerminalGotoStateTable) {
       nonTerminalGotoStateTable.setGotoState(36, PseudoNonTerminalEnum.function_rtype, 39);
  }
  
    
  private static void init_primitive_type(NonTerminalGotoStateTable<PseudoNonTerminalEnum> nonTerminalGotoStateTable) {
       nonTerminalGotoStateTable.setGotoState(6, PseudoNonTerminalEnum.primitive_type, 20);
      nonTerminalGotoStateTable.setGotoState(10, PseudoNonTerminalEnum.primitive_type, 20);
      nonTerminalGotoStateTable.setGotoState(25, PseudoNonTerminalEnum.primitive_type, 20);
      nonTerminalGotoStateTable.setGotoState(29, PseudoNonTerminalEnum.primitive_type, 20);
      nonTerminalGotoStateTable.setGotoState(37, PseudoNonTerminalEnum.primitive_type, 20);
      nonTerminalGotoStateTable.setGotoState(42, PseudoNonTerminalEnum.primitive_type, 20);
      nonTerminalGotoStateTable.setGotoState(45, PseudoNonTerminalEnum.primitive_type, 142);
      nonTerminalGotoStateTable.setGotoState(56, PseudoNonTerminalEnum.primitive_type, 20);
      nonTerminalGotoStateTable.setGotoState(123, PseudoNonTerminalEnum.primitive_type, 20);
      nonTerminalGotoStateTable.setGotoState(174, PseudoNonTerminalEnum.primitive_type, 20);
      nonTerminalGotoStateTable.setGotoState(205, PseudoNonTerminalEnum.primitive_type, 20);
      nonTerminalGotoStateTable.setGotoState(239, PseudoNonTerminalEnum.primitive_type, 20);
      nonTerminalGotoStateTable.setGotoState(241, PseudoNonTerminalEnum.primitive_type, 20);
  }
  
    
  private static void init_loop(NonTerminalGotoStateTable<PseudoNonTerminalEnum> nonTerminalGotoStateTable) {
       nonTerminalGotoStateTable.setGotoState(192, PseudoNonTerminalEnum.loop, 230);
  }
  
    
  private static void init_expr(NonTerminalGotoStateTable<PseudoNonTerminalEnum> nonTerminalGotoStateTable) {
       nonTerminalGotoStateTable.setGotoState(44, PseudoNonTerminalEnum.expr, 147);
      nonTerminalGotoStateTable.setGotoState(47, PseudoNonTerminalEnum.expr, 71);
      nonTerminalGotoStateTable.setGotoState(49, PseudoNonTerminalEnum.expr, 130);
      nonTerminalGotoStateTable.setGotoState(51, PseudoNonTerminalEnum.expr, 129);
      nonTerminalGotoStateTable.setGotoState(52, PseudoNonTerminalEnum.expr, 128);
      nonTerminalGotoStateTable.setGotoState(59, PseudoNonTerminalEnum.expr, 120);
      nonTerminalGotoStateTable.setGotoState(60, PseudoNonTerminalEnum.expr, 118);
      nonTerminalGotoStateTable.setGotoState(63, PseudoNonTerminalEnum.expr, 71);
      nonTerminalGotoStateTable.setGotoState(68, PseudoNonTerminalEnum.expr, 109);
      nonTerminalGotoStateTable.setGotoState(70, PseudoNonTerminalEnum.expr, 71);
      nonTerminalGotoStateTable.setGotoState(72, PseudoNonTerminalEnum.expr, 73);
      nonTerminalGotoStateTable.setGotoState(74, PseudoNonTerminalEnum.expr, 75);
      nonTerminalGotoStateTable.setGotoState(76, PseudoNonTerminalEnum.expr, 77);
      nonTerminalGotoStateTable.setGotoState(78, PseudoNonTerminalEnum.expr, 79);
      nonTerminalGotoStateTable.setGotoState(80, PseudoNonTerminalEnum.expr, 81);
      nonTerminalGotoStateTable.setGotoState(82, PseudoNonTerminalEnum.expr, 83);
      nonTerminalGotoStateTable.setGotoState(84, PseudoNonTerminalEnum.expr, 85);
      nonTerminalGotoStateTable.setGotoState(86, PseudoNonTerminalEnum.expr, 87);
      nonTerminalGotoStateTable.setGotoState(88, PseudoNonTerminalEnum.expr, 89);
      nonTerminalGotoStateTable.setGotoState(90, PseudoNonTerminalEnum.expr, 91);
      nonTerminalGotoStateTable.setGotoState(92, PseudoNonTerminalEnum.expr, 93);
      nonTerminalGotoStateTable.setGotoState(94, PseudoNonTerminalEnum.expr, 95);
      nonTerminalGotoStateTable.setGotoState(96, PseudoNonTerminalEnum.expr, 97);
      nonTerminalGotoStateTable.setGotoState(98, PseudoNonTerminalEnum.expr, 99);
      nonTerminalGotoStateTable.setGotoState(103, PseudoNonTerminalEnum.expr, 104);
      nonTerminalGotoStateTable.setGotoState(115, PseudoNonTerminalEnum.expr, 116);
      nonTerminalGotoStateTable.setGotoState(133, PseudoNonTerminalEnum.expr, 134);
      nonTerminalGotoStateTable.setGotoState(138, PseudoNonTerminalEnum.expr, 134);
      nonTerminalGotoStateTable.setGotoState(165, PseudoNonTerminalEnum.expr, 116);
      nonTerminalGotoStateTable.setGotoState(170, PseudoNonTerminalEnum.expr, 173);
      nonTerminalGotoStateTable.setGotoState(174, PseudoNonTerminalEnum.expr, 118);
      nonTerminalGotoStateTable.setGotoState(177, PseudoNonTerminalEnum.expr, 178);
      nonTerminalGotoStateTable.setGotoState(180, PseudoNonTerminalEnum.expr, 181);
      nonTerminalGotoStateTable.setGotoState(196, PseudoNonTerminalEnum.expr, 197);
      nonTerminalGotoStateTable.setGotoState(200, PseudoNonTerminalEnum.expr, 201);
      nonTerminalGotoStateTable.setGotoState(211, PseudoNonTerminalEnum.expr, 212);
      nonTerminalGotoStateTable.setGotoState(223, PseudoNonTerminalEnum.expr, 224);
      nonTerminalGotoStateTable.setGotoState(228, PseudoNonTerminalEnum.expr, 229);
  }
  
    
  private static void init_return_type(NonTerminalGotoStateTable<PseudoNonTerminalEnum> nonTerminalGotoStateTable) {
       nonTerminalGotoStateTable.setGotoState(29, PseudoNonTerminalEnum.return_type, 32);
      nonTerminalGotoStateTable.setGotoState(37, PseudoNonTerminalEnum.return_type, 38);
  }
  
    
  private static void init_field(NonTerminalGotoStateTable<PseudoNonTerminalEnum> nonTerminalGotoStateTable) {
       nonTerminalGotoStateTable.setGotoState(239, PseudoNonTerminalEnum.field, 249);
  }
  
    
  private static void init_instr(NonTerminalGotoStateTable<PseudoNonTerminalEnum> nonTerminalGotoStateTable) {
       nonTerminalGotoStateTable.setGotoState(42, PseudoNonTerminalEnum.instr, 183);
  }
  
    
  private static void init_expr_star_6(NonTerminalGotoStateTable<PseudoNonTerminalEnum> nonTerminalGotoStateTable) {
       nonTerminalGotoStateTable.setGotoState(47, PseudoNonTerminalEnum.expr_star_6, 66);
      nonTerminalGotoStateTable.setGotoState(63, PseudoNonTerminalEnum.expr_star_6, 66);
      nonTerminalGotoStateTable.setGotoState(70, PseudoNonTerminalEnum.expr_star_6, 66);
  }
  
    
  private static void init_primary_no_array_creation(NonTerminalGotoStateTable<PseudoNonTerminalEnum> nonTerminalGotoStateTable) {
       nonTerminalGotoStateTable.setGotoState(42, PseudoNonTerminalEnum.primary_no_array_creation, 67);
      nonTerminalGotoStateTable.setGotoState(44, PseudoNonTerminalEnum.primary_no_array_creation, 67);
      nonTerminalGotoStateTable.setGotoState(47, PseudoNonTerminalEnum.primary_no_array_creation, 67);
      nonTerminalGotoStateTable.setGotoState(49, PseudoNonTerminalEnum.primary_no_array_creation, 67);
      nonTerminalGotoStateTable.setGotoState(51, PseudoNonTerminalEnum.primary_no_array_creation, 67);
      nonTerminalGotoStateTable.setGotoState(52, PseudoNonTerminalEnum.primary_no_array_creation, 67);
      nonTerminalGotoStateTable.setGotoState(59, PseudoNonTerminalEnum.primary_no_array_creation, 67);
      nonTerminalGotoStateTable.setGotoState(60, PseudoNonTerminalEnum.primary_no_array_creation, 67);
      nonTerminalGotoStateTable.setGotoState(63, PseudoNonTerminalEnum.primary_no_array_creation, 67);
      nonTerminalGotoStateTable.setGotoState(68, PseudoNonTerminalEnum.primary_no_array_creation, 67);
      nonTerminalGotoStateTable.setGotoState(70, PseudoNonTerminalEnum.primary_no_array_creation, 67);
      nonTerminalGotoStateTable.setGotoState(72, PseudoNonTerminalEnum.primary_no_array_creation, 67);
      nonTerminalGotoStateTable.setGotoState(74, PseudoNonTerminalEnum.primary_no_array_creation, 67);
      nonTerminalGotoStateTable.setGotoState(76, PseudoNonTerminalEnum.primary_no_array_creation, 67);
      nonTerminalGotoStateTable.setGotoState(78, PseudoNonTerminalEnum.primary_no_array_creation, 67);
      nonTerminalGotoStateTable.setGotoState(80, PseudoNonTerminalEnum.primary_no_array_creation, 67);
      nonTerminalGotoStateTable.setGotoState(82, PseudoNonTerminalEnum.primary_no_array_creation, 67);
      nonTerminalGotoStateTable.setGotoState(84, PseudoNonTerminalEnum.primary_no_array_creation, 67);
      nonTerminalGotoStateTable.setGotoState(86, PseudoNonTerminalEnum.primary_no_array_creation, 67);
      nonTerminalGotoStateTable.setGotoState(88, PseudoNonTerminalEnum.primary_no_array_creation, 67);
      nonTerminalGotoStateTable.setGotoState(90, PseudoNonTerminalEnum.primary_no_array_creation, 67);
      nonTerminalGotoStateTable.setGotoState(92, PseudoNonTerminalEnum.primary_no_array_creation, 67);
      nonTerminalGotoStateTable.setGotoState(94, PseudoNonTerminalEnum.primary_no_array_creation, 67);
      nonTerminalGotoStateTable.setGotoState(96, PseudoNonTerminalEnum.primary_no_array_creation, 67);
      nonTerminalGotoStateTable.setGotoState(98, PseudoNonTerminalEnum.primary_no_array_creation, 67);
      nonTerminalGotoStateTable.setGotoState(103, PseudoNonTerminalEnum.primary_no_array_creation, 67);
      nonTerminalGotoStateTable.setGotoState(115, PseudoNonTerminalEnum.primary_no_array_creation, 67);
      nonTerminalGotoStateTable.setGotoState(133, PseudoNonTerminalEnum.primary_no_array_creation, 67);
      nonTerminalGotoStateTable.setGotoState(138, PseudoNonTerminalEnum.primary_no_array_creation, 67);
      nonTerminalGotoStateTable.setGotoState(152, PseudoNonTerminalEnum.primary_no_array_creation, 67);
      nonTerminalGotoStateTable.setGotoState(165, PseudoNonTerminalEnum.primary_no_array_creation, 67);
      nonTerminalGotoStateTable.setGotoState(170, PseudoNonTerminalEnum.primary_no_array_creation, 67);
      nonTerminalGotoStateTable.setGotoState(174, PseudoNonTerminalEnum.primary_no_array_creation, 67);
      nonTerminalGotoStateTable.setGotoState(177, PseudoNonTerminalEnum.primary_no_array_creation, 67);
      nonTerminalGotoStateTable.setGotoState(180, PseudoNonTerminalEnum.primary_no_array_creation, 67);
      nonTerminalGotoStateTable.setGotoState(196, PseudoNonTerminalEnum.primary_no_array_creation, 67);
      nonTerminalGotoStateTable.setGotoState(200, PseudoNonTerminalEnum.primary_no_array_creation, 67);
      nonTerminalGotoStateTable.setGotoState(205, PseudoNonTerminalEnum.primary_no_array_creation, 67);
      nonTerminalGotoStateTable.setGotoState(211, PseudoNonTerminalEnum.primary_no_array_creation, 67);
      nonTerminalGotoStateTable.setGotoState(214, PseudoNonTerminalEnum.primary_no_array_creation, 67);
      nonTerminalGotoStateTable.setGotoState(223, PseudoNonTerminalEnum.primary_no_array_creation, 67);
      nonTerminalGotoStateTable.setGotoState(228, PseudoNonTerminalEnum.primary_no_array_creation, 67);
  }
  
    
  private static void init_primary(NonTerminalGotoStateTable<PseudoNonTerminalEnum> nonTerminalGotoStateTable) {
       nonTerminalGotoStateTable.setGotoState(42, PseudoNonTerminalEnum.primary, 186);
      nonTerminalGotoStateTable.setGotoState(44, PseudoNonTerminalEnum.primary, 69);
      nonTerminalGotoStateTable.setGotoState(47, PseudoNonTerminalEnum.primary, 69);
      nonTerminalGotoStateTable.setGotoState(49, PseudoNonTerminalEnum.primary, 69);
      nonTerminalGotoStateTable.setGotoState(51, PseudoNonTerminalEnum.primary, 69);
      nonTerminalGotoStateTable.setGotoState(52, PseudoNonTerminalEnum.primary, 69);
      nonTerminalGotoStateTable.setGotoState(59, PseudoNonTerminalEnum.primary, 69);
      nonTerminalGotoStateTable.setGotoState(60, PseudoNonTerminalEnum.primary, 69);
      nonTerminalGotoStateTable.setGotoState(63, PseudoNonTerminalEnum.primary, 69);
      nonTerminalGotoStateTable.setGotoState(68, PseudoNonTerminalEnum.primary, 69);
      nonTerminalGotoStateTable.setGotoState(70, PseudoNonTerminalEnum.primary, 69);
      nonTerminalGotoStateTable.setGotoState(72, PseudoNonTerminalEnum.primary, 69);
      nonTerminalGotoStateTable.setGotoState(74, PseudoNonTerminalEnum.primary, 69);
      nonTerminalGotoStateTable.setGotoState(76, PseudoNonTerminalEnum.primary, 69);
      nonTerminalGotoStateTable.setGotoState(78, PseudoNonTerminalEnum.primary, 69);
      nonTerminalGotoStateTable.setGotoState(80, PseudoNonTerminalEnum.primary, 69);
      nonTerminalGotoStateTable.setGotoState(82, PseudoNonTerminalEnum.primary, 69);
      nonTerminalGotoStateTable.setGotoState(84, PseudoNonTerminalEnum.primary, 69);
      nonTerminalGotoStateTable.setGotoState(86, PseudoNonTerminalEnum.primary, 69);
      nonTerminalGotoStateTable.setGotoState(88, PseudoNonTerminalEnum.primary, 69);
      nonTerminalGotoStateTable.setGotoState(90, PseudoNonTerminalEnum.primary, 69);
      nonTerminalGotoStateTable.setGotoState(92, PseudoNonTerminalEnum.primary, 69);
      nonTerminalGotoStateTable.setGotoState(94, PseudoNonTerminalEnum.primary, 69);
      nonTerminalGotoStateTable.setGotoState(96, PseudoNonTerminalEnum.primary, 69);
      nonTerminalGotoStateTable.setGotoState(98, PseudoNonTerminalEnum.primary, 69);
      nonTerminalGotoStateTable.setGotoState(103, PseudoNonTerminalEnum.primary, 69);
      nonTerminalGotoStateTable.setGotoState(115, PseudoNonTerminalEnum.primary, 69);
      nonTerminalGotoStateTable.setGotoState(133, PseudoNonTerminalEnum.primary, 69);
      nonTerminalGotoStateTable.setGotoState(138, PseudoNonTerminalEnum.primary, 69);
      nonTerminalGotoStateTable.setGotoState(152, PseudoNonTerminalEnum.primary, 154);
      nonTerminalGotoStateTable.setGotoState(165, PseudoNonTerminalEnum.primary, 69);
      nonTerminalGotoStateTable.setGotoState(170, PseudoNonTerminalEnum.primary, 69);
      nonTerminalGotoStateTable.setGotoState(174, PseudoNonTerminalEnum.primary, 69);
      nonTerminalGotoStateTable.setGotoState(177, PseudoNonTerminalEnum.primary, 69);
      nonTerminalGotoStateTable.setGotoState(180, PseudoNonTerminalEnum.primary, 69);
      nonTerminalGotoStateTable.setGotoState(196, PseudoNonTerminalEnum.primary, 69);
      nonTerminalGotoStateTable.setGotoState(200, PseudoNonTerminalEnum.primary, 69);
      nonTerminalGotoStateTable.setGotoState(205, PseudoNonTerminalEnum.primary, 186);
      nonTerminalGotoStateTable.setGotoState(211, PseudoNonTerminalEnum.primary, 69);
      nonTerminalGotoStateTable.setGotoState(214, PseudoNonTerminalEnum.primary, 186);
      nonTerminalGotoStateTable.setGotoState(223, PseudoNonTerminalEnum.primary, 69);
      nonTerminalGotoStateTable.setGotoState(228, PseudoNonTerminalEnum.primary, 69);
  }
  
    
  private static void init_block(NonTerminalGotoStateTable<PseudoNonTerminalEnum> nonTerminalGotoStateTable) {
       nonTerminalGotoStateTable.setGotoState(3, PseudoNonTerminalEnum.block, 254);
      nonTerminalGotoStateTable.setGotoState(40, PseudoNonTerminalEnum.block, 235);
      nonTerminalGotoStateTable.setGotoState(42, PseudoNonTerminalEnum.block, 187);
      nonTerminalGotoStateTable.setGotoState(148, PseudoNonTerminalEnum.block, 149);
      nonTerminalGotoStateTable.setGotoState(150, PseudoNonTerminalEnum.block, 151);
      nonTerminalGotoStateTable.setGotoState(193, PseudoNonTerminalEnum.block, 194);
      nonTerminalGotoStateTable.setGotoState(202, PseudoNonTerminalEnum.block, 203);
      nonTerminalGotoStateTable.setGotoState(218, PseudoNonTerminalEnum.block, 219);
      nonTerminalGotoStateTable.setGotoState(243, PseudoNonTerminalEnum.block, 244);
  }
  
    
  private static void init_semis(NonTerminalGotoStateTable<PseudoNonTerminalEnum> nonTerminalGotoStateTable) {
       nonTerminalGotoStateTable.setGotoState(154, PseudoNonTerminalEnum.semis, 157);
      nonTerminalGotoStateTable.setGotoState(161, PseudoNonTerminalEnum.semis, 162);
      nonTerminalGotoStateTable.setGotoState(168, PseudoNonTerminalEnum.semis, 169);
      nonTerminalGotoStateTable.setGotoState(171, PseudoNonTerminalEnum.semis, 172);
      nonTerminalGotoStateTable.setGotoState(178, PseudoNonTerminalEnum.semis, 179);
      nonTerminalGotoStateTable.setGotoState(181, PseudoNonTerminalEnum.semis, 182);
      nonTerminalGotoStateTable.setGotoState(184, PseudoNonTerminalEnum.semis, 185);
      nonTerminalGotoStateTable.setGotoState(188, PseudoNonTerminalEnum.semis, 189);
      nonTerminalGotoStateTable.setGotoState(231, PseudoNonTerminalEnum.semis, 232);
      nonTerminalGotoStateTable.setGotoState(247, PseudoNonTerminalEnum.semis, 248);
  }
  
    
  private static void init_field_access(NonTerminalGotoStateTable<PseudoNonTerminalEnum> nonTerminalGotoStateTable) {
       nonTerminalGotoStateTable.setGotoState(42, PseudoNonTerminalEnum.field_access, 190);
      nonTerminalGotoStateTable.setGotoState(44, PseudoNonTerminalEnum.field_access, 64);
      nonTerminalGotoStateTable.setGotoState(47, PseudoNonTerminalEnum.field_access, 64);
      nonTerminalGotoStateTable.setGotoState(49, PseudoNonTerminalEnum.field_access, 64);
      nonTerminalGotoStateTable.setGotoState(51, PseudoNonTerminalEnum.field_access, 64);
      nonTerminalGotoStateTable.setGotoState(52, PseudoNonTerminalEnum.field_access, 64);
      nonTerminalGotoStateTable.setGotoState(59, PseudoNonTerminalEnum.field_access, 64);
      nonTerminalGotoStateTable.setGotoState(60, PseudoNonTerminalEnum.field_access, 64);
      nonTerminalGotoStateTable.setGotoState(63, PseudoNonTerminalEnum.field_access, 64);
      nonTerminalGotoStateTable.setGotoState(68, PseudoNonTerminalEnum.field_access, 64);
      nonTerminalGotoStateTable.setGotoState(70, PseudoNonTerminalEnum.field_access, 64);
      nonTerminalGotoStateTable.setGotoState(72, PseudoNonTerminalEnum.field_access, 64);
      nonTerminalGotoStateTable.setGotoState(74, PseudoNonTerminalEnum.field_access, 64);
      nonTerminalGotoStateTable.setGotoState(76, PseudoNonTerminalEnum.field_access, 64);
      nonTerminalGotoStateTable.setGotoState(78, PseudoNonTerminalEnum.field_access, 64);
      nonTerminalGotoStateTable.setGotoState(80, PseudoNonTerminalEnum.field_access, 64);
      nonTerminalGotoStateTable.setGotoState(82, PseudoNonTerminalEnum.field_access, 64);
      nonTerminalGotoStateTable.setGotoState(84, PseudoNonTerminalEnum.field_access, 64);
      nonTerminalGotoStateTable.setGotoState(86, PseudoNonTerminalEnum.field_access, 64);
      nonTerminalGotoStateTable.setGotoState(88, PseudoNonTerminalEnum.field_access, 64);
      nonTerminalGotoStateTable.setGotoState(90, PseudoNonTerminalEnum.field_access, 64);
      nonTerminalGotoStateTable.setGotoState(92, PseudoNonTerminalEnum.field_access, 64);
      nonTerminalGotoStateTable.setGotoState(94, PseudoNonTerminalEnum.field_access, 64);
      nonTerminalGotoStateTable.setGotoState(96, PseudoNonTerminalEnum.field_access, 64);
      nonTerminalGotoStateTable.setGotoState(98, PseudoNonTerminalEnum.field_access, 64);
      nonTerminalGotoStateTable.setGotoState(103, PseudoNonTerminalEnum.field_access, 64);
      nonTerminalGotoStateTable.setGotoState(115, PseudoNonTerminalEnum.field_access, 64);
      nonTerminalGotoStateTable.setGotoState(133, PseudoNonTerminalEnum.field_access, 64);
      nonTerminalGotoStateTable.setGotoState(138, PseudoNonTerminalEnum.field_access, 64);
      nonTerminalGotoStateTable.setGotoState(152, PseudoNonTerminalEnum.field_access, 64);
      nonTerminalGotoStateTable.setGotoState(165, PseudoNonTerminalEnum.field_access, 64);
      nonTerminalGotoStateTable.setGotoState(170, PseudoNonTerminalEnum.field_access, 64);
      nonTerminalGotoStateTable.setGotoState(174, PseudoNonTerminalEnum.field_access, 64);
      nonTerminalGotoStateTable.setGotoState(177, PseudoNonTerminalEnum.field_access, 64);
      nonTerminalGotoStateTable.setGotoState(180, PseudoNonTerminalEnum.field_access, 64);
      nonTerminalGotoStateTable.setGotoState(196, PseudoNonTerminalEnum.field_access, 64);
      nonTerminalGotoStateTable.setGotoState(200, PseudoNonTerminalEnum.field_access, 64);
      nonTerminalGotoStateTable.setGotoState(205, PseudoNonTerminalEnum.field_access, 190);
      nonTerminalGotoStateTable.setGotoState(211, PseudoNonTerminalEnum.field_access, 64);
      nonTerminalGotoStateTable.setGotoState(214, PseudoNonTerminalEnum.field_access, 190);
      nonTerminalGotoStateTable.setGotoState(223, PseudoNonTerminalEnum.field_access, 64);
      nonTerminalGotoStateTable.setGotoState(228, PseudoNonTerminalEnum.field_access, 64);
  }
  
    
  private static void init_expr_optional_13(NonTerminalGotoStateTable<PseudoNonTerminalEnum> nonTerminalGotoStateTable) {
       nonTerminalGotoStateTable.setGotoState(211, PseudoNonTerminalEnum.expr_optional_13, 213);
  }
  
    
  private static void init_loop_label(NonTerminalGotoStateTable<PseudoNonTerminalEnum> nonTerminalGotoStateTable) {
       nonTerminalGotoStateTable.setGotoState(42, PseudoNonTerminalEnum.loop_label, 233);
  }
  
    
  private static void init_type(NonTerminalGotoStateTable<PseudoNonTerminalEnum> nonTerminalGotoStateTable) {
       nonTerminalGotoStateTable.setGotoState(6, PseudoNonTerminalEnum.type, 124);
      nonTerminalGotoStateTable.setGotoState(10, PseudoNonTerminalEnum.type, 27);
      nonTerminalGotoStateTable.setGotoState(25, PseudoNonTerminalEnum.type, 26);
      nonTerminalGotoStateTable.setGotoState(29, PseudoNonTerminalEnum.type, 31);
      nonTerminalGotoStateTable.setGotoState(37, PseudoNonTerminalEnum.type, 31);
      nonTerminalGotoStateTable.setGotoState(42, PseudoNonTerminalEnum.type, 226);
      nonTerminalGotoStateTable.setGotoState(56, PseudoNonTerminalEnum.type, 124);
      nonTerminalGotoStateTable.setGotoState(123, PseudoNonTerminalEnum.type, 124);
      nonTerminalGotoStateTable.setGotoState(174, PseudoNonTerminalEnum.type, 27);
      nonTerminalGotoStateTable.setGotoState(205, PseudoNonTerminalEnum.type, 226);
      nonTerminalGotoStateTable.setGotoState(239, PseudoNonTerminalEnum.type, 246);
      nonTerminalGotoStateTable.setGotoState(241, PseudoNonTerminalEnum.type, 124);
  }
  
    
  private static void init_lhs(NonTerminalGotoStateTable<PseudoNonTerminalEnum> nonTerminalGotoStateTable) {
       nonTerminalGotoStateTable.setGotoState(42, PseudoNonTerminalEnum.lhs, 222);
      nonTerminalGotoStateTable.setGotoState(205, PseudoNonTerminalEnum.lhs, 222);
      nonTerminalGotoStateTable.setGotoState(214, PseudoNonTerminalEnum.lhs, 222);
  }
  
    
  private static void init_conditional(NonTerminalGotoStateTable<PseudoNonTerminalEnum> nonTerminalGotoStateTable) {
       nonTerminalGotoStateTable.setGotoState(42, PseudoNonTerminalEnum.conditional, 234);
  }
  
    
  private static void init_instr_star_7(NonTerminalGotoStateTable<PseudoNonTerminalEnum> nonTerminalGotoStateTable) {
       nonTerminalGotoStateTable.setGotoState(41, PseudoNonTerminalEnum.instr_star_7, 42);
  }
  
  
  public static NonTerminalGotoStateTable<PseudoNonTerminalEnum> create() {
     NonTerminalGotoStateTable<PseudoNonTerminalEnum> nonTerminalGotoStateTable=
       new NonTerminalGotoStateTable<PseudoNonTerminalEnum>(256);
     init_dims_opt(nonTerminalGotoStateTable);
         init_parameter_star_5(nonTerminalGotoStateTable);
         init_funtype(nonTerminalGotoStateTable);
         init_declaration(nonTerminalGotoStateTable);
         init_expr_star_6_sub(nonTerminalGotoStateTable);
         init_function_rtype_optional_4(nonTerminalGotoStateTable);
         init_parameter(nonTerminalGotoStateTable);
         init_funcall(nonTerminalGotoStateTable);
         init_start(nonTerminalGotoStateTable);
         init_loop_label_optional_8(nonTerminalGotoStateTable);
         init_function_def(nonTerminalGotoStateTable);
         init_array_creation(nonTerminalGotoStateTable);
         init_id_optional_10(nonTerminalGotoStateTable);
         init_record_init(nonTerminalGotoStateTable);
         init_type_star_0_sub(nonTerminalGotoStateTable);
         init_for_loop_init(nonTerminalGotoStateTable);
         init_dim_expr_plus_15(nonTerminalGotoStateTable);
         init_for_loop_init_optional_12(nonTerminalGotoStateTable);
         init_array_access(nonTerminalGotoStateTable);
         init_for_loop_incr(nonTerminalGotoStateTable);
         init_dim_expr(nonTerminalGotoStateTable);
         init_assignation(nonTerminalGotoStateTable);
         init_arguments(nonTerminalGotoStateTable);
         init_type_star_0(nonTerminalGotoStateTable);
         init_record_def(nonTerminalGotoStateTable);
         init_id_optional_9(nonTerminalGotoStateTable);
         init_parameter_star_5_sub(nonTerminalGotoStateTable);
         init_for_loop_incr_optional_14(nonTerminalGotoStateTable);
         init_expr_optional_11(nonTerminalGotoStateTable);
         init_dim_expr_plus_16(nonTerminalGotoStateTable);
         init_script_member(nonTerminalGotoStateTable);
         init_script_member_star_1(nonTerminalGotoStateTable);
         init_field_star_2(nonTerminalGotoStateTable);
         init_dims(nonTerminalGotoStateTable);
         init_record_init_optional_3(nonTerminalGotoStateTable);
         init_parameters(nonTerminalGotoStateTable);
         init_function_rtype(nonTerminalGotoStateTable);
         init_primitive_type(nonTerminalGotoStateTable);
         init_loop(nonTerminalGotoStateTable);
         init_expr(nonTerminalGotoStateTable);
         init_return_type(nonTerminalGotoStateTable);
         init_field(nonTerminalGotoStateTable);
         init_instr(nonTerminalGotoStateTable);
         init_expr_star_6(nonTerminalGotoStateTable);
         init_primary_no_array_creation(nonTerminalGotoStateTable);
         init_primary(nonTerminalGotoStateTable);
         init_block(nonTerminalGotoStateTable);
         init_semis(nonTerminalGotoStateTable);
         init_field_access(nonTerminalGotoStateTable);
         init_expr_optional_13(nonTerminalGotoStateTable);
         init_loop_label(nonTerminalGotoStateTable);
         init_type(nonTerminalGotoStateTable);
         init_lhs(nonTerminalGotoStateTable);
         init_conditional(nonTerminalGotoStateTable);
         init_instr_star_7(nonTerminalGotoStateTable);
         return nonTerminalGotoStateTable;
  } 
}