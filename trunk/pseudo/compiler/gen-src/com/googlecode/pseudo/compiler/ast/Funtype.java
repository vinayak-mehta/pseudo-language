package com.googlecode.pseudo.compiler.ast;

import com.googlecode.pseudo.compiler.ast.AbstractInnerNode;
import com.googlecode.pseudo.compiler.parser.PseudoProductionEnum;
import java.util.List;

/**
 *
 *  This class is generated - please do not edit it 
 */
public class Funtype extends AbstractInnerNode {
   private List<Type> type_star;
         private ReturnType return_type;
             public Funtype(List<Type> type_star,ReturnType return_type) {
    this.type_star=reparent(null,type_star);
          this.return_type=reparent(null,return_type);
              }
    
    @Override
    public PseudoProductionEnum getKind() {
      return PseudoProductionEnum.funtype;
    }
    
    @Override
    public Type getParent() {
      return (Type)super.getParent();
    }
    
              public List<Type> getTypeStar() {
            return type_star;
          }
          public void setTypeStar(List<Type> type_star) {
            this.type_star=reparent(this.type_star,type_star);
          }
                    public ReturnType getReturnType() {
            return return_type;
          }
          public void setReturnType(ReturnType return_type) {
            this.return_type=reparent(this.return_type,return_type);
          }
              
  @Override
  public <_R,_P,_E extends Exception> _R accept(Visitor<? extends _R, ? super _P, ? extends _E> visitor, _P param) throws _E {
    return visitor.visit(this,param);
  }
   
   @Override
   protected final Node subNodeAt(int index) {
     int _index=index;
               if (_index < type_star.size()) {
                 return type_star.get(_index);
               }
                        _index -= type_star.size();
                        switch(_index) {
                        case 0:
              return return_type;
           }
              throw new IndexOutOfBoundsException("invalid index "+index);
   }
   
   @Override
   protected final Node subNodeAt(int index, Node node) {
     int _index=index;
               if (_index < type_star.size()) {
                 return type_star.set(_index, (com.googlecode.pseudo.compiler.ast.Type)node);
               }
                        _index -= type_star.size();
                        switch(_index) {
                        case 0: {
              ReturnType old=return_type;
              this.return_type=(ReturnType)node;
              return old;
            }
           }
              throw new IndexOutOfBoundsException("invalid index "+index);
   }   
   
   @Override
   protected final int subNodesSize() {
           return 1+type_star.size();
   }
   
   /*
   @Override
   public String toString() { 
     return "lpar" + " "((type_star==null)?"":type_star.toString()) + " ""colon" + " "((return_type==null)?"":return_type.toString()) + " ""rpar";
   }*/
}
