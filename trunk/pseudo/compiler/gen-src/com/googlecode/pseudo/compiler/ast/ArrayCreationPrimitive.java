package com.googlecode.pseudo.compiler.ast;

import com.googlecode.pseudo.compiler.parser.PseudoProductionEnum;
import java.util.List;

/**
 *
 *  This class is generated - please do not edit it 
 */
public class ArrayCreationPrimitive extends ArrayCreation {
   private PrimitiveType primitive_type;
         private List<DimExpr> dim_expr_plus;
         private DimsOpt dims_opt;
             public ArrayCreationPrimitive(PrimitiveType primitive_type,List<DimExpr> dim_expr_plus,DimsOpt dims_opt) {
    this.primitive_type=reparent(null,primitive_type);
          this.dim_expr_plus=reparent(null,dim_expr_plus);
          this.dims_opt=reparent(null,dims_opt);
              }
    
    @Override
    public PseudoProductionEnum getKind() {
      return PseudoProductionEnum.array_creation_primitive;
    }
    
    
              public PrimitiveType getPrimitiveType() {
            return primitive_type;
          }
          public void setPrimitiveType(PrimitiveType primitive_type) {
            this.primitive_type=reparent(this.primitive_type,primitive_type);
          }
                    public List<DimExpr> getDimExprPlus() {
            return dim_expr_plus;
          }
          public void setDimExprPlus(List<DimExpr> dim_expr_plus) {
            this.dim_expr_plus=reparent(this.dim_expr_plus,dim_expr_plus);
          }
                    public DimsOpt getDimsOpt() {
            return dims_opt;
          }
          public void setDimsOpt(DimsOpt dims_opt) {
            this.dims_opt=reparent(this.dims_opt,dims_opt);
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
              return primitive_type;
           } 
               _index -= 1;
                           if (_index < dim_expr_plus.size()) {
                 return dim_expr_plus.get(_index);
               }
                        _index -= dim_expr_plus.size();
                        switch(_index) {
                        case 0:
              return dims_opt;
           }
              throw new IndexOutOfBoundsException("invalid index "+index);
   }
   
   @Override
   protected final Node subNodeAt(int index, Node node) {
     int _index=index;
              switch(_index) {
                        case 0: {
              PrimitiveType old=primitive_type;
              this.primitive_type=(PrimitiveType)node;
              return old;
            }
           } 
               _index -= 1;
                           if (_index < dim_expr_plus.size()) {
                 return dim_expr_plus.set(_index, (com.googlecode.pseudo.compiler.ast.DimExpr)node);
               }
                        _index -= dim_expr_plus.size();
                        switch(_index) {
                        case 0: {
              DimsOpt old=dims_opt;
              this.dims_opt=(DimsOpt)node;
              return old;
            }
           }
              throw new IndexOutOfBoundsException("invalid index "+index);
   }   
   
   @Override
   protected final int subNodesSize() {
           return 2+dim_expr_plus.size();
   }
   
   /*
   @Override
   public String toString() { 
     return "_new" + " "((primitive_type==null)?"":primitive_type.toString()) + " "((dim_expr_plus==null)?"":dim_expr_plus.toString()) + " "((dims_opt==null)?"":dims_opt.toString());
   }*/
}
