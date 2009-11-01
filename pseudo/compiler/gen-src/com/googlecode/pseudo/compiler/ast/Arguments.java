package com.googlecode.pseudo.compiler.ast;

import com.googlecode.pseudo.compiler.ast.AbstractInnerNode;
import com.googlecode.pseudo.compiler.parser.PseudoProductionEnum;
import java.util.List;

/**
 *
 *  This class is generated - please do not edit it 
 */
public class Arguments extends AbstractInnerNode {
   private List<Expr> expr_star;
             public Arguments(List<Expr> expr_star) {
    this.expr_star=reparent(null,expr_star);
              }
    
    @Override
    public PseudoProductionEnum getKind() {
      return PseudoProductionEnum.arguments;
    }
    
    
              public List<Expr> getExprStar() {
            return expr_star;
          }
          public void setExprStar(List<Expr> expr_star) {
            this.expr_star=reparent(this.expr_star,expr_star);
          }
              
  @Override
  public <_R,_P,_E extends Exception> _R accept(Visitor<? extends _R, ? super _P, ? extends _E> visitor, _P param) throws _E {
    return visitor.visit(this,param);
  }
   
   @Override
   protected final Node subNodeAt(int index) {
     int _index=index;
               if (_index < expr_star.size()) {
                 return expr_star.get(_index);
               }
                  throw new IndexOutOfBoundsException("invalid index "+index);
   }
   
   @Override
   protected final Node subNodeAt(int index, Node node) {
     int _index=index;
               if (_index < expr_star.size()) {
                 return expr_star.set(_index, (com.googlecode.pseudo.compiler.ast.Expr)node);
               }
                  throw new IndexOutOfBoundsException("invalid index "+index);
   }   
   
   @Override
   protected final int subNodesSize() {
           return 0+expr_star.size();
   }
   
   /*
   @Override
   public String toString() { 
     return ((expr_star==null)?"":expr_star.toString());
   }*/
}
