package com.googlecode.pseudo.compiler.model;


import com.googlecode.pseudo.compiler.Type;
import com.googlecode.pseudo.compiler.model.Vars.AbstractVar;


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
  
  @Override
  public boolean isReadOnly() {
    return false;
  }
}
