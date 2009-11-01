package com.googlecode.pseudo.compiler.ast;

import com.googlecode.pseudo.compiler.parser.PseudoProductionEnum;

/**
 *
 *  This class is generated - please do not edit it 
 */
public class TypePrimitiveDims extends Type {
   private PrimitiveType primitive_type;
         private Dims dims;
             public TypePrimitiveDims(PrimitiveType primitive_type,Dims dims) {
    this.primitive_type=reparent(null,primitive_type);
          this.dims=reparent(null,dims);
              }
    
    @Override
    public PseudoProductionEnum getKind() {
      return PseudoProductionEnum.type_primitive_dims;
    }
    
    
              public PrimitiveType getPrimitiveType() {
            return primitive_type;
          }
          public void setPrimitiveType(PrimitiveType primitive_type) {
            this.primitive_type=reparent(this.primitive_type,primitive_type);
          }
                    public Dims getDims() {
            return dims;
          }
          public void setDims(Dims dims) {
            this.dims=reparent(this.dims,dims);
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
                      case 1:
              return dims;
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
                      case 1: {
              Dims old=dims;
              this.dims=(Dims)node;
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
     return ((primitive_type==null)?"":primitive_type.toString()) + " "((dims==null)?"":dims.toString());
   }*/
}
