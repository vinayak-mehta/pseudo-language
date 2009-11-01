package com.googlecode.pseudo.compiler.ast;

import com.googlecode.pseudo.compiler.parser.PseudoProductionEnum;

/**
 *
 *  This class is generated - please do not edit it 
 */
public class ForLoopInitDeclaration extends ForLoopInit {
   private Declaration declaration;
             public ForLoopInitDeclaration(Declaration declaration) {
    this.declaration=reparent(null,declaration);
              }
    
    @Override
    public PseudoProductionEnum getKind() {
      return PseudoProductionEnum.for_loop_init_declaration;
    }
    
    
              public Declaration getDeclaration() {
            return declaration;
          }
          public void setDeclaration(Declaration declaration) {
            this.declaration=reparent(this.declaration,declaration);
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
              return declaration;
           }
              throw new IndexOutOfBoundsException("invalid index "+index);
   }
   
   @Override
   protected final Node subNodeAt(int index, Node node) {
     int _index=index;
              switch(_index) {
                        case 0: {
              Declaration old=declaration;
              this.declaration=(Declaration)node;
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
     return ((declaration==null)?"":declaration.toString());
   }*/
}
