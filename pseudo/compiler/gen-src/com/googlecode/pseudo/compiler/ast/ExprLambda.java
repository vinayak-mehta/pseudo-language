package com.googlecode.pseudo.compiler.ast;

import com.googlecode.pseudo.compiler.parser.PseudoProductionEnum;

/**
 *
 *  This class is generated - please do not edit it 
 */
public class ExprLambda extends Expr {
   private Parameters parameters;
         private Expr expr;
             public ExprLambda(Parameters parameters,Expr expr) {
    this.parameters=reparent(null,parameters);
          this.expr=reparent(null,expr);
              }
    
    @Override
    public PseudoProductionEnum getKind() {
      return PseudoProductionEnum.expr_lambda;
    }
    
    
              public Parameters getParameters() {
            return parameters;
          }
          public void setParameters(Parameters parameters) {
            this.parameters=reparent(this.parameters,parameters);
          }
                    public Expr getExpr() {
            return expr;
          }
          public void setExpr(Expr expr) {
            this.expr=reparent(this.expr,expr);
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
              return expr;
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
              Expr old=expr;
              this.expr=(Expr)node;
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
     return "lambda" + " ""lpar" + " "((parameters==null)?"":parameters.toString()) + " ""rpar" + " ""arrow" + " "((expr==null)?"":expr.toString());
   }*/
}
