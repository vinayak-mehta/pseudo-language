package com.googlecode.pseudo.compiler.ast;

import com.googlecode.pseudo.compiler.parser.PseudoProductionEnum;

/**
 *
 *  This class is generated - please do not edit it 
 */
public class InstrReturn extends Instr {
   private Expr expr_optional;
         private Semis semis;
             public InstrReturn(Expr expr_optional,Semis semis) {
    this.expr_optional=reparent(null,expr_optional);
          this.semis=reparent(null,semis);
              }
    
    @Override
    public PseudoProductionEnum getKind() {
      return PseudoProductionEnum.instr_return;
    }
    
    
              public Expr getExprOptional() {
            return expr_optional;
          }
          public void setExprOptional(Expr expr_optional) {
            this.expr_optional=reparent(this.expr_optional,expr_optional);
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
            if (_index == 0 && expr_optional != null) {
              return expr_optional;
            }
            if (expr_optional != null)
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
            if (_index == 0 && expr_optional != null) {
              Expr old=expr_optional;
              this.expr_optional=(Expr)node;
              return old;
            }
            if (expr_optional != null)
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
           return 1+((expr_optional==null)?0:1);
   }
   
   /*
   @Override
   public String toString() { 
     return "_return" + " "((expr_optional==null)?"":expr_optional.toString()) + " "((semis==null)?"":semis.toString());
   }*/
}
