package com.googlecode.pseudo.compiler.ast;

import com.googlecode.pseudo.compiler.parser.PseudoProductionEnum;

/**
 *
 *  This class is generated - please do not edit it 
 */
public class ForLoopIncrAssignation extends ForLoopIncr {
   private Assignation assignation;
             public ForLoopIncrAssignation(Assignation assignation) {
    this.assignation=reparent(null,assignation);
              }
    
    @Override
    public PseudoProductionEnum getKind() {
      return PseudoProductionEnum.for_loop_incr_assignation;
    }
    
    
              public Assignation getAssignation() {
            return assignation;
          }
          public void setAssignation(Assignation assignation) {
            this.assignation=reparent(this.assignation,assignation);
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
              return assignation;
           }
              throw new IndexOutOfBoundsException("invalid index "+index);
   }
   
   @Override
   protected final Node subNodeAt(int index, Node node) {
     int _index=index;
              switch(_index) {
                        case 0: {
              Assignation old=assignation;
              this.assignation=(Assignation)node;
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
     return ((assignation==null)?"":assignation.toString());
   }*/
}
