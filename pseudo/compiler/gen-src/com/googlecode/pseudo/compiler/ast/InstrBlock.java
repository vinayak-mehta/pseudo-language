package com.googlecode.pseudo.compiler.ast;

import com.googlecode.pseudo.compiler.parser.PseudoProductionEnum;

/**
 *
 *  This class is generated - please do not edit it 
 */
public class InstrBlock extends Instr {
   private Block block;
             public InstrBlock(Block block) {
    this.block=reparent(null,block);
              }
    
    @Override
    public PseudoProductionEnum getKind() {
      return PseudoProductionEnum.instr_block;
    }
    
    
              public Block getBlock() {
            return block;
          }
          public void setBlock(Block block) {
            this.block=reparent(this.block,block);
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
              return block;
           }
              throw new IndexOutOfBoundsException("invalid index "+index);
   }
   
   @Override
   protected final Node subNodeAt(int index, Node node) {
     int _index=index;
              switch(_index) {
                        case 0: {
              Block old=block;
              this.block=(Block)node;
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
     return ((block==null)?"":block.toString());
   }*/
}
