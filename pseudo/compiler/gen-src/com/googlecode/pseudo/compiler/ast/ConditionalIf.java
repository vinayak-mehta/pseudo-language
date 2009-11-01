package com.googlecode.pseudo.compiler.ast;

import com.googlecode.pseudo.compiler.parser.PseudoProductionEnum;

/**
 *
 *  This class is generated - please do not edit it 
 */
public class ConditionalIf extends Conditional {
   private Expr expr;
         private Block block;
             public ConditionalIf(Expr expr,Block block) {
    this.expr=reparent(null,expr);
          this.block=reparent(null,block);
              }
    
    @Override
    public PseudoProductionEnum getKind() {
      return PseudoProductionEnum.conditional_if;
    }
    
    
              public Expr getExpr() {
            return expr;
          }
          public void setExpr(Expr expr) {
            this.expr=reparent(this.expr,expr);
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
              return expr;
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
              Expr old=expr;
              this.expr=(Expr)node;
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
     return "_if" + " ""lpar" + " "((expr==null)?"":expr.toString()) + " ""rpar" + " "((block==null)?"":block.toString());
   }*/
}
