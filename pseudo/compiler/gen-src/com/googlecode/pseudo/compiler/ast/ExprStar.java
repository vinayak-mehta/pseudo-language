package com.googlecode.pseudo.compiler.ast;

import com.googlecode.pseudo.compiler.parser.PseudoProductionEnum;

/**
 *
 *  This class is generated - please do not edit it 
 */
public class ExprStar extends Expr {
   private Expr expr;
         private Expr expr2;
             public ExprStar(Expr expr,Expr expr2) {
    this.expr=reparent(null,expr);
          this.expr2=reparent(null,expr2);
              }
    
    @Override
    public PseudoProductionEnum getKind() {
      return PseudoProductionEnum.expr_star;
    }
    
    
              public Expr getExpr() {
            return expr;
          }
          public void setExpr(Expr expr) {
            this.expr=reparent(this.expr,expr);
          }
                    public Expr getExpr2() {
            return expr2;
          }
          public void setExpr2(Expr expr2) {
            this.expr2=reparent(this.expr2,expr2);
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
                      case 1:
              return expr2;
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
                      case 1: {
              Expr old=expr2;
              this.expr2=(Expr)node;
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
     return ((expr==null)?"":expr.toString()) + " ""star" + " "((expr2==null)?"":expr2.toString());
   }*/
}
