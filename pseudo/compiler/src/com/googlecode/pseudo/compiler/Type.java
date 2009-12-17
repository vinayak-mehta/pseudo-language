package com.googlecode.pseudo.compiler;

import com.googlecode.pseudo.compiler.Scopes.Item;

public interface Type extends Item {
  @Override
  public String getName();
  
  public boolean isPrimitive();
  public boolean isArray();
  public boolean isFunction();
}
