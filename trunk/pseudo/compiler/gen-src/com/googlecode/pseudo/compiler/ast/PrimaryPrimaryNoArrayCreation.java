package com.googlecode.pseudo.compiler.ast;

import com.googlecode.pseudo.compiler.parser.PseudoProductionEnum;

/**
 *
 *  This class is generated - please do not edit it 
 */
public class PrimaryPrimaryNoArrayCreation extends Primary {
   private PrimaryNoArrayCreation primary_no_array_creation;
             public PrimaryPrimaryNoArrayCreation(PrimaryNoArrayCreation primary_no_array_creation) {
    this.primary_no_array_creation=reparent(null,primary_no_array_creation);
              }
    
    @Override
    public PseudoProductionEnum getKind() {
      return PseudoProductionEnum.primary_primary_no_array_creation;
    }
    
    
              public PrimaryNoArrayCreation getPrimaryNoArrayCreation() {
            return primary_no_array_creation;
          }
          public void setPrimaryNoArrayCreation(PrimaryNoArrayCreation primary_no_array_creation) {
            this.primary_no_array_creation=reparent(this.primary_no_array_creation,primary_no_array_creation);
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
              return primary_no_array_creation;
           }
              throw new IndexOutOfBoundsException("invalid index "+index);
   }
   
   @Override
   protected final Node subNodeAt(int index, Node node) {
     int _index=index;
              switch(_index) {
                        case 0: {
              PrimaryNoArrayCreation old=primary_no_array_creation;
              this.primary_no_array_creation=(PrimaryNoArrayCreation)node;
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
     return ((primary_no_array_creation==null)?"":primary_no_array_creation.toString());
   }*/
}
