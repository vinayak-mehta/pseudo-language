package com.googlecode.pseudo.runtime;

import java.dyn.MethodHandle;
import java.dyn.MethodHandles;
import java.dyn.MethodType;
import java.util.HashMap;

public class Operators {
  static class Unary {
    private final String operatorName;
    private final Class<?> type;

    public Unary(String operatorName, Class<?> type) {
      this.operatorName = operatorName;
      this.type = type;
    }

    @Override
    public int hashCode() {
      return operatorName.hashCode() ^
             Integer.rotateLeft(type.hashCode(), 16);
    }

    @Override
    public boolean equals(Object obj) {
      if (!(obj instanceof Unary)) {
        return false;
      }
      Unary unary = (Unary) obj;
      return type == unary.type &&
             operatorName.equals(unary.operatorName);
    }
  }
  
  static class Binary {
    private final String operatorName;
    private final Class<?> leftType;
    private final Class<?> rightType;

    public Binary(String operatorName, Class<?> leftType, Class<?> rightType) {
      this.operatorName = operatorName;
      this.leftType = leftType;
      this.rightType = rightType;
    }

    @Override
    public int hashCode() {
      return operatorName.hashCode() ^
             Integer.rotateLeft(leftType.hashCode(), 8) ^
             Integer.rotateLeft(rightType.hashCode(), 24);
    }

    @Override
    public boolean equals(Object obj) {
      if (!(obj instanceof Binary)) {
        return false;
      }
      Binary binary = (Binary) obj;
      return leftType == binary.leftType &&
             rightType == binary.rightType &&
             operatorName.equals(binary.operatorName);
    }
  }
  
  private final HashMap<Unary, MethodHandle> unaryMHMap =
    new HashMap<Unary, MethodHandle>();
  private final HashMap<Binary, MethodHandle> binaryMHMap =
    new HashMap<Binary, MethodHandle>();
  
  private void register(String operatorName, Class<?> type, MethodHandle methodHandle) {
    unaryMHMap.put(new Unary(operatorName, type), methodHandle);
  }
  
  private void register(String operatorName, Class<?> leftType, Class<?> rightType, MethodHandle methodHandle) {
    binaryMHMap.put(new Binary(operatorName, leftType, rightType), methodHandle);
  }
  
  
  public MethodHandle lookup(String operatorName, Class<?> type) {
    return unaryMHMap.get(new Unary(operatorName, type));
  }
  
  public MethodHandle lookup(String operatorName, Class<?> leftType, Class<?> rightType) {
    return binaryMHMap.get(new Binary(operatorName, leftType, rightType));
  }
  
  
  public static Operators getInstance() {
    return INSTANCE;
  }
  private static final Operators INSTANCE;
  
  // --- method handle lookup helpers
  
  private static MethodHandle mh(String operatorName, Class<?> returnType, Class<?> parameterType) {
    return MethodHandles.lookup().findStatic(Operators.class, operatorName,
        MethodType.make(returnType, parameterType));
  }
  
  private static MethodHandle mh(String operatorName, Class<?> returnType, Class<?> leftType, Class<?> rightType) {
    return MethodHandles.lookup().findStatic(Operators.class, operatorName,
        MethodType.make(returnType, leftType, rightType));
  }
  
  // --- builtin operations
  
  public static int plus(int v) {
    return v;
  }
  public static double plus(double v) {
    return v;
  }
  public static int minus(int v) {
    return -v;
  }
  public static double minus(double v) {
    return -v;
  }
  public static boolean not(boolean v) {
    return !v;
  }
  
  
  public static int plus(int v1, int v2) {
    return v1 + v2;
  }
  public static double plus(double v1, double v2) {
    return v1 + v2;
  }
  public static int minus(int v1, int v2) {
    return v1 - v2;
  }
  public static double minus(double v1, double v2) {
    return v1 - v2;
  }
  public static int mul(int v1, int v2) {
    return v1 * v2;
  }
  public static double mul(double v1, double v2) {
    return v1 * v2;
  }
  public static int div(int v1, int v2) {
    return v1 / v2;
  }
  public static double div(double v1, double v2) {
    return v1 / v2;
  }
  public static int mod(int v1, int v2) {
    return v1 % v2;
  }
  public static double mod(double v1, double v2) {
    return v1 % v2;
  }
  
  public static boolean gt(int v1, int v2) {
    return v1 > v2;
  }
  public static boolean gt(double v1, double v2) {
    return v1 > v2;
  }
  public static boolean gt(String v1, String v2) {
    return v1.compareTo(v2) > 0;
  }
  public static boolean ge(int v1, int v2) {
    return v1 >= v2;
  }
  public static boolean ge(double v1, double v2) {
    return v1 >= v2;
  }
  public static boolean ge(String v1, String v2) {
    return v1.compareTo(v2) >= 0;
  }
  public static boolean lt(int v1, int v2) {
    return v1 < v2;
  }
  public static boolean lt(double v1, double v2) {
    return v1 < v2;
  }
  public static boolean lt(String v1, String v2) {
    return v1.compareTo(v2) < 0;
  }
  public static boolean le(int v1, int v2) {
    return v1 <= v2;
  }
  public static boolean le(double v1, double v2) {
    return v1 <= v2;
  }
  public static boolean le(String v1, String v2) {
    return v1.compareTo(v2) <= 0;
  }
  
  // --- builtin operators
  
  static {
    Operators ops = new Operators();
    
    // unary ops
    
    MethodHandle plus_int_int = mh("plus", int.class, int.class);
    ops.register("+", char.class, plus_int_int);
    ops.register("+", int.class, plus_int_int);
    
    MethodHandle plus_double_double = mh("plus", double.class, double.class);
    ops.register("+", double.class, plus_double_double);
    
    MethodHandle minus_int_int = mh("minus", int.class, int.class);
    ops.register("-", char.class, minus_int_int);
    ops.register("-", int.class, minus_int_int);
    
    MethodHandle minus_double_double = mh("minus", double.class, double.class);
    ops.register("-", double.class, minus_double_double);
    
    MethodHandle not_boolean_boolean = mh("not", boolean.class, boolean.class);
    ops.register("!", boolean.class, not_boolean_boolean);
    
    
    
    // binary ops
    
    MethodHandle plus_int_int_int = mh("plus", int.class, int.class, int.class);
    ops.register("+", char.class, char.class, plus_int_int_int);
    ops.register("+", char.class, int.class, plus_int_int_int);
    ops.register("+", int.class, char.class, plus_int_int_int);
    ops.register("+", int.class, int.class, plus_int_int_int);
    
    MethodHandle plus_double_double_double = mh("plus", double.class, double.class, double.class);
    ops.register("+", double.class, int.class, plus_double_double_double);
    ops.register("+", int.class, double.class, plus_double_double_double);
    ops.register("+", double.class, double.class, plus_double_double_double);
    
    /*MethodHandle plus_string_object_string = MethodType.make(String.class, Object.class, String.class);
    ops.register("+", String.class, Object.class, string_object_string);
    
    MethodHandle string_string_object = MethodType.make(String.class, String.class, Object.class);
    ops.register("+", Object.class, String.class, string_string_object);
    
    MethodHandle string_string_string = MethodType.make(String.class, String.class, String.class);
    ops.register("+", String.class, String.class, string_string_string);
    */
    
    MethodHandle minus_int_int_int = mh("minus", int.class, int.class, int.class);
    ops.register("-", char.class, char.class, minus_int_int_int);
    ops.register("-", char.class, int.class, minus_int_int_int);
    ops.register("-", int.class, char.class, minus_int_int_int);
    ops.register("-", int.class, int.class, minus_int_int_int);
    
    MethodHandle minus_double_double_double = mh("minus", double.class, double.class, double.class);
    ops.register("-", double.class, int.class, minus_double_double_double);
    ops.register("-", int.class, double.class, minus_double_double_double);
    ops.register("-", double.class, double.class, minus_double_double_double);
    
    MethodHandle mul_int_int_int = mh("mul", int.class, int.class, int.class);
    ops.register("*", char.class, char.class, mul_int_int_int);
    ops.register("*", char.class, int.class, mul_int_int_int);
    ops.register("*", int.class, char.class, mul_int_int_int);
    ops.register("*", int.class, int.class, mul_int_int_int);
    
    MethodHandle mul_double_double_double = mh("mul", double.class, double.class, double.class);
    ops.register("*", double.class, int.class, mul_double_double_double);
    ops.register("*", int.class, double.class, mul_double_double_double);
    ops.register("*", double.class, double.class, mul_double_double_double);
    
    MethodHandle div_int_int_int = mh("div", int.class, int.class, int.class);
    ops.register("/", char.class, char.class, div_int_int_int);
    ops.register("/", char.class, int.class, div_int_int_int);
    ops.register("/", int.class, char.class, div_int_int_int);
    ops.register("/", int.class, int.class, div_int_int_int);
    
    MethodHandle div_double_double_double = mh("div", double.class, double.class, double.class);
    ops.register("/", double.class, int.class, div_double_double_double);
    ops.register("/", int.class, double.class, div_double_double_double);
    ops.register("/", double.class, double.class, div_double_double_double);
    
    MethodHandle mod_int_int_int = mh("mod", int.class, int.class, int.class);
    ops.register("%", char.class, char.class, mod_int_int_int);
    ops.register("%", char.class, int.class, mod_int_int_int);
    ops.register("%", int.class, char.class, mod_int_int_int);
    ops.register("%", int.class, int.class, mod_int_int_int);
    
    MethodHandle mod_double_double_double = mh("mod", double.class, double.class, double.class);
    ops.register("%", double.class, int.class, mod_double_double_double);
    ops.register("%", int.class, double.class, mod_double_double_double);
    ops.register("%", double.class, double.class, mod_double_double_double);
    
    
    MethodHandle gt_boolean_int_int = mh("gt", boolean.class, int.class, int.class);
    ops.register(">", char.class, char.class, gt_boolean_int_int);
    ops.register(">", char.class, int.class, gt_boolean_int_int);
    ops.register(">", int.class, char.class, gt_boolean_int_int);
    ops.register(">", int.class, int.class, gt_boolean_int_int);
    MethodHandle gt_boolean_double_double = mh("gt", boolean.class, double.class, double.class);
    ops.register(">", double.class, int.class, gt_boolean_double_double);
    ops.register(">", int.class, double.class, gt_boolean_double_double);
    ops.register(">", double.class, double.class, gt_boolean_double_double);
    MethodHandle gt_boolean_string_string = mh("gt", boolean.class, String.class, String.class);
    ops.register(">", String.class, String.class, gt_boolean_string_string);
    
    MethodHandle ge_boolean_int_int = mh("ge", boolean.class, int.class, int.class);
    ops.register(">=", char.class, char.class, ge_boolean_int_int);
    ops.register(">=", char.class, int.class, ge_boolean_int_int);
    ops.register(">=", int.class, char.class, ge_boolean_int_int);
    ops.register(">=", int.class, int.class, ge_boolean_int_int);
    MethodHandle ge_boolean_double_double = mh("ge", boolean.class, double.class, double.class);
    ops.register(">=", double.class, int.class, ge_boolean_double_double);
    ops.register(">=", int.class, double.class, ge_boolean_double_double);
    ops.register(">=", double.class, double.class, ge_boolean_double_double);
    MethodHandle ge_boolean_string_string = mh("ge", boolean.class, String.class, String.class);
    ops.register(">=", String.class, String.class, ge_boolean_string_string);
    
    MethodHandle lt_boolean_int_int = mh("lt", boolean.class, int.class, int.class);
    ops.register("<", char.class, char.class, lt_boolean_int_int);
    ops.register("<", char.class, int.class, lt_boolean_int_int);
    ops.register("<", int.class, char.class, lt_boolean_int_int);
    ops.register("<", int.class, int.class, lt_boolean_int_int);
    MethodHandle lt_boolean_double_double = mh("lt", boolean.class, double.class, double.class);
    ops.register("<", double.class, int.class, lt_boolean_double_double);
    ops.register("<", int.class, double.class, lt_boolean_double_double);
    ops.register("<", double.class, double.class, lt_boolean_double_double);
    MethodHandle lt_boolean_string_string = mh("lt", boolean.class, String.class, String.class);
    ops.register("<", String.class, String.class, lt_boolean_string_string);
    
    MethodHandle le_boolean_int_int = mh("le", boolean.class, int.class, int.class);
    ops.register("<=", char.class, char.class, le_boolean_int_int);
    ops.register("<=", char.class, int.class, le_boolean_int_int);
    ops.register("<=", int.class, char.class, le_boolean_int_int);
    ops.register("<=", int.class, int.class, le_boolean_int_int);
    MethodHandle le_boolean_double_double = mh("le", boolean.class, double.class, double.class);
    ops.register("<=", double.class, int.class, le_boolean_double_double);
    ops.register("<=", int.class, double.class, le_boolean_double_double);
    ops.register("<=", double.class, double.class, le_boolean_double_double);
    MethodHandle le_boolean_string_string = mh("le", boolean.class, String.class, String.class);
    ops.register("<=", String.class, String.class, le_boolean_string_string);
    
    INSTANCE = ops;
  }  
}
