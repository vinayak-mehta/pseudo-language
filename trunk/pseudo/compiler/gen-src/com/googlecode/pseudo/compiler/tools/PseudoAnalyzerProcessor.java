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
  
import com.googlecode.pseudo.compiler.lexer.PseudoRuleEnum;
import com.googlecode.pseudo.compiler.parser.PseudoTerminalEnum;
import com.googlecode.pseudo.compiler.parser.PseudoNonTerminalEnum;
import com.googlecode.pseudo.compiler.parser.PseudoProductionEnum;
import com.googlecode.pseudo.compiler.tools.PseudoTerminalEvaluator;
import com.googlecode.pseudo.compiler.tools.PseudoGrammarEvaluator;

import fr.umlv.tatoo.runtime.buffer.LexerBuffer;
import fr.umlv.tatoo.runtime.tools.AnalyzerListener;
import fr.umlv.tatoo.runtime.tools.DataViewer;
import fr.umlv.tatoo.runtime.tools.SemanticStack;

/**  This class is called by the parser when
 *  <ol>
 *    <li>a terminal is shifted</li>
 *    <li>a non terminal is reduced</li>
 *    <li>a non terminal is accepted</li>
 *   </ol>
 *   In that case, depending on the information of the .xtls, terminal and non-terminal
 *   values are pushed/pop from a semantic stack.
 *   
 *   Furthermore, in case of error recovery, values of the stack can be pop out
 *   depending if the last recognized element is a terminal or a non-terminal.
 * 
 *  This class is generated - please do not edit it 
 */
public class PseudoAnalyzerProcessor<B extends LexerBuffer,D>
  implements AnalyzerListener<PseudoRuleEnum,B,PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum> {
          
  private final PseudoGrammarEvaluator grammarEvaluator;
  private final PseudoTerminalEvaluator<? super D> terminalEvaluator;
  private final DataViewer<? super B,? extends D> dataViewer;
  private final SemanticStack stack;
  
  protected PseudoAnalyzerProcessor(PseudoTerminalEvaluator<? super D> terminalEvaluator, PseudoGrammarEvaluator grammarEvaluator, DataViewer<? super B,? extends D> dataViewer, SemanticStack stack) {
    this.terminalEvaluator=terminalEvaluator;
    this.grammarEvaluator=grammarEvaluator;
    this.dataViewer=dataViewer;
    this.stack=stack;
  }
  
  /** Creates a tools listener that redirect accept/shift/reduce and comment to the terminal Evaluator
      and the grammar evaluator..
      This constructor allows to share the same stack between more
      than one parser processor.
      @param terminalEvaluator the terminal evaluator.
      @param grammarEvaluator the grammar evaluator.
      @param stack the stack used by the processor
   */
  public static <B extends LexerBuffer,D> PseudoAnalyzerProcessor<B,D>
    createPseudoAnalyzerProcessor(PseudoTerminalEvaluator<? super D> terminalEvaluator, PseudoGrammarEvaluator grammarEvaluator, DataViewer<? super B,? extends D> dataViewer, SemanticStack stack) {
    
    return new PseudoAnalyzerProcessor<B,D>(terminalEvaluator,grammarEvaluator,dataViewer,stack);
  }
  
  public void comment(PseudoRuleEnum rule, B buffer) {
    D data;
    switch(rule) {           case comment:
            data=dataViewer.view(buffer);
            terminalEvaluator.comment(data);
            return;
              default:
    }
    throw new AssertionError("unknown rule "+rule);
  }
 
   public void shift(PseudoTerminalEnum terminal, PseudoRuleEnum rule, B buffer) {
     D data;
     switch(terminal) {      case plus: {
                       return;
           }
                 case minus: {
                       return;
           }
                 case star: {
                       return;
           }
                 case slash: {
                       return;
           }
                 case mod: {
                       return;
           }
                 case pow: {
                       return;
           }
                 case band: {
                       return;
           }
                 case bor: {
                       return;
           }
                 case eq: {
                       return;
           }
                 case neq: {
                       return;
           }
                 case lt: {
                       return;
           }
                 case gt: {
                       return;
           }
                 case le: {
                       return;
           }
                 case ge: {
                       return;
           }
                 case assign: {
                       return;
           }
                 case lpar: {
                       return;
           }
                 case rpar: {
                       return;
           }
                 case lcurl: {
                       return;
           }
                 case rcurl: {
                       return;
           }
                 case lopt: {
                       return;
           }
                 case ropt: {
                       return;
           }
                 case bang: {
                       return;
           }
                 case dot: {
                       return;
           }
                 case colon: {
                       return;
           }
                 case semicolon: {
                       return;
           }
                 case comma: {
                       return;
           }
                 case _if: {
                       return;
           }
                 case _else: {
                       return;
           }
                 case _for: {
                       return;
           }
                 case _while: {
                       return;
           }
                 case _do: {
                       return;
           }
                 case _return: {
                       return;
           }
                 case _break: {
                       return;
           }
                 case _continue: {
                       return;
           }
                 case _new: {
                       return;
           }
                 case _throw: {
                       return;
           }
                 case record: {
                       return;
           }
                 case init: {
                       return;
           }
                 case def: {
                       return;
           }
                 case lambda: {
                       return;
           }
                 case arrow: {
                       return;
           }
                 case print: {
                       return;
           }
                 case scan: {
                       return;
           }
                 case _boolean: {
                       return;
           }
                 case _char: {
                       return;
           }
                 case _int: {
                       return;
           }
                 case _double: {
                       return;
           }
                 case string: {
                       return;
           }
                 case any: {
                       return;
           }
                 case _void: {
                       return;
           }
                 case null_literal: {
                       return;
           }
                 case boolean_literal: {
         data=dataViewer.view(buffer);
                                  com.googlecode.pseudo.compiler.ast.BooleanLiteralToken boolean_literal=terminalEvaluator.boolean_literal(data);
                                      stack.push_Object(boolean_literal);
                                 return;
           }
                 case char_literal: {
         data=dataViewer.view(buffer);
                                  com.googlecode.pseudo.compiler.ast.CharLiteralToken char_literal=terminalEvaluator.char_literal(data);
                                      stack.push_Object(char_literal);
                                 return;
           }
                 case string_literal: {
         data=dataViewer.view(buffer);
                                  com.googlecode.pseudo.compiler.ast.StringLiteralToken string_literal=terminalEvaluator.string_literal(data);
                                      stack.push_Object(string_literal);
                                 return;
           }
                 case value_literal: {
         data=dataViewer.view(buffer);
                                  com.googlecode.pseudo.compiler.ast.ValueLiteralToken value_literal=terminalEvaluator.value_literal(data);
                                      stack.push_Object(value_literal);
                                 return;
           }
                 case id: {
         data=dataViewer.view(buffer);
                                  com.googlecode.pseudo.compiler.ast.IdToken id=terminalEvaluator.id(data);
                                      stack.push_Object(id);
                                 return;
           }
                 case eoln: {
                       return;
           }
                 case __eof__: {
                       return;
           }
                 }
     throw new AssertionError("unknown terminal "+terminal);
   }
    
    
    @SuppressWarnings("unchecked")
    public void reduce(PseudoProductionEnum production) {
      switch(production) {           case primitive_type_boolean: { // not synthetic
                                       stack.push_Object(grammarEvaluator.primitive_type_boolean());
                      
          }
          return;
                    case primitive_type_char: { // not synthetic
                                       stack.push_Object(grammarEvaluator.primitive_type_char());
                      
          }
          return;
                    case primitive_type_int: { // not synthetic
                                       stack.push_Object(grammarEvaluator.primitive_type_int());
                      
          }
          return;
                    case primitive_type_double: { // not synthetic
                                       stack.push_Object(grammarEvaluator.primitive_type_double());
                      
          }
          return;
                    case primitive_type_string: { // not synthetic
                                       stack.push_Object(grammarEvaluator.primitive_type_string());
                      
          }
          return;
                    case primitive_type_any: { // not synthetic
                                       stack.push_Object(grammarEvaluator.primitive_type_any());
                      
          }
          return;
                    case type_id: { // not synthetic
                                 IdToken id=(IdToken)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.type_id(id));
                      
          }
          return;
                    case type_id_dims: { // not synthetic
                                 Dims dims=(Dims)stack.pop_Object();
                                          IdToken id=(IdToken)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.type_id_dims(id,dims));
                      
          }
          return;
                    case type_primitive: { // not synthetic
                                 PrimitiveType primitive_type=(PrimitiveType)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.type_primitive(primitive_type));
                      
          }
          return;
                    case type_primitive_dims: { // not synthetic
                                 Dims dims=(Dims)stack.pop_Object();
                                          PrimitiveType primitive_type=(PrimitiveType)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.type_primitive_dims(primitive_type,dims));
                      
          }
          return;
                    case type_funtype: { // not synthetic
                                 Funtype funtype=(Funtype)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.type_funtype(funtype));
                      
          }
          return;
                    case type_funtype_dims: { // not synthetic
                                 Dims dims=(Dims)stack.pop_Object();
                                          Funtype funtype=(Funtype)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.type_funtype_dims(funtype,dims));
                      
          }
          return;
                    case type_star_0_element: { // STAR_SINGLETON
                             java.util.ArrayList<Type> list=
                     new java.util.ArrayList<Type>();
                   list.add((Type)stack.pop_Object());
                   stack.push_Object(list);
                    
          }
          return;
                    case type_star_0_rec: { // STAR_RECURSIVE_LEFT
                            
                    Type type=(Type)stack.pop_Object();
                    List<Type> type_star_0_sub=(List<Type>)stack.pop_Object();
                     type_star_0_sub.add(type);
                     stack.push_Object(type_star_0_sub);
                       
          }
          return;
                    case type_star_0_empty: { // STAR_EMPTY
                            stack.push_Object(new java.util.ArrayList<Object>());
                  
          }
          return;
                    case type_star_0_through: { // STAR_PASS_THROUGH
            
          }
          return;
                    case funtype: { // not synthetic
                                 ReturnType return_type=(ReturnType)stack.pop_Object();
                                          List<Type> type_star_0=(List<Type>)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.funtype(type_star_0,return_type));
                      
          }
          return;
                    case return_type_type: { // not synthetic
                                 Type type=(Type)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.return_type_type(type));
                      
          }
          return;
                    case return_type_void: { // not synthetic
                                       stack.push_Object(grammarEvaluator.return_type_void());
                      
          }
          return;
                    case script_member_star_1_empty: { // STAR_EMPTY
                            stack.push_Object(new java.util.ArrayList<Object>());
                  
          }
          return;
                    case script_member_star_1_rec: { // STAR_RECURSIVE_LEFT
                            
                    ScriptMember script_member=(ScriptMember)stack.pop_Object();
                    List<ScriptMember> script_member_star_1=(List<ScriptMember>)stack.pop_Object();
                     script_member_star_1.add(script_member);
                     stack.push_Object(script_member_star_1);
                       
          }
          return;
                    case start: { // not synthetic
                                 List<ScriptMember> script_member_star_1=(List<ScriptMember>)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.start(script_member_star_1));
                      
          }
          return;
                    case script_member_record_def: { // not synthetic
                                 RecordDef record_def=(RecordDef)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.script_member_record_def(record_def));
                      
          }
          return;
                    case script_member_function_def: { // not synthetic
                                 FunctionDef function_def=(FunctionDef)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.script_member_function_def(function_def));
                      
          }
          return;
                    case script_member_block: { // not synthetic
                                 Block block=(Block)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.script_member_block(block));
                      
          }
          return;
                    case field_star_2_empty: { // STAR_EMPTY
                            stack.push_Object(new java.util.ArrayList<Object>());
                  
          }
          return;
                    case field_star_2_rec: { // STAR_RECURSIVE_LEFT
                            
                    Field field=(Field)stack.pop_Object();
                    List<Field> field_star_2=(List<Field>)stack.pop_Object();
                     field_star_2.add(field);
                     stack.push_Object(field_star_2);
                       
          }
          return;
                    case record_init_optional_3_empty: { // OPTIONAL_EMPTY
                              stack.push_Object(null);
                    
          }
          return;
                    case record_init_optional_3_record_init: { // OPTIONAL_SINGLETON
            
          }
          return;
                    case record_def: { // not synthetic
                                 RecordInit record_init_optional_3=(RecordInit)stack.pop_Object();
                                          List<Field> field_star_2=(List<Field>)stack.pop_Object();
                                          IdToken id=(IdToken)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.record_def(id,field_star_2,record_init_optional_3));
                      
          }
          return;
                    case record_init: { // not synthetic
                                 Block block=(Block)stack.pop_Object();
                                          Parameters parameters=(Parameters)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.record_init(parameters,block));
                      
          }
          return;
                    case field: { // not synthetic
                                 Semis semis=(Semis)stack.pop_Object();
                                          IdToken id=(IdToken)stack.pop_Object();
                                          Type type=(Type)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.field(type,id,semis));
                      
          }
          return;
                    case function_rtype_optional_4_empty: { // OPTIONAL_EMPTY
                              stack.push_Object(null);
                    
          }
          return;
                    case function_rtype_optional_4_function_rtype: { // OPTIONAL_SINGLETON
            
          }
          return;
                    case function_def: { // not synthetic
                                 Block block=(Block)stack.pop_Object();
                                          FunctionRtype function_rtype_optional_4=(FunctionRtype)stack.pop_Object();
                                          Parameters parameters=(Parameters)stack.pop_Object();
                                          IdToken id=(IdToken)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.function_def(id,parameters,function_rtype_optional_4,block));
                      
          }
          return;
                    case function_rtype: { // not synthetic
                                 ReturnType return_type=(ReturnType)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.function_rtype(return_type));
                      
          }
          return;
                    case parameter_star_5_element: { // STAR_SINGLETON
                             java.util.ArrayList<Parameter> list=
                     new java.util.ArrayList<Parameter>();
                   list.add((Parameter)stack.pop_Object());
                   stack.push_Object(list);
                    
          }
          return;
                    case parameter_star_5_rec: { // STAR_RECURSIVE_LEFT
                            
                    Parameter parameter=(Parameter)stack.pop_Object();
                    List<Parameter> parameter_star_5_sub=(List<Parameter>)stack.pop_Object();
                     parameter_star_5_sub.add(parameter);
                     stack.push_Object(parameter_star_5_sub);
                       
          }
          return;
                    case parameter_star_5_empty: { // STAR_EMPTY
                            stack.push_Object(new java.util.ArrayList<Object>());
                  
          }
          return;
                    case parameter_star_5_through: { // STAR_PASS_THROUGH
            
          }
          return;
                    case parameters: { // not synthetic
                                 List<Parameter> parameter_star_5=(List<Parameter>)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.parameters(parameter_star_5));
                      
          }
          return;
                    case parameter_naked: { // not synthetic
                                 IdToken id=(IdToken)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.parameter_naked(id));
                      
          }
          return;
                    case parameter_typed: { // not synthetic
                                 IdToken id=(IdToken)stack.pop_Object();
                                          Type type=(Type)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.parameter_typed(type,id));
                      
          }
          return;
                    case expr_star_6_element: { // STAR_SINGLETON
                             java.util.ArrayList<Expr> list=
                     new java.util.ArrayList<Expr>();
                   list.add((Expr)stack.pop_Object());
                   stack.push_Object(list);
                    
          }
          return;
                    case expr_star_6_rec: { // STAR_RECURSIVE_LEFT
                            
                    Expr expr=(Expr)stack.pop_Object();
                    List<Expr> expr_star_6_sub=(List<Expr>)stack.pop_Object();
                     expr_star_6_sub.add(expr);
                     stack.push_Object(expr_star_6_sub);
                       
          }
          return;
                    case expr_star_6_empty: { // STAR_EMPTY
                            stack.push_Object(new java.util.ArrayList<Object>());
                  
          }
          return;
                    case expr_star_6_through: { // STAR_PASS_THROUGH
            
          }
          return;
                    case arguments: { // not synthetic
                                 List<Expr> expr_star_6=(List<Expr>)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.arguments(expr_star_6));
                      
          }
          return;
                    case instr_star_7_empty: { // STAR_EMPTY
                            stack.push_Object(new java.util.ArrayList<Object>());
                  
          }
          return;
                    case instr_star_7_rec: { // STAR_RECURSIVE_LEFT
                            
                    Instr instr=(Instr)stack.pop_Object();
                    List<Instr> instr_star_7=(List<Instr>)stack.pop_Object();
                     instr_star_7.add(instr);
                     stack.push_Object(instr_star_7);
                       
          }
          return;
                    case block: { // not synthetic
                                 List<Instr> instr_star_7=(List<Instr>)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.block(instr_star_7));
                      
          }
          return;
                    case instr_print: { // not synthetic
                                 Semis semis=(Semis)stack.pop_Object();
                                          Expr expr=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.instr_print(expr,semis));
                      
          }
          return;
                    case instr_scan: { // not synthetic
                                 Semis semis=(Semis)stack.pop_Object();
                                          Primary primary=(Primary)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.instr_scan(primary,semis));
                      
          }
          return;
                    case instr_declaration: { // not synthetic
                                 Semis semis=(Semis)stack.pop_Object();
                                          Declaration declaration=(Declaration)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.instr_declaration(declaration,semis));
                      
          }
          return;
                    case instr_assignation: { // not synthetic
                                 Semis semis=(Semis)stack.pop_Object();
                                          Assignation assignation=(Assignation)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.instr_assignation(assignation,semis));
                      
          }
          return;
                    case instr_funcall: { // not synthetic
                                 Semis semis=(Semis)stack.pop_Object();
                                          Funcall funcall=(Funcall)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.instr_funcall(funcall,semis));
                      
          }
          return;
                    case instr_conditional: { // not synthetic
                                 Conditional conditional=(Conditional)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.instr_conditional(conditional));
                      
          }
          return;
                    case loop_label_optional_8_empty: { // OPTIONAL_EMPTY
                              stack.push_Object(null);
                    
          }
          return;
                    case loop_label_optional_8_loop_label: { // OPTIONAL_SINGLETON
            
          }
          return;
                    case instr_loop: { // not synthetic
                                 Loop loop=(Loop)stack.pop_Object();
                                          LoopLabel loop_label_optional_8=(LoopLabel)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.instr_loop(loop_label_optional_8,loop));
                      
          }
          return;
                    case id_optional_9_empty: { // OPTIONAL_EMPTY
                              stack.push_Object(null);
                    
          }
          return;
                    case id_optional_9_id: { // OPTIONAL_SINGLETON
            
          }
          return;
                    case instr_break: { // not synthetic
                                 Semis semis=(Semis)stack.pop_Object();
                                          IdToken id_optional_9=(IdToken)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.instr_break(id_optional_9,semis));
                      
          }
          return;
                    case id_optional_10_empty: { // OPTIONAL_EMPTY
                              stack.push_Object(null);
                    
          }
          return;
                    case id_optional_10_id: { // OPTIONAL_SINGLETON
            
          }
          return;
                    case instr_continue: { // not synthetic
                                 Semis semis=(Semis)stack.pop_Object();
                                          IdToken id_optional_10=(IdToken)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.instr_continue(id_optional_10,semis));
                      
          }
          return;
                    case expr_optional_11_empty: { // OPTIONAL_EMPTY
                              stack.push_Object(null);
                    
          }
          return;
                    case expr_optional_11_expr: { // OPTIONAL_SINGLETON
            
          }
          return;
                    case instr_return: { // not synthetic
                                 Semis semis=(Semis)stack.pop_Object();
                                          Expr expr_optional_11=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.instr_return(expr_optional_11,semis));
                      
          }
          return;
                    case instr_throw: { // not synthetic
                                 Semis semis=(Semis)stack.pop_Object();
                                          Expr expr=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.instr_throw(expr,semis));
                      
          }
          return;
                    case instr_block: { // not synthetic
                                 Block block=(Block)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.instr_block(block));
                      
          }
          return;
                    case instr_empty: { // not synthetic
                                       stack.push_Object(grammarEvaluator.instr_empty());
                      
          }
          return;
                    case semis__semicolon: { // not synthetic
                                       stack.push_Object(grammarEvaluator.semis__semicolon());
                      
          }
          return;
                    case semis__eoln: { // not synthetic
                                       stack.push_Object(grammarEvaluator.semis__eoln());
                      
          }
          return;
                    case declaration_id: { // not synthetic
                                 IdToken id=(IdToken)stack.pop_Object();
                                          Type type=(Type)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.declaration_id(type,id));
                      
          }
          return;
                    case declaration_id_init: { // not synthetic
                                 Expr expr=(Expr)stack.pop_Object();
                                          IdToken id=(IdToken)stack.pop_Object();
                                          Type type=(Type)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.declaration_id_init(type,id,expr));
                      
          }
          return;
                    case funcall_id: { // not synthetic
                                 Arguments arguments=(Arguments)stack.pop_Object();
                                          IdToken id=(IdToken)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.funcall_id(id,arguments));
                      
          }
          return;
                    case funcall_primary: { // not synthetic
                                 Arguments arguments=(Arguments)stack.pop_Object();
                                          Primary primary=(Primary)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.funcall_primary(primary,arguments));
                      
          }
          return;
                    case conditional_if: { // not synthetic
                                 Block block=(Block)stack.pop_Object();
                                          Expr expr=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.conditional_if(expr,block));
                      
          }
          return;
                    case conditional_if_else: { // not synthetic
                                 Block block2=(Block)stack.pop_Object();
                                          Block block=(Block)stack.pop_Object();
                                          Expr expr=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.conditional_if_else(expr,block,block2));
                      
          }
          return;
                    case loop_while: { // not synthetic
                                 Block block=(Block)stack.pop_Object();
                                          Expr expr=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.loop_while(expr,block));
                      
          }
          return;
                    case loop_dowhile: { // not synthetic
                                 Expr expr=(Expr)stack.pop_Object();
                                          Block block=(Block)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.loop_dowhile(block,expr));
                      
          }
          return;
                    case for_loop_init_optional_12_empty: { // OPTIONAL_EMPTY
                              stack.push_Object(null);
                    
          }
          return;
                    case for_loop_init_optional_12_for_loop_init: { // OPTIONAL_SINGLETON
            
          }
          return;
                    case expr_optional_13_empty: { // OPTIONAL_EMPTY
                              stack.push_Object(null);
                    
          }
          return;
                    case expr_optional_13_expr: { // OPTIONAL_SINGLETON
            
          }
          return;
                    case for_loop_incr_optional_14_empty: { // OPTIONAL_EMPTY
                              stack.push_Object(null);
                    
          }
          return;
                    case for_loop_incr_optional_14_for_loop_incr: { // OPTIONAL_SINGLETON
            
          }
          return;
                    case loop_for: { // not synthetic
                                 Block block=(Block)stack.pop_Object();
                                          ForLoopIncr for_loop_incr_optional_14=(ForLoopIncr)stack.pop_Object();
                                          Expr expr_optional_13=(Expr)stack.pop_Object();
                                          ForLoopInit for_loop_init_optional_12=(ForLoopInit)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.loop_for(for_loop_init_optional_12,expr_optional_13,for_loop_incr_optional_14,block));
                      
          }
          return;
                    case for_loop_init_declaration: { // not synthetic
                                 Declaration declaration=(Declaration)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.for_loop_init_declaration(declaration));
                      
          }
          return;
                    case for_loop_init_assignation: { // not synthetic
                                 Assignation assignation=(Assignation)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.for_loop_init_assignation(assignation));
                      
          }
          return;
                    case for_loop_init_funcall: { // not synthetic
                                 Funcall funcall=(Funcall)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.for_loop_init_funcall(funcall));
                      
          }
          return;
                    case for_loop_incr_assignation: { // not synthetic
                                 Assignation assignation=(Assignation)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.for_loop_incr_assignation(assignation));
                      
          }
          return;
                    case for_loop_incr_funcall: { // not synthetic
                                 Funcall funcall=(Funcall)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.for_loop_incr_funcall(funcall));
                      
          }
          return;
                    case loop_label: { // not synthetic
                                 IdToken id=(IdToken)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.loop_label(id));
                      
          }
          return;
                    case assignation: { // not synthetic
                                 Expr expr=(Expr)stack.pop_Object();
                                          Lhs lhs=(Lhs)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.assignation(lhs,expr));
                      
          }
          return;
                    case lhs_id: { // not synthetic
                                 IdToken id=(IdToken)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.lhs_id(id));
                      
          }
          return;
                    case lhs_field_access: { // not synthetic
                                 FieldAccess field_access=(FieldAccess)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.lhs_field_access(field_access));
                      
          }
          return;
                    case lhs_array_access: { // not synthetic
                                 ArrayAccess array_access=(ArrayAccess)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.lhs_array_access(array_access));
                      
          }
          return;
                    case primary_primary_no_array_creation: { // not synthetic
                                 PrimaryNoArrayCreation primary_no_array_creation=(PrimaryNoArrayCreation)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.primary_primary_no_array_creation(primary_no_array_creation));
                      
          }
          return;
                    case primary_array_creation: { // not synthetic
                                 ArrayCreation array_creation=(ArrayCreation)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.primary_array_creation(array_creation));
                      
          }
          return;
                    case primary_field_access: { // not synthetic
                                 FieldAccess field_access=(FieldAccess)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.primary_field_access(field_access));
                      
          }
          return;
                    case primary_array_access: { // not synthetic
                                 ArrayAccess array_access=(ArrayAccess)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.primary_array_access(array_access));
                      
          }
          return;
                    case primary_parens: { // not synthetic
                                 Expr expr=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.primary_parens(expr));
                      
          }
          return;
                    case primary_allocation: { // not synthetic
                                 Arguments arguments=(Arguments)stack.pop_Object();
                                          IdToken id=(IdToken)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.primary_allocation(id,arguments));
                      
          }
          return;
                    case primary_funcall: { // not synthetic
                                 Funcall funcall=(Funcall)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.primary_funcall(funcall));
                      
          }
          return;
                    case array_access_id: { // not synthetic
                                 Expr expr=(Expr)stack.pop_Object();
                                          IdToken id=(IdToken)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.array_access_id(id,expr));
                      
          }
          return;
                    case array_access_primary: { // not synthetic
                                 Expr expr=(Expr)stack.pop_Object();
                                          PrimaryNoArrayCreation primary_no_array_creation=(PrimaryNoArrayCreation)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.array_access_primary(primary_no_array_creation,expr));
                      
          }
          return;
                    case field_access_id: { // not synthetic
                                 IdToken id2=(IdToken)stack.pop_Object();
                                          IdToken id=(IdToken)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.field_access_id(id,id2));
                      
          }
          return;
                    case field_access_primary: { // not synthetic
                                 IdToken id=(IdToken)stack.pop_Object();
                                          Primary primary=(Primary)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.field_access_primary(primary,id));
                      
          }
          return;
                    case dim_expr_plus_15_element: { // STAR_SINGLETON
                             java.util.ArrayList<DimExpr> list=
                     new java.util.ArrayList<DimExpr>();
                   list.add((DimExpr)stack.pop_Object());
                   stack.push_Object(list);
                    
          }
          return;
                    case dim_expr_plus_15_rec: { // STAR_RECURSIVE_LEFT
                            
                    DimExpr dim_expr=(DimExpr)stack.pop_Object();
                    List<DimExpr> dim_expr_plus_15=(List<DimExpr>)stack.pop_Object();
                     dim_expr_plus_15.add(dim_expr);
                     stack.push_Object(dim_expr_plus_15);
                       
          }
          return;
                    case array_creation_primitive: { // not synthetic
                                 DimsOpt dims_opt=(DimsOpt)stack.pop_Object();
                                          List<DimExpr> dim_expr_plus_15=(List<DimExpr>)stack.pop_Object();
                                          PrimitiveType primitive_type=(PrimitiveType)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.array_creation_primitive(primitive_type,dim_expr_plus_15,dims_opt));
                      
          }
          return;
                    case dim_expr_plus_16_element: { // STAR_SINGLETON
                             java.util.ArrayList<DimExpr> list=
                     new java.util.ArrayList<DimExpr>();
                   list.add((DimExpr)stack.pop_Object());
                   stack.push_Object(list);
                    
          }
          return;
                    case dim_expr_plus_16_rec: { // STAR_RECURSIVE_LEFT
                            
                    DimExpr dim_expr=(DimExpr)stack.pop_Object();
                    List<DimExpr> dim_expr_plus_16=(List<DimExpr>)stack.pop_Object();
                     dim_expr_plus_16.add(dim_expr);
                     stack.push_Object(dim_expr_plus_16);
                       
          }
          return;
                    case array_creation_record: { // not synthetic
                                 DimsOpt dims_opt=(DimsOpt)stack.pop_Object();
                                          List<DimExpr> dim_expr_plus_16=(List<DimExpr>)stack.pop_Object();
                                          IdToken id=(IdToken)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.array_creation_record(id,dim_expr_plus_16,dims_opt));
                      
          }
          return;
                    case dim_expr: { // not synthetic
                                 Expr expr=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.dim_expr(expr));
                      
          }
          return;
                    case dims_opt_dims: { // not synthetic
                                 Dims dims=(Dims)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.dims_opt_dims(dims));
                      
          }
          return;
                    case dims_opt_empty: { // not synthetic
                                       stack.push_Object(grammarEvaluator.dims_opt_empty());
                      
          }
          return;
                    case dims_singleton: { // not synthetic
                                       stack.push_Object(grammarEvaluator.dims_singleton());
                      
          }
          return;
                    case dims_recursive: { // not synthetic
                                 Dims dims=(Dims)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.dims_recursive(dims));
                      
          }
          return;
                    case expr_boolean_literal: { // not synthetic
                                 BooleanLiteralToken boolean_literal=(BooleanLiteralToken)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_boolean_literal(boolean_literal));
                      
          }
          return;
                    case expr_char_literal: { // not synthetic
                                 CharLiteralToken char_literal=(CharLiteralToken)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_char_literal(char_literal));
                      
          }
          return;
                    case expr_value_literal: { // not synthetic
                                 ValueLiteralToken value_literal=(ValueLiteralToken)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_value_literal(value_literal));
                      
          }
          return;
                    case expr_string_literal: { // not synthetic
                                 StringLiteralToken string_literal=(StringLiteralToken)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_string_literal(string_literal));
                      
          }
          return;
                    case expr_null_literal: { // not synthetic
                                       stack.push_Object(grammarEvaluator.expr_null_literal());
                      
          }
          return;
                    case expr_id: { // not synthetic
                                 IdToken id=(IdToken)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_id(id));
                      
          }
          return;
                    case expr_primary: { // not synthetic
                                 Primary primary=(Primary)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_primary(primary));
                      
          }
          return;
                    case expr_lambda: { // not synthetic
                                 Expr expr=(Expr)stack.pop_Object();
                                          Parameters parameters=(Parameters)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_lambda(parameters,expr));
                      
          }
          return;
                    case expr_neg: { // not synthetic
                                 Expr expr=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_neg(expr));
                      
          }
          return;
                    case expr_unary_plus: { // not synthetic
                                 Expr expr=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_unary_plus(expr));
                      
          }
          return;
                    case expr_unary_minus: { // not synthetic
                                 Expr expr=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_unary_minus(expr));
                      
          }
          return;
                    case expr_eq: { // not synthetic
                                 Expr expr2=(Expr)stack.pop_Object();
                                          Expr expr=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_eq(expr,expr2));
                      
          }
          return;
                    case expr_ne: { // not synthetic
                                 Expr expr2=(Expr)stack.pop_Object();
                                          Expr expr=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_ne(expr,expr2));
                      
          }
          return;
                    case expr_lt: { // not synthetic
                                 Expr expr2=(Expr)stack.pop_Object();
                                          Expr expr=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_lt(expr,expr2));
                      
          }
          return;
                    case expr_le: { // not synthetic
                                 Expr expr2=(Expr)stack.pop_Object();
                                          Expr expr=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_le(expr,expr2));
                      
          }
          return;
                    case expr_gt: { // not synthetic
                                 Expr expr2=(Expr)stack.pop_Object();
                                          Expr expr=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_gt(expr,expr2));
                      
          }
          return;
                    case expr_ge: { // not synthetic
                                 Expr expr2=(Expr)stack.pop_Object();
                                          Expr expr=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_ge(expr,expr2));
                      
          }
          return;
                    case expr_band: { // not synthetic
                                 Expr expr2=(Expr)stack.pop_Object();
                                          Expr expr=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_band(expr,expr2));
                      
          }
          return;
                    case expr_bor: { // not synthetic
                                 Expr expr2=(Expr)stack.pop_Object();
                                          Expr expr=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_bor(expr,expr2));
                      
          }
          return;
                    case expr_plus: { // not synthetic
                                 Expr expr2=(Expr)stack.pop_Object();
                                          Expr expr=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_plus(expr,expr2));
                      
          }
          return;
                    case expr_minus: { // not synthetic
                                 Expr expr2=(Expr)stack.pop_Object();
                                          Expr expr=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_minus(expr,expr2));
                      
          }
          return;
                    case expr_star: { // not synthetic
                                 Expr expr2=(Expr)stack.pop_Object();
                                          Expr expr=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_star(expr,expr2));
                      
          }
          return;
                    case expr_slash: { // not synthetic
                                 Expr expr2=(Expr)stack.pop_Object();
                                          Expr expr=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_slash(expr,expr2));
                      
          }
          return;
                    case expr_mod: { // not synthetic
                                 Expr expr2=(Expr)stack.pop_Object();
                                          Expr expr=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_mod(expr,expr2));
                      
          }
          return;
                    case expr_pow: { // not synthetic
                                 Expr expr2=(Expr)stack.pop_Object();
                                          Expr expr=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_pow(expr,expr2));
                      
          }
          return;
                    default:
             throw new AssertionError("unknown production "+production);
       }
    }

     public void accept(PseudoNonTerminalEnum nonterminal) {
       switch(nonterminal) {            case start:
                        grammarEvaluator.acceptStart((Start)stack.pop_Object());
                        return;
                     default:
       }
        throw new AssertionError("unknown start nonterminal "+nonterminal);
     }

      public void popTerminalOnError(PseudoTerminalEnum terminal) {
        switch(terminal) {             case plus:
              
              return;
                         case minus:
              
              return;
                         case star:
              
              return;
                         case slash:
              
              return;
                         case mod:
              
              return;
                         case pow:
              
              return;
                         case band:
              
              return;
                         case bor:
              
              return;
                         case eq:
              
              return;
                         case neq:
              
              return;
                         case lt:
              
              return;
                         case gt:
              
              return;
                         case le:
              
              return;
                         case ge:
              
              return;
                         case assign:
              
              return;
                         case lpar:
              
              return;
                         case rpar:
              
              return;
                         case lcurl:
              
              return;
                         case rcurl:
              
              return;
                         case lopt:
              
              return;
                         case ropt:
              
              return;
                         case bang:
              
              return;
                         case dot:
              
              return;
                         case colon:
              
              return;
                         case semicolon:
              
              return;
                         case comma:
              
              return;
                         case _if:
              
              return;
                         case _else:
              
              return;
                         case _for:
              
              return;
                         case _while:
              
              return;
                         case _do:
              
              return;
                         case _return:
              
              return;
                         case _break:
              
              return;
                         case _continue:
              
              return;
                         case _new:
              
              return;
                         case _throw:
              
              return;
                         case record:
              
              return;
                         case init:
              
              return;
                         case def:
              
              return;
                         case lambda:
              
              return;
                         case arrow:
              
              return;
                         case print:
              
              return;
                         case scan:
              
              return;
                         case _boolean:
              
              return;
                         case _char:
              
              return;
                         case _int:
              
              return;
                         case _double:
              
              return;
                         case string:
              
              return;
                         case any:
              
              return;
                         case _void:
              
              return;
                         case null_literal:
              
              return;
                         case boolean_literal:
              stack.pop_Object();
              return;
                         case char_literal:
              stack.pop_Object();
              return;
                         case string_literal:
              stack.pop_Object();
              return;
                         case value_literal:
              stack.pop_Object();
              return;
                         case id:
              stack.pop_Object();
              return;
                         case eoln:
              
              return;
                         case __eof__:
              
              return;
                     }
        throw new AssertionError("unknown terminal "+terminal);
      }
 
      public void popNonTerminalOnError(PseudoNonTerminalEnum nonTerminal) {
        switch(nonTerminal) {             case primitive_type:
              stack.pop_Object();
              return;
                         case type:
              stack.pop_Object();
              return;
                         case funtype:
              stack.pop_Object();
              return;
                         case return_type:
              stack.pop_Object();
              return;
                         case start:
              stack.pop_Object();
              return;
                         case script_member:
              stack.pop_Object();
              return;
                         case record_def:
              stack.pop_Object();
              return;
                         case record_init:
              stack.pop_Object();
              return;
                         case field:
              stack.pop_Object();
              return;
                         case function_def:
              stack.pop_Object();
              return;
                         case function_rtype:
              stack.pop_Object();
              return;
                         case parameters:
              stack.pop_Object();
              return;
                         case parameter:
              stack.pop_Object();
              return;
                         case arguments:
              stack.pop_Object();
              return;
                         case block:
              stack.pop_Object();
              return;
                         case instr:
              stack.pop_Object();
              return;
                         case semis:
              stack.pop_Object();
              return;
                         case declaration:
              stack.pop_Object();
              return;
                         case funcall:
              stack.pop_Object();
              return;
                         case conditional:
              stack.pop_Object();
              return;
                         case loop:
              stack.pop_Object();
              return;
                         case for_loop_init:
              stack.pop_Object();
              return;
                         case for_loop_incr:
              stack.pop_Object();
              return;
                         case loop_label:
              stack.pop_Object();
              return;
                         case assignation:
              stack.pop_Object();
              return;
                         case lhs:
              stack.pop_Object();
              return;
                         case primary:
              stack.pop_Object();
              return;
                         case primary_no_array_creation:
              stack.pop_Object();
              return;
                         case array_access:
              stack.pop_Object();
              return;
                         case field_access:
              stack.pop_Object();
              return;
                         case array_creation:
              stack.pop_Object();
              return;
                         case dim_expr:
              stack.pop_Object();
              return;
                         case dims_opt:
              stack.pop_Object();
              return;
                         case dims:
              stack.pop_Object();
              return;
                         case expr:
              stack.pop_Object();
              return;
                         case type_star_0:
              stack.pop_Object();
              return;
                         case type_star_0_sub:
              stack.pop_Object();
              return;
                         case script_member_star_1:
              stack.pop_Object();
              return;
                         case field_star_2:
              stack.pop_Object();
              return;
                         case record_init_optional_3:
              stack.pop_Object();
              return;
                         case function_rtype_optional_4:
              stack.pop_Object();
              return;
                         case parameter_star_5:
              stack.pop_Object();
              return;
                         case parameter_star_5_sub:
              stack.pop_Object();
              return;
                         case expr_star_6:
              stack.pop_Object();
              return;
                         case expr_star_6_sub:
              stack.pop_Object();
              return;
                         case instr_star_7:
              stack.pop_Object();
              return;
                         case loop_label_optional_8:
              stack.pop_Object();
              return;
                         case id_optional_9:
              stack.pop_Object();
              return;
                         case id_optional_10:
              stack.pop_Object();
              return;
                         case expr_optional_11:
              stack.pop_Object();
              return;
                         case for_loop_init_optional_12:
              stack.pop_Object();
              return;
                         case expr_optional_13:
              stack.pop_Object();
              return;
                         case for_loop_incr_optional_14:
              stack.pop_Object();
              return;
                         case dim_expr_plus_15:
              stack.pop_Object();
              return;
                         case dim_expr_plus_16:
              stack.pop_Object();
              return;
                     }
        throw new AssertionError("unknown nonterminal "+nonTerminal);
      }
}