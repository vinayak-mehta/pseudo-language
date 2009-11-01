package com.googlecode.pseudo.compiler.ast;

import com.googlecode.pseudo.compiler.parser.PseudoProductionEnum;

/**
 *
 *  This class is generated - please do not edit it 
 */
public class PrimaryArrayAccess extends PrimaryNoArrayCreation {
   private ArrayAccess array_access;
             public PrimaryArrayAccess(ArrayAccess array_access) {
    this.array_access=reparent(null,array_access);
              }
    
    @Override
    public PseudoProductionEnum getKind() {
      return PseudoProductionEnum.primary_array_access;
    }
    
    
              public ArrayAccess getArrayAccess() {
            return array_access;
          }
          public void setArrayAccess(ArrayAccess array_access) {
            this.array_access=reparent(this.array_access,array_access);
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
              return array_access;
           }
              throw new IndexOutOfBoundsException("invalid index "+index);
   }
   
   @Override
   protected final Node subNodeAt(int index, Node node) {
     int _index=index;
              switch(_index) {
                        case 0: {
              ArrayAccess old=array_access;
              this.array_access=(ArrayAccess)node;
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
     return ((array_access==null)?"":array_access.toString());
   }*/
}
