package com.googlecode.pseudo.compiler.ast;

import com.googlecode.pseudo.compiler.parser.PseudoNonTerminalEnum;

import fr.umlv.tatoo.runtime.ast.NonTerminalGotoStateTable;

public class NonTerminalGotoStateDataTable {
  private NonTerminalGotoStateDataTable() {
    // helper class
  }
  
    
  private static void init_start(NonTerminalGotoStateTable<PseudoNonTerminalEnum> nonTerminalGotoStateTable) {
       nonTerminalGotoStateTable.setGotoState(0, PseudoNonTerminalEnum.start, 1);
  }
  
    
  private static void init_parameters(NonTerminalGotoStateTable<PseudoNonTerminalEnum> nonTerminalGotoStateTable) {
       nonTerminalGotoStateTable.setGotoState(36, PseudoNonTerminalEnum.parameters, 40);
      nonTerminalGotoStateTable.setGotoState(52, PseudoNonTerminalEnum.parameters, 53);
      nonTerminalGotoStateTable.setGotoState(244, PseudoNonTerminalEnum.parameters, 245);
  }
  
    
  private static void init_for_loop_init_optional_12(NonTerminalGotoStateTable<PseudoNonTerminalEnum> nonTerminalGotoStateTable) {
       nonTerminalGotoStateTable.setGotoState(214, PseudoNonTerminalEnum.for_loop_init_optional_12, 219);
  }
  
    
  private static void init_instr_star_7(NonTerminalGotoStateTable<PseudoNonTerminalEnum> nonTerminalGotoStateTable) {
       nonTerminalGotoStateTable.setGotoState(42, PseudoNonTerminalEnum.instr_star_7, 43);
  }
  
    
  private static void init_declaration(NonTerminalGotoStateTable<PseudoNonTerminalEnum> nonTerminalGotoStateTable) {
       nonTerminalGotoStateTable.setGotoState(43, PseudoNonTerminalEnum.declaration, 196);
      nonTerminalGotoStateTable.setGotoState(214, PseudoNonTerminalEnum.declaration, 231);
  }
  
    
  private static void init_for_loop_incr(NonTerminalGotoStateTable<PseudoNonTerminalEnum> nonTerminalGotoStateTable) {
       nonTerminalGotoStateTable.setGotoState(222, PseudoNonTerminalEnum.for_loop_incr, 224);
  }
  
    
  private static void init_primary_no_array_creation(NonTerminalGotoStateTable<PseudoNonTerminalEnum> nonTerminalGotoStateTable) {
       nonTerminalGotoStateTable.setGotoState(43, PseudoNonTerminalEnum.primary_no_array_creation, 67);
      nonTerminalGotoStateTable.setGotoState(44, PseudoNonTerminalEnum.primary_no_array_creation, 67);
      nonTerminalGotoStateTable.setGotoState(47, PseudoNonTerminalEnum.primary_no_array_creation, 67);
      nonTerminalGotoStateTable.setGotoState(50, PseudoNonTerminalEnum.primary_no_array_creation, 67);
      nonTerminalGotoStateTable.setGotoState(55, PseudoNonTerminalEnum.primary_no_array_creation, 67);
      nonTerminalGotoStateTable.setGotoState(59, PseudoNonTerminalEnum.primary_no_array_creation, 67);
      nonTerminalGotoStateTable.setGotoState(60, PseudoNonTerminalEnum.primary_no_array_creation, 67);
      nonTerminalGotoStateTable.setGotoState(62, PseudoNonTerminalEnum.primary_no_array_creation, 67);
      nonTerminalGotoStateTable.setGotoState(63, PseudoNonTerminalEnum.primary_no_array_creation, 67);
      nonTerminalGotoStateTable.setGotoState(68, PseudoNonTerminalEnum.primary_no_array_creation, 67);
      nonTerminalGotoStateTable.setGotoState(70, PseudoNonTerminalEnum.primary_no_array_creation, 67);
      nonTerminalGotoStateTable.setGotoState(72, PseudoNonTerminalEnum.primary_no_array_creation, 67);
      nonTerminalGotoStateTable.setGotoState(75, PseudoNonTerminalEnum.primary_no_array_creation, 67);
      nonTerminalGotoStateTable.setGotoState(77, PseudoNonTerminalEnum.primary_no_array_creation, 67);
      nonTerminalGotoStateTable.setGotoState(79, PseudoNonTerminalEnum.primary_no_array_creation, 67);
      nonTerminalGotoStateTable.setGotoState(81, PseudoNonTerminalEnum.primary_no_array_creation, 67);
      nonTerminalGotoStateTable.setGotoState(83, PseudoNonTerminalEnum.primary_no_array_creation, 67);
      nonTerminalGotoStateTable.setGotoState(85, PseudoNonTerminalEnum.primary_no_array_creation, 67);
      nonTerminalGotoStateTable.setGotoState(87, PseudoNonTerminalEnum.primary_no_array_creation, 67);
      nonTerminalGotoStateTable.setGotoState(89, PseudoNonTerminalEnum.primary_no_array_creation, 67);
      nonTerminalGotoStateTable.setGotoState(91, PseudoNonTerminalEnum.primary_no_array_creation, 67);
      nonTerminalGotoStateTable.setGotoState(93, PseudoNonTerminalEnum.primary_no_array_creation, 67);
      nonTerminalGotoStateTable.setGotoState(95, PseudoNonTerminalEnum.primary_no_array_creation, 67);
      nonTerminalGotoStateTable.setGotoState(97, PseudoNonTerminalEnum.primary_no_array_creation, 67);
      nonTerminalGotoStateTable.setGotoState(99, PseudoNonTerminalEnum.primary_no_array_creation, 67);
      nonTerminalGotoStateTable.setGotoState(101, PseudoNonTerminalEnum.primary_no_array_creation, 67);
      nonTerminalGotoStateTable.setGotoState(115, PseudoNonTerminalEnum.primary_no_array_creation, 67);
      nonTerminalGotoStateTable.setGotoState(131, PseudoNonTerminalEnum.primary_no_array_creation, 67);
      nonTerminalGotoStateTable.setGotoState(135, PseudoNonTerminalEnum.primary_no_array_creation, 67);
      nonTerminalGotoStateTable.setGotoState(151, PseudoNonTerminalEnum.primary_no_array_creation, 67);
      nonTerminalGotoStateTable.setGotoState(156, PseudoNonTerminalEnum.primary_no_array_creation, 67);
      nonTerminalGotoStateTable.setGotoState(157, PseudoNonTerminalEnum.primary_no_array_creation, 67);
      nonTerminalGotoStateTable.setGotoState(160, PseudoNonTerminalEnum.primary_no_array_creation, 67);
      nonTerminalGotoStateTable.setGotoState(170, PseudoNonTerminalEnum.primary_no_array_creation, 67);
      nonTerminalGotoStateTable.setGotoState(178, PseudoNonTerminalEnum.primary_no_array_creation, 67);
      nonTerminalGotoStateTable.setGotoState(185, PseudoNonTerminalEnum.primary_no_array_creation, 67);
      nonTerminalGotoStateTable.setGotoState(190, PseudoNonTerminalEnum.primary_no_array_creation, 67);
      nonTerminalGotoStateTable.setGotoState(203, PseudoNonTerminalEnum.primary_no_array_creation, 67);
      nonTerminalGotoStateTable.setGotoState(210, PseudoNonTerminalEnum.primary_no_array_creation, 67);
      nonTerminalGotoStateTable.setGotoState(214, PseudoNonTerminalEnum.primary_no_array_creation, 67);
      nonTerminalGotoStateTable.setGotoState(220, PseudoNonTerminalEnum.primary_no_array_creation, 67);
      nonTerminalGotoStateTable.setGotoState(222, PseudoNonTerminalEnum.primary_no_array_creation, 67);
  }
  
    
  private static void init_type_star_0(NonTerminalGotoStateTable<PseudoNonTerminalEnum> nonTerminalGotoStateTable) {
       nonTerminalGotoStateTable.setGotoState(18, PseudoNonTerminalEnum.type_star_0, 29);
      nonTerminalGotoStateTable.setGotoState(157, PseudoNonTerminalEnum.type_star_0, 29);
  }
  
    
  private static void init_expr_star_6(NonTerminalGotoStateTable<PseudoNonTerminalEnum> nonTerminalGotoStateTable) {
       nonTerminalGotoStateTable.setGotoState(70, PseudoNonTerminalEnum.expr_star_6, 105);
      nonTerminalGotoStateTable.setGotoState(115, PseudoNonTerminalEnum.expr_star_6, 105);
      nonTerminalGotoStateTable.setGotoState(131, PseudoNonTerminalEnum.expr_star_6, 105);
  }
  
    
  private static void init_semis(NonTerminalGotoStateTable<PseudoNonTerminalEnum> nonTerminalGotoStateTable) {
       nonTerminalGotoStateTable.setGotoState(146, PseudoNonTerminalEnum.semis, 149);
      nonTerminalGotoStateTable.setGotoState(152, PseudoNonTerminalEnum.semis, 153);
      nonTerminalGotoStateTable.setGotoState(168, PseudoNonTerminalEnum.semis, 169);
      nonTerminalGotoStateTable.setGotoState(171, PseudoNonTerminalEnum.semis, 172);
      nonTerminalGotoStateTable.setGotoState(176, PseudoNonTerminalEnum.semis, 177);
      nonTerminalGotoStateTable.setGotoState(179, PseudoNonTerminalEnum.semis, 180);
      nonTerminalGotoStateTable.setGotoState(192, PseudoNonTerminalEnum.semis, 193);
      nonTerminalGotoStateTable.setGotoState(194, PseudoNonTerminalEnum.semis, 195);
      nonTerminalGotoStateTable.setGotoState(196, PseudoNonTerminalEnum.semis, 197);
      nonTerminalGotoStateTable.setGotoState(240, PseudoNonTerminalEnum.semis, 241);
  }
  
    
  private static void init_block(NonTerminalGotoStateTable<PseudoNonTerminalEnum> nonTerminalGotoStateTable) {
       nonTerminalGotoStateTable.setGotoState(3, PseudoNonTerminalEnum.block, 254);
      nonTerminalGotoStateTable.setGotoState(41, PseudoNonTerminalEnum.block, 234);
      nonTerminalGotoStateTable.setGotoState(43, PseudoNonTerminalEnum.block, 200);
      nonTerminalGotoStateTable.setGotoState(162, PseudoNonTerminalEnum.block, 163);
      nonTerminalGotoStateTable.setGotoState(164, PseudoNonTerminalEnum.block, 165);
      nonTerminalGotoStateTable.setGotoState(205, PseudoNonTerminalEnum.block, 206);
      nonTerminalGotoStateTable.setGotoState(207, PseudoNonTerminalEnum.block, 208);
      nonTerminalGotoStateTable.setGotoState(226, PseudoNonTerminalEnum.block, 227);
      nonTerminalGotoStateTable.setGotoState(250, PseudoNonTerminalEnum.block, 251);
  }
  
    
  private static void init_funtype(NonTerminalGotoStateTable<PseudoNonTerminalEnum> nonTerminalGotoStateTable) {
       nonTerminalGotoStateTable.setGotoState(7, PseudoNonTerminalEnum.funtype, 27);
      nonTerminalGotoStateTable.setGotoState(18, PseudoNonTerminalEnum.funtype, 27);
      nonTerminalGotoStateTable.setGotoState(23, PseudoNonTerminalEnum.funtype, 27);
      nonTerminalGotoStateTable.setGotoState(30, PseudoNonTerminalEnum.funtype, 27);
      nonTerminalGotoStateTable.setGotoState(36, PseudoNonTerminalEnum.funtype, 27);
      nonTerminalGotoStateTable.setGotoState(43, PseudoNonTerminalEnum.funtype, 27);
      nonTerminalGotoStateTable.setGotoState(52, PseudoNonTerminalEnum.funtype, 27);
      nonTerminalGotoStateTable.setGotoState(126, PseudoNonTerminalEnum.funtype, 27);
      nonTerminalGotoStateTable.setGotoState(157, PseudoNonTerminalEnum.funtype, 27);
      nonTerminalGotoStateTable.setGotoState(214, PseudoNonTerminalEnum.funtype, 27);
      nonTerminalGotoStateTable.setGotoState(244, PseudoNonTerminalEnum.funtype, 27);
      nonTerminalGotoStateTable.setGotoState(247, PseudoNonTerminalEnum.funtype, 27);
  }
  
    
  private static void init_parameter_star_5_sub(NonTerminalGotoStateTable<PseudoNonTerminalEnum> nonTerminalGotoStateTable) {
       nonTerminalGotoStateTable.setGotoState(36, PseudoNonTerminalEnum.parameter_star_5_sub, 125);
      nonTerminalGotoStateTable.setGotoState(52, PseudoNonTerminalEnum.parameter_star_5_sub, 125);
      nonTerminalGotoStateTable.setGotoState(244, PseudoNonTerminalEnum.parameter_star_5_sub, 125);
  }
  
    
  private static void init_array_access(NonTerminalGotoStateTable<PseudoNonTerminalEnum> nonTerminalGotoStateTable) {
       nonTerminalGotoStateTable.setGotoState(43, PseudoNonTerminalEnum.array_access, 182);
      nonTerminalGotoStateTable.setGotoState(44, PseudoNonTerminalEnum.array_access, 65);
      nonTerminalGotoStateTable.setGotoState(47, PseudoNonTerminalEnum.array_access, 65);
      nonTerminalGotoStateTable.setGotoState(50, PseudoNonTerminalEnum.array_access, 65);
      nonTerminalGotoStateTable.setGotoState(55, PseudoNonTerminalEnum.array_access, 65);
      nonTerminalGotoStateTable.setGotoState(59, PseudoNonTerminalEnum.array_access, 65);
      nonTerminalGotoStateTable.setGotoState(60, PseudoNonTerminalEnum.array_access, 65);
      nonTerminalGotoStateTable.setGotoState(62, PseudoNonTerminalEnum.array_access, 65);
      nonTerminalGotoStateTable.setGotoState(63, PseudoNonTerminalEnum.array_access, 65);
      nonTerminalGotoStateTable.setGotoState(68, PseudoNonTerminalEnum.array_access, 65);
      nonTerminalGotoStateTable.setGotoState(70, PseudoNonTerminalEnum.array_access, 65);
      nonTerminalGotoStateTable.setGotoState(72, PseudoNonTerminalEnum.array_access, 65);
      nonTerminalGotoStateTable.setGotoState(75, PseudoNonTerminalEnum.array_access, 65);
      nonTerminalGotoStateTable.setGotoState(77, PseudoNonTerminalEnum.array_access, 65);
      nonTerminalGotoStateTable.setGotoState(79, PseudoNonTerminalEnum.array_access, 65);
      nonTerminalGotoStateTable.setGotoState(81, PseudoNonTerminalEnum.array_access, 65);
      nonTerminalGotoStateTable.setGotoState(83, PseudoNonTerminalEnum.array_access, 65);
      nonTerminalGotoStateTable.setGotoState(85, PseudoNonTerminalEnum.array_access, 65);
      nonTerminalGotoStateTable.setGotoState(87, PseudoNonTerminalEnum.array_access, 65);
      nonTerminalGotoStateTable.setGotoState(89, PseudoNonTerminalEnum.array_access, 65);
      nonTerminalGotoStateTable.setGotoState(91, PseudoNonTerminalEnum.array_access, 65);
      nonTerminalGotoStateTable.setGotoState(93, PseudoNonTerminalEnum.array_access, 65);
      nonTerminalGotoStateTable.setGotoState(95, PseudoNonTerminalEnum.array_access, 65);
      nonTerminalGotoStateTable.setGotoState(97, PseudoNonTerminalEnum.array_access, 65);
      nonTerminalGotoStateTable.setGotoState(99, PseudoNonTerminalEnum.array_access, 65);
      nonTerminalGotoStateTable.setGotoState(101, PseudoNonTerminalEnum.array_access, 65);
      nonTerminalGotoStateTable.setGotoState(115, PseudoNonTerminalEnum.array_access, 65);
      nonTerminalGotoStateTable.setGotoState(131, PseudoNonTerminalEnum.array_access, 65);
      nonTerminalGotoStateTable.setGotoState(135, PseudoNonTerminalEnum.array_access, 65);
      nonTerminalGotoStateTable.setGotoState(151, PseudoNonTerminalEnum.array_access, 65);
      nonTerminalGotoStateTable.setGotoState(156, PseudoNonTerminalEnum.array_access, 65);
      nonTerminalGotoStateTable.setGotoState(157, PseudoNonTerminalEnum.array_access, 65);
      nonTerminalGotoStateTable.setGotoState(160, PseudoNonTerminalEnum.array_access, 65);
      nonTerminalGotoStateTable.setGotoState(170, PseudoNonTerminalEnum.array_access, 65);
      nonTerminalGotoStateTable.setGotoState(178, PseudoNonTerminalEnum.array_access, 65);
      nonTerminalGotoStateTable.setGotoState(185, PseudoNonTerminalEnum.array_access, 65);
      nonTerminalGotoStateTable.setGotoState(190, PseudoNonTerminalEnum.array_access, 65);
      nonTerminalGotoStateTable.setGotoState(203, PseudoNonTerminalEnum.array_access, 65);
      nonTerminalGotoStateTable.setGotoState(210, PseudoNonTerminalEnum.array_access, 65);
      nonTerminalGotoStateTable.setGotoState(214, PseudoNonTerminalEnum.array_access, 182);
      nonTerminalGotoStateTable.setGotoState(220, PseudoNonTerminalEnum.array_access, 65);
      nonTerminalGotoStateTable.setGotoState(222, PseudoNonTerminalEnum.array_access, 182);
  }
  
    
  private static void init_field(NonTerminalGotoStateTable<PseudoNonTerminalEnum> nonTerminalGotoStateTable) {
       nonTerminalGotoStateTable.setGotoState(7, PseudoNonTerminalEnum.field, 238);
  }
  
    
  private static void init_dim_expr(NonTerminalGotoStateTable<PseudoNonTerminalEnum> nonTerminalGotoStateTable) {
       nonTerminalGotoStateTable.setGotoState(46, PseudoNonTerminalEnum.dim_expr, 139);
      nonTerminalGotoStateTable.setGotoState(134, PseudoNonTerminalEnum.dim_expr, 137);
      nonTerminalGotoStateTable.setGotoState(140, PseudoNonTerminalEnum.dim_expr, 141);
      nonTerminalGotoStateTable.setGotoState(142, PseudoNonTerminalEnum.dim_expr, 144);
  }
  
    
  private static void init_assignation(NonTerminalGotoStateTable<PseudoNonTerminalEnum> nonTerminalGotoStateTable) {
       nonTerminalGotoStateTable.setGotoState(43, PseudoNonTerminalEnum.assignation, 192);
      nonTerminalGotoStateTable.setGotoState(214, PseudoNonTerminalEnum.assignation, 218);
      nonTerminalGotoStateTable.setGotoState(222, PseudoNonTerminalEnum.assignation, 228);
  }
  
    
  private static void init_parameter(NonTerminalGotoStateTable<PseudoNonTerminalEnum> nonTerminalGotoStateTable) {
       nonTerminalGotoStateTable.setGotoState(36, PseudoNonTerminalEnum.parameter, 124);
      nonTerminalGotoStateTable.setGotoState(52, PseudoNonTerminalEnum.parameter, 124);
      nonTerminalGotoStateTable.setGotoState(126, PseudoNonTerminalEnum.parameter, 127);
      nonTerminalGotoStateTable.setGotoState(244, PseudoNonTerminalEnum.parameter, 124);
  }
  
    
  private static void init_return_type(NonTerminalGotoStateTable<PseudoNonTerminalEnum> nonTerminalGotoStateTable) {
       nonTerminalGotoStateTable.setGotoState(30, PseudoNonTerminalEnum.return_type, 33);
      nonTerminalGotoStateTable.setGotoState(247, PseudoNonTerminalEnum.return_type, 248);
  }
  
    
  private static void init_dims(NonTerminalGotoStateTable<PseudoNonTerminalEnum> nonTerminalGotoStateTable) {
       nonTerminalGotoStateTable.setGotoState(12, PseudoNonTerminalEnum.dims, 15);
      nonTerminalGotoStateTable.setGotoState(25, PseudoNonTerminalEnum.dims, 26);
      nonTerminalGotoStateTable.setGotoState(27, PseudoNonTerminalEnum.dims, 28);
      nonTerminalGotoStateTable.setGotoState(37, PseudoNonTerminalEnum.dims, 15);
      nonTerminalGotoStateTable.setGotoState(134, PseudoNonTerminalEnum.dims, 138);
      nonTerminalGotoStateTable.setGotoState(142, PseudoNonTerminalEnum.dims, 138);
      nonTerminalGotoStateTable.setGotoState(154, PseudoNonTerminalEnum.dims, 15);
      nonTerminalGotoStateTable.setGotoState(158, PseudoNonTerminalEnum.dims, 15);
      nonTerminalGotoStateTable.setGotoState(215, PseudoNonTerminalEnum.dims, 15);
  }
  
    
  private static void init_function_def(NonTerminalGotoStateTable<PseudoNonTerminalEnum> nonTerminalGotoStateTable) {
       nonTerminalGotoStateTable.setGotoState(3, PseudoNonTerminalEnum.function_def, 253);
  }
  
    
  private static void init_loop_label_optional_8(NonTerminalGotoStateTable<PseudoNonTerminalEnum> nonTerminalGotoStateTable) {
       nonTerminalGotoStateTable.setGotoState(43, PseudoNonTerminalEnum.loop_label_optional_8, 201);
  }
  
    
  private static void init_field_access(NonTerminalGotoStateTable<PseudoNonTerminalEnum> nonTerminalGotoStateTable) {
       nonTerminalGotoStateTable.setGotoState(43, PseudoNonTerminalEnum.field_access, 183);
      nonTerminalGotoStateTable.setGotoState(44, PseudoNonTerminalEnum.field_access, 64);
      nonTerminalGotoStateTable.setGotoState(47, PseudoNonTerminalEnum.field_access, 64);
      nonTerminalGotoStateTable.setGotoState(50, PseudoNonTerminalEnum.field_access, 64);
      nonTerminalGotoStateTable.setGotoState(55, PseudoNonTerminalEnum.field_access, 64);
      nonTerminalGotoStateTable.setGotoState(59, PseudoNonTerminalEnum.field_access, 64);
      nonTerminalGotoStateTable.setGotoState(60, PseudoNonTerminalEnum.field_access, 64);
      nonTerminalGotoStateTable.setGotoState(62, PseudoNonTerminalEnum.field_access, 64);
      nonTerminalGotoStateTable.setGotoState(63, PseudoNonTerminalEnum.field_access, 64);
      nonTerminalGotoStateTable.setGotoState(68, PseudoNonTerminalEnum.field_access, 64);
      nonTerminalGotoStateTable.setGotoState(70, PseudoNonTerminalEnum.field_access, 64);
      nonTerminalGotoStateTable.setGotoState(72, PseudoNonTerminalEnum.field_access, 64);
      nonTerminalGotoStateTable.setGotoState(75, PseudoNonTerminalEnum.field_access, 64);
      nonTerminalGotoStateTable.setGotoState(77, PseudoNonTerminalEnum.field_access, 64);
      nonTerminalGotoStateTable.setGotoState(79, PseudoNonTerminalEnum.field_access, 64);
      nonTerminalGotoStateTable.setGotoState(81, PseudoNonTerminalEnum.field_access, 64);
      nonTerminalGotoStateTable.setGotoState(83, PseudoNonTerminalEnum.field_access, 64);
      nonTerminalGotoStateTable.setGotoState(85, PseudoNonTerminalEnum.field_access, 64);
      nonTerminalGotoStateTable.setGotoState(87, PseudoNonTerminalEnum.field_access, 64);
      nonTerminalGotoStateTable.setGotoState(89, PseudoNonTerminalEnum.field_access, 64);
      nonTerminalGotoStateTable.setGotoState(91, PseudoNonTerminalEnum.field_access, 64);
      nonTerminalGotoStateTable.setGotoState(93, PseudoNonTerminalEnum.field_access, 64);
      nonTerminalGotoStateTable.setGotoState(95, PseudoNonTerminalEnum.field_access, 64);
      nonTerminalGotoStateTable.setGotoState(97, PseudoNonTerminalEnum.field_access, 64);
      nonTerminalGotoStateTable.setGotoState(99, PseudoNonTerminalEnum.field_access, 64);
      nonTerminalGotoStateTable.setGotoState(101, PseudoNonTerminalEnum.field_access, 64);
      nonTerminalGotoStateTable.setGotoState(115, PseudoNonTerminalEnum.field_access, 64);
      nonTerminalGotoStateTable.setGotoState(131, PseudoNonTerminalEnum.field_access, 64);
      nonTerminalGotoStateTable.setGotoState(135, PseudoNonTerminalEnum.field_access, 64);
      nonTerminalGotoStateTable.setGotoState(151, PseudoNonTerminalEnum.field_access, 64);
      nonTerminalGotoStateTable.setGotoState(156, PseudoNonTerminalEnum.field_access, 64);
      nonTerminalGotoStateTable.setGotoState(157, PseudoNonTerminalEnum.field_access, 64);
      nonTerminalGotoStateTable.setGotoState(160, PseudoNonTerminalEnum.field_access, 64);
      nonTerminalGotoStateTable.setGotoState(170, PseudoNonTerminalEnum.field_access, 64);
      nonTerminalGotoStateTable.setGotoState(178, PseudoNonTerminalEnum.field_access, 64);
      nonTerminalGotoStateTable.setGotoState(185, PseudoNonTerminalEnum.field_access, 64);
      nonTerminalGotoStateTable.setGotoState(190, PseudoNonTerminalEnum.field_access, 64);
      nonTerminalGotoStateTable.setGotoState(203, PseudoNonTerminalEnum.field_access, 64);
      nonTerminalGotoStateTable.setGotoState(210, PseudoNonTerminalEnum.field_access, 64);
      nonTerminalGotoStateTable.setGotoState(214, PseudoNonTerminalEnum.field_access, 183);
      nonTerminalGotoStateTable.setGotoState(220, PseudoNonTerminalEnum.field_access, 64);
      nonTerminalGotoStateTable.setGotoState(222, PseudoNonTerminalEnum.field_access, 183);
  }
  
    
  private static void init_array_creation(NonTerminalGotoStateTable<PseudoNonTerminalEnum> nonTerminalGotoStateTable) {
       nonTerminalGotoStateTable.setGotoState(43, PseudoNonTerminalEnum.array_creation, 66);
      nonTerminalGotoStateTable.setGotoState(44, PseudoNonTerminalEnum.array_creation, 66);
      nonTerminalGotoStateTable.setGotoState(47, PseudoNonTerminalEnum.array_creation, 66);
      nonTerminalGotoStateTable.setGotoState(50, PseudoNonTerminalEnum.array_creation, 66);
      nonTerminalGotoStateTable.setGotoState(55, PseudoNonTerminalEnum.array_creation, 66);
      nonTerminalGotoStateTable.setGotoState(59, PseudoNonTerminalEnum.array_creation, 66);
      nonTerminalGotoStateTable.setGotoState(60, PseudoNonTerminalEnum.array_creation, 66);
      nonTerminalGotoStateTable.setGotoState(62, PseudoNonTerminalEnum.array_creation, 66);
      nonTerminalGotoStateTable.setGotoState(63, PseudoNonTerminalEnum.array_creation, 66);
      nonTerminalGotoStateTable.setGotoState(68, PseudoNonTerminalEnum.array_creation, 66);
      nonTerminalGotoStateTable.setGotoState(70, PseudoNonTerminalEnum.array_creation, 66);
      nonTerminalGotoStateTable.setGotoState(72, PseudoNonTerminalEnum.array_creation, 66);
      nonTerminalGotoStateTable.setGotoState(75, PseudoNonTerminalEnum.array_creation, 66);
      nonTerminalGotoStateTable.setGotoState(77, PseudoNonTerminalEnum.array_creation, 66);
      nonTerminalGotoStateTable.setGotoState(79, PseudoNonTerminalEnum.array_creation, 66);
      nonTerminalGotoStateTable.setGotoState(81, PseudoNonTerminalEnum.array_creation, 66);
      nonTerminalGotoStateTable.setGotoState(83, PseudoNonTerminalEnum.array_creation, 66);
      nonTerminalGotoStateTable.setGotoState(85, PseudoNonTerminalEnum.array_creation, 66);
      nonTerminalGotoStateTable.setGotoState(87, PseudoNonTerminalEnum.array_creation, 66);
      nonTerminalGotoStateTable.setGotoState(89, PseudoNonTerminalEnum.array_creation, 66);
      nonTerminalGotoStateTable.setGotoState(91, PseudoNonTerminalEnum.array_creation, 66);
      nonTerminalGotoStateTable.setGotoState(93, PseudoNonTerminalEnum.array_creation, 66);
      nonTerminalGotoStateTable.setGotoState(95, PseudoNonTerminalEnum.array_creation, 66);
      nonTerminalGotoStateTable.setGotoState(97, PseudoNonTerminalEnum.array_creation, 66);
      nonTerminalGotoStateTable.setGotoState(99, PseudoNonTerminalEnum.array_creation, 66);
      nonTerminalGotoStateTable.setGotoState(101, PseudoNonTerminalEnum.array_creation, 66);
      nonTerminalGotoStateTable.setGotoState(115, PseudoNonTerminalEnum.array_creation, 66);
      nonTerminalGotoStateTable.setGotoState(131, PseudoNonTerminalEnum.array_creation, 66);
      nonTerminalGotoStateTable.setGotoState(135, PseudoNonTerminalEnum.array_creation, 66);
      nonTerminalGotoStateTable.setGotoState(151, PseudoNonTerminalEnum.array_creation, 66);
      nonTerminalGotoStateTable.setGotoState(156, PseudoNonTerminalEnum.array_creation, 66);
      nonTerminalGotoStateTable.setGotoState(157, PseudoNonTerminalEnum.array_creation, 66);
      nonTerminalGotoStateTable.setGotoState(160, PseudoNonTerminalEnum.array_creation, 66);
      nonTerminalGotoStateTable.setGotoState(170, PseudoNonTerminalEnum.array_creation, 66);
      nonTerminalGotoStateTable.setGotoState(178, PseudoNonTerminalEnum.array_creation, 66);
      nonTerminalGotoStateTable.setGotoState(185, PseudoNonTerminalEnum.array_creation, 66);
      nonTerminalGotoStateTable.setGotoState(190, PseudoNonTerminalEnum.array_creation, 66);
      nonTerminalGotoStateTable.setGotoState(203, PseudoNonTerminalEnum.array_creation, 66);
      nonTerminalGotoStateTable.setGotoState(210, PseudoNonTerminalEnum.array_creation, 66);
      nonTerminalGotoStateTable.setGotoState(214, PseudoNonTerminalEnum.array_creation, 66);
      nonTerminalGotoStateTable.setGotoState(220, PseudoNonTerminalEnum.array_creation, 66);
      nonTerminalGotoStateTable.setGotoState(222, PseudoNonTerminalEnum.array_creation, 66);
  }
  
    
  private static void init_lhs(NonTerminalGotoStateTable<PseudoNonTerminalEnum> nonTerminalGotoStateTable) {
       nonTerminalGotoStateTable.setGotoState(43, PseudoNonTerminalEnum.lhs, 184);
      nonTerminalGotoStateTable.setGotoState(214, PseudoNonTerminalEnum.lhs, 184);
      nonTerminalGotoStateTable.setGotoState(222, PseudoNonTerminalEnum.lhs, 184);
  }
  
    
  private static void init_field_star_2(NonTerminalGotoStateTable<PseudoNonTerminalEnum> nonTerminalGotoStateTable) {
       nonTerminalGotoStateTable.setGotoState(6, PseudoNonTerminalEnum.field_star_2, 7);
  }
  
    
  private static void init_arguments(NonTerminalGotoStateTable<PseudoNonTerminalEnum> nonTerminalGotoStateTable) {
       nonTerminalGotoStateTable.setGotoState(70, PseudoNonTerminalEnum.arguments, 103);
      nonTerminalGotoStateTable.setGotoState(115, PseudoNonTerminalEnum.arguments, 116);
      nonTerminalGotoStateTable.setGotoState(131, PseudoNonTerminalEnum.arguments, 132);
  }
  
    
  private static void init_record_init(NonTerminalGotoStateTable<PseudoNonTerminalEnum> nonTerminalGotoStateTable) {
       nonTerminalGotoStateTable.setGotoState(7, PseudoNonTerminalEnum.record_init, 235);
  }
  
    
  private static void init_record_init_optional_3(NonTerminalGotoStateTable<PseudoNonTerminalEnum> nonTerminalGotoStateTable) {
       nonTerminalGotoStateTable.setGotoState(7, PseudoNonTerminalEnum.record_init_optional_3, 236);
  }
  
    
  private static void init_for_loop_init(NonTerminalGotoStateTable<PseudoNonTerminalEnum> nonTerminalGotoStateTable) {
       nonTerminalGotoStateTable.setGotoState(214, PseudoNonTerminalEnum.for_loop_init, 216);
  }
  
    
  private static void init_type(NonTerminalGotoStateTable<PseudoNonTerminalEnum> nonTerminalGotoStateTable) {
       nonTerminalGotoStateTable.setGotoState(7, PseudoNonTerminalEnum.type, 239);
      nonTerminalGotoStateTable.setGotoState(18, PseudoNonTerminalEnum.type, 21);
      nonTerminalGotoStateTable.setGotoState(23, PseudoNonTerminalEnum.type, 24);
      nonTerminalGotoStateTable.setGotoState(30, PseudoNonTerminalEnum.type, 32);
      nonTerminalGotoStateTable.setGotoState(36, PseudoNonTerminalEnum.type, 38);
      nonTerminalGotoStateTable.setGotoState(43, PseudoNonTerminalEnum.type, 188);
      nonTerminalGotoStateTable.setGotoState(52, PseudoNonTerminalEnum.type, 38);
      nonTerminalGotoStateTable.setGotoState(126, PseudoNonTerminalEnum.type, 38);
      nonTerminalGotoStateTable.setGotoState(157, PseudoNonTerminalEnum.type, 21);
      nonTerminalGotoStateTable.setGotoState(214, PseudoNonTerminalEnum.type, 188);
      nonTerminalGotoStateTable.setGotoState(244, PseudoNonTerminalEnum.type, 38);
      nonTerminalGotoStateTable.setGotoState(247, PseudoNonTerminalEnum.type, 32);
  }
  
    
  private static void init_expr_optional_13(NonTerminalGotoStateTable<PseudoNonTerminalEnum> nonTerminalGotoStateTable) {
       nonTerminalGotoStateTable.setGotoState(220, PseudoNonTerminalEnum.expr_optional_13, 221);
  }
  
    
  private static void init_loop(NonTerminalGotoStateTable<PseudoNonTerminalEnum> nonTerminalGotoStateTable) {
       nonTerminalGotoStateTable.setGotoState(201, PseudoNonTerminalEnum.loop, 232);
  }
  
    
  private static void init_expr(NonTerminalGotoStateTable<PseudoNonTerminalEnum> nonTerminalGotoStateTable) {
       nonTerminalGotoStateTable.setGotoState(47, PseudoNonTerminalEnum.expr, 129);
      nonTerminalGotoStateTable.setGotoState(50, PseudoNonTerminalEnum.expr, 128);
      nonTerminalGotoStateTable.setGotoState(55, PseudoNonTerminalEnum.expr, 122);
      nonTerminalGotoStateTable.setGotoState(59, PseudoNonTerminalEnum.expr, 121);
      nonTerminalGotoStateTable.setGotoState(60, PseudoNonTerminalEnum.expr, 120);
      nonTerminalGotoStateTable.setGotoState(62, PseudoNonTerminalEnum.expr, 113);
      nonTerminalGotoStateTable.setGotoState(63, PseudoNonTerminalEnum.expr, 111);
      nonTerminalGotoStateTable.setGotoState(68, PseudoNonTerminalEnum.expr, 109);
      nonTerminalGotoStateTable.setGotoState(70, PseudoNonTerminalEnum.expr, 106);
      nonTerminalGotoStateTable.setGotoState(72, PseudoNonTerminalEnum.expr, 74);
      nonTerminalGotoStateTable.setGotoState(75, PseudoNonTerminalEnum.expr, 76);
      nonTerminalGotoStateTable.setGotoState(77, PseudoNonTerminalEnum.expr, 78);
      nonTerminalGotoStateTable.setGotoState(79, PseudoNonTerminalEnum.expr, 80);
      nonTerminalGotoStateTable.setGotoState(81, PseudoNonTerminalEnum.expr, 82);
      nonTerminalGotoStateTable.setGotoState(83, PseudoNonTerminalEnum.expr, 84);
      nonTerminalGotoStateTable.setGotoState(85, PseudoNonTerminalEnum.expr, 86);
      nonTerminalGotoStateTable.setGotoState(87, PseudoNonTerminalEnum.expr, 88);
      nonTerminalGotoStateTable.setGotoState(89, PseudoNonTerminalEnum.expr, 90);
      nonTerminalGotoStateTable.setGotoState(91, PseudoNonTerminalEnum.expr, 92);
      nonTerminalGotoStateTable.setGotoState(93, PseudoNonTerminalEnum.expr, 94);
      nonTerminalGotoStateTable.setGotoState(95, PseudoNonTerminalEnum.expr, 96);
      nonTerminalGotoStateTable.setGotoState(97, PseudoNonTerminalEnum.expr, 98);
      nonTerminalGotoStateTable.setGotoState(99, PseudoNonTerminalEnum.expr, 100);
      nonTerminalGotoStateTable.setGotoState(101, PseudoNonTerminalEnum.expr, 102);
      nonTerminalGotoStateTable.setGotoState(115, PseudoNonTerminalEnum.expr, 106);
      nonTerminalGotoStateTable.setGotoState(131, PseudoNonTerminalEnum.expr, 106);
      nonTerminalGotoStateTable.setGotoState(135, PseudoNonTerminalEnum.expr, 129);
      nonTerminalGotoStateTable.setGotoState(151, PseudoNonTerminalEnum.expr, 152);
      nonTerminalGotoStateTable.setGotoState(156, PseudoNonTerminalEnum.expr, 113);
      nonTerminalGotoStateTable.setGotoState(157, PseudoNonTerminalEnum.expr, 111);
      nonTerminalGotoStateTable.setGotoState(160, PseudoNonTerminalEnum.expr, 161);
      nonTerminalGotoStateTable.setGotoState(170, PseudoNonTerminalEnum.expr, 171);
      nonTerminalGotoStateTable.setGotoState(178, PseudoNonTerminalEnum.expr, 181);
      nonTerminalGotoStateTable.setGotoState(185, PseudoNonTerminalEnum.expr, 186);
      nonTerminalGotoStateTable.setGotoState(190, PseudoNonTerminalEnum.expr, 191);
      nonTerminalGotoStateTable.setGotoState(203, PseudoNonTerminalEnum.expr, 204);
      nonTerminalGotoStateTable.setGotoState(210, PseudoNonTerminalEnum.expr, 211);
      nonTerminalGotoStateTable.setGotoState(220, PseudoNonTerminalEnum.expr, 230);
  }
  
    
  private static void init_script_member_star_1(NonTerminalGotoStateTable<PseudoNonTerminalEnum> nonTerminalGotoStateTable) {
       nonTerminalGotoStateTable.setGotoState(0, PseudoNonTerminalEnum.script_member_star_1, 3);
  }
  
    
  private static void init_conditional(NonTerminalGotoStateTable<PseudoNonTerminalEnum> nonTerminalGotoStateTable) {
       nonTerminalGotoStateTable.setGotoState(43, PseudoNonTerminalEnum.conditional, 198);
  }
  
    
  private static void init_record_def(NonTerminalGotoStateTable<PseudoNonTerminalEnum> nonTerminalGotoStateTable) {
       nonTerminalGotoStateTable.setGotoState(3, PseudoNonTerminalEnum.record_def, 252);
  }
  
    
  private static void init_dim_expr_plus_15(NonTerminalGotoStateTable<PseudoNonTerminalEnum> nonTerminalGotoStateTable) {
       nonTerminalGotoStateTable.setGotoState(140, PseudoNonTerminalEnum.dim_expr_plus_15, 142);
  }
  
    
  private static void init_function_rtype_optional_4(NonTerminalGotoStateTable<PseudoNonTerminalEnum> nonTerminalGotoStateTable) {
       nonTerminalGotoStateTable.setGotoState(246, PseudoNonTerminalEnum.function_rtype_optional_4, 250);
  }
  
    
  private static void init_id_optional_10(NonTerminalGotoStateTable<PseudoNonTerminalEnum> nonTerminalGotoStateTable) {
       nonTerminalGotoStateTable.setGotoState(166, PseudoNonTerminalEnum.id_optional_10, 168);
  }
  
    
  private static void init_for_loop_incr_optional_14(NonTerminalGotoStateTable<PseudoNonTerminalEnum> nonTerminalGotoStateTable) {
       nonTerminalGotoStateTable.setGotoState(222, PseudoNonTerminalEnum.for_loop_incr_optional_14, 225);
  }
  
    
  private static void init_dims_opt(NonTerminalGotoStateTable<PseudoNonTerminalEnum> nonTerminalGotoStateTable) {
       nonTerminalGotoStateTable.setGotoState(134, PseudoNonTerminalEnum.dims_opt, 136);
      nonTerminalGotoStateTable.setGotoState(142, PseudoNonTerminalEnum.dims_opt, 143);
  }
  
    
  private static void init_instr(NonTerminalGotoStateTable<PseudoNonTerminalEnum> nonTerminalGotoStateTable) {
       nonTerminalGotoStateTable.setGotoState(43, PseudoNonTerminalEnum.instr, 187);
  }
  
    
  private static void init_dim_expr_plus_16(NonTerminalGotoStateTable<PseudoNonTerminalEnum> nonTerminalGotoStateTable) {
       nonTerminalGotoStateTable.setGotoState(46, PseudoNonTerminalEnum.dim_expr_plus_16, 134);
  }
  
    
  private static void init_funcall(NonTerminalGotoStateTable<PseudoNonTerminalEnum> nonTerminalGotoStateTable) {
       nonTerminalGotoStateTable.setGotoState(43, PseudoNonTerminalEnum.funcall, 194);
      nonTerminalGotoStateTable.setGotoState(44, PseudoNonTerminalEnum.funcall, 73);
      nonTerminalGotoStateTable.setGotoState(47, PseudoNonTerminalEnum.funcall, 73);
      nonTerminalGotoStateTable.setGotoState(50, PseudoNonTerminalEnum.funcall, 73);
      nonTerminalGotoStateTable.setGotoState(55, PseudoNonTerminalEnum.funcall, 73);
      nonTerminalGotoStateTable.setGotoState(59, PseudoNonTerminalEnum.funcall, 73);
      nonTerminalGotoStateTable.setGotoState(60, PseudoNonTerminalEnum.funcall, 73);
      nonTerminalGotoStateTable.setGotoState(62, PseudoNonTerminalEnum.funcall, 73);
      nonTerminalGotoStateTable.setGotoState(63, PseudoNonTerminalEnum.funcall, 73);
      nonTerminalGotoStateTable.setGotoState(68, PseudoNonTerminalEnum.funcall, 73);
      nonTerminalGotoStateTable.setGotoState(70, PseudoNonTerminalEnum.funcall, 73);
      nonTerminalGotoStateTable.setGotoState(72, PseudoNonTerminalEnum.funcall, 73);
      nonTerminalGotoStateTable.setGotoState(75, PseudoNonTerminalEnum.funcall, 73);
      nonTerminalGotoStateTable.setGotoState(77, PseudoNonTerminalEnum.funcall, 73);
      nonTerminalGotoStateTable.setGotoState(79, PseudoNonTerminalEnum.funcall, 73);
      nonTerminalGotoStateTable.setGotoState(81, PseudoNonTerminalEnum.funcall, 73);
      nonTerminalGotoStateTable.setGotoState(83, PseudoNonTerminalEnum.funcall, 73);
      nonTerminalGotoStateTable.setGotoState(85, PseudoNonTerminalEnum.funcall, 73);
      nonTerminalGotoStateTable.setGotoState(87, PseudoNonTerminalEnum.funcall, 73);
      nonTerminalGotoStateTable.setGotoState(89, PseudoNonTerminalEnum.funcall, 73);
      nonTerminalGotoStateTable.setGotoState(91, PseudoNonTerminalEnum.funcall, 73);
      nonTerminalGotoStateTable.setGotoState(93, PseudoNonTerminalEnum.funcall, 73);
      nonTerminalGotoStateTable.setGotoState(95, PseudoNonTerminalEnum.funcall, 73);
      nonTerminalGotoStateTable.setGotoState(97, PseudoNonTerminalEnum.funcall, 73);
      nonTerminalGotoStateTable.setGotoState(99, PseudoNonTerminalEnum.funcall, 73);
      nonTerminalGotoStateTable.setGotoState(101, PseudoNonTerminalEnum.funcall, 73);
      nonTerminalGotoStateTable.setGotoState(115, PseudoNonTerminalEnum.funcall, 73);
      nonTerminalGotoStateTable.setGotoState(131, PseudoNonTerminalEnum.funcall, 73);
      nonTerminalGotoStateTable.setGotoState(135, PseudoNonTerminalEnum.funcall, 73);
      nonTerminalGotoStateTable.setGotoState(151, PseudoNonTerminalEnum.funcall, 73);
      nonTerminalGotoStateTable.setGotoState(156, PseudoNonTerminalEnum.funcall, 73);
      nonTerminalGotoStateTable.setGotoState(157, PseudoNonTerminalEnum.funcall, 73);
      nonTerminalGotoStateTable.setGotoState(160, PseudoNonTerminalEnum.funcall, 73);
      nonTerminalGotoStateTable.setGotoState(170, PseudoNonTerminalEnum.funcall, 73);
      nonTerminalGotoStateTable.setGotoState(178, PseudoNonTerminalEnum.funcall, 73);
      nonTerminalGotoStateTable.setGotoState(185, PseudoNonTerminalEnum.funcall, 73);
      nonTerminalGotoStateTable.setGotoState(190, PseudoNonTerminalEnum.funcall, 73);
      nonTerminalGotoStateTable.setGotoState(203, PseudoNonTerminalEnum.funcall, 73);
      nonTerminalGotoStateTable.setGotoState(210, PseudoNonTerminalEnum.funcall, 73);
      nonTerminalGotoStateTable.setGotoState(214, PseudoNonTerminalEnum.funcall, 217);
      nonTerminalGotoStateTable.setGotoState(220, PseudoNonTerminalEnum.funcall, 73);
      nonTerminalGotoStateTable.setGotoState(222, PseudoNonTerminalEnum.funcall, 229);
  }
  
    
  private static void init_expr_optional_11(NonTerminalGotoStateTable<PseudoNonTerminalEnum> nonTerminalGotoStateTable) {
       nonTerminalGotoStateTable.setGotoState(178, PseudoNonTerminalEnum.expr_optional_11, 179);
  }
  
    
  private static void init_type_star_0_sub(NonTerminalGotoStateTable<PseudoNonTerminalEnum> nonTerminalGotoStateTable) {
       nonTerminalGotoStateTable.setGotoState(18, PseudoNonTerminalEnum.type_star_0_sub, 22);
      nonTerminalGotoStateTable.setGotoState(157, PseudoNonTerminalEnum.type_star_0_sub, 22);
  }
  
    
  private static void init_function_rtype(NonTerminalGotoStateTable<PseudoNonTerminalEnum> nonTerminalGotoStateTable) {
       nonTerminalGotoStateTable.setGotoState(246, PseudoNonTerminalEnum.function_rtype, 249);
  }
  
    
  private static void init_parameter_star_5(NonTerminalGotoStateTable<PseudoNonTerminalEnum> nonTerminalGotoStateTable) {
       nonTerminalGotoStateTable.setGotoState(36, PseudoNonTerminalEnum.parameter_star_5, 123);
      nonTerminalGotoStateTable.setGotoState(52, PseudoNonTerminalEnum.parameter_star_5, 123);
      nonTerminalGotoStateTable.setGotoState(244, PseudoNonTerminalEnum.parameter_star_5, 123);
  }
  
    
  private static void init_id_optional_9(NonTerminalGotoStateTable<PseudoNonTerminalEnum> nonTerminalGotoStateTable) {
       nonTerminalGotoStateTable.setGotoState(174, PseudoNonTerminalEnum.id_optional_9, 176);
  }
  
    
  private static void init_expr_star_6_sub(NonTerminalGotoStateTable<PseudoNonTerminalEnum> nonTerminalGotoStateTable) {
       nonTerminalGotoStateTable.setGotoState(70, PseudoNonTerminalEnum.expr_star_6_sub, 71);
      nonTerminalGotoStateTable.setGotoState(115, PseudoNonTerminalEnum.expr_star_6_sub, 71);
      nonTerminalGotoStateTable.setGotoState(131, PseudoNonTerminalEnum.expr_star_6_sub, 71);
  }
  
    
  private static void init_primary(NonTerminalGotoStateTable<PseudoNonTerminalEnum> nonTerminalGotoStateTable) {
       nonTerminalGotoStateTable.setGotoState(43, PseudoNonTerminalEnum.primary, 199);
      nonTerminalGotoStateTable.setGotoState(44, PseudoNonTerminalEnum.primary, 146);
      nonTerminalGotoStateTable.setGotoState(47, PseudoNonTerminalEnum.primary, 69);
      nonTerminalGotoStateTable.setGotoState(50, PseudoNonTerminalEnum.primary, 69);
      nonTerminalGotoStateTable.setGotoState(55, PseudoNonTerminalEnum.primary, 69);
      nonTerminalGotoStateTable.setGotoState(59, PseudoNonTerminalEnum.primary, 69);
      nonTerminalGotoStateTable.setGotoState(60, PseudoNonTerminalEnum.primary, 69);
      nonTerminalGotoStateTable.setGotoState(62, PseudoNonTerminalEnum.primary, 69);
      nonTerminalGotoStateTable.setGotoState(63, PseudoNonTerminalEnum.primary, 69);
      nonTerminalGotoStateTable.setGotoState(68, PseudoNonTerminalEnum.primary, 69);
      nonTerminalGotoStateTable.setGotoState(70, PseudoNonTerminalEnum.primary, 69);
      nonTerminalGotoStateTable.setGotoState(72, PseudoNonTerminalEnum.primary, 69);
      nonTerminalGotoStateTable.setGotoState(75, PseudoNonTerminalEnum.primary, 69);
      nonTerminalGotoStateTable.setGotoState(77, PseudoNonTerminalEnum.primary, 69);
      nonTerminalGotoStateTable.setGotoState(79, PseudoNonTerminalEnum.primary, 69);
      nonTerminalGotoStateTable.setGotoState(81, PseudoNonTerminalEnum.primary, 69);
      nonTerminalGotoStateTable.setGotoState(83, PseudoNonTerminalEnum.primary, 69);
      nonTerminalGotoStateTable.setGotoState(85, PseudoNonTerminalEnum.primary, 69);
      nonTerminalGotoStateTable.setGotoState(87, PseudoNonTerminalEnum.primary, 69);
      nonTerminalGotoStateTable.setGotoState(89, PseudoNonTerminalEnum.primary, 69);
      nonTerminalGotoStateTable.setGotoState(91, PseudoNonTerminalEnum.primary, 69);
      nonTerminalGotoStateTable.setGotoState(93, PseudoNonTerminalEnum.primary, 69);
      nonTerminalGotoStateTable.setGotoState(95, PseudoNonTerminalEnum.primary, 69);
      nonTerminalGotoStateTable.setGotoState(97, PseudoNonTerminalEnum.primary, 69);
      nonTerminalGotoStateTable.setGotoState(99, PseudoNonTerminalEnum.primary, 69);
      nonTerminalGotoStateTable.setGotoState(101, PseudoNonTerminalEnum.primary, 69);
      nonTerminalGotoStateTable.setGotoState(115, PseudoNonTerminalEnum.primary, 69);
      nonTerminalGotoStateTable.setGotoState(131, PseudoNonTerminalEnum.primary, 69);
      nonTerminalGotoStateTable.setGotoState(135, PseudoNonTerminalEnum.primary, 69);
      nonTerminalGotoStateTable.setGotoState(151, PseudoNonTerminalEnum.primary, 69);
      nonTerminalGotoStateTable.setGotoState(156, PseudoNonTerminalEnum.primary, 69);
      nonTerminalGotoStateTable.setGotoState(157, PseudoNonTerminalEnum.primary, 69);
      nonTerminalGotoStateTable.setGotoState(160, PseudoNonTerminalEnum.primary, 69);
      nonTerminalGotoStateTable.setGotoState(170, PseudoNonTerminalEnum.primary, 69);
      nonTerminalGotoStateTable.setGotoState(178, PseudoNonTerminalEnum.primary, 69);
      nonTerminalGotoStateTable.setGotoState(185, PseudoNonTerminalEnum.primary, 69);
      nonTerminalGotoStateTable.setGotoState(190, PseudoNonTerminalEnum.primary, 69);
      nonTerminalGotoStateTable.setGotoState(203, PseudoNonTerminalEnum.primary, 69);
      nonTerminalGotoStateTable.setGotoState(210, PseudoNonTerminalEnum.primary, 69);
      nonTerminalGotoStateTable.setGotoState(214, PseudoNonTerminalEnum.primary, 199);
      nonTerminalGotoStateTable.setGotoState(220, PseudoNonTerminalEnum.primary, 69);
      nonTerminalGotoStateTable.setGotoState(222, PseudoNonTerminalEnum.primary, 199);
  }
  
    
  private static void init_script_member(NonTerminalGotoStateTable<PseudoNonTerminalEnum> nonTerminalGotoStateTable) {
       nonTerminalGotoStateTable.setGotoState(3, PseudoNonTerminalEnum.script_member, 255);
  }
  
    
  private static void init_primitive_type(NonTerminalGotoStateTable<PseudoNonTerminalEnum> nonTerminalGotoStateTable) {
       nonTerminalGotoStateTable.setGotoState(7, PseudoNonTerminalEnum.primitive_type, 25);
      nonTerminalGotoStateTable.setGotoState(18, PseudoNonTerminalEnum.primitive_type, 25);
      nonTerminalGotoStateTable.setGotoState(23, PseudoNonTerminalEnum.primitive_type, 25);
      nonTerminalGotoStateTable.setGotoState(30, PseudoNonTerminalEnum.primitive_type, 25);
      nonTerminalGotoStateTable.setGotoState(36, PseudoNonTerminalEnum.primitive_type, 25);
      nonTerminalGotoStateTable.setGotoState(43, PseudoNonTerminalEnum.primitive_type, 25);
      nonTerminalGotoStateTable.setGotoState(45, PseudoNonTerminalEnum.primitive_type, 140);
      nonTerminalGotoStateTable.setGotoState(52, PseudoNonTerminalEnum.primitive_type, 25);
      nonTerminalGotoStateTable.setGotoState(126, PseudoNonTerminalEnum.primitive_type, 25);
      nonTerminalGotoStateTable.setGotoState(157, PseudoNonTerminalEnum.primitive_type, 25);
      nonTerminalGotoStateTable.setGotoState(214, PseudoNonTerminalEnum.primitive_type, 25);
      nonTerminalGotoStateTable.setGotoState(244, PseudoNonTerminalEnum.primitive_type, 25);
      nonTerminalGotoStateTable.setGotoState(247, PseudoNonTerminalEnum.primitive_type, 25);
  }
  
    
  private static void init_loop_label(NonTerminalGotoStateTable<PseudoNonTerminalEnum> nonTerminalGotoStateTable) {
       nonTerminalGotoStateTable.setGotoState(43, PseudoNonTerminalEnum.loop_label, 233);
  }
  
  
  public static NonTerminalGotoStateTable<PseudoNonTerminalEnum> create() {
     NonTerminalGotoStateTable<PseudoNonTerminalEnum> nonTerminalGotoStateTable=
       new NonTerminalGotoStateTable<PseudoNonTerminalEnum>(256);
     init_start(nonTerminalGotoStateTable);
         init_parameters(nonTerminalGotoStateTable);
         init_for_loop_init_optional_12(nonTerminalGotoStateTable);
         init_instr_star_7(nonTerminalGotoStateTable);
         init_declaration(nonTerminalGotoStateTable);
         init_for_loop_incr(nonTerminalGotoStateTable);
         init_primary_no_array_creation(nonTerminalGotoStateTable);
         init_type_star_0(nonTerminalGotoStateTable);
         init_expr_star_6(nonTerminalGotoStateTable);
         init_semis(nonTerminalGotoStateTable);
         init_block(nonTerminalGotoStateTable);
         init_funtype(nonTerminalGotoStateTable);
         init_parameter_star_5_sub(nonTerminalGotoStateTable);
         init_array_access(nonTerminalGotoStateTable);
         init_field(nonTerminalGotoStateTable);
         init_dim_expr(nonTerminalGotoStateTable);
         init_assignation(nonTerminalGotoStateTable);
         init_parameter(nonTerminalGotoStateTable);
         init_return_type(nonTerminalGotoStateTable);
         init_dims(nonTerminalGotoStateTable);
         init_function_def(nonTerminalGotoStateTable);
         init_loop_label_optional_8(nonTerminalGotoStateTable);
         init_field_access(nonTerminalGotoStateTable);
         init_array_creation(nonTerminalGotoStateTable);
         init_lhs(nonTerminalGotoStateTable);
         init_field_star_2(nonTerminalGotoStateTable);
         init_arguments(nonTerminalGotoStateTable);
         init_record_init(nonTerminalGotoStateTable);
         init_record_init_optional_3(nonTerminalGotoStateTable);
         init_for_loop_init(nonTerminalGotoStateTable);
         init_type(nonTerminalGotoStateTable);
         init_expr_optional_13(nonTerminalGotoStateTable);
         init_loop(nonTerminalGotoStateTable);
         init_expr(nonTerminalGotoStateTable);
         init_script_member_star_1(nonTerminalGotoStateTable);
         init_conditional(nonTerminalGotoStateTable);
         init_record_def(nonTerminalGotoStateTable);
         init_dim_expr_plus_15(nonTerminalGotoStateTable);
         init_function_rtype_optional_4(nonTerminalGotoStateTable);
         init_id_optional_10(nonTerminalGotoStateTable);
         init_for_loop_incr_optional_14(nonTerminalGotoStateTable);
         init_dims_opt(nonTerminalGotoStateTable);
         init_instr(nonTerminalGotoStateTable);
         init_dim_expr_plus_16(nonTerminalGotoStateTable);
         init_funcall(nonTerminalGotoStateTable);
         init_expr_optional_11(nonTerminalGotoStateTable);
         init_type_star_0_sub(nonTerminalGotoStateTable);
         init_function_rtype(nonTerminalGotoStateTable);
         init_parameter_star_5(nonTerminalGotoStateTable);
         init_id_optional_9(nonTerminalGotoStateTable);
         init_expr_star_6_sub(nonTerminalGotoStateTable);
         init_primary(nonTerminalGotoStateTable);
         init_script_member(nonTerminalGotoStateTable);
         init_primitive_type(nonTerminalGotoStateTable);
         init_loop_label(nonTerminalGotoStateTable);
         return nonTerminalGotoStateTable;
  } 
}