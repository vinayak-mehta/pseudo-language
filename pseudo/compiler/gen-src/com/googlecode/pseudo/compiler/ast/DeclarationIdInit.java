package com.googlecode.pseudo.compiler.ast;

import com.googlecode.pseudo.compiler.parser.PseudoProductionEnum;

/**
 *
 *  This class is generated - please do not edit it 
 */
public class DeclarationIdInit extends Declaration {
   private Type type;
         private IdToken id;
         private Expr expr;
             public DeclarationIdInit(Type type,IdToken id,Expr expr) {
    this.type=reparent(null,type);
          this.id=reparent(null,id);
          this.expr=reparent(null,expr);
              }
    
    @Override
    public PseudoProductionEnum getKind() {
      return PseudoProductionEnum.declaration_id_init;
    }
    
    
              public Type getType() {
            return type;
          }
          public void setType(Type type) {
            this.type=reparent(this.type,type);
          }
                    public IdToken getId() {
            return id;
          }
          public void setId(IdToken id) {
            this.id=reparent(this.id,id);
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
              return type;
                      case 1:
              return id;
                      case 2:
              return expr;
           }
              throw new IndexOutOfBoundsException("invalid index "+index);
   }
   
   @Override
   protected final Node subNodeAt(int index, Node node) {
     int _index=index;
              switch(_index) {
                        case 0: {
              Type old=type;
              this.type=(Type)node;
              return old;
            }
                      case 1: {
              IdToken old=id;
              this.id=(IdToken)node;
              return old;
            }
                      case 2: {
              Expr old=expr;
              this.expr=(Expr)node;
              return old;
            }
           }
              throw new IndexOutOfBoundsException("invalid index "+index);
   }   
   
   @Override
   protected final int subNodesSize() {
           return 3;
   }
   
   /*
   @Override
   public String toString() { 
     return ((type==null)?"":type.toString()) + " "((id==null)?"":id.toString()) + " ""assign" + " "((expr==null)?"":expr.toString());
   }*/
}
