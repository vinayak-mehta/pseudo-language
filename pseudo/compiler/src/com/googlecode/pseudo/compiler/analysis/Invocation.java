package com.googlecode.pseudo.compiler.analysis;

import code.googlecode.pseudo.compiler.model.Functions.UserFunction;

import com.googlecode.pseudo.compiler.Types.FunType;


public class Invocation {
  private final FunType funType;
  private final UserFunction function;
  
  public Invocation(FunType funType, /*maybenull*/UserFunction function) {
    this.funType = funType;
    this.function = function;
  }
  
  public FunType getFunType() {
    return funType;
  }
  public UserFunction getFunction() {
    return function;
  }
}
