package com.googlecode.pseudo.compiler.ast;

import com.googlecode.pseudo.compiler.parser.PseudoProductionEnum;

/**
 *
 *  This class is generated - please do not edit it 
 */
public class FuncallPrimary extends Funcall {
   private Primary primary;
         private Arguments arguments;
             public FuncallPrimary(Primary primary,Arguments arguments) {
    this.primary=reparent(null,primary);
          this.arguments=reparent(null,arguments);
              }
    
    @Override
    public PseudoProductionEnum getKind() {
      return PseudoProductionEnum.funcall_primary;
    }
    
    
              public Primary getPrimary() {
            return primary;
          }
          public void setPrimary(Primary primary) {
            this.primary=reparent(this.primary,primary);
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
              return primary;
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
              Primary old=primary;
              this.primary=(Primary)node;
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
     return ((primary==null)?"":primary.toString()) + " ""lpar" + " "((arguments==null)?"":arguments.toString()) + " ""rpar";
   }*/
}
