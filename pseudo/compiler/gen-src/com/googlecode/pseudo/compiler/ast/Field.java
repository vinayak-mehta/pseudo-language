package com.googlecode.pseudo.compiler.ast;

import com.googlecode.pseudo.compiler.ast.AbstractInnerNode;
import com.googlecode.pseudo.compiler.parser.PseudoProductionEnum;

/**
 *
 *  This class is generated - please do not edit it 
 */
public class Field extends AbstractInnerNode {
   private Type type;
         private IdToken id;
         private Semis semis;
             public Field(Type type,IdToken id,Semis semis) {
    this.type=reparent(null,type);
          this.id=reparent(null,id);
          this.semis=reparent(null,semis);
              }
    
    @Override
    public PseudoProductionEnum getKind() {
      return PseudoProductionEnum.field;
    }
    
    
              public Type getType() {
            return type;
          }
          public void setType(Type type) {
            this.type=reparent(this.type,type);
          }
                    public IdToken getId() {
            return id;
          }
          public void setId(IdToken id) {
            this.id=reparent(this.id,id);
          }
                    public Semis getSemis() {
            return semis;
          }
          public void setSemis(Semis semis) {
            this.semis=reparent(this.semis,semis);
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
              return type;
                      case 1:
              return id;
                      case 2:
              return semis;
           }
              throw new IndexOutOfBoundsException("invalid index "+index);
   }
   
   @Override
   protected final Node subNodeAt(int index, Node node) {
     int _index=index;
              switch(_index) {
                        case 0: {
              Type old=type;
              this.type=(Type)node;
              return old;
            }
                      case 1: {
              IdToken old=id;
              this.id=(IdToken)node;
              return old;
            }
                      case 2: {
              Semis old=semis;
              this.semis=(Semis)node;
              return old;
            }
           }
              throw new IndexOutOfBoundsException("invalid index "+index);
   }   
   
   @Override
   protected final int subNodesSize() {
           return 3;
   }
   
   /*
   @Override
   public String toString() { 
     return ((type==null)?"":type.toString()) + " "((id==null)?"":id.toString()) + " "((semis==null)?"":semis.toString());
   }*/
}
