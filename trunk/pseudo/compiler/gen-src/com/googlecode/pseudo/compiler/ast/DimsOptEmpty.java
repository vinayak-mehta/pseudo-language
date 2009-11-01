package com.googlecode.pseudo.compiler.ast;

import com.googlecode.pseudo.compiler.parser.PseudoProductionEnum;

/**
 *
 *  This class is generated - please do not edit it 
 */
public class DimsOptEmpty extends DimsOpt {
       public DimsOptEmpty() {
          //no field to initialize
    }
    
    @Override
    public PseudoProductionEnum getKind() {
      return PseudoProductionEnum.dims_opt_empty;
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
     return ;
   }*/
}
