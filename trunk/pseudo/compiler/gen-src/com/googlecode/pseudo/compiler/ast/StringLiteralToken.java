package com.googlecode.pseudo.compiler.ast;

import com.googlecode.pseudo.compiler.ast.AbstractToken;
import com.googlecode.pseudo.compiler.parser.PseudoTerminalEnum;


/**
 *
 *  This class is generated - please do not edit it 
 */
public class StringLiteralToken extends AbstractToken<String> {
    private final String string_literal;
    
    public StringLiteralToken(String string_literal) {
      this.string_literal=string_literal;
    } 

    @Override
    public String getValue() {
      return string_literal;
    }
    
    @Override
    public PseudoTerminalEnum getKind() {
      return PseudoTerminalEnum.string_literal;
    }
    
    @Override
    public ExprStringLiteral getParent() {
      return (ExprStringLiteral)super.getParent();
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
