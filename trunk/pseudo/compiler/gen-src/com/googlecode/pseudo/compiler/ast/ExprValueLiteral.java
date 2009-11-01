package com.googlecode.pseudo.compiler.ast;

import com.googlecode.pseudo.compiler.parser.PseudoProductionEnum;

/**
 *
 *  This class is generated - please do not edit it 
 */
public class ExprValueLiteral extends Expr {
   private ValueLiteralToken value_literal;
             public ExprValueLiteral(ValueLiteralToken value_literal) {
    this.value_literal=reparent(null,value_literal);
              }
    
    @Override
    public PseudoProductionEnum getKind() {
      return PseudoProductionEnum.expr_value_literal;
    }
    
    
              public ValueLiteralToken getValueLiteral() {
            return value_literal;
          }
          public void setValueLiteral(ValueLiteralToken value_literal) {
            this.value_literal=reparent(this.value_literal,value_literal);
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
              return value_literal;
           }
              throw new IndexOutOfBoundsException("invalid index "+index);
   }
   
   @Override
   protected final Node subNodeAt(int index, Node node) {
     int _index=index;
              switch(_index) {
                        case 0: {
              ValueLiteralToken old=value_literal;
              this.value_literal=(ValueLiteralToken)node;
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
     return ((value_literal==null)?"":value_literal.toString());
   }*/
}
