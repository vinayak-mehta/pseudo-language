package com.googlecode.pseudo.compiler.ast;

import com.googlecode.pseudo.compiler.parser.PseudoProductionEnum;

/**
 *
 *  This class is generated - please do not edit it 
 */
public class InstrDeclaration extends Instr {
   private Declaration declaration;
         private Semis semis;
             public InstrDeclaration(Declaration declaration,Semis semis) {
    this.declaration=reparent(null,declaration);
          this.semis=reparent(null,semis);
              }
    
    @Override
    public PseudoProductionEnum getKind() {
      return PseudoProductionEnum.instr_declaration;
    }
    
    
              public Declaration getDeclaration() {
            return declaration;
          }
          public void setDeclaration(Declaration declaration) {
            this.declaration=reparent(this.declaration,declaration);
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
              return declaration;
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
              Declaration old=declaration;
              this.declaration=(Declaration)node;
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
     return ((declaration==null)?"":declaration.toString()) + " "((semis==null)?"":semis.toString());
   }*/
}
