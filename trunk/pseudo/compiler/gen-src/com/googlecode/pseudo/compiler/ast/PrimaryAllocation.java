package com.googlecode.pseudo.compiler.ast;

import com.googlecode.pseudo.compiler.parser.PseudoProductionEnum;

/**
 *
 *  This class is generated - please do not edit it 
 */
public class PrimaryAllocation extends PrimaryNoArrayCreation {
   private IdToken id;
         private Arguments arguments;
             public PrimaryAllocation(IdToken id,Arguments arguments) {
    this.id=reparent(null,id);
          this.arguments=reparent(null,arguments);
              }
    
    @Override
    public PseudoProductionEnum getKind() {
      return PseudoProductionEnum.primary_allocation;
    }
    
    
              public IdToken getId() {
            return id;
          }
          public void setId(IdToken id) {
            this.id=reparent(this.id,id);
          }
                    public Arguments getArguments() {
            return arguments;
          }
          public void setArguments(Arguments arguments) {
            this.arguments=reparent(this.arguments,arguments);
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
              return arguments;
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
              Arguments old=arguments;
              this.arguments=(Arguments)node;
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
     return "_new" + " "((id==null)?"":id.toString()) + " ""lpar" + " "((arguments==null)?"":arguments.toString()) + " ""rpar";
   }*/
}
