package com.googlecode.pseudo.compiler.ast;

import com.googlecode.pseudo.compiler.ast.AbstractInnerNode;
import com.googlecode.pseudo.compiler.parser.PseudoProductionEnum;

/**
 *
 *  This class is generated - please do not edit it 
 */
public class Assignation extends AbstractInnerNode {
   private Lhs lhs;
         private Expr expr;
             public Assignation(Lhs lhs,Expr expr) {
    this.lhs=reparent(null,lhs);
          this.expr=reparent(null,expr);
              }
    
    @Override
    public PseudoProductionEnum getKind() {
      return PseudoProductionEnum.assignation;
    }
    
    
              public Lhs getLhs() {
            return lhs;
          }
          public void setLhs(Lhs lhs) {
            this.lhs=reparent(this.lhs,lhs);
          }
                    public Expr getExpr() {
            return expr;
          }
          public void setExpr(Expr expr) {
            this.expr=reparent(this.expr,expr);
          }
              
  @Override
  public <_R,_P,_E extends Exception> _R accept(Visitor<? extends _R, ? super _P, ? extends _E> visitor, _P param) throws _E {
    return visitor.visit(this,param);
  }
   
   @Override
   protected final Node subNodeAt(int index) {
     int _index=index;
              switch(_index) {
                        case 0:
              return lhs;
                      case 1:
              return expr;
           }
              throw new IndexOutOfBoundsException("invalid index "+index);
   }
   
   @Override
   protected final Node subNodeAt(int index, Node node) {
     int _index=index;
              switch(_index) {
                        case 0: {
              Lhs old=lhs;
              this.lhs=(Lhs)node;
              return old;
            }
                      case 1: {
              Expr old=expr;
              this.expr=(Expr)node;
              return old;
            }
           }
              throw new IndexOutOfBoundsException("invalid index "+index);
   }   
   
   @Override
   protected final int subNodesSize() {
           return 2;
   }
   
   /*
   @Override
   public String toString() { 
     return ((lhs==null)?"":lhs.toString()) + " ""assign" + " "((expr==null)?"":expr.toString());
   }*/
}
