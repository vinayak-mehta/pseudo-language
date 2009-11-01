package com.googlecode.pseudo.compiler.ast;

import com.googlecode.pseudo.compiler.ast.AbstractInnerNode;
import com.googlecode.pseudo.compiler.parser.PseudoProductionEnum;
import java.util.List;

/**
 *
 *  This class is generated - please do not edit it 
 */
public class Block extends AbstractInnerNode {
   private List<Instr> instr_star;
             public Block(List<Instr> instr_star) {
    this.instr_star=reparent(null,instr_star);
              }
    
    @Override
    public PseudoProductionEnum getKind() {
      return PseudoProductionEnum.block;
    }
    
    
              public List<Instr> getInstrStar() {
            return instr_star;
          }
          public void setInstrStar(List<Instr> instr_star) {
            this.instr_star=reparent(this.instr_star,instr_star);
          }
              
  @Override
  public <_R,_P,_E extends Exception> _R accept(Visitor<? extends _R, ? super _P, ? extends _E> visitor, _P param) throws _E {
    return visitor.visit(this,param);
  }
   
   @Override
   protected final Node subNodeAt(int index) {
     int _index=index;
               if (_index < instr_star.size()) {
                 return instr_star.get(_index);
               }
                  throw new IndexOutOfBoundsException("invalid index "+index);
   }
   
   @Override
   protected final Node subNodeAt(int index, Node node) {
     int _index=index;
               if (_index < instr_star.size()) {
                 return instr_star.set(_index, (com.googlecode.pseudo.compiler.ast.Instr)node);
               }
                  throw new IndexOutOfBoundsException("invalid index "+index);
   }   
   
   @Override
   protected final int subNodesSize() {
           return 0+instr_star.size();
   }
   
   /*
   @Override
   public String toString() { 
     return "lcurl" + " "((instr_star==null)?"":instr_star.toString()) + " ""rcurl";
   }*/
}
