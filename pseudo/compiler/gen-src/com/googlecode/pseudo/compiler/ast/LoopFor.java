package com.googlecode.pseudo.compiler.ast;

import com.googlecode.pseudo.compiler.parser.PseudoProductionEnum;

/**
 *
 *  This class is generated - please do not edit it 
 */
public class LoopFor extends Loop {
   private ForLoopInit for_loop_init_optional;
         private Expr expr_optional;
         private ForLoopIncr for_loop_incr_optional;
         private Block block;
             public LoopFor(ForLoopInit for_loop_init_optional,Expr expr_optional,ForLoopIncr for_loop_incr_optional,Block block) {
    this.for_loop_init_optional=reparent(null,for_loop_init_optional);
          this.expr_optional=reparent(null,expr_optional);
          this.for_loop_incr_optional=reparent(null,for_loop_incr_optional);
          this.block=reparent(null,block);
              }
    
    @Override
    public PseudoProductionEnum getKind() {
      return PseudoProductionEnum.loop_for;
    }
    
    
              public ForLoopInit getForLoopInitOptional() {
            return for_loop_init_optional;
          }
          public void setForLoopInitOptional(ForLoopInit for_loop_init_optional) {
            this.for_loop_init_optional=reparent(this.for_loop_init_optional,for_loop_init_optional);
          }
                    public Expr getExprOptional() {
            return expr_optional;
          }
          public void setExprOptional(Expr expr_optional) {
            this.expr_optional=reparent(this.expr_optional,expr_optional);
          }
                    public ForLoopIncr getForLoopIncrOptional() {
            return for_loop_incr_optional;
          }
          public void setForLoopIncrOptional(ForLoopIncr for_loop_incr_optional) {
            this.for_loop_incr_optional=reparent(this.for_loop_incr_optional,for_loop_incr_optional);
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
            if (_index == 0 && for_loop_init_optional != null) {
              return for_loop_init_optional;
            }
            if (for_loop_init_optional != null)
              _index--;
                        if (_index == 0 && expr_optional != null) {
              return expr_optional;
            }
            if (expr_optional != null)
              _index--;
                        if (_index == 0 && for_loop_incr_optional != null) {
              return for_loop_incr_optional;
            }
            if (for_loop_incr_optional != null)
              _index--;
                          switch(_index) {
                        case 0:
              return block;
           }
              throw new IndexOutOfBoundsException("invalid index "+index);
   }
   
   @Override
   protected final Node subNodeAt(int index, Node node) {
     int _index=index;
            if (_index == 0 && for_loop_init_optional != null) {
              ForLoopInit old=for_loop_init_optional;
              this.for_loop_init_optional=(ForLoopInit)node;
              return old;
            }
            if (for_loop_init_optional != null)
              _index--;
                        if (_index == 0 && expr_optional != null) {
              Expr old=expr_optional;
              this.expr_optional=(Expr)node;
              return old;
            }
            if (expr_optional != null)
              _index--;
                        if (_index == 0 && for_loop_incr_optional != null) {
              ForLoopIncr old=for_loop_incr_optional;
              this.for_loop_incr_optional=(ForLoopIncr)node;
              return old;
            }
            if (for_loop_incr_optional != null)
              _index--;
                          switch(_index) {
                        case 0: {
              Block old=block;
              this.block=(Block)node;
              return old;
            }
           }
              throw new IndexOutOfBoundsException("invalid index "+index);
   }   
   
   @Override
   protected final int subNodesSize() {
           return 1+((for_loop_init_optional==null)?0:1)+((expr_optional==null)?0:1)+((for_loop_incr_optional==null)?0:1);
   }
   
   /*
   @Override
   public String toString() { 
     return "_for" + " ""lpar" + " "((for_loop_init_optional==null)?"":for_loop_init_optional.toString()) + " ""semicolon" + " "((expr_optional==null)?"":expr_optional.toString()) + " ""semicolon2" + " "((for_loop_incr_optional==null)?"":for_loop_incr_optional.toString()) + " ""rpar" + " "((block==null)?"":block.toString());
   }*/
}
