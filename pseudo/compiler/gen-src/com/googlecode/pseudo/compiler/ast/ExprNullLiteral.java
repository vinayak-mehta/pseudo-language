package com.googlecode.pseudo.compiler.ast;

import com.googlecode.pseudo.compiler.parser.PseudoProductionEnum;

/**
 *
 *  This class is generated - please do not edit it 
 */
public class ExprNullLiteral extends Expr {
       public ExprNullLiteral() {
          //no field to initialize
    }
    
    @Override
    public PseudoProductionEnum getKind() {
      return PseudoProductionEnum.expr_null_literal;
    }
    
    
        
  @Override
  public <_R,_P,_E extends Exception> _R accept(Visitor<? extends _R, ? super _P, ? extends _E> visitor, _P param) throws _E {
    return visitor.visit(this,param);
  }
   
   @Override
   protected final Node subNodeAt(int index) {
      throw new IndexOutOfBoundsException("invalid index "+index);
   }
   
   @Override
   protected final Node subNodeAt(int index, Node node) {
      throw new IndexOutOfBoundsException("invalid index "+index);
   }   
   
   @Override
   protected final int subNodesSize() {
           return 0;
   }
   
   /*
   @Override
   public String toString() { 
     return "null_literal";
   }*/
}
