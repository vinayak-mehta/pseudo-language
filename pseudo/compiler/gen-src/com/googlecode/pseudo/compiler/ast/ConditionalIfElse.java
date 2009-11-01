package com.googlecode.pseudo.compiler.ast;

import com.googlecode.pseudo.compiler.parser.PseudoProductionEnum;

/**
 *
 *  This class is generated - please do not edit it 
 */
public class ConditionalIfElse extends Conditional {
   private Expr expr;
         private Block block;
         private Block block2;
             public ConditionalIfElse(Expr expr,Block block,Block block2) {
    this.expr=reparent(null,expr);
          this.block=reparent(null,block);
          this.block2=reparent(null,block2);
              }
    
    @Override
    public PseudoProductionEnum getKind() {
      return PseudoProductionEnum.conditional_if_else;
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
                    public Block getBlock2() {
            return block2;
          }
          public void setBlock2(Block block2) {
            this.block2=reparent(this.block2,block2);
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
                      case 2:
              return block2;
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
                      case 2: {
              Block old=block2;
              this.block2=(Block)node;
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
     return "_if" + " ""lpar" + " "((expr==null)?"":expr.toString()) + " ""rpar" + " "((block==null)?"":block.toString()) + " ""_else" + " "((block2==null)?"":block2.toString());
   }*/
}
