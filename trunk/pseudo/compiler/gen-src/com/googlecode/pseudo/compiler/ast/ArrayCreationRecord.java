package com.googlecode.pseudo.compiler.ast;

import com.googlecode.pseudo.compiler.parser.PseudoProductionEnum;
import java.util.List;

/**
 *
 *  This class is generated - please do not edit it 
 */
public class ArrayCreationRecord extends ArrayCreation {
   private IdToken id;
         private List<DimExpr> dim_expr_plus;
         private DimsOpt dims_opt;
             public ArrayCreationRecord(IdToken id,List<DimExpr> dim_expr_plus,DimsOpt dims_opt) {
    this.id=reparent(null,id);
          this.dim_expr_plus=reparent(null,dim_expr_plus);
          this.dims_opt=reparent(null,dims_opt);
              }
    
    @Override
    public PseudoProductionEnum getKind() {
      return PseudoProductionEnum.array_creation_record;
    }
    
    
              public IdToken getId() {
            return id;
          }
          public void setId(IdToken id) {
            this.id=reparent(this.id,id);
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
              return id;
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
              IdToken old=id;
              this.id=(IdToken)node;
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
     return "_new" + " "((id==null)?"":id.toString()) + " "((dim_expr_plus==null)?"":dim_expr_plus.toString()) + " "((dims_opt==null)?"":dims_opt.toString());
   }*/
}
