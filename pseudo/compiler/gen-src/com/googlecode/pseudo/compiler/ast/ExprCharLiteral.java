package com.googlecode.pseudo.compiler.ast;

import com.googlecode.pseudo.compiler.parser.PseudoProductionEnum;

/**
 *
 *  This class is generated - please do not edit it 
 */
public class ExprCharLiteral extends Expr {
   private CharLiteralToken char_literal;
             public ExprCharLiteral(CharLiteralToken char_literal) {
    this.char_literal=reparent(null,char_literal);
              }
    
    @Override
    public PseudoProductionEnum getKind() {
      return PseudoProductionEnum.expr_char_literal;
    }
    
    
              public CharLiteralToken getCharLiteral() {
            return char_literal;
          }
          public void setCharLiteral(CharLiteralToken char_literal) {
            this.char_literal=reparent(this.char_literal,char_literal);
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
              return char_literal;
           }
              throw new IndexOutOfBoundsException("invalid index "+index);
   }
   
   @Override
   protected final Node subNodeAt(int index, Node node) {
     int _index=index;
              switch(_index) {
                        case 0: {
              CharLiteralToken old=char_literal;
              this.char_literal=(CharLiteralToken)node;
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
     return ((char_literal==null)?"":char_literal.toString());
   }*/
}
