package com.googlecode.pseudo.compiler.ast;

import com.googlecode.pseudo.compiler.parser.PseudoProductionEnum;

/**
 *
 *  This class is generated - please do not edit it 
 */
public class ExprStringLiteral extends Expr {
   private StringLiteralToken string_literal;
             public ExprStringLiteral(StringLiteralToken string_literal) {
    this.string_literal=reparent(null,string_literal);
              }
    
    @Override
    public PseudoProductionEnum getKind() {
      return PseudoProductionEnum.expr_string_literal;
    }
    
    
              public StringLiteralToken getStringLiteral() {
            return string_literal;
          }
          public void setStringLiteral(StringLiteralToken string_literal) {
            this.string_literal=reparent(this.string_literal,string_literal);
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
              return string_literal;
           }
              throw new IndexOutOfBoundsException("invalid index "+index);
   }
   
   @Override
   protected final Node subNodeAt(int index, Node node) {
     int _index=index;
              switch(_index) {
                        case 0: {
              StringLiteralToken old=string_literal;
              this.string_literal=(StringLiteralToken)node;
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
     return ((string_literal==null)?"":string_literal.toString());
   }*/
}
