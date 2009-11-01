package com.googlecode.pseudo.compiler.ast;

import com.googlecode.pseudo.compiler.parser.PseudoProductionEnum;

/**
 *
 *  This class is generated - please do not edit it 
 */
public class PrimaryFieldAccess extends PrimaryNoArrayCreation {
   private FieldAccess field_access;
             public PrimaryFieldAccess(FieldAccess field_access) {
    this.field_access=reparent(null,field_access);
              }
    
    @Override
    public PseudoProductionEnum getKind() {
      return PseudoProductionEnum.primary_field_access;
    }
    
    
              public FieldAccess getFieldAccess() {
            return field_access;
          }
          public void setFieldAccess(FieldAccess field_access) {
            this.field_access=reparent(this.field_access,field_access);
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
              return field_access;
           }
              throw new IndexOutOfBoundsException("invalid index "+index);
   }
   
   @Override
   protected final Node subNodeAt(int index, Node node) {
     int _index=index;
              switch(_index) {
                        case 0: {
              FieldAccess old=field_access;
              this.field_access=(FieldAccess)node;
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
     return ((field_access==null)?"":field_access.toString());
   }*/
}
