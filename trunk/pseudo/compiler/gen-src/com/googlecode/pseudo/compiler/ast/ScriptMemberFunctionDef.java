package com.googlecode.pseudo.compiler.ast;

import com.googlecode.pseudo.compiler.parser.PseudoProductionEnum;

/**
 *
 *  This class is generated - please do not edit it 
 */
public class ScriptMemberFunctionDef extends ScriptMember {
   private FunctionDef function_def;
             public ScriptMemberFunctionDef(FunctionDef function_def) {
    this.function_def=reparent(null,function_def);
              }
    
    @Override
    public PseudoProductionEnum getKind() {
      return PseudoProductionEnum.script_member_function_def;
    }
    
    
              public FunctionDef getFunctionDef() {
            return function_def;
          }
          public void setFunctionDef(FunctionDef function_def) {
            this.function_def=reparent(this.function_def,function_def);
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
              return function_def;
           }
              throw new IndexOutOfBoundsException("invalid index "+index);
   }
   
   @Override
   protected final Node subNodeAt(int index, Node node) {
     int _index=index;
              switch(_index) {
                        case 0: {
              FunctionDef old=function_def;
              this.function_def=(FunctionDef)node;
              return old;
            }
           }
              throw new IndexOutOfBoundsException("invalid index "+index);
   }   
   
   @Override
   protected final int subNodesSize() {
           return 1;
   }
   
   /*
   @Override
   public String toString() { 
     return ((function_def==null)?"":function_def.toString());
   }*/
}
