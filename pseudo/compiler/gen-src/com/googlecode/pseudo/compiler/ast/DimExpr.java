package com.googlecode.pseudo.compiler.ast;

import com.googlecode.pseudo.compiler.ast.AbstractInnerNode;
import com.googlecode.pseudo.compiler.parser.PseudoProductionEnum;

/**
 *
 *  This class is generated - please do not edit it 
 */
public class DimExpr extends AbstractInnerNode {
   private Expr expr;
             public DimExpr(Expr expr) {
    this.expr=reparent(null,expr);
              }
    
    @Override
    public PseudoProductionEnum getKind() {
      return PseudoProductionEnum.dim_expr;
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
              return expr;
           }
              throw new IndexOutOfBoundsException("invalid index "+index);
   }
   
   @Override
   protected final Node subNodeAt(int index, Node node) {
     int _index=index;
              switch(_index) {
                        case 0: {
              Expr old=expr;
              this.expr=(Expr)node;
              return old;
            }
           }
              throw new IndexOutOfBoundsException("invalid index "+index);
   }   
   
   @Override
   protected final int subNodesSize() {
           return 1;
   }
   
   /*
   @Override
   public String toString() { 
     return "lopt" + " "((expr==null)?"":expr.toString()) + " ""ropt";
   }*/
}
