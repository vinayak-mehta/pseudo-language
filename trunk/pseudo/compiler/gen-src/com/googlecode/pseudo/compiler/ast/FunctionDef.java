package com.googlecode.pseudo.compiler.ast;

import com.googlecode.pseudo.compiler.ast.AbstractInnerNode;
import com.googlecode.pseudo.compiler.parser.PseudoProductionEnum;

/**
 *
 *  This class is generated - please do not edit it 
 */
public class FunctionDef extends AbstractInnerNode {
   private IdToken id;
         private Parameters parameters;
         private FunctionRtype function_rtype_optional;
         private Block block;
             public FunctionDef(IdToken id,Parameters parameters,FunctionRtype function_rtype_optional,Block block) {
    this.id=reparent(null,id);
          this.parameters=reparent(null,parameters);
          this.function_rtype_optional=reparent(null,function_rtype_optional);
          this.block=reparent(null,block);
              }
    
    @Override
    public PseudoProductionEnum getKind() {
      return PseudoProductionEnum.function_def;
    }
    
    @Override
    public ScriptMemberFunctionDef getParent() {
      return (ScriptMemberFunctionDef)super.getParent();
    }
    
              public IdToken getId() {
            return id;
          }
          public void setId(IdToken id) {
            this.id=reparent(this.id,id);
          }
                    public Parameters getParameters() {
            return parameters;
          }
          public void setParameters(Parameters parameters) {
            this.parameters=reparent(this.parameters,parameters);
          }
                    public FunctionRtype getFunctionRtypeOptional() {
            return function_rtype_optional;
          }
          public void setFunctionRtypeOptional(FunctionRtype function_rtype_optional) {
            this.function_rtype_optional=reparent(this.function_rtype_optional,function_rtype_optional);
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
              return id;
                      case 1:
              return parameters;
           } 
               _index -= 2;
                        if (_index == 0 && function_rtype_optional != null) {
              return function_rtype_optional;
            }
            if (function_rtype_optional != null)
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
              switch(_index) {
                        case 0: {
              IdToken old=id;
              this.id=(IdToken)node;
              return old;
            }
                      case 1: {
              Parameters old=parameters;
              this.parameters=(Parameters)node;
              return old;
            }
           } 
               _index -= 2;
                        if (_index == 0 && function_rtype_optional != null) {
              FunctionRtype old=function_rtype_optional;
              this.function_rtype_optional=(FunctionRtype)node;
              return old;
            }
            if (function_rtype_optional != null)
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
           return 3+((function_rtype_optional==null)?0:1);
   }
   
   /*
   @Override
   public String toString() { 
     return "def" + " "((id==null)?"":id.toString()) + " ""lpar" + " "((parameters==null)?"":parameters.toString()) + " ""rpar" + " "((function_rtype_optional==null)?"":function_rtype_optional.toString()) + " "((block==null)?"":block.toString());
   }*/
}
