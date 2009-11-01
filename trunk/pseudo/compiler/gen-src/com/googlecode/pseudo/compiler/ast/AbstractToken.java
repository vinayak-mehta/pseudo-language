package com.googlecode.pseudo.compiler.ast;

import java.util.Collections;
import java.util.List;

import fr.umlv.tatoo.runtime.ast.Token;
import com.googlecode.pseudo.compiler.parser.PseudoTerminalEnum;

/** Common abstract class of all tokens.
 *
 *  This class is generated - please do not edit it 
 */
public abstract class AbstractToken<V> extends Node implements Token {
  @Override
  public boolean isToken() {
    return true;
  }
  
  public abstract V getValue();
  
  public abstract PseudoTerminalEnum getKind();
  
  @Override
  public String toString() {
    return "["+getKind()+' '+getValue()+']';
  }
  
  @Override
  public List<Node> nodeList() {
    return Collections.emptyList();
  }
}
