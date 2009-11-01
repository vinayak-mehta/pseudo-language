package com.googlecode.pseudo.compiler.ast;

import com.googlecode.pseudo.compiler.ast.AbstractInnerNode;
import com.googlecode.pseudo.compiler.parser.PseudoProductionEnum;
import java.util.List;

/**
 *
 *  This class is generated - please do not edit it 
 */
public class Parameters extends AbstractInnerNode {
   private List<Parameter> parameter_star;
             public Parameters(List<Parameter> parameter_star) {
    this.parameter_star=reparent(null,parameter_star);
              }
    
    @Override
    public PseudoProductionEnum getKind() {
      return PseudoProductionEnum.parameters;
    }
    
    
              public List<Parameter> getParameterStar() {
            return parameter_star;
          }
          public void setParameterStar(List<Parameter> parameter_star) {
            this.parameter_star=reparent(this.parameter_star,parameter_star);
          }
              
  @Override
  public <_R,_P,_E extends Exception> _R accept(Visitor<? extends _R, ? super _P, ? extends _E> visitor, _P param) throws _E {
    return visitor.visit(this,param);
  }
   
   @Override
   protected final Node subNodeAt(int index) {
     int _index=index;
               if (_index < parameter_star.size()) {
                 return parameter_star.get(_index);
               }
                  throw new IndexOutOfBoundsException("invalid index "+index);
   }
   
   @Override
   protected final Node subNodeAt(int index, Node node) {
     int _index=index;
               if (_index < parameter_star.size()) {
                 return parameter_star.set(_index, (com.googlecode.pseudo.compiler.ast.Parameter)node);
               }
                  throw new IndexOutOfBoundsException("invalid index "+index);
   }   
   
   @Override
   protected final int subNodesSize() {
           return 0+parameter_star.size();
   }
   
   /*
   @Override
   public String toString() { 
     return ((parameter_star==null)?"":parameter_star.toString());
   }*/
}
