package com.googlecode.pseudo.compiler.ast;

import com.googlecode.pseudo.compiler.parser.PseudoProductionEnum;

/**
 *
 *  This class is generated - please do not edit it 
 */
public class DimsRecursive extends Dims {
   private Dims dims;
             public DimsRecursive(Dims dims) {
    this.dims=reparent(null,dims);
              }
    
    @Override
    public PseudoProductionEnum getKind() {
      return PseudoProductionEnum.dims_recursive;
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
              return dims;
           }
              throw new IndexOutOfBoundsException("invalid index "+index);
   }
   
   @Override
   protected final Node subNodeAt(int index, Node node) {
     int _index=index;
              switch(_index) {
                        case 0: {
              Dims old=dims;
              this.dims=(Dims)node;
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
     return ((dims==null)?"":dims.toString()) + " ""lopt" + " ""ropt";
   }*/
}
