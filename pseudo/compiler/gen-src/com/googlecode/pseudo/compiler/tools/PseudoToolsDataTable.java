package com.googlecode.pseudo.compiler.tools;

import fr.umlv.tatoo.runtime.tools.ToolsTable;

import java.util.EnumMap;
import java.util.EnumSet;

import com.googlecode.pseudo.compiler.lexer.PseudoRuleEnum;
import com.googlecode.pseudo.compiler.parser.PseudoTerminalEnum;

public class PseudoToolsDataTable {
  public static ToolsTable<PseudoRuleEnum,PseudoTerminalEnum> createToolsTable() {
      EnumSet<PseudoRuleEnum> spawns = EnumSet.of(PseudoRuleEnum.slash,PseudoRuleEnum.lopt,PseudoRuleEnum.rpar,PseudoRuleEnum.bor,PseudoRuleEnum.arrow,PseudoRuleEnum.char_literal,PseudoRuleEnum._for,PseudoRuleEnum._break,PseudoRuleEnum.eoln,PseudoRuleEnum.value_literal,PseudoRuleEnum._new,PseudoRuleEnum.id,PseudoRuleEnum._do,PseudoRuleEnum.band,PseudoRuleEnum.bang,PseudoRuleEnum._double,PseudoRuleEnum.record,PseudoRuleEnum.boolean_literal,PseudoRuleEnum._if,PseudoRuleEnum.star,PseudoRuleEnum.print,PseudoRuleEnum.semicolon,PseudoRuleEnum.init,PseudoRuleEnum.dot,PseudoRuleEnum.colon,PseudoRuleEnum.lpar,PseudoRuleEnum.null_literal,PseudoRuleEnum.eq,PseudoRuleEnum.plus,PseudoRuleEnum.lt,PseudoRuleEnum._else,PseudoRuleEnum._return,PseudoRuleEnum._boolean,PseudoRuleEnum.minus,PseudoRuleEnum.lcurl,PseudoRuleEnum._continue,PseudoRuleEnum.comma,PseudoRuleEnum.gt,PseudoRuleEnum.rcurl,PseudoRuleEnum.pow,PseudoRuleEnum.neq,PseudoRuleEnum._while,PseudoRuleEnum._char,PseudoRuleEnum.ropt,PseudoRuleEnum.string_literal,PseudoRuleEnum.le,PseudoRuleEnum.scan,PseudoRuleEnum.lambda,PseudoRuleEnum.def,PseudoRuleEnum.ge,PseudoRuleEnum.any,PseudoRuleEnum.string,PseudoRuleEnum._void,PseudoRuleEnum.comment,PseudoRuleEnum.mod,PseudoRuleEnum._int,PseudoRuleEnum._throw,PseudoRuleEnum.assign);
      EnumSet<PseudoRuleEnum> discards = EnumSet.allOf(PseudoRuleEnum.class);
      EnumMap<PseudoRuleEnum,PseudoTerminalEnum> terminal = new EnumMap<PseudoRuleEnum,PseudoTerminalEnum>(PseudoRuleEnum.class);
              terminal.put(PseudoRuleEnum.slash,PseudoTerminalEnum.slash);
              terminal.put(PseudoRuleEnum.lopt,PseudoTerminalEnum.lopt);
              terminal.put(PseudoRuleEnum.rpar,PseudoTerminalEnum.rpar);
              terminal.put(PseudoRuleEnum.bor,PseudoTerminalEnum.bor);
              terminal.put(PseudoRuleEnum.arrow,PseudoTerminalEnum.arrow);
              terminal.put(PseudoRuleEnum.char_literal,PseudoTerminalEnum.char_literal);
              terminal.put(PseudoRuleEnum._for,PseudoTerminalEnum._for);
              terminal.put(PseudoRuleEnum._break,PseudoTerminalEnum._break);
              terminal.put(PseudoRuleEnum.eoln,PseudoTerminalEnum.eoln);
              terminal.put(PseudoRuleEnum.value_literal,PseudoTerminalEnum.value_literal);
              terminal.put(PseudoRuleEnum._new,PseudoTerminalEnum._new);
              terminal.put(PseudoRuleEnum.id,PseudoTerminalEnum.id);
              terminal.put(PseudoRuleEnum._do,PseudoTerminalEnum._do);
              terminal.put(PseudoRuleEnum.band,PseudoTerminalEnum.band);
              terminal.put(PseudoRuleEnum.bang,PseudoTerminalEnum.bang);
              terminal.put(PseudoRuleEnum.record,PseudoTerminalEnum.record);
              terminal.put(PseudoRuleEnum._double,PseudoTerminalEnum._double);
              terminal.put(PseudoRuleEnum.boolean_literal,PseudoTerminalEnum.boolean_literal);
              terminal.put(PseudoRuleEnum._if,PseudoTerminalEnum._if);
              terminal.put(PseudoRuleEnum.star,PseudoTerminalEnum.star);
              terminal.put(PseudoRuleEnum.print,PseudoTerminalEnum.print);
              terminal.put(PseudoRuleEnum.semicolon,PseudoTerminalEnum.semicolon);
              terminal.put(PseudoRuleEnum.init,PseudoTerminalEnum.init);
              terminal.put(PseudoRuleEnum.colon,PseudoTerminalEnum.colon);
              terminal.put(PseudoRuleEnum.dot,PseudoTerminalEnum.dot);
              terminal.put(PseudoRuleEnum.lpar,PseudoTerminalEnum.lpar);
              terminal.put(PseudoRuleEnum.null_literal,PseudoTerminalEnum.null_literal);
              terminal.put(PseudoRuleEnum.eq,PseudoTerminalEnum.eq);
              terminal.put(PseudoRuleEnum.plus,PseudoTerminalEnum.plus);
              terminal.put(PseudoRuleEnum.lt,PseudoTerminalEnum.lt);
              terminal.put(PseudoRuleEnum._else,PseudoTerminalEnum._else);
              terminal.put(PseudoRuleEnum._return,PseudoTerminalEnum._return);
              terminal.put(PseudoRuleEnum._boolean,PseudoTerminalEnum._boolean);
              terminal.put(PseudoRuleEnum.minus,PseudoTerminalEnum.minus);
              terminal.put(PseudoRuleEnum.lcurl,PseudoTerminalEnum.lcurl);
              terminal.put(PseudoRuleEnum._continue,PseudoTerminalEnum._continue);
              terminal.put(PseudoRuleEnum.comma,PseudoTerminalEnum.comma);
              terminal.put(PseudoRuleEnum.gt,PseudoTerminalEnum.gt);
              terminal.put(PseudoRuleEnum.rcurl,PseudoTerminalEnum.rcurl);
              terminal.put(PseudoRuleEnum.pow,PseudoTerminalEnum.pow);
              terminal.put(PseudoRuleEnum.neq,PseudoTerminalEnum.neq);
              terminal.put(PseudoRuleEnum._while,PseudoTerminalEnum._while);
              terminal.put(PseudoRuleEnum._char,PseudoTerminalEnum._char);
              terminal.put(PseudoRuleEnum.ropt,PseudoTerminalEnum.ropt);
              terminal.put(PseudoRuleEnum.string_literal,PseudoTerminalEnum.string_literal);
              terminal.put(PseudoRuleEnum.le,PseudoTerminalEnum.le);
              terminal.put(PseudoRuleEnum.scan,PseudoTerminalEnum.scan);
              terminal.put(PseudoRuleEnum.lambda,PseudoTerminalEnum.lambda);
              terminal.put(PseudoRuleEnum.def,PseudoTerminalEnum.def);
              terminal.put(PseudoRuleEnum.ge,PseudoTerminalEnum.ge);
              terminal.put(PseudoRuleEnum.string,PseudoTerminalEnum.string);
              terminal.put(PseudoRuleEnum.any,PseudoTerminalEnum.any);
              terminal.put(PseudoRuleEnum._void,PseudoTerminalEnum._void);
              terminal.put(PseudoRuleEnum.mod,PseudoTerminalEnum.mod);
              terminal.put(PseudoRuleEnum._throw,PseudoTerminalEnum._throw);
              terminal.put(PseudoRuleEnum._int,PseudoTerminalEnum._int);
              terminal.put(PseudoRuleEnum.assign,PseudoTerminalEnum.assign);
            EnumSet<PseudoRuleEnum> unconditionals = EnumSet.of(PseudoRuleEnum.comment,PseudoRuleEnum.space);
      return new ToolsTable<PseudoRuleEnum,PseudoTerminalEnum>(spawns,discards,unconditionals,terminal);
  }
}