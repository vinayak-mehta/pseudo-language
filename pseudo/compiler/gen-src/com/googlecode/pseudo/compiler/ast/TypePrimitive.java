package com.googlecode.pseudo.compiler.ast;

import com.googlecode.pseudo.compiler.parser.PseudoProductionEnum;

/**
 *
 *  This class is generated - please do not edit it 
 */
public class TypePrimitive extends Type {
   private PrimitiveType primitive_type;
             public TypePrimitive(PrimitiveType primitive_type) {
    this.primitive_type=reparent(null,primitive_type);
              }
    
    @Override
    public PseudoProductionEnum getKind() {
      return PseudoProductionEnum.type_primitive;
    }
    
    
              public PrimitiveType getPrimitiveType() {
            return primitive_type;
          }
          public void setPrimitiveType(PrimitiveType primitive_type) {
            this.primitive_type=reparent(this.primitive_type,primitive_type);
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
              return primitive_type;
           }
              throw new IndexOutOfBoundsException("invalid index "+index);
   }
   
   @Override
   protected final Node subNodeAt(int index, Node node) {
     int _index=index;
              switch(_index) {
                        case 0: {
              PrimitiveType old=primitive_type;
              this.primitive_type=(PrimitiveType)node;
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
     return ((primitive_type==null)?"":primitive_type.toString());
   }*/
}
