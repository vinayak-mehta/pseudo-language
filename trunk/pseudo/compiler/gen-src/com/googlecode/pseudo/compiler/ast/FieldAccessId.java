package com.googlecode.pseudo.compiler.ast;

import com.googlecode.pseudo.compiler.parser.PseudoProductionEnum;

/**
 *
 *  This class is generated - please do not edit it 
 */
public class FieldAccessId extends FieldAccess {
   private IdToken id;
         private IdToken id2;
             public FieldAccessId(IdToken id,IdToken id2) {
    this.id=reparent(null,id);
          this.id2=reparent(null,id2);
              }
    
    @Override
    public PseudoProductionEnum getKind() {
      return PseudoProductionEnum.field_access_id;
    }
    
    
              public IdToken getId() {
            return id;
          }
          public void setId(IdToken id) {
            this.id=reparent(this.id,id);
          }
                    public IdToken getId2() {
            return id2;
          }
          public void setId2(IdToken id2) {
            this.id2=reparent(this.id2,id2);
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
              return id;
                      case 1:
              return id2;
           }
              throw new IndexOutOfBoundsException("invalid index "+index);
   }
   
   @Override
   protected final Node subNodeAt(int index, Node node) {
     int _index=index;
              switch(_index) {
                        case 0: {
              IdToken old=id;
              this.id=(IdToken)node;
              return old;
            }
                      case 1: {
              IdToken old=id2;
              this.id2=(IdToken)node;
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
     return ((id==null)?"":id.toString()) + " ""dot" + " "((id2==null)?"":id2.toString());
   }*/
}
