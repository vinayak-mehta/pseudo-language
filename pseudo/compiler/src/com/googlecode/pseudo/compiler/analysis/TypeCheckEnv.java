package com.googlecode.pseudo.compiler.analysis;


import com.googlecode.pseudo.compiler.Type;
import com.googlecode.pseudo.compiler.Scopes.Scope;
import com.googlecode.pseudo.compiler.model.Var;
import com.googlecode.pseudo.compiler.model.Vars.LocalVar;


public class TypeCheckEnv {
  private final Scope<Var,LocalVar> varScope;
  private final Type functionReturnType;
   
  public TypeCheckEnv(Scope<Var,LocalVar> varScope, Type functionReturnType) {
    this.varScope = varScope;
    this.functionReturnType = functionReturnType;
  } 
   
  public Scope<Var,LocalVar> getVarScope() {
    return varScope;
  }

  public Type getFunctionReturnType() {
    return functionReturnType;
  }
}
