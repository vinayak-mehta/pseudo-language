package com.googlecode.pseudo.compiler.lexer;

import com.googlecode.pseudo.compiler.lexer.PseudoRuleEnum;
import fr.umlv.tatoo.runtime.lexer.LexerTable;
import fr.umlv.tatoo.runtime.lexer.rules.RuleData;
import fr.umlv.tatoo.runtime.regex.CharRegexTable;
import java.util.EnumMap;
/** 
 *  This class is generated - please do not edit it 
 */
public class PseudoLexerDataTable {

  public static LexerTable<PseudoRuleEnum> createTable() {
    return new PseudoLexerDataTable().table;
  }

  private PseudoLexerDataTable() {
    initplusMainAccepts();
    initplusMainTransitions();
    CharRegexTable plusMain = new CharRegexTable(1, plusMainTransitions, plusMainAccepts);
    RuleData plus = new RuleData(plusMain, null, 0, false);
    initminusMainAccepts();
    initminusMainTransitions();
    CharRegexTable minusMain = new CharRegexTable(1, minusMainTransitions, minusMainAccepts);
    RuleData minus = new RuleData(minusMain, null, 1, false);
    initstarMainAccepts();
    initstarMainTransitions();
    CharRegexTable starMain = new CharRegexTable(1, starMainTransitions, starMainAccepts);
    RuleData star = new RuleData(starMain, null, 2, false);
    initslashMainAccepts();
    initslashMainTransitions();
    CharRegexTable slashMain = new CharRegexTable(1, slashMainTransitions, slashMainAccepts);
    RuleData slash = new RuleData(slashMain, null, 3, false);
    initmodMainAccepts();
    initmodMainTransitions();
    CharRegexTable modMain = new CharRegexTable(1, modMainTransitions, modMainAccepts);
    RuleData mod = new RuleData(modMain, null, 4, false);
    initpowMainAccepts();
    initpowMainTransitions();
    CharRegexTable powMain = new CharRegexTable(2, powMainTransitions, powMainAccepts);
    RuleData pow = new RuleData(powMain, null, 5, false);
    initbandMainAccepts();
    initbandMainTransitions();
    CharRegexTable bandMain = new CharRegexTable(1, bandMainTransitions, bandMainAccepts);
    RuleData band = new RuleData(bandMain, null, 6, false);
    initborMainAccepts();
    initborMainTransitions();
    CharRegexTable borMain = new CharRegexTable(1, borMainTransitions, borMainAccepts);
    RuleData bor = new RuleData(borMain, null, 7, false);
    initeqMainAccepts();
    initeqMainTransitions();
    CharRegexTable eqMain = new CharRegexTable(2, eqMainTransitions, eqMainAccepts);
    RuleData eq = new RuleData(eqMain, null, 8, false);
    initneqMainAccepts();
    initneqMainTransitions();
    CharRegexTable neqMain = new CharRegexTable(2, neqMainTransitions, neqMainAccepts);
    RuleData neq = new RuleData(neqMain, null, 9, false);
    initltMainAccepts();
    initltMainTransitions();
    CharRegexTable ltMain = new CharRegexTable(1, ltMainTransitions, ltMainAccepts);
    RuleData lt = new RuleData(ltMain, null, 10, false);
    initgtMainAccepts();
    initgtMainTransitions();
    CharRegexTable gtMain = new CharRegexTable(1, gtMainTransitions, gtMainAccepts);
    RuleData gt = new RuleData(gtMain, null, 11, false);
    initleMainAccepts();
    initleMainTransitions();
    CharRegexTable leMain = new CharRegexTable(2, leMainTransitions, leMainAccepts);
    RuleData le = new RuleData(leMain, null, 12, false);
    initgeMainAccepts();
    initgeMainTransitions();
    CharRegexTable geMain = new CharRegexTable(2, geMainTransitions, geMainAccepts);
    RuleData ge = new RuleData(geMain, null, 13, false);
    initassignMainAccepts();
    initassignMainTransitions();
    CharRegexTable assignMain = new CharRegexTable(1, assignMainTransitions, assignMainAccepts);
    RuleData assign = new RuleData(assignMain, null, 14, false);
    initlparMainAccepts();
    initlparMainTransitions();
    CharRegexTable lparMain = new CharRegexTable(1, lparMainTransitions, lparMainAccepts);
    RuleData lpar = new RuleData(lparMain, null, 15, false);
    initrparMainAccepts();
    initrparMainTransitions();
    CharRegexTable rparMain = new CharRegexTable(1, rparMainTransitions, rparMainAccepts);
    RuleData rpar = new RuleData(rparMain, null, 16, false);
    initlcurlMainAccepts();
    initlcurlMainTransitions();
    CharRegexTable lcurlMain = new CharRegexTable(1, lcurlMainTransitions, lcurlMainAccepts);
    RuleData lcurl = new RuleData(lcurlMain, null, 17, false);
    initrcurlMainAccepts();
    initrcurlMainTransitions();
    CharRegexTable rcurlMain = new CharRegexTable(1, rcurlMainTransitions, rcurlMainAccepts);
    RuleData rcurl = new RuleData(rcurlMain, null, 18, false);
    initloptMainAccepts();
    initloptMainTransitions();
    CharRegexTable loptMain = new CharRegexTable(1, loptMainTransitions, loptMainAccepts);
    RuleData lopt = new RuleData(loptMain, null, 19, false);
    initroptMainAccepts();
    initroptMainTransitions();
    CharRegexTable roptMain = new CharRegexTable(1, roptMainTransitions, roptMainAccepts);
    RuleData ropt = new RuleData(roptMain, null, 20, false);
    initbangMainAccepts();
    initbangMainTransitions();
    CharRegexTable bangMain = new CharRegexTable(1, bangMainTransitions, bangMainAccepts);
    RuleData bang = new RuleData(bangMain, null, 21, false);
    initdotMainAccepts();
    initdotMainTransitions();
    CharRegexTable dotMain = new CharRegexTable(1, dotMainTransitions, dotMainAccepts);
    RuleData dot = new RuleData(dotMain, null, 22, false);
    initcolonMainAccepts();
    initcolonMainTransitions();
    CharRegexTable colonMain = new CharRegexTable(1, colonMainTransitions, colonMainAccepts);
    RuleData colon = new RuleData(colonMain, null, 23, false);
    initsemicolonMainAccepts();
    initsemicolonMainTransitions();
    CharRegexTable semicolonMain = new CharRegexTable(1, semicolonMainTransitions, semicolonMainAccepts);
    RuleData semicolon = new RuleData(semicolonMain, null, 24, false);
    initcommaMainAccepts();
    initcommaMainTransitions();
    CharRegexTable commaMain = new CharRegexTable(1, commaMainTransitions, commaMainAccepts);
    RuleData comma = new RuleData(commaMain, null, 25, false);
    init_ifMainAccepts();
    init_ifMainTransitions();
    CharRegexTable _ifMain = new CharRegexTable(2, _ifMainTransitions, _ifMainAccepts);
    RuleData _if = new RuleData(_ifMain, null, 26, false);
    init_elseMainAccepts();
    init_elseMainTransitions();
    CharRegexTable _elseMain = new CharRegexTable(3, _elseMainTransitions, _elseMainAccepts);
    RuleData _else = new RuleData(_elseMain, null, 27, false);
    init_forMainAccepts();
    init_forMainTransitions();
    CharRegexTable _forMain = new CharRegexTable(1, _forMainTransitions, _forMainAccepts);
    RuleData _for = new RuleData(_forMain, null, 28, false);
    init_whileMainAccepts();
    init_whileMainTransitions();
    CharRegexTable _whileMain = new CharRegexTable(1, _whileMainTransitions, _whileMainAccepts);
    RuleData _while = new RuleData(_whileMain, null, 29, false);
    init_doMainAccepts();
    init_doMainTransitions();
    CharRegexTable _doMain = new CharRegexTable(2, _doMainTransitions, _doMainAccepts);
    RuleData _do = new RuleData(_doMain, null, 30, false);
    init_returnMainAccepts();
    init_returnMainTransitions();
    CharRegexTable _returnMain = new CharRegexTable(4, _returnMainTransitions, _returnMainAccepts);
    RuleData _return = new RuleData(_returnMain, null, 31, false);
    init_breakMainAccepts();
    init_breakMainTransitions();
    CharRegexTable _breakMain = new CharRegexTable(1, _breakMainTransitions, _breakMainAccepts);
    RuleData _break = new RuleData(_breakMain, null, 32, false);
    init_continueMainAccepts();
    init_continueMainTransitions();
    CharRegexTable _continueMain = new CharRegexTable(7, _continueMainTransitions, _continueMainAccepts);
    RuleData _continue = new RuleData(_continueMain, null, 33, false);
    init_newMainAccepts();
    init_newMainTransitions();
    CharRegexTable _newMain = new CharRegexTable(2, _newMainTransitions, _newMainAccepts);
    RuleData _new = new RuleData(_newMain, null, 34, false);
    init_throwMainAccepts();
    init_throwMainTransitions();
    CharRegexTable _throwMain = new CharRegexTable(4, _throwMainTransitions, _throwMainAccepts);
    RuleData _throw = new RuleData(_throwMain, null, 35, false);
    initrecordMainAccepts();
    initrecordMainTransitions();
    CharRegexTable recordMain = new CharRegexTable(3, recordMainTransitions, recordMainAccepts);
    RuleData record = new RuleData(recordMain, null, 36, false);
    initinitMainAccepts();
    initinitMainTransitions();
    CharRegexTable initMain = new CharRegexTable(3, initMainTransitions, initMainAccepts);
    RuleData init = new RuleData(initMain, null, 37, false);
    initdefMainAccepts();
    initdefMainTransitions();
    CharRegexTable defMain = new CharRegexTable(3, defMainTransitions, defMainAccepts);
    RuleData def = new RuleData(defMain, null, 38, false);
    initlambdaMainAccepts();
    initlambdaMainTransitions();
    CharRegexTable lambdaMain = new CharRegexTable(5, lambdaMainTransitions, lambdaMainAccepts);
    RuleData lambda = new RuleData(lambdaMain, null, 39, false);
    initarrowMainAccepts();
    initarrowMainTransitions();
    CharRegexTable arrowMain = new CharRegexTable(1, arrowMainTransitions, arrowMainAccepts);
    RuleData arrow = new RuleData(arrowMain, null, 40, false);
    initprintMainAccepts();
    initprintMainTransitions();
    CharRegexTable printMain = new CharRegexTable(5, printMainTransitions, printMainAccepts);
    RuleData print = new RuleData(printMain, null, 41, false);
    initscanMainAccepts();
    initscanMainTransitions();
    CharRegexTable scanMain = new CharRegexTable(1, scanMainTransitions, scanMainAccepts);
    RuleData scan = new RuleData(scanMain, null, 42, false);
    init_booleanMainAccepts();
    init_booleanMainTransitions();
    CharRegexTable _booleanMain = new CharRegexTable(1, _booleanMainTransitions, _booleanMainAccepts);
    RuleData _boolean = new RuleData(_booleanMain, null, 43, false);
    init_charMainAccepts();
    init_charMainTransitions();
    CharRegexTable _charMain = new CharRegexTable(3, _charMainTransitions, _charMainAccepts);
    RuleData _char = new RuleData(_charMain, null, 44, false);
    init_intMainAccepts();
    init_intMainTransitions();
    CharRegexTable _intMain = new CharRegexTable(2, _intMainTransitions, _intMainAccepts);
    RuleData _int = new RuleData(_intMain, null, 45, false);
    init_doubleMainAccepts();
    init_doubleMainTransitions();
    CharRegexTable _doubleMain = new CharRegexTable(6, _doubleMainTransitions, _doubleMainAccepts);
    RuleData _double = new RuleData(_doubleMain, null, 46, false);
    initstringMainAccepts();
    initstringMainTransitions();
    CharRegexTable stringMain = new CharRegexTable(2, stringMainTransitions, stringMainAccepts);
    RuleData string = new RuleData(stringMain, null, 47, false);
    initanyMainAccepts();
    initanyMainTransitions();
    CharRegexTable anyMain = new CharRegexTable(3, anyMainTransitions, anyMainAccepts);
    RuleData any = new RuleData(anyMain, null, 48, false);
    init_voidMainAccepts();
    init_voidMainTransitions();
    CharRegexTable _voidMain = new CharRegexTable(3, _voidMainTransitions, _voidMainAccepts);
    RuleData _void = new RuleData(_voidMain, null, 49, false);
    initnull_literalMainAccepts();
    initnull_literalMainTransitions();
    CharRegexTable null_literalMain = new CharRegexTable(1, null_literalMainTransitions, null_literalMainAccepts);
    RuleData null_literal = new RuleData(null_literalMain, null, 50, false);
    initboolean_literalMainAccepts();
    initboolean_literalMainTransitions();
    CharRegexTable boolean_literalMain = new CharRegexTable(1, boolean_literalMainTransitions, boolean_literalMainAccepts);
    RuleData boolean_literal = new RuleData(boolean_literalMain, null, 51, false);
    initchar_literalMainAccepts();
    initchar_literalMainTransitions();
    CharRegexTable char_literalMain = new CharRegexTable(2, char_literalMainTransitions, char_literalMainAccepts);
    RuleData char_literal = new RuleData(char_literalMain, null, 52, false);
    initstring_literalMainAccepts();
    initstring_literalMainTransitions();
    CharRegexTable string_literalMain = new CharRegexTable(1, string_literalMainTransitions, string_literalMainAccepts);
    RuleData string_literal = new RuleData(string_literalMain, null, 53, false);
    initvalue_literalMainAccepts();
    initvalue_literalMainTransitions();
    CharRegexTable value_literalMain = new CharRegexTable(3, value_literalMainTransitions, value_literalMainAccepts);
    RuleData value_literal = new RuleData(value_literalMain, null, 54, false);
    initidMainAccepts();
    initidMainTransitions();
    CharRegexTable idMain = new CharRegexTable(1, idMainTransitions, idMainAccepts);
    RuleData id = new RuleData(idMain, null, 55, false);
    initeolnMainAccepts();
    initeolnMainTransitions();
    CharRegexTable eolnMain = new CharRegexTable(2, eolnMainTransitions, eolnMainAccepts);
    RuleData eoln = new RuleData(eolnMain, null, 56, false);
    initspaceMainAccepts();
    initspaceMainTransitions();
    CharRegexTable spaceMain = new CharRegexTable(1, spaceMainTransitions, spaceMainAccepts);
    RuleData space = new RuleData(spaceMain, null, 57, false);
    initcommentMainAccepts();
    initcommentMainTransitions();
    CharRegexTable commentMain = new CharRegexTable(2, commentMainTransitions, commentMainAccepts);
    RuleData comment = new RuleData(commentMain, null, 58, false);

    EnumMap<PseudoRuleEnum,RuleData> datas = new EnumMap<PseudoRuleEnum,RuleData>(PseudoRuleEnum.class);
    datas.put(PseudoRuleEnum.plus, plus);
    datas.put(PseudoRuleEnum.minus, minus);
    datas.put(PseudoRuleEnum.star, star);
    datas.put(PseudoRuleEnum.slash, slash);
    datas.put(PseudoRuleEnum.mod, mod);
    datas.put(PseudoRuleEnum.pow, pow);
    datas.put(PseudoRuleEnum.band, band);
    datas.put(PseudoRuleEnum.bor, bor);
    datas.put(PseudoRuleEnum.eq, eq);
    datas.put(PseudoRuleEnum.neq, neq);
    datas.put(PseudoRuleEnum.lt, lt);
    datas.put(PseudoRuleEnum.gt, gt);
    datas.put(PseudoRuleEnum.le, le);
    datas.put(PseudoRuleEnum.ge, ge);
    datas.put(PseudoRuleEnum.assign, assign);
    datas.put(PseudoRuleEnum.lpar, lpar);
    datas.put(PseudoRuleEnum.rpar, rpar);
    datas.put(PseudoRuleEnum.lcurl, lcurl);
    datas.put(PseudoRuleEnum.rcurl, rcurl);
    datas.put(PseudoRuleEnum.lopt, lopt);
    datas.put(PseudoRuleEnum.ropt, ropt);
    datas.put(PseudoRuleEnum.bang, bang);
    datas.put(PseudoRuleEnum.dot, dot);
    datas.put(PseudoRuleEnum.colon, colon);
    datas.put(PseudoRuleEnum.semicolon, semicolon);
    datas.put(PseudoRuleEnum.comma, comma);
    datas.put(PseudoRuleEnum._if, _if);
    datas.put(PseudoRuleEnum._else, _else);
    datas.put(PseudoRuleEnum._for, _for);
    datas.put(PseudoRuleEnum._while, _while);
    datas.put(PseudoRuleEnum._do, _do);
    datas.put(PseudoRuleEnum._return, _return);
    datas.put(PseudoRuleEnum._break, _break);
    datas.put(PseudoRuleEnum._continue, _continue);
    datas.put(PseudoRuleEnum._new, _new);
    datas.put(PseudoRuleEnum._throw, _throw);
    datas.put(PseudoRuleEnum.record, record);
    datas.put(PseudoRuleEnum.init, init);
    datas.put(PseudoRuleEnum.def, def);
    datas.put(PseudoRuleEnum.lambda, lambda);
    datas.put(PseudoRuleEnum.arrow, arrow);
    datas.put(PseudoRuleEnum.print, print);
    datas.put(PseudoRuleEnum.scan, scan);
    datas.put(PseudoRuleEnum._boolean, _boolean);
    datas.put(PseudoRuleEnum._char, _char);
    datas.put(PseudoRuleEnum._int, _int);
    datas.put(PseudoRuleEnum._double, _double);
    datas.put(PseudoRuleEnum.string, string);
    datas.put(PseudoRuleEnum.any, any);
    datas.put(PseudoRuleEnum._void, _void);
    datas.put(PseudoRuleEnum.null_literal, null_literal);
    datas.put(PseudoRuleEnum.boolean_literal, boolean_literal);
    datas.put(PseudoRuleEnum.char_literal, char_literal);
    datas.put(PseudoRuleEnum.string_literal, string_literal);
    datas.put(PseudoRuleEnum.value_literal, value_literal);
    datas.put(PseudoRuleEnum.id, id);
    datas.put(PseudoRuleEnum.eoln, eoln);
    datas.put(PseudoRuleEnum.space, space);
    datas.put(PseudoRuleEnum.comment, comment);
    table = new LexerTable<PseudoRuleEnum>(datas);
  }

  
  private boolean[] plusMainAccepts;
  private void initplusMainAccepts() {
    plusMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] plusMainTransitions;
  private void initplusMainTransitions() {
    plusMainTransitions = new int[][] {{0,-1},{0,-1,43,0,44,-1}};
  }
  
  private boolean[] minusMainAccepts;
  private void initminusMainAccepts() {
    minusMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] minusMainTransitions;
  private void initminusMainTransitions() {
    minusMainTransitions = new int[][] {{0,-1},{0,-1,45,0,46,-1}};
  }
  
  private boolean[] starMainAccepts;
  private void initstarMainAccepts() {
    starMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] starMainTransitions;
  private void initstarMainTransitions() {
    starMainTransitions = new int[][] {{0,-1},{0,-1,42,0,43,-1}};
  }
  
  private boolean[] slashMainAccepts;
  private void initslashMainAccepts() {
    slashMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] slashMainTransitions;
  private void initslashMainTransitions() {
    slashMainTransitions = new int[][] {{0,-1},{0,-1,47,0,48,-1}};
  }
  
  private boolean[] modMainAccepts;
  private void initmodMainAccepts() {
    modMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] modMainTransitions;
  private void initmodMainTransitions() {
    modMainTransitions = new int[][] {{0,-1},{0,-1,37,0,38,-1}};
  }
  
  private boolean[] powMainAccepts;
  private void initpowMainAccepts() {
    powMainAccepts = new boolean[] {true,false,false};
  }
    
  private int[][] powMainTransitions;
  private void initpowMainTransitions() {
    powMainTransitions = new int[][] {{0,-1},{0,-1,94,0,95,-1},{0,-1,94,1,95,-1}};
  }
  
  private boolean[] bandMainAccepts;
  private void initbandMainAccepts() {
    bandMainAccepts = new boolean[] {true,false,false};
  }
    
  private int[][] bandMainTransitions;
  private void initbandMainTransitions() {
    bandMainTransitions = new int[][] {{0,-1},{0,-1,38,2,39,-1},{0,-1,38,0,39,-1}};
  }
  
  private boolean[] borMainAccepts;
  private void initborMainAccepts() {
    borMainAccepts = new boolean[] {true,false,false};
  }
    
  private int[][] borMainTransitions;
  private void initborMainTransitions() {
    borMainTransitions = new int[][] {{0,-1},{0,-1,124,2,125,-1},{0,-1,124,0,125,-1}};
  }
  
  private boolean[] eqMainAccepts;
  private void initeqMainAccepts() {
    eqMainAccepts = new boolean[] {true,false,false};
  }
    
  private int[][] eqMainTransitions;
  private void initeqMainTransitions() {
    eqMainTransitions = new int[][] {{0,-1},{0,-1,61,0,62,-1},{0,-1,61,1,62,-1}};
  }
  
  private boolean[] neqMainAccepts;
  private void initneqMainAccepts() {
    neqMainAccepts = new boolean[] {true,false,false};
  }
    
  private int[][] neqMainTransitions;
  private void initneqMainTransitions() {
    neqMainTransitions = new int[][] {{0,-1},{0,-1,61,0,62,-1},{0,-1,33,1,34,-1}};
  }
  
  private boolean[] ltMainAccepts;
  private void initltMainAccepts() {
    ltMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] ltMainTransitions;
  private void initltMainTransitions() {
    ltMainTransitions = new int[][] {{0,-1},{0,-1,60,0,61,-1}};
  }
  
  private boolean[] gtMainAccepts;
  private void initgtMainAccepts() {
    gtMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] gtMainTransitions;
  private void initgtMainTransitions() {
    gtMainTransitions = new int[][] {{0,-1},{0,-1,62,0,63,-1}};
  }
  
  private boolean[] leMainAccepts;
  private void initleMainAccepts() {
    leMainAccepts = new boolean[] {true,false,false};
  }
    
  private int[][] leMainTransitions;
  private void initleMainTransitions() {
    leMainTransitions = new int[][] {{0,-1},{0,-1,61,0,62,-1},{0,-1,60,1,61,-1}};
  }
  
  private boolean[] geMainAccepts;
  private void initgeMainAccepts() {
    geMainAccepts = new boolean[] {true,false,false};
  }
    
  private int[][] geMainTransitions;
  private void initgeMainTransitions() {
    geMainTransitions = new int[][] {{0,-1},{0,-1,61,0,62,-1},{0,-1,62,1,63,-1}};
  }
  
  private boolean[] assignMainAccepts;
  private void initassignMainAccepts() {
    assignMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] assignMainTransitions;
  private void initassignMainTransitions() {
    assignMainTransitions = new int[][] {{0,-1},{0,-1,61,0,62,-1}};
  }
  
  private boolean[] lparMainAccepts;
  private void initlparMainAccepts() {
    lparMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] lparMainTransitions;
  private void initlparMainTransitions() {
    lparMainTransitions = new int[][] {{0,-1},{0,-1,40,0,41,-1}};
  }
  
  private boolean[] rparMainAccepts;
  private void initrparMainAccepts() {
    rparMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] rparMainTransitions;
  private void initrparMainTransitions() {
    rparMainTransitions = new int[][] {{0,-1},{0,-1,41,0,42,-1}};
  }
  
  private boolean[] lcurlMainAccepts;
  private void initlcurlMainAccepts() {
    lcurlMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] lcurlMainTransitions;
  private void initlcurlMainTransitions() {
    lcurlMainTransitions = new int[][] {{0,-1},{0,-1,123,0,124,-1}};
  }
  
  private boolean[] rcurlMainAccepts;
  private void initrcurlMainAccepts() {
    rcurlMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] rcurlMainTransitions;
  private void initrcurlMainTransitions() {
    rcurlMainTransitions = new int[][] {{0,-1},{0,-1,125,0,126,-1}};
  }
  
  private boolean[] loptMainAccepts;
  private void initloptMainAccepts() {
    loptMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] loptMainTransitions;
  private void initloptMainTransitions() {
    loptMainTransitions = new int[][] {{0,-1},{0,-1,91,0,92,-1}};
  }
  
  private boolean[] roptMainAccepts;
  private void initroptMainAccepts() {
    roptMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] roptMainTransitions;
  private void initroptMainTransitions() {
    roptMainTransitions = new int[][] {{0,-1},{0,-1,93,0,94,-1}};
  }
  
  private boolean[] bangMainAccepts;
  private void initbangMainAccepts() {
    bangMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] bangMainTransitions;
  private void initbangMainTransitions() {
    bangMainTransitions = new int[][] {{0,-1},{0,-1,33,0,34,-1}};
  }
  
  private boolean[] dotMainAccepts;
  private void initdotMainAccepts() {
    dotMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] dotMainTransitions;
  private void initdotMainTransitions() {
    dotMainTransitions = new int[][] {{0,-1},{0,-1,46,0,47,-1}};
  }
  
  private boolean[] colonMainAccepts;
  private void initcolonMainAccepts() {
    colonMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] colonMainTransitions;
  private void initcolonMainTransitions() {
    colonMainTransitions = new int[][] {{0,-1},{0,-1,58,0,59,-1}};
  }
  
  private boolean[] semicolonMainAccepts;
  private void initsemicolonMainAccepts() {
    semicolonMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] semicolonMainTransitions;
  private void initsemicolonMainTransitions() {
    semicolonMainTransitions = new int[][] {{0,-1},{0,-1,59,0,60,-1}};
  }
  
  private boolean[] commaMainAccepts;
  private void initcommaMainAccepts() {
    commaMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] commaMainTransitions;
  private void initcommaMainTransitions() {
    commaMainTransitions = new int[][] {{0,-1},{0,-1,44,0,45,-1}};
  }
  
  private boolean[] _ifMainAccepts;
  private void init_ifMainAccepts() {
    _ifMainAccepts = new boolean[] {true,false,false};
  }
    
  private int[][] _ifMainTransitions;
  private void init_ifMainTransitions() {
    _ifMainTransitions = new int[][] {{0,-1},{0,-1,102,0,103,-1},{0,-1,105,1,106,-1}};
  }
  
  private boolean[] _elseMainAccepts;
  private void init_elseMainAccepts() {
    _elseMainAccepts = new boolean[] {true,false,false,false,false};
  }
    
  private int[][] _elseMainTransitions;
  private void init_elseMainTransitions() {
    _elseMainTransitions = new int[][] {{0,-1},{0,-1,115,2,116,-1},{0,-1,101,0,102,-1},{0,-1,101,4,102,-1},{0,-1,108,1,109,-1}};
  }
  
  private boolean[] _forMainAccepts;
  private void init_forMainAccepts() {
    _forMainAccepts = new boolean[] {true,false,false,false};
  }
    
  private int[][] _forMainTransitions;
  private void init_forMainTransitions() {
    _forMainTransitions = new int[][] {{0,-1},{0,-1,102,3,103,-1},{0,-1,114,0,115,-1},{0,-1,111,2,112,-1}};
  }
  
  private boolean[] _whileMainAccepts;
  private void init_whileMainAccepts() {
    _whileMainAccepts = new boolean[] {true,false,false,false,false,false};
  }
    
  private int[][] _whileMainTransitions;
  private void init_whileMainTransitions() {
    _whileMainTransitions = new int[][] {{0,-1},{0,-1,119,5,120,-1},{0,-1,101,0,102,-1},{0,-1,105,4,106,-1},{0,-1,108,2,109,-1},{0,-1,104,3,105,-1}};
  }
  
  private boolean[] _doMainAccepts;
  private void init_doMainAccepts() {
    _doMainAccepts = new boolean[] {true,false,false};
  }
    
  private int[][] _doMainTransitions;
  private void init_doMainTransitions() {
    _doMainTransitions = new int[][] {{0,-1},{0,-1,111,0,112,-1},{0,-1,100,1,101,-1}};
  }
  
  private boolean[] _returnMainAccepts;
  private void init_returnMainAccepts() {
    _returnMainAccepts = new boolean[] {true,false,false,false,false,false,false};
  }
    
  private int[][] _returnMainTransitions;
  private void init_returnMainTransitions() {
    _returnMainTransitions = new int[][] {{0,-1},{0,-1,110,0,111,-1},{0,-1,117,5,118,-1},{0,-1,101,6,102,-1},{0,-1,114,3,115,-1},{0,-1,114,1,115,-1},{0,-1,116,2,117,-1}};
  }
  
  private boolean[] _breakMainAccepts;
  private void init_breakMainAccepts() {
    _breakMainAccepts = new boolean[] {true,false,false,false,false,false};
  }
    
  private int[][] _breakMainTransitions;
  private void init_breakMainTransitions() {
    _breakMainTransitions = new int[][] {{0,-1},{0,-1,98,2,99,-1},{0,-1,114,5,115,-1},{0,-1,107,0,108,-1},{0,-1,97,3,98,-1},{0,-1,101,4,102,-1}};
  }
  
  private boolean[] _continueMainAccepts;
  private void init_continueMainAccepts() {
    _continueMainAccepts = new boolean[] {true,false,false,false,false,false,false,false,false};
  }
    
  private int[][] _continueMainTransitions;
  private void init_continueMainTransitions() {
    _continueMainTransitions = new int[][] {{0,-1},{0,-1,110,3,111,-1},{0,-1,110,8,111,-1},{0,-1,117,6,118,-1},{0,-1,111,2,112,-1},{0,-1,105,1,106,-1},{0,-1,101,0,102,-1},{0,-1,99,4,100,-1},{0,-1,116,5,117,-1}};
  }
  
  private boolean[] _newMainAccepts;
  private void init_newMainAccepts() {
    _newMainAccepts = new boolean[] {true,false,false,false};
  }
    
  private int[][] _newMainTransitions;
  private void init_newMainTransitions() {
    _newMainTransitions = new int[][] {{0,-1},{0,-1,119,0,120,-1},{0,-1,110,3,111,-1},{0,-1,101,1,102,-1}};
  }
  
  private boolean[] _throwMainAccepts;
  private void init_throwMainAccepts() {
    _throwMainAccepts = new boolean[] {true,false,false,false,false,false};
  }
    
  private int[][] _throwMainTransitions;
  private void init_throwMainTransitions() {
    _throwMainTransitions = new int[][] {{0,-1},{0,-1,119,0,120,-1},{0,-1,111,1,112,-1},{0,-1,114,2,115,-1},{0,-1,116,5,117,-1},{0,-1,104,3,105,-1}};
  }
  
  private boolean[] recordMainAccepts;
  private void initrecordMainAccepts() {
    recordMainAccepts = new boolean[] {true,false,false,false,false,false,false};
  }
    
  private int[][] recordMainTransitions;
  private void initrecordMainTransitions() {
    recordMainTransitions = new int[][] {{0,-1},{0,-1,111,4,112,-1},{0,-1,101,5,102,-1},{0,-1,114,2,115,-1},{0,-1,114,6,115,-1},{0,-1,99,1,100,-1},{0,-1,100,0,101,-1}};
  }
  
  private boolean[] initMainAccepts;
  private void initinitMainAccepts() {
    initMainAccepts = new boolean[] {true,false,false,false,false};
  }
    
  private int[][] initMainTransitions;
  private void initinitMainTransitions() {
    initMainTransitions = new int[][] {{0,-1},{0,-1,110,2,111,-1},{0,-1,105,4,106,-1},{0,-1,105,1,106,-1},{0,-1,116,0,117,-1}};
  }
  
  private boolean[] defMainAccepts;
  private void initdefMainAccepts() {
    defMainAccepts = new boolean[] {true,false,false,false};
  }
    
  private int[][] defMainTransitions;
  private void initdefMainTransitions() {
    defMainTransitions = new int[][] {{0,-1},{0,-1,102,0,103,-1},{0,-1,101,1,102,-1},{0,-1,100,2,101,-1}};
  }
  
  private boolean[] lambdaMainAccepts;
  private void initlambdaMainAccepts() {
    lambdaMainAccepts = new boolean[] {true,false,false,false,false,false,false};
  }
    
  private int[][] lambdaMainTransitions;
  private void initlambdaMainTransitions() {
    lambdaMainTransitions = new int[][] {{0,-1},{0,-1,98,6,99,-1},{0,-1,109,1,110,-1},{0,-1,97,0,98,-1},{0,-1,97,2,98,-1},{0,-1,108,4,109,-1},{0,-1,100,3,101,-1}};
  }
  
  private boolean[] arrowMainAccepts;
  private void initarrowMainAccepts() {
    arrowMainAccepts = new boolean[] {true,false,false};
  }
    
  private int[][] arrowMainTransitions;
  private void initarrowMainTransitions() {
    arrowMainTransitions = new int[][] {{0,-1},{0,-1,61,2,62,-1},{0,-1,62,0,63,-1}};
  }
  
  private boolean[] printMainAccepts;
  private void initprintMainAccepts() {
    printMainAccepts = new boolean[] {true,false,false,false,false,false};
  }
    
  private int[][] printMainTransitions;
  private void initprintMainTransitions() {
    printMainTransitions = new int[][] {{0,-1},{0,-1,110,4,111,-1},{0,-1,105,1,106,-1},{0,-1,114,2,115,-1},{0,-1,116,0,117,-1},{0,-1,112,3,113,-1}};
  }
  
  private boolean[] scanMainAccepts;
  private void initscanMainAccepts() {
    scanMainAccepts = new boolean[] {true,false,false,false,false};
  }
    
  private int[][] scanMainTransitions;
  private void initscanMainTransitions() {
    scanMainTransitions = new int[][] {{0,-1},{0,-1,115,3,116,-1},{0,-1,110,0,111,-1},{0,-1,99,4,100,-1},{0,-1,97,2,98,-1}};
  }
  
  private boolean[] _booleanMainAccepts;
  private void init_booleanMainAccepts() {
    _booleanMainAccepts = new boolean[] {true,false,false,false,false,false,false,false};
  }
    
  private int[][] _booleanMainTransitions;
  private void init_booleanMainTransitions() {
    _booleanMainTransitions = new int[][] {{0,-1},{0,-1,98,3,99,-1},{0,-1,110,0,111,-1},{0,-1,111,4,112,-1},{0,-1,111,7,112,-1},{0,-1,101,6,102,-1},{0,-1,97,2,98,-1},{0,-1,108,5,109,-1}};
  }
  
  private boolean[] _charMainAccepts;
  private void init_charMainAccepts() {
    _charMainAccepts = new boolean[] {true,false,false,false,false};
  }
    
  private int[][] _charMainTransitions;
  private void init_charMainTransitions() {
    _charMainTransitions = new int[][] {{0,-1},{0,-1,114,0,115,-1},{0,-1,97,1,98,-1},{0,-1,99,4,100,-1},{0,-1,104,2,105,-1}};
  }
  
  private boolean[] _intMainAccepts;
  private void init_intMainAccepts() {
    _intMainAccepts = new boolean[] {true,false,false,false};
  }
    
  private int[][] _intMainTransitions;
  private void init_intMainTransitions() {
    _intMainTransitions = new int[][] {{0,-1},{0,-1,110,3,111,-1},{0,-1,105,1,106,-1},{0,-1,116,0,117,-1}};
  }
  
  private boolean[] _doubleMainAccepts;
  private void init_doubleMainAccepts() {
    _doubleMainAccepts = new boolean[] {true,false,false,false,false,false,false};
  }
    
  private int[][] _doubleMainTransitions;
  private void init_doubleMainTransitions() {
    _doubleMainTransitions = new int[][] {{0,-1},{0,-1,98,5,99,-1},{0,-1,117,1,118,-1},{0,-1,101,0,102,-1},{0,-1,111,2,112,-1},{0,-1,108,3,109,-1},{0,-1,100,4,101,-1}};
  }
  
  private boolean[] stringMainAccepts;
  private void initstringMainAccepts() {
    stringMainAccepts = new boolean[] {true,false,false,false,false,false,false};
  }
    
  private int[][] stringMainTransitions;
  private void initstringMainTransitions() {
    stringMainTransitions = new int[][] {{0,-1},{0,-1,110,3,111,-1},{0,-1,115,6,116,-1},{0,-1,103,0,104,-1},{0,-1,105,1,106,-1},{0,-1,114,4,115,-1},{0,-1,116,5,117,-1}};
  }
  
  private boolean[] anyMainAccepts;
  private void initanyMainAccepts() {
    anyMainAccepts = new boolean[] {true,false,false,false};
  }
    
  private int[][] anyMainTransitions;
  private void initanyMainTransitions() {
    anyMainTransitions = new int[][] {{0,-1},{0,-1,110,2,111,-1},{0,-1,121,0,122,-1},{0,-1,97,1,98,-1}};
  }
  
  private boolean[] _voidMainAccepts;
  private void init_voidMainAccepts() {
    _voidMainAccepts = new boolean[] {true,false,false,false,false};
  }
    
  private int[][] _voidMainTransitions;
  private void init_voidMainTransitions() {
    _voidMainTransitions = new int[][] {{0,-1},{0,-1,105,4,106,-1},{0,-1,111,1,112,-1},{0,-1,118,2,119,-1},{0,-1,100,0,101,-1}};
  }
  
  private boolean[] null_literalMainAccepts;
  private void initnull_literalMainAccepts() {
    null_literalMainAccepts = new boolean[] {true,false,false,false,false};
  }
    
  private int[][] null_literalMainTransitions;
  private void initnull_literalMainTransitions() {
    null_literalMainTransitions = new int[][] {{0,-1},{0,-1,110,2,111,-1},{0,-1,117,3,118,-1},{0,-1,108,4,109,-1},{0,-1,108,0,109,-1}};
  }
  
  private boolean[] boolean_literalMainAccepts;
  private void initboolean_literalMainAccepts() {
    boolean_literalMainAccepts = new boolean[] {true,false,false,false,false,false,false,false};
  }
    
  private int[][] boolean_literalMainTransitions;
  private void initboolean_literalMainTransitions() {
    boolean_literalMainTransitions = new int[][] {{0,-1},{0,-1,102,6,103,-1,116,5,117,-1},{0,-1,117,4,118,-1},{0,-1,115,4,116,-1},{0,-1,101,0,102,-1},{0,-1,114,2,115,-1},{0,-1,97,7,98,-1},{0,-1,108,3,109,-1}};
  }
  
  private boolean[] char_literalMainAccepts;
  private void initchar_literalMainAccepts() {
    char_literalMainAccepts = new boolean[] {true,false,false,false};
  }
    
  private int[][] char_literalMainTransitions;
  private void initchar_literalMainTransitions() {
    char_literalMainTransitions = new int[][] {{0,-1},{0,3,39,-1,40,3},{0,-1,39,1,40,-1},{0,-1,39,0,40,-1}};
  }
  
  private boolean[] string_literalMainAccepts;
  private void initstring_literalMainAccepts() {
    string_literalMainAccepts = new boolean[] {true,false,false};
  }
    
  private int[][] string_literalMainTransitions;
  private void initstring_literalMainTransitions() {
    string_literalMainTransitions = new int[][] {{0,-1},{0,-1,34,2,35,-1},{0,2,34,0,35,2}};
  }
  
  private boolean[] value_literalMainAccepts;
  private void initvalue_literalMainAccepts() {
    value_literalMainAccepts = new boolean[] {true,true,false,false};
  }
    
  private int[][] value_literalMainTransitions;
  private void initvalue_literalMainTransitions() {
    value_literalMainTransitions = new int[][] {{0,-1,48,0,58,-1},{0,-1,46,2,47,-1,48,1,58,-1},{0,-1,48,0,58,-1},{0,-1,48,1,58,-1}};
  }
  
  private boolean[] idMainAccepts;
  private void initidMainAccepts() {
    idMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] idMainTransitions;
  private void initidMainTransitions() {
    idMainTransitions = new int[][] {{0,-1,48,0,58,-1,65,0,91,-1,95,0,96,-1,97,0,123,-1},{0,-1,65,0,91,-1,95,0,96,-1,97,0,123,-1}};
  }
  
  private boolean[] eolnMainAccepts;
  private void initeolnMainAccepts() {
    eolnMainAccepts = new boolean[] {true,false,false};
  }
    
  private int[][] eolnMainTransitions;
  private void initeolnMainTransitions() {
    eolnMainTransitions = new int[][] {{0,-1},{0,-1,10,0,11,-1},{0,-1,10,0,11,-1,13,1,14,-1}};
  }
  
  private boolean[] spaceMainAccepts;
  private void initspaceMainAccepts() {
    spaceMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] spaceMainTransitions;
  private void initspaceMainTransitions() {
    spaceMainTransitions = new int[][] {{0,-1},{0,-1,9,0,11,-1,13,0,14,-1,32,0,33,-1}};
  }
  
  private boolean[] commentMainAccepts;
  private void initcommentMainAccepts() {
    commentMainAccepts = new boolean[] {true,false,false,false};
  }
    
  private int[][] commentMainTransitions;
  private void initcommentMainTransitions() {
    commentMainTransitions = new int[][] {{0,-1},{0,-1,10,0,11,-1},{0,-1,35,3,36,-1},{0,3,10,0,11,3,13,1,14,3}};
  }
  
  private final LexerTable<PseudoRuleEnum> table;
}
