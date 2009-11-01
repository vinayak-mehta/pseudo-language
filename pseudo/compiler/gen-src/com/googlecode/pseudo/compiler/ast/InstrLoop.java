package com.googlecode.pseudo.compiler.ast;

import com.googlecode.pseudo.compiler.parser.PseudoProductionEnum;

/**
 *
 *  This class is generated - please do not edit it 
 */
public class InstrLoop extends Instr {
   private LoopLabel loop_label_optional;
         private Loop loop;
             public InstrLoop(LoopLabel loop_label_optional,Loop loop) {
    this.loop_label_optional=reparent(null,loop_label_optional);
          this.loop=reparent(null,loop);
              }
    
    @Override
    public PseudoProductionEnum getKind() {
      return PseudoProductionEnum.instr_loop;
    }
    
    
              public LoopLabel getLoopLabelOptional() {
            return loop_label_optional;
          }
          public void setLoopLabelOptional(LoopLabel loop_label_optional) {
            this.loop_label_optional=reparent(this.loop_label_optional,loop_label_optional);
          }
                    public Loop getLoop() {
            return loop;
          }
          public void setLoop(Loop loop) {
            this.loop=reparent(this.loop,loop);
          }
              
  @Override
  public <_R,_P,_E extends Exception> _R accept(Visitor<? extends _R, ? super _P, ? extends _E> visitor, _P param) throws _E {
    return visitor.visit(this,param);
  }
   
   @Override
   protected final Node subNodeAt(int index) {
     int _index=index;
            if (_index == 0 && loop_label_optional != null) {
              return loop_label_optional;
            }
            if (loop_label_optional != null)
              _index--;
                          switch(_index) {
                        case 0:
              return loop;
           }
              throw new IndexOutOfBoundsException("invalid index "+index);
   }
   
   @Override
   protected final Node subNodeAt(int index, Node node) {
     int _index=index;
            if (_index == 0 && loop_label_optional != null) {
              LoopLabel old=loop_label_optional;
              this.loop_label_optional=(LoopLabel)node;
              return old;
            }
            if (loop_label_optional != null)
              _index--;
                          switch(_index) {
                        case 0: {
              Loop old=loop;
              this.loop=(Loop)node;
              return old;
            }
           }
              throw new IndexOutOfBoundsException("invalid index "+index);
   }   
   
   @Override
   protected final int subNodesSize() {
           return 1+((loop_label_optional==null)?0:1);
   }
   
   /*
   @Override
   public String toString() { 
     return ((loop_label_optional==null)?"":loop_label_optional.toString()) + " "((loop==null)?"":loop.toString());
   }*/
}
