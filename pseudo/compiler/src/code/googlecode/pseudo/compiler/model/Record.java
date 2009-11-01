package code.googlecode.pseudo.compiler.model;

import code.googlecode.pseudo.compiler.model.Functions.UserFunction;

import com.googlecode.pseudo.compiler.Scopes.Table;
import com.googlecode.pseudo.compiler.Types.ReferenceType;


public class Record extends ReferenceType {
  private final String name;
  private final Table<Field> fieldTable =
    new Table<Field>();
  
  private UserFunction initFunction; 
  
  public Record(String name) {
    this.name = name;
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
  
  public String getName() {
    return name;
  }
  
  public Table<Field> getFieldTable() {
    return fieldTable;
  }
  
  public /*maybenull*/ UserFunction getInitFunction() {
    return initFunction;
  }
  public void setInitFunction(UserFunction initFunction) {
    this.initFunction = initFunction;
  }
}
