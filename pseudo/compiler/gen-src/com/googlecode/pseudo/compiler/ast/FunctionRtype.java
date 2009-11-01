package com.googlecode.pseudo.compiler.ast;

import com.googlecode.pseudo.compiler.ast.AbstractInnerNode;
import com.googlecode.pseudo.compiler.parser.PseudoProductionEnum;

/**
 *
 *  This class is generated - please do not edit it 
 */
public class FunctionRtype extends AbstractInnerNode {
   private ReturnType return_type;
             public FunctionRtype(ReturnType return_type) {
    this.return_type=reparent(null,return_type);
              }
    
    @Override
    public PseudoProductionEnum getKind() {
      return PseudoProductionEnum.function_rtype;
    }
    
    
              public ReturnType getReturnType() {
            return return_type;
          }
          public void setReturnType(ReturnType return_type) {
            this.return_type=reparent(this.return_type,return_type);
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
              return return_type;
           }
              throw new IndexOutOfBoundsException("invalid index "+index);
   }
   
   @Override
   protected final Node subNodeAt(int index, Node node) {
     int _index=index;
              switch(_index) {
                        case 0: {
              ReturnType old=return_type;
              this.return_type=(ReturnType)node;
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
     return "colon" + " "((return_type==null)?"":return_type.toString());
   }*/
}
