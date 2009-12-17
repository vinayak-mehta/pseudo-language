package com.googlecode.pseudo.compiler.model;



import com.googlecode.pseudo.compiler.Types.FunType;
import com.googlecode.pseudo.compiler.model.Functions.NamedFunction;

public class Invocation implements Symbol {
  private final FunType funType;
  private final NamedFunction function;
  private boolean tailCall;
  
  public Invocation(FunType funType, /*maybenull*/NamedFunction function) {
    this.funType = funType;
    this.function = function;
  }
  
  public FunType getFunType() {
    return funType;
  }
  public /*maybenull*/NamedFunction getFunction() {
    return function;
  }
  
  public boolean isTailCall() {
    return tailCall;
  }
  public void setTailCall() {
    this.tailCall = true;
  }
}
