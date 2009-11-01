package com.googlecode.pseudo.compiler.ast;

import com.googlecode.pseudo.compiler.ast.AbstractInnerNode;
import com.googlecode.pseudo.compiler.parser.PseudoProductionEnum;

/**
 *
 *  This class is generated - please do not edit it 
 */
public class RecordInit extends AbstractInnerNode {
   private Parameters parameters;
         private Block block;
             public RecordInit(Parameters parameters,Block block) {
    this.parameters=reparent(null,parameters);
          this.block=reparent(null,block);
              }
    
    @Override
    public PseudoProductionEnum getKind() {
      return PseudoProductionEnum.record_init;
    }
    
    
              public Parameters getParameters() {
            return parameters;
          }
          public void setParameters(Parameters parameters) {
            this.parameters=reparent(this.parameters,parameters);
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
              return parameters;
                      case 1:
              return block;
           }
              throw new IndexOutOfBoundsException("invalid index "+index);
   }
   
   @Override
   protected final Node subNodeAt(int index, Node node) {
     int _index=index;
              switch(_index) {
                        case 0: {
              Parameters old=parameters;
              this.parameters=(Parameters)node;
              return old;
            }
                      case 1: {
              Block old=block;
              this.block=(Block)node;
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
     return "init" + " ""lpar" + " "((parameters==null)?"":parameters.toString()) + " ""rpar" + " "((block==null)?"":block.toString());
   }*/
}
