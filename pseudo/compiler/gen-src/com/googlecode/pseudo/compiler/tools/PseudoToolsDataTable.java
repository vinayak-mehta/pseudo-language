package com.googlecode.pseudo.compiler.tools;

import fr.umlv.tatoo.runtime.tools.ToolsTable;

import java.util.EnumMap;
import java.util.EnumSet;

import com.googlecode.pseudo.compiler.lexer.PseudoRuleEnum;
import com.googlecode.pseudo.compiler.parser.PseudoTerminalEnum;

public class PseudoToolsDataTable {
  public static ToolsTable<PseudoRuleEnum,PseudoTerminalEnum> createToolsTable() {
      EnumSet<PseudoRuleEnum> spawns = EnumSet.of(PseudoRuleEnum.value_literal,PseudoRuleEnum.lcurl,PseudoRuleEnum.eq,PseudoRuleEnum.dot,PseudoRuleEnum._char,PseudoRuleEnum.scan,PseudoRuleEnum.gt,PseudoRuleEnum.char_literal,PseudoRuleEnum.null_literal,PseudoRuleEnum._boolean,PseudoRuleEnum.colon,PseudoRuleEnum._break,PseudoRuleEnum.mod,PseudoRuleEnum.neq,PseudoRuleEnum._double,PseudoRuleEnum._return,PseudoRuleEnum.boolean_literal,PseudoRuleEnum.init,PseudoRuleEnum.bor,PseudoRuleEnum.ropt,PseudoRuleEnum.semicolon,PseudoRuleEnum._new,PseudoRuleEnum.arrow,PseudoRuleEnum.slash,PseudoRuleEnum.id,PseudoRuleEnum._int,PseudoRuleEnum._else,PseudoRuleEnum.eoln,PseudoRuleEnum._void,PseudoRuleEnum.print,PseudoRuleEnum.lopt,PseudoRuleEnum.string,PseudoRuleEnum.rpar,PseudoRuleEnum._continue,PseudoRuleEnum.assign,PseudoRuleEnum.lt,PseudoRuleEnum._do,PseudoRuleEnum.comment,PseudoRuleEnum.le,PseudoRuleEnum.any,PseudoRuleEnum._throw,PseudoRuleEnum._while,PseudoRuleEnum.bang,PseudoRuleEnum.ge,PseudoRuleEnum.string_literal,PseudoRuleEnum.lambda,PseudoRuleEnum._if,PseudoRuleEnum.band,PseudoRuleEnum.comma,PseudoRuleEnum.star,PseudoRuleEnum.plus,PseudoRuleEnum.pow,PseudoRuleEnum.rcurl,PseudoRuleEnum.def,PseudoRuleEnum.minus,PseudoRuleEnum._for,PseudoRuleEnum.record,PseudoRuleEnum.lpar);
      EnumSet<PseudoRuleEnum> discards = EnumSet.allOf(PseudoRuleEnum.class);
      EnumMap<PseudoRuleEnum,PseudoTerminalEnum> terminal = new EnumMap<PseudoRuleEnum,PseudoTerminalEnum>(PseudoRuleEnum.class);
              terminal.put(PseudoRuleEnum.value_literal,PseudoTerminalEnum.value_literal);
              terminal.put(PseudoRuleEnum.lcurl,PseudoTerminalEnum.lcurl);
              terminal.put(PseudoRuleEnum.eq,PseudoTerminalEnum.eq);
              terminal.put(PseudoRuleEnum.dot,PseudoTerminalEnum.dot);
              terminal.put(PseudoRuleEnum._char,PseudoTerminalEnum._char);
              terminal.put(PseudoRuleEnum.scan,PseudoTerminalEnum.scan);
              terminal.put(PseudoRuleEnum.gt,PseudoTerminalEnum.gt);
              terminal.put(PseudoRuleEnum.char_literal,PseudoTerminalEnum.char_literal);
              terminal.put(PseudoRuleEnum.null_literal,PseudoTerminalEnum.null_literal);
              terminal.put(PseudoRuleEnum._boolean,PseudoTerminalEnum._boolean);
              terminal.put(PseudoRuleEnum.colon,PseudoTerminalEnum.colon);
              terminal.put(PseudoRuleEnum._break,PseudoTerminalEnum._break);
              terminal.put(PseudoRuleEnum.mod,PseudoTerminalEnum.mod);
              terminal.put(PseudoRuleEnum.neq,PseudoTerminalEnum.neq);
              terminal.put(PseudoRuleEnum._return,PseudoTerminalEnum._return);
              terminal.put(PseudoRuleEnum._double,PseudoTerminalEnum._double);
              terminal.put(PseudoRuleEnum.boolean_literal,PseudoTerminalEnum.boolean_literal);
              terminal.put(PseudoRuleEnum.init,PseudoTerminalEnum.init);
              terminal.put(PseudoRuleEnum.semicolon,PseudoTerminalEnum.semicolon);
              terminal.put(PseudoRuleEnum.ropt,PseudoTerminalEnum.ropt);
              terminal.put(PseudoRuleEnum.bor,PseudoTerminalEnum.bor);
              terminal.put(PseudoRuleEnum._new,PseudoTerminalEnum._new);
              terminal.put(PseudoRuleEnum.arrow,PseudoTerminalEnum.arrow);
              terminal.put(PseudoRuleEnum.id,PseudoTerminalEnum.id);
              terminal.put(PseudoRuleEnum.slash,PseudoTerminalEnum.slash);
              terminal.put(PseudoRuleEnum._int,PseudoTerminalEnum._int);
              terminal.put(PseudoRuleEnum._else,PseudoTerminalEnum._else);
              terminal.put(PseudoRuleEnum.eoln,PseudoTerminalEnum.eoln);
              terminal.put(PseudoRuleEnum._void,PseudoTerminalEnum._void);
              terminal.put(PseudoRuleEnum.print,PseudoTerminalEnum.print);
              terminal.put(PseudoRuleEnum.lopt,PseudoTerminalEnum.lopt);
              terminal.put(PseudoRuleEnum.string,PseudoTerminalEnum.string);
              terminal.put(PseudoRuleEnum.rpar,PseudoTerminalEnum.rpar);
              terminal.put(PseudoRuleEnum._continue,PseudoTerminalEnum._continue);
              terminal.put(PseudoRuleEnum.assign,PseudoTerminalEnum.assign);
              terminal.put(PseudoRuleEnum.lt,PseudoTerminalEnum.lt);
              terminal.put(PseudoRuleEnum._do,PseudoTerminalEnum._do);
              terminal.put(PseudoRuleEnum.le,PseudoTerminalEnum.le);
              terminal.put(PseudoRuleEnum.any,PseudoTerminalEnum.any);
              terminal.put(PseudoRuleEnum._throw,PseudoTerminalEnum._throw);
              terminal.put(PseudoRuleEnum._while,PseudoTerminalEnum._while);
              terminal.put(PseudoRuleEnum.bang,PseudoTerminalEnum.bang);
              terminal.put(PseudoRuleEnum.ge,PseudoTerminalEnum.ge);
              terminal.put(PseudoRuleEnum.string_literal,PseudoTerminalEnum.string_literal);
              terminal.put(PseudoRuleEnum.lambda,PseudoTerminalEnum.lambda);
              terminal.put(PseudoRuleEnum._if,PseudoTerminalEnum._if);
              terminal.put(PseudoRuleEnum.band,PseudoTerminalEnum.band);
              terminal.put(PseudoRuleEnum.comma,PseudoTerminalEnum.comma);
              terminal.put(PseudoRuleEnum.star,PseudoTerminalEnum.star);
              terminal.put(PseudoRuleEnum.plus,PseudoTerminalEnum.plus);
              terminal.put(PseudoRuleEnum.pow,PseudoTerminalEnum.pow);
              terminal.put(PseudoRuleEnum.rcurl,PseudoTerminalEnum.rcurl);
              terminal.put(PseudoRuleEnum.def,PseudoTerminalEnum.def);
              terminal.put(PseudoRuleEnum.minus,PseudoTerminalEnum.minus);
              terminal.put(PseudoRuleEnum._for,PseudoTerminalEnum._for);
              terminal.put(PseudoRuleEnum.record,PseudoTerminalEnum.record);
              terminal.put(PseudoRuleEnum.lpar,PseudoTerminalEnum.lpar);
            EnumSet<PseudoRuleEnum> unconditionals = EnumSet.of(PseudoRuleEnum.comment,PseudoRuleEnum.space);
      return new ToolsTable<PseudoRuleEnum,PseudoTerminalEnum>(spawns,discards,unconditionals,terminal);
  }
}