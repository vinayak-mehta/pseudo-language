package com.googlecode.pseudo.compiler;

import java.util.HashMap;

public enum Option {
  tailcall;

  public static Option parse(String optionName) {
    return OPTION_MAP.get(optionName);
  }
  
  private static final HashMap<String, Option> OPTION_MAP;
  static {
    HashMap<String, Option> map = new HashMap<String, Option>();
    for(Option option: Option.values()) {
      map.put(option.name(), option);
    }
    
    OPTION_MAP = map;
  }
}
