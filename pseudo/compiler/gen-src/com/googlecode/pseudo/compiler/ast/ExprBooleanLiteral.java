package com.googlecode.pseudo.compiler.ast;

import com.googlecode.pseudo.compiler.parser.PseudoProductionEnum;

/**
 *
 *  This class is generated - please do not edit it 
 */
public class ExprBooleanLiteral extends Expr {
   private BooleanLiteralToken boolean_literal;
             public ExprBooleanLiteral(BooleanLiteralToken boolean_literal) {
    this.boolean_literal=reparent(null,boolean_literal);
              }
    
    @Override
    public PseudoProductionEnum getKind() {
      return PseudoProductionEnum.expr_boolean_literal;
    }
    
    
              public BooleanLiteralToken getBooleanLiteral() {
            return boolean_literal;
          }
          public void setBooleanLiteral(BooleanLiteralToken boolean_literal) {
            this.boolean_literal=reparent(this.boolean_literal,boolean_literal);
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
              return boolean_literal;
           }
              throw new IndexOutOfBoundsException("invalid index "+index);
   }
   
   @Override
   protected final Node subNodeAt(int index, Node node) {
     int _index=index;
              switch(_index) {
                        case 0: {
              BooleanLiteralToken old=boolean_literal;
              this.boolean_literal=(BooleanLiteralToken)node;
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
     return ((boolean_literal==null)?"":boolean_literal.toString());
   }*/
}
