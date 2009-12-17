package code.googlecode.pseudo.compiler.model;

import code.googlecode.pseudo.compiler.model.Functions.UserFunction;

import com.googlecode.pseudo.compiler.Scopes.Table;
import com.googlecode.pseudo.compiler.Types.ReferenceType;
import com.googlecode.pseudo.compiler.ast.RecordDef;


public class Record extends ReferenceType {
  private final String name;
  private final RecordDef recordDef;
  private final Table<Field> fieldTable =
    new Table<Field>();
  
  private UserFunction initFunction; 
  
  public Record(String name, RecordDef recordDef) {
    this.name = name;
    this.recordDef = recordDef;
  }
  
  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof Record)) {
      return false;
    }
    Record record = (Record)obj;
    return name.equals(record.name);
  }
  
  @Override
  public int hashCode() {
    return name.hashCode();
  }
  
  @Override
  public String getName() {
    return name;
  }
  
  public RecordDef getRecordDef() {
    return recordDef;
  }
  
  public Table<Field> getFieldTable() {
    return fieldTable;
  }
  
  public UserFunction getInitFunction() {
    return initFunction;
  }
  public void setInitFunction(UserFunction initFunction) {
    this.initFunction = initFunction;
  }
}
