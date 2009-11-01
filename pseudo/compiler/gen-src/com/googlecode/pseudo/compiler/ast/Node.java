package com.googlecode.pseudo.compiler.ast;

import java.util.List;

/** Common class for all node, specialized for the AST.
 *
 *  This class is generated - please do not edit it 
 */
public abstract class Node implements fr.umlv.tatoo.runtime.ast.Node {
  AbstractInnerNode parent;

  public Node getParent() {
    return parent;
  }
  
  public abstract List<Node> nodeList();
  
  /** call a visitor method depending of the real type of the current node.
   * 
   * @param <_R> type of the return value.
   * @param <_P> type of the argument.
   * @param <_E> type of the exception possibly raised by a visit method.
   * @param visitor visitor to call.
   * @param param parameter send to the visitor.
   * @return the return value of the selected visitor method.
   * @throws _E could propagate a generic exception raised by the visitor.
   */
  public abstract <_R,_P,_E extends Exception> _R accept(Visitor<? extends _R, ? super _P, ? extends _E> visitor, _P param) throws _E;
}