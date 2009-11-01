package com.googlecode.pseudo.compiler.ast;

import com.googlecode.pseudo.compiler.ast.AbstractToken;
import com.googlecode.pseudo.compiler.parser.PseudoTerminalEnum;


/**
 *
 *  This class is generated - please do not edit it 
 */
public class IdToken extends AbstractToken<String> {
    private final String id;
    
    public IdToken(String id) {
      this.id=id;
    } 

    @Override
    public String getValue() {
      return id;
    }
    
    @Override
    public PseudoTerminalEnum getKind() {
      return PseudoTerminalEnum.id;
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
