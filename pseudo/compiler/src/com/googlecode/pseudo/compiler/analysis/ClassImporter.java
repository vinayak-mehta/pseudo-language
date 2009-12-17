package com.googlecode.pseudo.compiler.analysis;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashMap;


import com.googlecode.pseudo.compiler.Type;
import com.googlecode.pseudo.compiler.Scopes.Table;
import com.googlecode.pseudo.compiler.Types.FunType;
import com.googlecode.pseudo.compiler.Types.PrimitiveType;
import com.googlecode.pseudo.compiler.analysis.ErrorReporter.ErrorKind;
import com.googlecode.pseudo.compiler.ast.Node;
import com.googlecode.pseudo.compiler.model.Functions.Builtin;

public class ClassImporter {
  private static Type getType(Class<?> type) {
    if (type == boolean.class)
      return PrimitiveType.BOOLEAN;
    if (type == char.class)
      return PrimitiveType.CHAR;
    if (type == int.class)
      return PrimitiveType.INT;
    if (type == double.class)
      return PrimitiveType.DOUBLE;
    if (type == String.class)
      return PrimitiveType.STRING;
    if (type == Object.class)
      return PrimitiveType.ANY;
    if (type == void.class)
      return PrimitiveType.VOID;
    return null;
  }

  private static FunType asFunType(Method method) {
    ArrayList<Type> list = new ArrayList<Type>();
    for(Class<?> parameterType: method.getParameterTypes()) {
      Type type = getType(parameterType);
      if (type == null)
        return null;
      list.add(type);
    }
    
    Type returnType = getType(method.getReturnType());
    if (returnType == null)
      return null;
    
    return new FunType(returnType, list);
  }
  
  private static class MethodEntry {
    final Method method;
    final FunType funType;

    MethodEntry(Method method, FunType funType) {
      this.method = method;
      this.funType = funType;
    }
  }
  
  private static final MethodEntry NULL_METHOD_ENTRY = new MethodEntry(null, null);
  
  public static void importClass(Node node, Class<?> clazz, Table<Builtin> scope, ErrorReporter reporter) {
    HashMap<String, MethodEntry> map = new HashMap<String, MethodEntry>();
    
    for(Method method: clazz.getMethods()) {
      int modifiers = method.getModifiers();
      if (!Modifier.isStatic(modifiers))
        continue;
      
      FunType funType = asFunType(method);
      if (funType == null)
        continue;
      
      String name = method.getName();
      MethodEntry entry = map.get(name);
      if (entry == null) {
        map.put(name, new MethodEntry(method, funType));
        continue;
      } 
      if (entry == NULL_METHOD_ENTRY) {
        continue;
      }
      
      // method is overridden
      map.put(name, NULL_METHOD_ENTRY);
    }
    
    
    for(MethodEntry entry: map.values()) {
      if (entry == NULL_METHOD_ENTRY)
        continue;
      
      String name = entry.method.getName();
      if (scope.lookup(name) != null) {
        reporter.error(ErrorKind.duplicate_function, node, name);
        // error recovery
        continue;
      }
      
      Builtin builtin = new Builtin(name, entry.funType, clazz.getName());
      scope.register(builtin);
    }
  }
}
