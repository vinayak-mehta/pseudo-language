package com.googlecode.pseudo.compiler.tools;

import java.io.InputStreamReader;
import java.io.Reader;

import com.googlecode.pseudo.compiler.lexer.PseudoRuleEnum;
import com.googlecode.pseudo.compiler.parser.PseudoTerminalEnum;
import com.googlecode.pseudo.compiler.parser.PseudoNonTerminalEnum;
import com.googlecode.pseudo.compiler.parser.PseudoProductionEnum;
import com.googlecode.pseudo.compiler.parser.PseudoVersionEnum;
import com.googlecode.pseudo.compiler.lexer.PseudoLexerDataTable;
import com.googlecode.pseudo.compiler.parser.PseudoParserDataTable;
import com.googlecode.pseudo.compiler.tools.PseudoToolsDataTable;
import com.googlecode.pseudo.compiler.tools.PseudoGrammarEvaluator;
import com.googlecode.pseudo.compiler.tools.PseudoTerminalEvaluator;

import fr.umlv.tatoo.runtime.buffer.LexerBuffer;
import fr.umlv.tatoo.runtime.buffer.TokenBuffer;
import fr.umlv.tatoo.runtime.buffer.impl.LocationTracker;
import fr.umlv.tatoo.runtime.buffer.impl.ReaderWrapper;
import fr.umlv.tatoo.runtime.lexer.LexerTable;
import fr.umlv.tatoo.runtime.parser.ParserTable;
import fr.umlv.tatoo.runtime.tools.DataViewer;
import fr.umlv.tatoo.runtime.tools.Debug;
import fr.umlv.tatoo.runtime.tools.SemanticStack;
import fr.umlv.tatoo.runtime.tools.ToolsTable;
import fr.umlv.tatoo.runtime.tools.builder.Builder;

/** Helper methods that can be used to run a couple lexer/parser on a text.
 *
 *  This class is generated - please do not edit it 
 */
public class PseudoAnalyzers {
  /**
   * Runs the analyzer (lexer+parser) on a reader and print recognized tokens and
   * applied parser rules on error input (see {@link Debug}).
   * @param reader the source of standard input if null
   * @param terminalEvaluator the terminal evaluator or just method call printer if null
   * @param grammarEvaluator the grammar evaluator or just method call printer if null
   * @param start the start or default start if null
   * @param version the version of default version if null
   */
  public static void runDebug(Reader reader,
    PseudoTerminalEvaluator<? super CharSequence> terminalEvaluator,
    PseudoGrammarEvaluator grammarEvaluator,
    PseudoNonTerminalEnum start,
    PseudoVersionEnum version) {
    if (reader==null)
      reader=new InputStreamReader(System.in);
    @SuppressWarnings("unchecked") PseudoTerminalEvaluator<CharSequence> debugTerminalEvaluator =
      Debug.createTraceProxy(PseudoTerminalEvaluator.class,terminalEvaluator);
    PseudoGrammarEvaluator debugGrammarEvaluator = Debug.createTraceProxy(PseudoGrammarEvaluator.class,grammarEvaluator);
    run(reader,debugTerminalEvaluator,debugGrammarEvaluator,
        start,version);
  }

  /** Runs the analyzer (lexer+parser) on a reader and sends recognized tokens
   *  as CharSequence. Tokens are transformed to objects by the terminal evaluator.
   *  At last, the grammar evaluator is called with these objects.
   *  
   *  This implementation uses a {@link fr.umlv.tatoo.runtime.buffer.impl.ReaderWrapper}
   *  configured with a location tracker as buffer and calls.
   *  
   * @param reader a reader used to obtain the characters of the text to parse.
   * @param terminalEvaluator an interface that returns the value of a token.
   * @param grammarEvaluator an interface that evaluates the grammar productions. 
   * @param start a start non terminal of the grammar used as root state of the parser.
   *    If start is null,
   *    the {@link fr.umlv.tatoo.runtime.parser.ParserTable#getDefaultStart() default start}
   *    non terminal is used.
   * @param version a version of the grammar used to parse the reader.
   *    If version is null,
   *    the {@link fr.umlv.tatoo.runtime.parser.ParserTable#getDefaultVersion() default version}
   *    of the grammar is used.
   *    
   * @see #run(TokenBuffer, PseudoTerminalEvaluator, PseudoGrammarEvaluator, PseudoNonTerminalEnum, PseudoVersionEnum)
   */
  public static void run(
    Reader reader,
    PseudoTerminalEvaluator<? super CharSequence> terminalEvaluator,
    PseudoGrammarEvaluator grammarEvaluator,
    PseudoNonTerminalEnum start,
    PseudoVersionEnum version) {

    run(new ReaderWrapper(reader, new LocationTracker()), terminalEvaluator, grammarEvaluator, start, version);
  }
  
  public static <B extends TokenBuffer<D>&LexerBuffer,D> void runDebug(
    B tokenBuffer,
    PseudoTerminalEvaluator<? super D> terminalEvaluator,
    PseudoGrammarEvaluator grammarEvaluator,
    PseudoNonTerminalEnum start,
    PseudoVersionEnum version) {
      @SuppressWarnings("unchecked") PseudoTerminalEvaluator<? super D> debugTerminalEvaluator =
      Debug.createTraceProxy(PseudoTerminalEvaluator.class,terminalEvaluator);
    PseudoGrammarEvaluator debugGrammarEvaluator = Debug.createTraceProxy(PseudoGrammarEvaluator.class,grammarEvaluator);
    run(tokenBuffer,debugTerminalEvaluator,debugGrammarEvaluator,
        start,version);
    }
  
  /** Runs the analyzer (lexer+parser) on a token buffer and sends recognized tokens
   *  as CharSequence. Tokens are transformed to objects by the terminal evaluator.
   *  At last, the grammar evaluator is called with these objects.
   *  
   *  It is up to the caller to create its buffer and to provide or not a location tracker.
   *
   * @param <B> type of the buffer.
   *  
   * @param tokenBuffer the token buffer used to obtain the characters of the text to parse.
   * @param terminalEvaluator an interface that returns the value of a token.
   * @param grammarEvaluator an interface that evaluates the grammar productions. 
   * @param start a start non terminal of the grammar used as root state of the parser.
   *    If start is null,
   *    the {@link fr.umlv.tatoo.runtime.parser.ParserTable#getDefaultStart() default start}
   *    non terminal is used.
   * @param version a version of the grammar used to parse the reader.
   *    If version is null,
   *    the {@link fr.umlv.tatoo.runtime.parser.ParserTable#getDefaultVersion() default version}
   *    of the grammar is used.
   *
   * @see #run(Reader, PseudoTerminalEvaluator, PseudoGrammarEvaluator, PseudoNonTerminalEnum, PseudoVersionEnum)
   */
  public static <B extends TokenBuffer<D>&LexerBuffer,D> void run(
    B tokenBuffer,
    PseudoTerminalEvaluator<? super D> terminalEvaluator,
    PseudoGrammarEvaluator grammarEvaluator,
    PseudoNonTerminalEnum start,
    PseudoVersionEnum version) {
  
    analyzerTokenBufferBuilder(tokenBuffer,terminalEvaluator,grammarEvaluator,new SemanticStack()).
      start(start).version(version).createLexer().run();
  }

  public static Builder.LexerTableBuilder<PseudoRuleEnum> lexerBuilder() {
    return Builder.lexer(PseudoLexerDataTable.createTable());
  }
  
  public static Builder.ParserTableBuilder<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> parserBuilder() {
    return Builder.parser(PseudoParserDataTable.createTable());
  }
  
  public static Builder.AnalyzerTableBuilder<PseudoRuleEnum,PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> analyzerBuilder() {
    return Builder.analyzer(LEXER_TABLE,PARSER_TABLE,TOOLS_TABLE);
  }
  
  public static <B extends LexerBuffer> Builder.AnalyzerBuilder<PseudoRuleEnum,B,PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> analyzerLexerBufferBuilder(B lexerBuffer,
    PseudoTerminalEvaluator<? super B> terminalEvaluator, PseudoGrammarEvaluator grammarEvaluator,
    SemanticStack semanticStack) {
    return analyzerBuilder().buffer(lexerBuffer).listener(PseudoAnalyzerProcessor.<B,B>createPseudoAnalyzerProcessor(terminalEvaluator,grammarEvaluator,
      DataViewer.<B>getIdentityDataViewer(),semanticStack));
  }
  
  public static <B extends TokenBuffer<D>&LexerBuffer,D> Builder.AnalyzerBuilder<PseudoRuleEnum,B,PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> analyzerTokenBufferBuilder(B tokenBuffer,
    PseudoTerminalEvaluator<? super D> terminalEvaluator, PseudoGrammarEvaluator grammarEvaluator,
    SemanticStack semanticStack) {
    return analyzerBuilder().buffer(tokenBuffer).listener(PseudoAnalyzerProcessor.<B,D>createPseudoAnalyzerProcessor(terminalEvaluator,grammarEvaluator,
      DataViewer.<D>getTokenBufferViewer(),semanticStack));
  }
  
  private static final LexerTable<PseudoRuleEnum> LEXER_TABLE;
  private static final ParserTable<PseudoTerminalEnum,PseudoNonTerminalEnum,PseudoProductionEnum,PseudoVersionEnum> PARSER_TABLE;
  private static final ToolsTable<PseudoRuleEnum,PseudoTerminalEnum> TOOLS_TABLE;

  static {
    LEXER_TABLE = PseudoLexerDataTable.createTable();
    PARSER_TABLE = PseudoParserDataTable.createTable();
    TOOLS_TABLE = PseudoToolsDataTable.createToolsTable();
  }

  /* sample main method
  
  public static void main(String[] args) throws java.io.IOException {
    java.io.Reader reader;
    if (args.length>0) {
      reader = new java.io.FileReader(args[0]);
    } else {
      reader = new java.io.InputStreamReader(System.in);
    }
    //TODO implements the terminal attribute evaluator here
    PseudoTerminalEvaluator<CharSequence> terminalEvaluator = fr.umlv.tatoo.runtime.tools.Debug.createTraceProxy(PseudoTerminalEvaluator.class);

    //TODO implements the grammar evaluator here
    PseudoGrammarEvaluator grammarEvaluator = fr.umlv.tatoo.runtime.tools.Debug.createTraceProxy(PseudoGrammarEvaluator.class);

    //TODO choose a start non terminal and a version here
    PseudoVersionEnum version = PseudoVersionEnum.DEFAULT;
    PseudoNonTerminalEnum start = PseudoNonTerminalEnum.start;

    PseudoAnalyzers.run(reader, terminalEvaluator, grammarEvaluator, start, version);
  }*/
}
