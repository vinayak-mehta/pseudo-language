package code.googlecode.pseudo.compiler.model;

import code.googlecode.pseudo.compiler.model.Vars.AbstractVar;

import com.googlecode.pseudo.compiler.Type;


public class Field extends AbstractVar {
  private final Type type;
  
  public Field(Type type, String name) {
    super(name);
    this.type = type;
  }
  
  @Override
  public Type getType() {
    return type;
  }
  
  public boolean isReadOnly() {
    return false;
  }
}
