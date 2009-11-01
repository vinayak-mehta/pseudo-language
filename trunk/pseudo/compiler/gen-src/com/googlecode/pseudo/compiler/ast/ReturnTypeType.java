package com.googlecode.pseudo.compiler.ast;

import com.googlecode.pseudo.compiler.parser.PseudoProductionEnum;

/**
 *
 *  This class is generated - please do not edit it 
 */
public class ReturnTypeType extends ReturnType {
   private Type type;
             public ReturnTypeType(Type type) {
    this.type=reparent(null,type);
              }
    
    @Override
    public PseudoProductionEnum getKind() {
      return PseudoProductionEnum.return_type_type;
    }
    
    
              public Type getType() {
            return type;
          }
          public void setType(Type type) {
            this.type=reparent(this.type,type);
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
              return type;
           }
              throw new IndexOutOfBoundsException("invalid index "+index);
   }
   
   @Override
   protected final Node subNodeAt(int index, Node node) {
     int _index=index;
              switch(_index) {
                        case 0: {
              Type old=type;
              this.type=(Type)node;
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
     return ((type==null)?"":type.toString());
   }*/
}
