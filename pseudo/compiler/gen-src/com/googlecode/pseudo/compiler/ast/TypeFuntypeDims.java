package com.googlecode.pseudo.compiler.ast;

import com.googlecode.pseudo.compiler.parser.PseudoProductionEnum;

/**
 *
 *  This class is generated - please do not edit it 
 */
public class TypeFuntypeDims extends Type {
   private Funtype funtype;
         private Dims dims;
             public TypeFuntypeDims(Funtype funtype,Dims dims) {
    this.funtype=reparent(null,funtype);
          this.dims=reparent(null,dims);
              }
    
    @Override
    public PseudoProductionEnum getKind() {
      return PseudoProductionEnum.type_funtype_dims;
    }
    
    
              public Funtype getFuntype() {
            return funtype;
          }
          public void setFuntype(Funtype funtype) {
            this.funtype=reparent(this.funtype,funtype);
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
              return funtype;
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
              Funtype old=funtype;
              this.funtype=(Funtype)node;
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
     return ((funtype==null)?"":funtype.toString()) + " "((dims==null)?"":dims.toString());
   }*/
}
