package com.googlecode.pseudo.compiler.ast;

import com.googlecode.pseudo.compiler.parser.PseudoProductionEnum;

/**
 *
 *  This class is generated - please do not edit it 
 */
public class PrimaryArrayCreation extends Primary {
   private ArrayCreation array_creation;
             public PrimaryArrayCreation(ArrayCreation array_creation) {
    this.array_creation=reparent(null,array_creation);
              }
    
    @Override
    public PseudoProductionEnum getKind() {
      return PseudoProductionEnum.primary_array_creation;
    }
    
    
              public ArrayCreation getArrayCreation() {
            return array_creation;
          }
          public void setArrayCreation(ArrayCreation array_creation) {
            this.array_creation=reparent(this.array_creation,array_creation);
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
              return array_creation;
           }
              throw new IndexOutOfBoundsException("invalid index "+index);
   }
   
   @Override
   protected final Node subNodeAt(int index, Node node) {
     int _index=index;
              switch(_index) {
                        case 0: {
              ArrayCreation old=array_creation;
              this.array_creation=(ArrayCreation)node;
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
     return ((array_creation==null)?"":array_creation.toString());
   }*/
}
