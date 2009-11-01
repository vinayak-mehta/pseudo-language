package com.googlecode.pseudo.compiler.ast;

import com.googlecode.pseudo.compiler.ast.AbstractToken;
import com.googlecode.pseudo.compiler.parser.PseudoTerminalEnum;


/**
 *
 *  This class is generated - please do not edit it 
 */
public class CharLiteralToken extends AbstractToken<Character> {
    private final char char_literal;
    
    public CharLiteralToken(char char_literal) {
      this.char_literal=char_literal;
    } 

    @Override
    public Character getValue() {
      return char_literal;
    }
    
    @Override
    public PseudoTerminalEnum getKind() {
      return PseudoTerminalEnum.char_literal;
    }
    
    @Override
    public ExprCharLiteral getParent() {
      return (ExprCharLiteral)super.getParent();
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
