package com.googlecode.pseudo.compiler.ast;

import com.googlecode.pseudo.compiler.parser.PseudoProductionEnum;

/**
 *
 *  This class is generated - please do not edit it 
 */
public class InstrContinue extends Instr {
   private IdToken id_optional;
         private Semis semis;
             public InstrContinue(IdToken id_optional,Semis semis) {
    this.id_optional=reparent(null,id_optional);
          this.semis=reparent(null,semis);
              }
    
    @Override
    public PseudoProductionEnum getKind() {
      return PseudoProductionEnum.instr_continue;
    }
    
    
              public IdToken getIdOptional() {
            return id_optional;
          }
          public void setIdOptional(IdToken id_optional) {
            this.id_optional=reparent(this.id_optional,id_optional);
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
            if (_index == 0 && id_optional != null) {
              return id_optional;
            }
            if (id_optional != null)
              _index--;
                          switch(_index) {
                        case 0:
              return semis;
           }
              throw new IndexOutOfBoundsException("invalid index "+index);
   }
   
   @Override
   protected final Node subNodeAt(int index, Node node) {
     int _index=index;
            if (_index == 0 && id_optional != null) {
              IdToken old=id_optional;
              this.id_optional=(IdToken)node;
              return old;
            }
            if (id_optional != null)
              _index--;
                          switch(_index) {
                        case 0: {
              Semis old=semis;
              this.semis=(Semis)node;
              return old;
            }
           }
              throw new IndexOutOfBoundsException("invalid index "+index);
   }   
   
   @Override
   protected final int subNodesSize() {
           return 1+((id_optional==null)?0:1);
   }
   
   /*
   @Override
   public String toString() { 
     return "_continue" + " "((id_optional==null)?"":id_optional.toString()) + " "((semis==null)?"":semis.toString());
   }*/
}
