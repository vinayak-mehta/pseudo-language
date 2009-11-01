package com.googlecode.pseudo.compiler.ast;

import com.googlecode.pseudo.compiler.parser.PseudoProductionEnum;

/**
 *
 *  This class is generated - please do not edit it 
 */
public class InstrThrow extends Instr {
   private Expr expr;
         private Semis semis;
             public InstrThrow(Expr expr,Semis semis) {
    this.expr=reparent(null,expr);
          this.semis=reparent(null,semis);
              }
    
    @Override
    public PseudoProductionEnum getKind() {
      return PseudoProductionEnum.instr_throw;
    }
    
    
              public Expr getExpr() {
            return expr;
          }
          public void setExpr(Expr expr) {
            this.expr=reparent(this.expr,expr);
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
              return expr;
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
              Expr old=expr;
              this.expr=(Expr)node;
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
     return "_throw" + " "((expr==null)?"":expr.toString()) + " "((semis==null)?"":semis.toString());
   }*/
}
