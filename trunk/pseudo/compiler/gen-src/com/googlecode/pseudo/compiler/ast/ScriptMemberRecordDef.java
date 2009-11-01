package com.googlecode.pseudo.compiler.ast;

import com.googlecode.pseudo.compiler.parser.PseudoProductionEnum;

/**
 *
 *  This class is generated - please do not edit it 
 */
public class ScriptMemberRecordDef extends ScriptMember {
   private RecordDef record_def;
             public ScriptMemberRecordDef(RecordDef record_def) {
    this.record_def=reparent(null,record_def);
              }
    
    @Override
    public PseudoProductionEnum getKind() {
      return PseudoProductionEnum.script_member_record_def;
    }
    
    
              public RecordDef getRecordDef() {
            return record_def;
          }
          public void setRecordDef(RecordDef record_def) {
            this.record_def=reparent(this.record_def,record_def);
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
              return record_def;
           }
              throw new IndexOutOfBoundsException("invalid index "+index);
   }
   
   @Override
   protected final Node subNodeAt(int index, Node node) {
     int _index=index;
              switch(_index) {
                        case 0: {
              RecordDef old=record_def;
              this.record_def=(RecordDef)node;
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
     return ((record_def==null)?"":record_def.toString());
   }*/
}
