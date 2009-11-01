package com.googlecode.pseudo.compiler.ast;

import com.googlecode.pseudo.compiler.ast.AbstractToken;
import com.googlecode.pseudo.compiler.parser.PseudoTerminalEnum;


/**
 *
 *  This class is generated - please do not edit it 
 */
public class ValueLiteralToken extends AbstractToken<Object> {
    private final Object value_literal;
    
    public ValueLiteralToken(Object value_literal) {
      this.value_literal=value_literal;
    } 

    @Override
    public Object getValue() {
      return value_literal;
    }
    
    @Override
    public PseudoTerminalEnum getKind() {
      return PseudoTerminalEnum.value_literal;
    }
    
    @Override
    public ExprValueLiteral getParent() {
      return (ExprValueLiteral)super.getParent();
    }

   @Override
   public <_R,_P,_E extends Exception> _R accept(Visitor<? extends _R, ? super _P, ? extends _E> visitor, _P param) throws _E {
     return visitor.visit(this,param);
   }
   /*
   @Override
   public String toString() {
     return getValue().toString();
   }*/
}
