package com.googlecode.pseudo.compiler.ast;

import com.googlecode.pseudo.compiler.parser.PseudoProductionEnum;

/**
 *
 *  This class is generated - please do not edit it 
 */
public class ForLoopInitFuncall extends ForLoopInit {
   private Funcall funcall;
             public ForLoopInitFuncall(Funcall funcall) {
    this.funcall=reparent(null,funcall);
              }
    
    @Override
    public PseudoProductionEnum getKind() {
      return PseudoProductionEnum.for_loop_init_funcall;
    }
    
    
              public Funcall getFuncall() {
            return funcall;
          }
          public void setFuncall(Funcall funcall) {
            this.funcall=reparent(this.funcall,funcall);
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
              return funcall;
           }
              throw new IndexOutOfBoundsException("invalid index "+index);
   }
   
   @Override
   protected final Node subNodeAt(int index, Node node) {
     int _index=index;
              switch(_index) {
                        case 0: {
              Funcall old=funcall;
              this.funcall=(Funcall)node;
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
     return ((funcall==null)?"":funcall.toString());
   }*/
}
