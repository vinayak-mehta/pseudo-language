package com.googlecode.pseudo.compiler.ast;

import fr.umlv.tatoo.runtime.ast.NodeEmitter;
import fr.umlv.tatoo.runtime.buffer.impl.CharSequenceWrapper;
import fr.umlv.tatoo.runtime.tools.DataViewer;
import fr.umlv.tatoo.runtime.tools.SemanticStack;
import fr.umlv.tatoo.runtime.tools.builder.LexerAndParser;

import com.googlecode.pseudo.compiler.parser.PseudoTerminalEnum;
import com.googlecode.pseudo.compiler.parser.PseudoNonTerminalEnum;
import com.googlecode.pseudo.compiler.parser.PseudoProductionEnum;
import com.googlecode.pseudo.compiler.parser.PseudoVersionEnum;
import com.googlecode.pseudo.compiler.tools.PseudoTerminalEvaluator;
import com.googlecode.pseudo.compiler.ast.ASTGrammarEvaluator;
import com.googlecode.pseudo.compiler.tools.PseudoAnalyzerProcessor;
import com.googlecode.pseudo.compiler.tools.PseudoAnalyzers;

/** 
 *  This class is generated - please do not edit it 
 */
public class ASTEmitter {
private final NodeEmitter<PseudoTerminalEnum, PseudoNonTerminalEnum, PseudoProductionEnum, PseudoVersionEnum> nodeEmitter;
  
  protected ASTEmitter(NodeEmitter<PseudoTerminalEnum, PseudoNonTerminalEnum, PseudoProductionEnum, PseudoVersionEnum> nodeEmitter) {
    this.nodeEmitter=nodeEmitter;
  }
  
  public static ASTEmitter create(PseudoTerminalEvaluator<CharSequence> terminalEvaluator, ASTGrammarEvaluator grammarEvaluator) {
    SemanticStack semanticStack=new SemanticStack();
    PseudoAnalyzerProcessor<CharSequenceWrapper, CharSequence> processor=PseudoAnalyzerProcessor.createPseudoAnalyzerProcessor(
        terminalEvaluator,
        grammarEvaluator,
        DataViewer.<CharSequence>getTokenBufferViewer(),
        semanticStack);

    LexerAndParser<CharSequenceWrapper, PseudoTerminalEnum, PseudoNonTerminalEnum, PseudoProductionEnum, PseudoVersionEnum> lexerAndParser =
      PseudoAnalyzers.analyzerBuilder().buffer((CharSequenceWrapper)null).listener(processor).createAnalyzer();

    return new ASTEmitter(NodeEmitter.create(lexerAndParser.getLexer(),
        lexerAndParser.getParser(),
        NonTerminalGotoStateDataTable.create(),
        grammarEvaluator,
        semanticStack));
  }
  
  
  public ASTBuilder<Start> toStart() {
    return new ASTBuilder<Start>(nodeEmitter.to(PseudoNonTerminalEnum.start, Start.class));
  }
 
  
  public static class ASTBuilder<A> {
    private final NodeEmitter<PseudoTerminalEnum, PseudoNonTerminalEnum, PseudoProductionEnum, PseudoVersionEnum>.NodeBuilder<A> nodeBuilder;
    
    protected ASTBuilder(NodeEmitter<PseudoTerminalEnum, PseudoNonTerminalEnum, PseudoProductionEnum, PseudoVersionEnum>.NodeBuilder<A> nodeBuilder) {
      this.nodeBuilder=nodeBuilder;
    }
    
    public ASTBuilder<A> parse(CharSequence data) {
      nodeBuilder.parse(data);
      return this;
    }

    
    public ASTBuilder<A> start(Start start) {
      nodeBuilder.nonTerminal(PseudoNonTerminalEnum.start, start);
      return this;
    }
    
    public ASTBuilder<A> parameters(Parameters parameters) {
      nodeBuilder.nonTerminal(PseudoNonTerminalEnum.parameters, parameters);
      return this;
    }
    
    public ASTBuilder<A> declaration(Declaration declaration) {
      nodeBuilder.nonTerminal(PseudoNonTerminalEnum.declaration, declaration);
      return this;
    }
    
    public ASTBuilder<A> forLoopIncr(ForLoopIncr for_loop_incr) {
      nodeBuilder.nonTerminal(PseudoNonTerminalEnum.for_loop_incr, for_loop_incr);
      return this;
    }
    
    public ASTBuilder<A> primaryNoArrayCreation(PrimaryNoArrayCreation primary_no_array_creation) {
      nodeBuilder.nonTerminal(PseudoNonTerminalEnum.primary_no_array_creation, primary_no_array_creation);
      return this;
    }
    
    public ASTBuilder<A> block(Block block) {
      nodeBuilder.nonTerminal(PseudoNonTerminalEnum.block, block);
      return this;
    }
    
    public ASTBuilder<A> semis(Semis semis) {
      nodeBuilder.nonTerminal(PseudoNonTerminalEnum.semis, semis);
      return this;
    }
    
    public ASTBuilder<A> funtype(Funtype funtype) {
      nodeBuilder.nonTerminal(PseudoNonTerminalEnum.funtype, funtype);
      return this;
    }
    
    public ASTBuilder<A> arrayAccess(ArrayAccess array_access) {
      nodeBuilder.nonTerminal(PseudoNonTerminalEnum.array_access, array_access);
      return this;
    }
    
    public ASTBuilder<A> field(Field field) {
      nodeBuilder.nonTerminal(PseudoNonTerminalEnum.field, field);
      return this;
    }
    
    public ASTBuilder<A> dimExpr(DimExpr dim_expr) {
      nodeBuilder.nonTerminal(PseudoNonTerminalEnum.dim_expr, dim_expr);
      return this;
    }
    
    public ASTBuilder<A> assignation(Assignation assignation) {
      nodeBuilder.nonTerminal(PseudoNonTerminalEnum.assignation, assignation);
      return this;
    }
    
    public ASTBuilder<A> parameter(Parameter parameter) {
      nodeBuilder.nonTerminal(PseudoNonTerminalEnum.parameter, parameter);
      return this;
    }
    
    public ASTBuilder<A> dims(Dims dims) {
      nodeBuilder.nonTerminal(PseudoNonTerminalEnum.dims, dims);
      return this;
    }
    
    public ASTBuilder<A> returnType(ReturnType return_type) {
      nodeBuilder.nonTerminal(PseudoNonTerminalEnum.return_type, return_type);
      return this;
    }
    
    public ASTBuilder<A> functionDef(FunctionDef function_def) {
      nodeBuilder.nonTerminal(PseudoNonTerminalEnum.function_def, function_def);
      return this;
    }
    
    public ASTBuilder<A> fieldAccess(FieldAccess field_access) {
      nodeBuilder.nonTerminal(PseudoNonTerminalEnum.field_access, field_access);
      return this;
    }
    
    public ASTBuilder<A> arrayCreation(ArrayCreation array_creation) {
      nodeBuilder.nonTerminal(PseudoNonTerminalEnum.array_creation, array_creation);
      return this;
    }
    
    public ASTBuilder<A> lhs(Lhs lhs) {
      nodeBuilder.nonTerminal(PseudoNonTerminalEnum.lhs, lhs);
      return this;
    }
    
    public ASTBuilder<A> recordInit(RecordInit record_init) {
      nodeBuilder.nonTerminal(PseudoNonTerminalEnum.record_init, record_init);
      return this;
    }
    
    public ASTBuilder<A> arguments(Arguments arguments) {
      nodeBuilder.nonTerminal(PseudoNonTerminalEnum.arguments, arguments);
      return this;
    }
    
    public ASTBuilder<A> forLoopInit(ForLoopInit for_loop_init) {
      nodeBuilder.nonTerminal(PseudoNonTerminalEnum.for_loop_init, for_loop_init);
      return this;
    }
    
    public ASTBuilder<A> type(Type type) {
      nodeBuilder.nonTerminal(PseudoNonTerminalEnum.type, type);
      return this;
    }
    
    public ASTBuilder<A> loop(Loop loop) {
      nodeBuilder.nonTerminal(PseudoNonTerminalEnum.loop, loop);
      return this;
    }
    
    public ASTBuilder<A> expr(Expr expr) {
      nodeBuilder.nonTerminal(PseudoNonTerminalEnum.expr, expr);
      return this;
    }
    
    public ASTBuilder<A> conditional(Conditional conditional) {
      nodeBuilder.nonTerminal(PseudoNonTerminalEnum.conditional, conditional);
      return this;
    }
    
    public ASTBuilder<A> recordDef(RecordDef record_def) {
      nodeBuilder.nonTerminal(PseudoNonTerminalEnum.record_def, record_def);
      return this;
    }
    
    public ASTBuilder<A> dimsOpt(DimsOpt dims_opt) {
      nodeBuilder.nonTerminal(PseudoNonTerminalEnum.dims_opt, dims_opt);
      return this;
    }
    
    public ASTBuilder<A> instr(Instr instr) {
      nodeBuilder.nonTerminal(PseudoNonTerminalEnum.instr, instr);
      return this;
    }
    
    public ASTBuilder<A> funcall(Funcall funcall) {
      nodeBuilder.nonTerminal(PseudoNonTerminalEnum.funcall, funcall);
      return this;
    }
    
    public ASTBuilder<A> functionRtype(FunctionRtype function_rtype) {
      nodeBuilder.nonTerminal(PseudoNonTerminalEnum.function_rtype, function_rtype);
      return this;
    }
    
    public ASTBuilder<A> primary(Primary primary) {
      nodeBuilder.nonTerminal(PseudoNonTerminalEnum.primary, primary);
      return this;
    }
    
    public ASTBuilder<A> scriptMember(ScriptMember script_member) {
      nodeBuilder.nonTerminal(PseudoNonTerminalEnum.script_member, script_member);
      return this;
    }
    
    public ASTBuilder<A> primitiveType(PrimitiveType primitive_type) {
      nodeBuilder.nonTerminal(PseudoNonTerminalEnum.primitive_type, primitive_type);
      return this;
    }
    
    public ASTBuilder<A> loopLabel(LoopLabel loop_label) {
      nodeBuilder.nonTerminal(PseudoNonTerminalEnum.loop_label, loop_label);
      return this;
    }
    
    public A emit() {
      return nodeBuilder.emit();
    }
  }
}
