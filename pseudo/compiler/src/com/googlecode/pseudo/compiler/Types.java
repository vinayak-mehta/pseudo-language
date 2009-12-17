package com.googlecode.pseudo.compiler;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Types {
  public enum PrimitiveType implements Type {
    BOOLEAN, CHAR, INT, DOUBLE, STRING, VOID, ANY, NULL {
      @Override
      public String toString() {
        return "<null>";
      }
    }
    ;

    @Override
    public String getName() {
      return name();
    }
    
    @Override
    public boolean isPrimitive() {
      return true;
    }
    @Override
    public boolean isArray() {
      return false;
    }
    @Override
    public boolean isFunction() {
      return false;
    }
    
    @Override
    public String toString() {
      return name().toLowerCase();
    }
  }
  
  public static abstract class ReferenceType implements Type {
    @Override
    public boolean isPrimitive() {
      return false;
    }
    @Override
    public boolean isArray() {
      return false;
    }
    @Override
    public boolean isFunction() {
      return false;
    }
    
    @Override
    public String toString() {
      return getName();
    }
  }
  
  public static class ArrayType extends ReferenceType {
    private final Type componentType;
    
    public ArrayType(Type componentType) {
      this.componentType = componentType;
    }

    @Override
    public boolean equals(Object obj) {
      if (!(obj instanceof ArrayType)) {
        return false;
      }
      ArrayType arrayType = (ArrayType)obj;
      return componentType.equals(arrayType.componentType);
    }
    
    @Override
    public int hashCode() {
      return Integer.rotateLeft(componentType.hashCode(), 1);
    }
    
    public Type getComponentType() {
      return componentType;
    }

    @Override
    public String getName() {
      return componentType+"[]";
    }
    
    @Override
    public boolean isArray() {
      return true;
    }
  }
  
  public static class FunType extends ReferenceType {
    private final Type returnType;
    private final List<Type> parameterTypes;
    
    public FunType(Type returnType, List<Type> parameterTypes) {
      this.returnType = returnType;
      this.parameterTypes = parameterTypes;
    }
    
    @Override
    public boolean equals(Object obj) {
      if (!(obj instanceof FunType)) {
        return false;
      }
      FunType funType = (FunType)obj;
      return returnType == funType.returnType &&
             parameterTypes.equals(funType.parameterTypes);
    }
    
    @Override
    public int hashCode() {
      return Integer.reverseBytes(returnType.hashCode()) ^
        parameterTypes.hashCode();
    }
    
    public Type getReturnType() {
      return returnType;
    }
    public List<Type> getParameterTypes() {
      return parameterTypes;
    }
    
    @Override
    public String getName() {
      return String.valueOf(parameterTypes)+':'+returnType;
    }
    
    @Override
    public boolean isFunction() {
      return true;
    }
  }
  
  public static boolean isAssignableFrom(Type type1, Type type2) {
    if (type1.equals(type2))
      return true;
    
    if (type1 == PrimitiveType.ANY || type2 == PrimitiveType.ANY)
      return true;
    
    if (type2 == PrimitiveType.NULL && type1 instanceof ReferenceType)
      return true;
    
    if ((type1 == PrimitiveType.DOUBLE && (type2 == PrimitiveType.INT || type2 == PrimitiveType.CHAR)) || 
        (type1 == PrimitiveType.INT && type2 == PrimitiveType.CHAR))
      return true;
    
    if (type1 instanceof ArrayType && type2 instanceof ArrayType) {
      return isSubtypeOf(((ArrayType)type1).getComponentType(), ((ArrayType)type2).getComponentType());
    }
    
    if (type1 instanceof FunType && type2 instanceof FunType) {
      return isSubtypeOf((FunType)type1, (FunType)type2);
    }
    
    return false;
  }
  
  /*
  private static boolean isAssignableFrom(ArrayType type1, ArrayType type2) {
    Type componentType1 = type1.getComponentType();
    Type componentType2 = type2.getComponentType();
    if (componentType1.equals(componentType2)) {
      return true;
    }
    if (componentType1 == PrimitiveType.ANY || componentType2 == PrimitiveType.ANY) {
      return true;
    }
    if (!(componentType1 instanceof ArrayType)) {
      return false;
    }
    return componentType2 instanceof ArrayType &&
           isAssignableFrom((ArrayType)componentType1, (ArrayType)componentType2);
  }
  
  private static boolean isAssignableFrom(FunType type1, FunType type2) {
    List<Type> parameterTypes1 = type1.getParameterTypes();
    List<Type> parameterTypes2 = type2.getParameterTypes();
    if (parameterTypes1.size() != parameterTypes2.size()) {
      return false;
    }
    
    if (!(isAssignableFrom(type1.getReturnType(), type2.getReturnType()))) {
      return false;
    }
    
    Iterator<Type> it1 = parameterTypes1.iterator();
    Iterator<Type> it2 = parameterTypes2.iterator();
    while(it1.hasNext()) {
      Type t1 = it1.next();
      Type t2 = it2.next();
      if (!(isAssignableFrom(t2, t1)))
        return false;
    }
    return true;
  }*/
  
  /*
  public static boolean isInstanceOf(List<Type> parameterTypes1, List<Type> parameterTypes2) {
    Iterator<Type> it1 = parameterTypes1.iterator();
    Iterator<Type> it2 = parameterTypes2.iterator();
    while(it1.hasNext()) {
      Type t1 = it1.next();
      Type t2 = it2.next();
      if (!(isInstanceOf(t1, t2)))
        return false;
    }
    return true;
  }*/
  
  private static boolean isSubtypeOf(Type type1, Type type2) {
    if (type1.equals(type2))
      return true;
    
    if (type1 == PrimitiveType.ANY || type2 == PrimitiveType.ANY)
      return true;
    
    if (type2 == PrimitiveType.NULL && type1 instanceof ReferenceType)
      return true;
    
    if (type1 instanceof ArrayType && type2 instanceof ArrayType) {
      return isSubtypeOf(((ArrayType)type1).getComponentType(), ((ArrayType)type2).getComponentType());
    }
    
    if (type1 instanceof FunType && type2 instanceof FunType) {
      return isSubtypeOf((FunType)type1, (FunType)type2);
    }
    
    return false;
  }
  
  private static boolean isSubtypeOf(FunType type1, FunType type2) {
    List<Type> parameterTypes1 = type1.getParameterTypes();
    List<Type> parameterTypes2 = type2.getParameterTypes();
    if (parameterTypes1.size() != parameterTypes2.size()) {
      return false;
    }
    
    if (!(isSubtypeOf(type1.getReturnType(), type2.getReturnType()))) {
      return false;
    }
    
    Iterator<Type> it1 = parameterTypes1.iterator();
    Iterator<Type> it2 = parameterTypes2.iterator();
    while(it1.hasNext()) {
      Type t1 = it1.next();
      Type t2 = it2.next();
      if (!(isSubtypeOf(t2, t1)))
        return false;
    }
    return true;
  }
  
  /**
   * @param type type of the primary
   * @param argumentTypes type of the arguments
   * @return the fun type otherwise null.
   */
  public static FunType getFunTypeForCall(Type type, List<Type> argumentTypes) {
    if (type == PrimitiveType.ANY)
      return null;
    if (!(type instanceof FunType))
      return null;
    FunType funType = (FunType)type;
    return isCallable(funType, argumentTypes)?funType:null;
  }
  
  public static boolean isCallable(FunType funType, List<Type> argumentTypes) {
    List<Type> parameterTypes = funType.getParameterTypes();
    if (parameterTypes.size() != argumentTypes.size())
      return false;
    
    Iterator<Type> parameterIt = parameterTypes.iterator();
    Iterator<Type> argumentIt = argumentTypes.iterator();
    while(parameterIt.hasNext()) {
      Type parameterType = parameterIt.next();
      Type argumentType = argumentIt.next();
      if (!(isAssignableFrom(parameterType, argumentType)))
        return false;
    }
    return true;
  }

  private static Type glb(Type type1, Type type2) {
    if (type1.equals(type2))
      return type1;
    if (Types.isSubtypeOf(type1, type2))
      return type1;
    if (Types.isSubtypeOf(type2, type1))
      return type2;
    
    return PrimitiveType.ANY;
  }
  
  private static Type lub(Type type1, Type type2) {
    if (type1.equals(type2))
      return type1;
    if (Types.isSubtypeOf(type1, type2))
      return type2;
    if (Types.isSubtypeOf(type2, type1))
      return type1;
    
    return PrimitiveType.ANY;
  }
  
  public static FunType glb(FunType funType1, FunType funType2) {
    Type returnType = lub(funType1.getReturnType(), funType2.getReturnType());
    
    ArrayList<Type> parameterTypes = new ArrayList<Type>();
    Iterator<Type> it1 = funType1.getParameterTypes().iterator();
    Iterator<Type> it2 = funType2.getParameterTypes().iterator();
    while(it1.hasNext()) {
      Type t1 = it1.next();
      Type t2 = it2.next();
      parameterTypes.add(glb(t1, t2));
    }
    return new FunType(returnType, parameterTypes);
  }
  
  public static boolean isDynamic(List<Type> argumentTypes) {
    for(Type type:argumentTypes) {
      if (type == PrimitiveType.ANY)
        return true;
    }
    return false;
  }
}
