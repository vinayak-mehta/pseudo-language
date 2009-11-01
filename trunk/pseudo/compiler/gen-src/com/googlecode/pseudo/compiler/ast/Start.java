package com.googlecode.pseudo.compiler.ast;

import com.googlecode.pseudo.compiler.ast.AbstractInnerNode;
import com.googlecode.pseudo.compiler.parser.PseudoProductionEnum;
import java.util.List;

/**
 *
 *  This class is generated - please do not edit it 
 */
public class Start extends AbstractInnerNode {
   private List<ScriptMember> script_member_star;
             public Start(List<ScriptMember> script_member_star) {
    this.script_member_star=reparent(null,script_member_star);
              }
    
    @Override
    public PseudoProductionEnum getKind() {
      return PseudoProductionEnum.start;
    }
    
    
              public List<ScriptMember> getScriptMemberStar() {
            return script_member_star;
          }
          public void setScriptMemberStar(List<ScriptMember> script_member_star) {
            this.script_member_star=reparent(this.script_member_star,script_member_star);
          }
              
  @Override
  public <_R,_P,_E extends Exception> _R accept(Visitor<? extends _R, ? super _P, ? extends _E> visitor, _P param) throws _E {
    return visitor.visit(this,param);
  }
   
   @Override
   protected final Node subNodeAt(int index) {
     int _index=index;
               if (_index < script_member_star.size()) {
                 return script_member_star.get(_index);
               }
                  throw new IndexOutOfBoundsException("invalid index "+index);
   }
   
   @Override
   protected final Node subNodeAt(int index, Node node) {
     int _index=index;
               if (_index < script_member_star.size()) {
                 return script_member_star.set(_index, (com.googlecode.pseudo.compiler.ast.ScriptMember)node);
               }
                  throw new IndexOutOfBoundsException("invalid index "+index);
   }   
   
   @Override
   protected final int subNodesSize() {
           return 0+script_member_star.size();
   }
   
   /*
   @Override
   public String toString() { 
     return ((script_member_star==null)?"":script_member_star.toString());
   }*/
}
