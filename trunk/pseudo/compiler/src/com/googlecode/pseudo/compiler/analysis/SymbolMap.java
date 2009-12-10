package com.googlecode.pseudo.compiler.analysis;

import java.util.HashMap;

import code.googlecode.pseudo.compiler.model.Symbol;

import com.googlecode.pseudo.compiler.ast.Node;

public class SymbolMap {
  private final HashMap<Node, Symbol> symbolMap =
    new HashMap<Node, Symbol>();
  
  public void register(Node node, Symbol symbol) {
    if (symbolMap.put(node, symbol) != null) {
      throw new AssertionError("symbol defined twice "+node);
    }
  }
  
  public Symbol get(Node node) {
    Symbol symbol = symbolMap.get(node);
    if (symbol == null)
      throw new AssertionError("no symbol for node "+node);
    return symbol;
  }
}
