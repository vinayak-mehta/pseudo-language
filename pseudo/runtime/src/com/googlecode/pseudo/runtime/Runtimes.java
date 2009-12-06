package com.googlecode.pseudo.runtime;

import java.dyn.CallSite;
import java.dyn.MethodHandle;
import java.dyn.MethodHandles;
import java.dyn.MethodType;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;

public class Runtimes {
  public static Scanner scanner() {
    return ScannerCache.SCANNER;
  }
  
  static class ScannerCache {
    static final Scanner SCANNER = new Scanner();
  }
  
  
  public static CallSite bootstrapMethod(Class<?> caller, String name, MethodType type) {
    if ("__cast__".equals(name)) {
      return Cast.bootstrapDynamicCast(caller, type);
    }
    if ("__call__".equals(name)) {
      return Call.bootstrapDynamicCall(caller, type);
    }

    if (name.startsWith("__operator__:")) {
      String operatorName = name.substring(13);
      if ("==".equals(operatorName)) {
        return Test.bootstrapDynamicBinaryOperator(caller, operatorName, type);
      } 
      
      int parameterLength = type.parameterCount();
      if (parameterLength == 1)
        return Unary.bootstrapDynamicUnaryOperator(caller, operatorName, type);
      if (parameterLength == 2)
        return Binary.bootstrapDynamicBinaryOperator(caller, operatorName, type);
      throw new LinkageError("operator "+operatorName+" can't have more than 2 parameters");
    }
    
    if (name.startsWith("__field_get__:")) {
      String fieldName = name.substring(14);
      return FieldAccess.bootstrapDynamicFieldGet(caller, fieldName, type);
    }
    if (name.startsWith("__field_set__:")) {
      String fieldName = name.substring(14);
      return FieldAccess.bootstrapDynamicFieldSet(caller, fieldName, type);
    }
    
    if (name.equals("__array_get__")) {
      return ArrayAccess.bootstrapDynamicArrayGet(caller, type);
    }
    if (name.equals("__array_set__")) {
      return ArrayAccess.bootstrapDynamicArraySet(caller, type);
    }

    throw new LinkageError("unknwon protocol "+name+" "+type+" asked by "+caller);
  }


  public static class Cast {
    public static Object dynamicCastSlowPath(Object value) {
      return value;
    }

    private static final MethodHandle dynamicCastSlowPath;
    static {
      dynamicCastSlowPath = MethodHandles.lookup().findStatic(Cast.class, "dynamicCastSlowPath",
          MethodType.make(Object.class, Object.class));
    }

    static CallSite bootstrapDynamicCast(Class<?> caller, MethodType type) {
      CallSite callSite = new CallSite(caller, "__cast__", type);
      callSite.setTarget(MethodHandles.convertArguments(dynamicCastSlowPath, type));
      return callSite;
    }

  }

  // ----

  public static class Call { 
    public static boolean methodHandleTest(/*MethodHandle*/Object mh1, /*MethodHandle*/Object mh2) {
      return mh1 == mh2;
    }

    public static Object dynamicCallSlowPath(CallSite callSite, /*MethodHandle*/Object omh, Object[] args) throws Throwable {
      //FIXME MethodHandle in the invokedynamic signature is not currently supported by the backport
      MethodHandle mh = (MethodHandle)omh;

      MethodType callSiteType = callSite.type();
      MethodHandle target = MethodHandles.convertArguments(
          MethodHandles.exactInvoker(mh.type()),
          callSiteType);

      MethodHandle test = MethodHandles.insertArguments(methodHandleTest, 0, mh);

      Class<?>[] types = new Class<?>[callSiteType.parameterCount() - 1];
      for(int i=1; i<callSiteType.parameterCount(); i++) {
        types[i - 1] = callSiteType.parameterType(i);
      }
      test = MethodHandles.dropArguments(test, 1, types);

      //System.out.println("target type "+target.type() + " test type "+test.type());

      callSite.setTarget(MethodHandles.guardWithTest(test, target, callSite.getTarget()));
      return MethodHandles.invokeVarargs(mh, args);
    }

    private static final MethodHandle dynamicCallSlowPath;
    private static final MethodHandle methodHandleTest;
    static {
      dynamicCallSlowPath = MethodHandles.lookup().findStatic(Call.class, "dynamicCallSlowPath",
          MethodType.make(Object.class, CallSite.class, /*MethodHandle*/Object.class, Object[].class));
      methodHandleTest = MethodHandles.lookup().findStatic(Call.class, "methodHandleTest",
          MethodType.make(boolean.class, /*MethodHandle*/Object.class, /*MethodHandle*/Object.class));
    }

    static CallSite bootstrapDynamicCall(Class<?> caller, MethodType type) {
      CallSite callSite = new CallSite(caller, "__call__", type);
      MethodHandle mh = MethodHandles.insertArguments(dynamicCallSlowPath, 0, callSite);
      callSite.setTarget(MethodHandles.collectArguments(mh, type));
      return callSite;
    }  

  }

  // ---

  public static class Unary {

    public static Object dynamicUnaryPlusSlowPath(Object value) {
      if (value instanceof Integer || value instanceof Double || value instanceof Character)
        return value;
      throw new ClassCastException("can't apply unary + on " + ((value==null)?null:value.getClass()));
    }

    public static Object dynamicUnaryMinusSlowPath(Object value) {
      if (value instanceof Integer)
        return -((Integer)value);
      if (value instanceof Double)
        return -((Double)value);
      if (value instanceof Character)
        return -((Character)value);
      throw new ClassCastException("can't apply unary - on " + ((value==null)?null:value.getClass()));
    }

    public static Object dynamicUnaryNegSlowPath(Object value) {
      if (value instanceof Boolean)
        return !((Boolean)value);
      throw new ClassCastException("can't apply unary ! on " + ((value==null)?null:value.getClass()));
    }

    private static final MethodHandle dynamicUnaryPludSlowPath;
    private static final MethodHandle dynamicUnaryMinusSlowPath;
    private static final MethodHandle dynamicUnaryNegSlowPath;
    static {
      dynamicUnaryPludSlowPath = MethodHandles.lookup().findStatic(Unary.class, "dynamicUnaryPlusSlowPath",
          MethodType.make(Object.class, Object.class));
      dynamicUnaryMinusSlowPath = MethodHandles.lookup().findStatic(Unary.class, "dynamicUnaryMinusSlowPath",
          MethodType.make(Object.class, Object.class));
      dynamicUnaryNegSlowPath = MethodHandles.lookup().findStatic(Unary.class, "dynamicUnaryNegSlowPath",
          MethodType.make(Object.class, Object.class));
    }

    static CallSite bootstrapDynamicUnaryOperator(Class<?> caller, String operatorName, MethodType type) {
      CallSite callSite = new CallSite(caller, "__operator__:"+operatorName, type); 

      MethodHandle mh;
      if ("-".equals(operatorName))
        mh = dynamicUnaryMinusSlowPath;
      else if ("!".equals(operatorName))
        mh = dynamicUnaryNegSlowPath;
      else if ("+".equals(operatorName))
        mh = dynamicUnaryPludSlowPath;
      else
        throw new LinkageError("unknown unary operator "+operatorName);
      callSite.setTarget(MethodHandles.convertArguments(mh, type));
      return callSite;
    }
  }

  public static class Binary {
    public static boolean instanceofTest(Class<?> expectedType, Object value) {
      return expectedType.isInstance(value); 
    }

    public static Object dynamicBinaryLeftSlowPath(CallSite callSite, Class<?> rightType, Object leftValue, Object rightValue) throws Throwable {
      Class<?> leftType = leftValue.getClass();
      MethodHandle target = Operators.getInstance().lookup(callSite.name(),
          Wrappers.getPrimitiveFromWrapper(leftType),
          rightType);
      if (target == null) {
        throw new NoSuchMethodException("operator "+callSite.name()+" "+Wrappers.getPrimitiveFromWrapper(leftType)+" "+rightType);  
      }

      MethodHandle test = MethodHandles.insertArguments(instanceofTest, 0, leftType);
      test = MethodHandles.convertArguments(
          MethodHandles.dropArguments(test, 1, rightType),
          callSite.type().changeReturnType(boolean.class));
      target = MethodHandles.convertArguments(target, callSite.type());
      callSite.setTarget(MethodHandles.guardWithTest(test, target, callSite.getTarget()));

      return MethodHandles.invoke(target, leftValue, rightValue);
    }

    public static Object dynamicBinaryRightSlowPath(CallSite callSite, Class<?> leftType, Object leftValue, Object rightValue) throws Throwable {
      Class<?> rightType = rightValue.getClass();
      MethodHandle target = Operators.getInstance().lookup(callSite.name(),
          leftType, 
          Wrappers.getPrimitiveFromWrapper(rightType));
      if (target == null) {
        throw new NoSuchMethodException("operator "+callSite.name()+" "+leftType+" "+Wrappers.getPrimitiveFromWrapper(rightType));  
      }

      MethodHandle test = MethodHandles.insertArguments(instanceofTest, 0, rightType);
      test = MethodHandles.convertArguments(
          MethodHandles.dropArguments(test, 0, leftType),
          callSite.type().changeReturnType(boolean.class));
      target = MethodHandles.convertArguments(target, callSite.type());
      callSite.setTarget(MethodHandles.guardWithTest(test, target, callSite.getTarget()));

      return MethodHandles.invoke(target, leftValue, rightValue);
    }

    public static boolean instanceofBothTest(Class<?> expectedType1, Class<?> expectedType2, Object value1, Object value2) {
      return expectedType1.isInstance(value1) && expectedType2.isInstance(value2); 
    }

    public static Object dynamicBinaryBothSlowPath(CallSite callSite, Object leftValue, Object rightValue) throws Throwable {
      Class<?> leftType = leftValue.getClass();
      Class<?> rightType = rightValue.getClass();
      MethodHandle target = Operators.getInstance().lookup(callSite.name(),
          Wrappers.getPrimitiveFromWrapper(leftType),
          Wrappers.getPrimitiveFromWrapper(rightType));
      if (target == null) {
        throw new NoSuchMethodException("operator "+callSite.name()+" "+Wrappers.getPrimitiveFromWrapper(leftType)+
            " "+Wrappers.getPrimitiveFromWrapper(rightType));  
      }

      MethodHandle test = MethodHandles.insertArguments(instanceofBothTest, 0, leftType, rightType);
      test = MethodHandles.convertArguments(test,
          callSite.type().changeReturnType(boolean.class));
      target = MethodHandles.convertArguments(target, callSite.type());
      callSite.setTarget(MethodHandles.guardWithTest(test, target, callSite.getTarget()));

      return MethodHandles.invoke(target, leftValue, rightValue);
    }


    private static final MethodHandle instanceofTest;
    private static final MethodHandle dynamicBinaryLeftSlowPath;
    private static final MethodHandle dynamicBinaryRightSlowPath;
    private static final MethodHandle instanceofBothTest;
    private static final MethodHandle dynamicBinaryBothSlowPath;
    static {
      instanceofTest = MethodHandles.lookup().findStatic(Binary.class, "instanceofTest",
          MethodType.make(boolean.class, Class.class, Object.class));
      dynamicBinaryLeftSlowPath = MethodHandles.lookup().findStatic(Binary.class, "dynamicBinaryLeftSlowPath",
          MethodType.make(Object.class, CallSite.class, Class.class, Object.class, Object.class));
      dynamicBinaryRightSlowPath = MethodHandles.lookup().findStatic(Binary.class, "dynamicBinaryRightSlowPath",
          MethodType.make(Object.class, CallSite.class, Class.class, Object.class, Object.class));
      instanceofBothTest = MethodHandles.lookup().findStatic(Binary.class, "instanceofBothTest",
          MethodType.make(boolean.class, Class.class, Class.class, Object.class, Object.class));
      dynamicBinaryBothSlowPath = MethodHandles.lookup().findStatic(Binary.class, "dynamicBinaryBothSlowPath",
          MethodType.make(Object.class, CallSite.class, Object.class, Object.class));
    }

    static CallSite bootstrapDynamicBinaryOperator(Class<?> caller, String operatorName, MethodType type) {
      CallSite callSite = new CallSite(caller, operatorName, type);

      MethodHandle target;
      Class<?> leftType = type.parameterType(0);
      Class<?> rightType = type.parameterType(1);
      if (leftType == Object.class) {
        if (rightType == Object.class) {
          // full dynamic
          target = MethodHandles.insertArguments(dynamicBinaryBothSlowPath, 0, callSite);

        } else {
          // left value is dynamic
          target = MethodHandles.insertArguments(dynamicBinaryLeftSlowPath, 0, callSite, rightType);
        }
      } else {
        if (rightType != Object.class)
          throw new LinkageError("dynamic binary operator without dynamic type "+caller+" "+operatorName+" "+type);

        // right value is dynamic
        target = MethodHandles.insertArguments(dynamicBinaryRightSlowPath, 0, callSite, leftType);
      }

      callSite.setTarget(MethodHandles.convertArguments(target, type));
      return callSite;
    }
  }
  
  public static class Test {
    
    public static boolean eq(Object v1, Object v2) {
      return v1 == v2 || (v1 != null && v1.equals(v2));
    }
    
    public static boolean eqLeft(Object v1, boolean v2) {
      if (v1 instanceof Boolean) {
        return (Boolean)v1 == v2;
      }
      return false;
    }
    public static boolean eqLeft(Object v1, char v2) {
      if (v1 instanceof Character) {
        return (Character)v1 == v2;
      }
      return false;
    }
    public static boolean eqLeft(Object v1, int v2) {
      if (v1 instanceof Integer) {
        return (Integer)v1 == v2;
      }
      return false;
    }
    public static boolean eqLeft(Object v1, double v2) {
      if (v1 instanceof Double) {
        return (Double)v1 == v2;
      }
      return false;
    }

    public static boolean eqRight(boolean v1,  Object v2) {
      if (v2 instanceof Boolean) {
        return v1 == (Boolean)v2;
      }
      return false;
    }
    public static boolean eqRight(char v1,  Object v2) {
      if (v2 instanceof Character) {
        return v1 == (Character)v2;
      }
      return false;
    }
    public static boolean eqRight(int v1,  Object v2) {
      if (v2 instanceof Integer) {
        return v1 == (Integer)v2;
      }
      return false;
    }
    public static boolean eqRight(double v1,  Object v2) {
      if (v2 instanceof Double) {
        return v1 == (Double)v2;
      }
      return false;
    }
        
    private static final MethodHandle eq;
    private static final HashMap<Class<?>, MethodHandle> eqLeftMap;
    private static final HashMap<Class<?>, MethodHandle> eqRightMap;
    static {
      eq = MethodHandles.lookup().findStatic(Test.class, "eq",
          MethodType.make(boolean.class, Object.class, Object.class));
      
      HashMap<Class<?>, MethodHandle> eqLMap =
        new HashMap<Class<?>, MethodHandle>();
      HashMap<Class<?>, MethodHandle> eqRMap =
        new HashMap<Class<?>, MethodHandle>();
      for(Class<?> type:Arrays.<Class<?>>asList(boolean.class, char.class, int.class, double.class)) {
        MethodHandle eqLeft = MethodHandles.lookup().findStatic(Test.class, "eqLeft",
            MethodType.make(boolean.class, Object.class, type));
        eqLMap.put(type, eqLeft);
        MethodHandle eqRight = MethodHandles.lookup().findStatic(Test.class, "eqRight",
            MethodType.make(boolean.class, type, Object.class));
        eqLMap.put(type, eqRight);
      }
      
      eqLeftMap = eqLMap;
      eqRightMap = eqRMap;
    }
    
    static CallSite bootstrapDynamicBinaryOperator(Class<?> caller, String operatorName, MethodType type) {
      CallSite callSite = new CallSite(caller, operatorName, type);

      MethodHandle target;
      Class<?> leftType = type.parameterType(0);
      Class<?> rightType = type.parameterType(1);
      if (leftType == Object.class) {
        if (rightType == Object.class) {
          // full dynamic
          target = eq;

        } else {
          // left value is dynamic
          target = eqLeftMap.get(rightType);
        }
      } else {
        if (rightType != Object.class)
          throw new LinkageError("dynamic binary operator without dynamic type "+caller+" "+operatorName+" "+type);

        // right value is dynamic
        target = eqRightMap.get(leftType);
      }
      
      if (target == null) {
        throw new LinkageError("unknown target for "+caller+" "+operatorName+" "+type);
      }
      
      callSite.setTarget(MethodHandles.convertArguments(target, type));
      return callSite;
    }
  }
  
  public static class FieldAccess {
    public static boolean test(Class<?> targetClass, Object receiver) {
      return receiver != null && receiver.getClass() == targetClass;
    }

    public static Object dynamicGetSlowPath(CallSite callSite, String fieldName, Object receiver) throws Throwable {
      if (receiver == null)
        throw new NullPointerException("receiver is null");
      
      Class<?> receiverClass = receiver.getClass();
      
      MethodHandle getter;
      if (receiverClass.isArray()) {
        if (!fieldName.equals("length"))
          throw new LinkageError("no field "+fieldName+" defined on array "+receiverClass.getSimpleName());
        
        getter = getLength;
      } else {
        Field field;
        try {
          field = receiverClass.getField(fieldName);
        } catch (NoSuchFieldException e) {
          throw new LinkageError("no field "+fieldName+" defined in record "+receiverClass.getSimpleName());
        }
        getter = MethodHandles.lookup().unreflectGetter(field);
      } 
      
      callSite.setTarget(MethodHandles.guardWithTest(
          MethodHandles.insertArguments(test, 0, receiverClass),
          MethodHandles.convertArguments(getter, callSite.type()),
          callSite.getTarget()));
      
      return MethodHandles.invoke(getter, receiver);
    }
    
    public static void dynamicSetSlowPath(CallSite callSite, String fieldName, Object receiver, Object value) throws Throwable {
      if (receiver == null)
        throw new NullPointerException("receiver is null");
      
      Class<?> receiverClass = receiver.getClass();

      Field field;
      try {
        field = receiverClass.getField(fieldName);
      } catch (NoSuchFieldException e) {
        throw new LinkageError("no field "+fieldName+" defined in record "+receiverClass.getSimpleName());
      }

      MethodHandle setter = MethodHandles.lookup().unreflectSetter(field);
      callSite.setTarget(MethodHandles.guardWithTest(
          MethodHandles.dropArguments(
              MethodHandles.insertArguments(test, 0, receiverClass),
              1, callSite.type().parameterType(1)),
          MethodHandles.convertArguments(setter, callSite.type()),
          callSite.getTarget()));
      
      MethodHandles.invoke(setter, receiver, value);
    }
    
    private static final MethodHandle test;
    private static final MethodHandle dynamicGetSlowPath;
    private static final MethodHandle dynamicSetSlowPath;
    private static final MethodHandle getLength;
    static {
      test = MethodHandles.lookup().findStatic(FieldAccess.class, "test",
          MethodType.make(boolean.class, Class.class, Object.class));
      dynamicGetSlowPath = MethodHandles.lookup().findStatic(FieldAccess.class, "dynamicGetSlowPath",
          MethodType.make(Object.class, CallSite.class, String.class, Object.class));
      dynamicSetSlowPath = MethodHandles.lookup().findStatic(FieldAccess.class, "dynamicSetSlowPath",
          MethodType.make(void.class, CallSite.class, String.class, Object.class, Object.class));
      getLength = MethodHandles.lookup().findStatic(Array.class, "getLength",
          MethodType.make(int.class, Object.class));
    }
    
    public static CallSite bootstrapDynamicFieldGet(Class<?> caller, String fieldName, MethodType type) {
      CallSite callSite = new CallSite(caller, "__field_get__:"+fieldName, type);
      
      MethodHandle target = MethodHandles.insertArguments(dynamicGetSlowPath, 0, callSite, fieldName);
      target = MethodHandles.convertArguments(target, type);
      
      callSite.setTarget(target);
      return callSite;
    }
    
    public static CallSite bootstrapDynamicFieldSet(Class<?> caller, String fieldName, MethodType type) {
      CallSite callSite = new CallSite(caller, "__field_set__:"+fieldName, type);
      
      MethodHandle target = MethodHandles.insertArguments(dynamicSetSlowPath, 0, callSite, fieldName);
      target = MethodHandles.convertArguments(target, type);
      
      callSite.setTarget(target);
      return callSite;
    }
  }
  
  public static class ArrayAccess {
    public static CallSite bootstrapDynamicArrayGet(Class<?> caller, MethodType type) {
      MethodHandle dynamicGet = MethodHandles.lookup().findStatic(Array.class, "get",
          MethodType.make(Object.class, Object.class, int.class));
      dynamicGet = MethodHandles.convertArguments(dynamicGet, type);
      
      CallSite callSite = new CallSite(caller, "__array_get__", type);
      callSite.setTarget(dynamicGet);
      return callSite;
    }

    public static CallSite bootstrapDynamicArraySet(Class<?> caller, MethodType type) {
      MethodHandle dynamicSet = MethodHandles.lookup().findStatic(Array.class, "set",
          MethodType.make(void.class, Object.class, int.class, Object.class));
      dynamicSet = MethodHandles.convertArguments(dynamicSet, type);
      
      CallSite callSite = new CallSite(caller, "__array_set__", type);
      callSite.setTarget(dynamicSet);
      return callSite;
    }
  }
}
