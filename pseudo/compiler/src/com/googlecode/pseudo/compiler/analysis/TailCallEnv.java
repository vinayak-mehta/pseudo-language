package com.googlecode.pseudo.compiler.analysis;

import java.util.HashSet;
import java.util.Set;

import com.googlecode.pseudo.compiler.model.Invocation;
import com.googlecode.pseudo.compiler.model.Functions.UserFunction;


public class TailCallEnv {
  private final UserFunction declaringFunction;
  private final HashSet<Invocation> invocationSet =
    new HashSet<Invocation>();
  
  public TailCallEnv(UserFunction declaringFunction) {
    this.declaringFunction = declaringFunction;
  }
  
  public UserFunction getDeclaringFunction() {
    return declaringFunction;
  }
  
  public void clearInvocationSet() {
    invocationSet.clear();
  }
  public void addInvocation(Invocation invocation) {
    invocationSet.add(invocation);
  }
  
  public Set<Invocation> getInvocationSet() {
    return invocationSet;
  }
}
