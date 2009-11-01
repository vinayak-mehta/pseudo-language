package com.googlecode.pseudo.compiler.ast;

import com.googlecode.pseudo.compiler.parser.PseudoProductionEnum;

/**
 *
 *  This class is generated - please do not edit it 
 */
public class InstrScan extends Instr {
   private Primary primary;
         private Semis semis;
             public InstrScan(Primary primary,Semis semis) {
    this.primary=reparent(null,primary);
          this.semis=reparent(null,semis);
              }
    
    @Override
    public PseudoProductionEnum getKind() {
      return PseudoProductionEnum.instr_scan;
    }
    
    
              public Primary getPrimary() {
            return primary;
          }
          public void setPrimary(Primary primary) {
            this.primary=reparent(this.primary,primary);
          }
                    public Semis getSemis() {
            return semis;
          }
          public void setSemis(Semis semis) {
            this.semis=reparent(this.semis,semis);
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
              return primary;
                      case 1:
              return semis;
           }
              throw new IndexOutOfBoundsException("invalid index "+index);
   }
   
   @Override
   protected final Node subNodeAt(int index, Node node) {
     int _index=index;
              switch(_index) {
                        case 0: {
              Primary old=primary;
              this.primary=(Primary)node;
              return old;
            }
                      case 1: {
              Semis old=semis;
              this.semis=(Semis)node;
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
     return "scan" + " "((primary==null)?"":primary.toString()) + " "((semis==null)?"":semis.toString());
   }*/
}
