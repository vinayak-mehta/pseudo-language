package com.googlecode.pseudo.compiler.ast;

import com.googlecode.pseudo.compiler.parser.PseudoProductionEnum;

/**
 *
 *  This class is generated - please do not edit it 
 */
public class FieldAccessPrimary extends FieldAccess {
   private Primary primary;
         private IdToken id;
             public FieldAccessPrimary(Primary primary,IdToken id) {
    this.primary=reparent(null,primary);
          this.id=reparent(null,id);
              }
    
    @Override
    public PseudoProductionEnum getKind() {
      return PseudoProductionEnum.field_access_primary;
    }
    
    
              public Primary getPrimary() {
            return primary;
          }
          public void setPrimary(Primary primary) {
            this.primary=reparent(this.primary,primary);
          }
                    public IdToken getId() {
            return id;
          }
          public void setId(IdToken id) {
            this.id=reparent(this.id,id);
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
              return primary;
                      case 1:
              return id;
           }
              throw new IndexOutOfBoundsException("invalid index "+index);
   }
   
   @Override
   protected final Node subNodeAt(int index, Node node) {
     int _index=index;
              switch(_index) {
                        case 0: {
              Primary old=primary;
              this.primary=(Primary)node;
              return old;
            }
                      case 1: {
              IdToken old=id;
              this.id=(IdToken)node;
              return old;
            }
           }
              throw new IndexOutOfBoundsException("invalid index "+index);
   }   
   
   @Override
   protected final int subNodesSize() {
           return 2;
   }
   
   /*
   @Override
   public String toString() { 
     return ((primary==null)?"":primary.toString()) + " ""dot" + " "((id==null)?"":id.toString());
   }*/
}
