package com.googlecode.pseudo.compiler.ast;

import com.googlecode.pseudo.compiler.ast.AbstractInnerNode;
import com.googlecode.pseudo.compiler.parser.PseudoProductionEnum;
import java.util.List;

/**
 *
 *  This class is generated - please do not edit it 
 */
public class RecordDef extends AbstractInnerNode {
   private IdToken id;
         private List<Field> field_star;
         private RecordInit record_init_optional;
             public RecordDef(IdToken id,List<Field> field_star,RecordInit record_init_optional) {
    this.id=reparent(null,id);
          this.field_star=reparent(null,field_star);
          this.record_init_optional=reparent(null,record_init_optional);
              }
    
    @Override
    public PseudoProductionEnum getKind() {
      return PseudoProductionEnum.record_def;
    }
    
    @Override
    public ScriptMemberRecordDef getParent() {
      return (ScriptMemberRecordDef)super.getParent();
    }
    
              public IdToken getId() {
            return id;
          }
          public void setId(IdToken id) {
            this.id=reparent(this.id,id);
          }
                    public List<Field> getFieldStar() {
            return field_star;
          }
          public void setFieldStar(List<Field> field_star) {
            this.field_star=reparent(this.field_star,field_star);
          }
                    public RecordInit getRecordInitOptional() {
            return record_init_optional;
          }
          public void setRecordInitOptional(RecordInit record_init_optional) {
            this.record_init_optional=reparent(this.record_init_optional,record_init_optional);
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
                           if (_index < field_star.size()) {
                 return field_star.get(_index);
               }
                        _index -= field_star.size();
                      if (_index == 0 && record_init_optional != null) {
              return record_init_optional;
            }
            if (record_init_optional != null)
              _index--;
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
                           if (_index < field_star.size()) {
                 return field_star.set(_index, (com.googlecode.pseudo.compiler.ast.Field)node);
               }
                        _index -= field_star.size();
                      if (_index == 0 && record_init_optional != null) {
              RecordInit old=record_init_optional;
              this.record_init_optional=(RecordInit)node;
              return old;
            }
            if (record_init_optional != null)
              _index--;
                  throw new IndexOutOfBoundsException("invalid index "+index);
   }   
   
   @Override
   protected final int subNodesSize() {
           return 1+field_star.size()+((record_init_optional==null)?0:1);
   }
   
   /*
   @Override
   public String toString() { 
     return "record" + " "((id==null)?"":id.toString()) + " ""lcurl" + " "((field_star==null)?"":field_star.toString()) + " "((record_init_optional==null)?"":record_init_optional.toString()) + " ""rcurl";
   }*/
}
