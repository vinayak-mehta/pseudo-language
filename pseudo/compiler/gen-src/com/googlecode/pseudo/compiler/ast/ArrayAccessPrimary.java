package com.googlecode.pseudo.compiler.ast;

import com.googlecode.pseudo.compiler.parser.PseudoProductionEnum;

/**
 *
 *  This class is generated - please do not edit it 
 */
public class ArrayAccessPrimary extends ArrayAccess {
   private PrimaryNoArrayCreation primary_no_array_creation;
         private Expr expr;
             public ArrayAccessPrimary(PrimaryNoArrayCreation primary_no_array_creation,Expr expr) {
    this.primary_no_array_creation=reparent(null,primary_no_array_creation);
          this.expr=reparent(null,expr);
              }
    
    @Override
    public PseudoProductionEnum getKind() {
      return PseudoProductionEnum.array_access_primary;
    }
    
    
              public PrimaryNoArrayCreation getPrimaryNoArrayCreation() {
            return primary_no_array_creation;
          }
          public void setPrimaryNoArrayCreation(PrimaryNoArrayCreation primary_no_array_creation) {
            this.primary_no_array_creation=reparent(this.primary_no_array_creation,primary_no_array_creation);
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
              return primary_no_array_creation;
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
              PrimaryNoArrayCreation old=primary_no_array_creation;
              this.primary_no_array_creation=(PrimaryNoArrayCreation)node;
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
     return ((primary_no_array_creation==null)?"":primary_no_array_creation.toString()) + " ""lopt" + " "((expr==null)?"":expr.toString()) + " ""ropt";
   }*/
}
