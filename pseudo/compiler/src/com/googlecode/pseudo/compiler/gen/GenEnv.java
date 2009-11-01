package com.googlecode.pseudo.compiler.gen;

import com.googlecode.pseudo.compiler.Type;

public class GenEnv {
  private final Type expectedReturnType;
  
  public GenEnv(Type expectedReturnType) {
    this.expectedReturnType = expectedReturnType;
  }
  
  public Type getExpectedReturnType() {
    return expectedReturnType;
  }
}
