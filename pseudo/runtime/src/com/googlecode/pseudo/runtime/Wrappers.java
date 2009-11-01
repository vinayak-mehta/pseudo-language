package com.googlecode.pseudo.runtime;

import java.util.IdentityHashMap;

public class Wrappers {
  public static Class<?> getPrimitiveFromWrapper(Class<?> wrapper) {
    Class<?> primitive = WRAPPER_MAP.get(wrapper);
    if (primitive == null)
      throw new IllegalArgumentException("no primitive for wrapper type "+wrapper);
    return primitive;
  }
  
  private static final IdentityHashMap<Class<?>, Class<?>> WRAPPER_MAP;
  static {
    IdentityHashMap<Class<?>, Class<?>> map =
      new IdentityHashMap<Class<?>, Class<?>>();
    map.put(Boolean.class, boolean.class);
    map.put(Character.class, char.class);
    map.put(Integer.class, int.class);
    map.put(Double.class, double.class);
    map.put(String.class, String.class);
    
    WRAPPER_MAP = map;
  }
}
