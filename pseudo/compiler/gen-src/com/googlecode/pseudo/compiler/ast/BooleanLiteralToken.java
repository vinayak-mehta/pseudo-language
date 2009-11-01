package com.googlecode.pseudo.compiler.ast;

import com.googlecode.pseudo.compiler.ast.AbstractToken;
import com.googlecode.pseudo.compiler.parser.PseudoTerminalEnum;


/**
 *
 *  This class is generated - please do not edit it 
 */
public class BooleanLiteralToken extends AbstractToken<Boolean> {
    private final boolean boolean_literal;
    
    public BooleanLiteralToken(boolean boolean_literal) {
      this.boolean_literal=boolean_literal;
    } 

    @Override
    public Boolean getValue() {
      return boolean_literal;
    }
    
    @Override
    public PseudoTerminalEnum getKind() {
      return PseudoTerminalEnum.boolean_literal;
    }
    
    @Override
    public ExprBooleanLiteral getParent() {
      return (ExprBooleanLiteral)super.getParent();
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
