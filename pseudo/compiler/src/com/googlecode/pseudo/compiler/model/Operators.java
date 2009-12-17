package com.googlecode.pseudo.compiler.model;

import static com.googlecode.pseudo.compiler.Types.PrimitiveType.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import com.googlecode.pseudo.compiler.Type;
import com.googlecode.pseudo.compiler.Types.FunType;


public class Operators {
  static class OperatorOverloads {
    private Type commonReturnType;
    private final HashMap<List<Type>,FunType> overloadMap =
      new HashMap<List<Type>, FunType>();
    
    public void addOverload(List<Type> parameterTypes, FunType funType) {
      overloadMap.put(parameterTypes, funType);
      
      Type returnType = funType.getReturnType();
      if (commonReturnType == null) {
        commonReturnType = returnType;
      } else {
        if (returnType != commonReturnType)
          commonReturnType = ANY;
      }
    }
    
    public FunType find(List<Type> parameterTypes) {
      return overloadMap.get(parameterTypes);
    }
    
    public Type getCommonReturnType() {
      assert commonReturnType != null;
      return commonReturnType;
    }
  }
  
  private final HashMap<String, OperatorOverloads> unaryMap =
    new HashMap<String, OperatorOverloads>();
  private final HashMap<String, OperatorOverloads> binaryMap =
    new HashMap<String, OperatorOverloads>();
  
  
  private static void register(HashMap<String, OperatorOverloads> map, String operatorName, List<Type> parameterTypes, FunType funType) {
    OperatorOverloads operatorOverloads = map.get(operatorName);
    if (operatorOverloads == null) {
      operatorOverloads = new OperatorOverloads();
      map.put(operatorName, operatorOverloads);
    }
    operatorOverloads.addOverload(parameterTypes, funType);
  }
  
  private void registerUnaryOp(String operatorName, Type type, FunType funType) {
    register(unaryMap, operatorName, Collections.singletonList(type), funType);
  }
  
  private void registerBinaryOp(String operatorName, Type leftType, Type rightType, FunType funType) {
    register(binaryMap, operatorName, Arrays.asList(leftType, rightType), funType);
  }
  
  
  private FunType find(HashMap<String, OperatorOverloads> map, String operatorName, List<Type> parameterTypes) {
    OperatorOverloads operatorOverloads = map.get(operatorName);
    if (operatorOverloads == null) {
      throw new IllegalArgumentException("no operator "+operatorName+" is registered");
    }
    return operatorOverloads.find(parameterTypes);
  }
  
  public FunType findOperator(String operatorName, List<Type> types) {
    HashMap<String, OperatorOverloads> map;
    int parameterCount = types.size();
    if (parameterCount == 1)
      map = unaryMap;
    else
      if (parameterCount == 2) {
        map = binaryMap;
      }
      else
        throw new IllegalArgumentException("invalid number of parameter "+parameterCount);
        
    return find(map, operatorName, types);
  }
  
  public Type findCommonReturnType(String operatorName, int parameterCount) {
    HashMap<String, OperatorOverloads> map;
    if (parameterCount == 1)
      map = unaryMap;
    else
      if (parameterCount == 2)
        map = binaryMap;
      else
        throw new IllegalArgumentException("invalid number of parameter "+parameterCount);
    
    OperatorOverloads operatorOverloads = map.get(operatorName);
    if (operatorOverloads == null) {
      throw new IllegalArgumentException("there is no operator "+operatorName+" with "+parameterCount+" arguments");
    }
    return operatorOverloads.getCommonReturnType();
  }
  
  private static final Operators INSTANCE;
  
  public static Operators getInstance() {
    return INSTANCE;
  }
  
  // --- builtin operators
  
  static {
    Operators ops = new Operators();
    
    // unary ops
    
    FunType int_int = new FunType(INT, Collections.<Type>singletonList(INT));
    ops.registerUnaryOp("+", CHAR, int_int);
    ops.registerUnaryOp("+", INT, int_int);
    
    FunType double_double = new FunType(DOUBLE, Collections.<Type>singletonList(DOUBLE));
    ops.registerUnaryOp("+", DOUBLE, double_double);
    
    ops.registerUnaryOp("-", CHAR, int_int);
    ops.registerUnaryOp("-", INT, int_int);
    ops.registerUnaryOp("-", DOUBLE, double_double);
    
    FunType boolean_boolean = new FunType(DOUBLE, Collections.<Type>singletonList(BOOLEAN));
    ops.registerUnaryOp("!", BOOLEAN, boolean_boolean);
    
    
    // binary ops
    
    FunType int_int_int = new FunType(INT, Arrays.<Type>asList(INT, INT));
    ops.registerBinaryOp("+", CHAR, CHAR, int_int_int);
    ops.registerBinaryOp("+", CHAR, INT, int_int_int);
    ops.registerBinaryOp("+", INT, CHAR, int_int_int);
    ops.registerBinaryOp("+", INT, INT, int_int_int);
    
    FunType double_double_double = new FunType(DOUBLE, Arrays.<Type>asList(DOUBLE, DOUBLE));
    ops.registerBinaryOp("+", DOUBLE, INT, double_double_double);
    ops.registerBinaryOp("+", INT, DOUBLE, double_double_double);
    ops.registerBinaryOp("+", DOUBLE, DOUBLE, double_double_double);
    
    //FunType string_object_string = new FunType(STRING, Arrays.<Type>asList(ANY, STRING));
    //ops.register("+", STRING, ANY, string_object_string);
    
    //FunType string_string_object = new FunType(STRING, Arrays.<Type>asList(STRING, ANY));
    //ops.register("+", ANY, STRING, string_string_object);
    
    FunType string_string_string = new FunType(STRING, Arrays.<Type>asList(STRING, STRING));
    ops.registerBinaryOp("+", STRING, STRING, string_string_string);
    
    
    ops.registerBinaryOp("-", CHAR, CHAR, int_int_int);
    ops.registerBinaryOp("-", CHAR, INT, int_int_int);
    ops.registerBinaryOp("-", INT, CHAR, int_int_int);
    ops.registerBinaryOp("-", INT, INT, int_int_int);
    ops.registerBinaryOp("-", DOUBLE, INT, double_double_double);
    ops.registerBinaryOp("-", INT, DOUBLE, double_double_double);
    ops.registerBinaryOp("-", DOUBLE, DOUBLE, double_double_double);
    
    ops.registerBinaryOp("*", CHAR, CHAR, int_int_int);
    ops.registerBinaryOp("*", CHAR, INT, int_int_int);
    ops.registerBinaryOp("*", INT, CHAR, int_int_int);
    ops.registerBinaryOp("*", INT, INT, int_int_int);
    ops.registerBinaryOp("*", DOUBLE, INT, double_double_double);
    ops.registerBinaryOp("*", INT, DOUBLE, double_double_double);
    ops.registerBinaryOp("*", DOUBLE, DOUBLE, double_double_double);
    
    ops.registerBinaryOp("/", CHAR, CHAR, int_int_int);
    ops.registerBinaryOp("/", CHAR, INT, int_int_int);
    ops.registerBinaryOp("/", INT, CHAR, int_int_int);
    ops.registerBinaryOp("/", INT, INT, int_int_int);
    ops.registerBinaryOp("/", DOUBLE, INT, double_double_double);
    ops.registerBinaryOp("/", INT, DOUBLE, double_double_double);
    ops.registerBinaryOp("/", DOUBLE, DOUBLE, double_double_double);
    
    ops.registerBinaryOp("%", CHAR, CHAR, int_int_int);
    ops.registerBinaryOp("%", CHAR, INT, int_int_int);
    ops.registerBinaryOp("%", INT, CHAR, int_int_int);
    ops.registerBinaryOp("%", INT, INT, int_int_int);
    ops.registerBinaryOp("%", DOUBLE, INT, double_double_double);
    ops.registerBinaryOp("%", INT, DOUBLE, double_double_double);
    ops.registerBinaryOp("%", DOUBLE, DOUBLE, double_double_double);
    
    
    FunType boolean_boolean_boolean = new FunType(BOOLEAN, Arrays.<Type>asList(BOOLEAN, BOOLEAN));
    FunType boolean_char_char = new FunType(BOOLEAN, Arrays.<Type>asList(CHAR, CHAR));
    FunType boolean_int_int = new FunType(BOOLEAN, Arrays.<Type>asList(INT, INT));
    FunType boolean_double_double = new FunType(BOOLEAN, Arrays.<Type>asList(DOUBLE, DOUBLE));
    
    /*
    ops.registerBinaryOp("==", BOOLEAN, BOOLEAN, boolean_boolean_boolean);
    
    ops.registerBinaryOp("==", CHAR, CHAR, boolean_char_char);
    ops.registerBinaryOp("==", CHAR, INT, boolean_int_int);
    ops.registerBinaryOp("==", INT, CHAR, boolean_int_int);
    ops.registerBinaryOp("==", INT, INT, boolean_int_int);
    
    ops.registerBinaryOp("==", DOUBLE, INT, boolean_double_double);
    ops.registerBinaryOp("==", INT, DOUBLE, boolean_double_double);
    ops.registerBinaryOp("==", DOUBLE, DOUBLE, boolean_double_double);
    
    //FunType boolean_any_any = new FunType(BOOLEAN, Arrays.<Type>asList(ANY, ANY));
    //ops.register("==", ANY, ANY, boolean_any_any);
    
    
    ops.registerBinaryOp("!=", BOOLEAN, BOOLEAN, boolean_boolean_boolean);
    ops.registerBinaryOp("!=", CHAR, CHAR, boolean_char_char);
    ops.registerBinaryOp("!=", CHAR, INT, boolean_int_int);
    ops.registerBinaryOp("!=", INT, CHAR, boolean_int_int);
    ops.registerBinaryOp("!=", INT, INT, boolean_int_int);
    ops.registerBinaryOp("!=", DOUBLE, INT, boolean_double_double);
    ops.registerBinaryOp("!=", INT, DOUBLE, boolean_double_double);
    ops.registerBinaryOp("!=", DOUBLE, DOUBLE, boolean_double_double);
    //ops.register("!=", ANY, ANY, boolean_any_any);
    */
    
    FunType boolean_string_string = new FunType(BOOLEAN, Arrays.<Type>asList(STRING, STRING));
    
    ops.registerBinaryOp(">", CHAR, CHAR, boolean_char_char);
    ops.registerBinaryOp(">", CHAR, INT, boolean_int_int);
    ops.registerBinaryOp(">", INT, CHAR, boolean_int_int);
    ops.registerBinaryOp(">", INT, INT, boolean_int_int);
    ops.registerBinaryOp(">", DOUBLE, INT, boolean_double_double);
    ops.registerBinaryOp(">", INT, DOUBLE, boolean_double_double);
    ops.registerBinaryOp(">", DOUBLE, DOUBLE, boolean_double_double);
    ops.registerBinaryOp(">", STRING, STRING, boolean_string_string);
    //ops.register(">", ANY, ANY, boolean_any_any);
    
    ops.registerBinaryOp(">=", CHAR, CHAR, boolean_char_char);
    ops.registerBinaryOp(">=", CHAR, INT, boolean_int_int);
    ops.registerBinaryOp(">=", INT, CHAR, boolean_int_int);
    ops.registerBinaryOp(">=", INT, INT, boolean_int_int);
    ops.registerBinaryOp(">=", DOUBLE, INT, boolean_double_double);
    ops.registerBinaryOp(">=", INT, DOUBLE, boolean_double_double);
    ops.registerBinaryOp(">=", DOUBLE, DOUBLE, boolean_double_double);
    ops.registerBinaryOp(">=", STRING, STRING, boolean_string_string);
    //ops.register(">=", ANY, ANY, boolean_any_any);
    
    ops.registerBinaryOp("<", CHAR, CHAR, boolean_char_char);
    ops.registerBinaryOp("<", CHAR, INT, boolean_int_int);
    ops.registerBinaryOp("<", INT, CHAR, boolean_int_int);
    ops.registerBinaryOp("<", INT, INT, boolean_int_int);
    ops.registerBinaryOp("<", DOUBLE, INT, boolean_double_double);
    ops.registerBinaryOp("<", INT, DOUBLE, boolean_double_double);
    ops.registerBinaryOp("<", DOUBLE, DOUBLE, boolean_double_double);
    ops.registerBinaryOp("<", STRING, STRING, boolean_string_string);
    //ops.register("<", ANY, ANY, boolean_any_any);
    
    ops.registerBinaryOp("<=", CHAR, CHAR, boolean_char_char);
    ops.registerBinaryOp("<=", CHAR, INT, boolean_int_int);
    ops.registerBinaryOp("<=", INT, CHAR, boolean_int_int);
    ops.registerBinaryOp("<=", INT, INT, boolean_int_int);
    ops.registerBinaryOp("<=", DOUBLE, INT, boolean_double_double);
    ops.registerBinaryOp("<=", INT, DOUBLE, boolean_double_double);
    ops.registerBinaryOp("<=", DOUBLE, DOUBLE, boolean_double_double);
    ops.registerBinaryOp("<=", STRING, STRING, boolean_string_string);
    //ops.register("<=", ANY, ANY, boolean_any_any);
    
    
    ops.registerBinaryOp("&&", BOOLEAN, BOOLEAN, boolean_boolean_boolean);
    ops.registerBinaryOp("||", BOOLEAN, BOOLEAN, boolean_boolean_boolean);
    
    INSTANCE = ops;
  }
}
