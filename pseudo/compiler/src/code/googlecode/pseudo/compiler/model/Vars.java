package code.googlecode.pseudo.compiler.model;

import com.googlecode.pseudo.compiler.Type;
import com.googlecode.pseudo.compiler.Types.PrimitiveType;

public class Vars {
  static abstract class AbstractVar implements Var {
    private final String name;
    
    public AbstractVar(String name) {
      this.name = name;
    }
    
    public String getName() {
      return name;
    }
    
    @Override
    public String toString() {
      return String.valueOf(getType())+' '+getName();
    }
  }
  
  public static class LocalVar extends AbstractVar {
    private final Type type;
    
    public LocalVar(Type type, String name) {
      super(name);
      this.type = type;
    }
    
    @Override
    public Type getType() {
      return type;
    }
    
    public boolean isReadOnly() {
      return false;
    }
  }
  
  public static class ParameterVar extends LocalVar {
    public ParameterVar(Type type, String name) {
      super(type, name);
    }
    
    @Override
    public boolean isReadOnly() {
      return true;
    }
  }
  
  public static class ArrayVar implements Var {
    private final Type componentType;
    
    public ArrayVar(Type componentType) {
      this.componentType = componentType;
    }

    @Override
    public Type getType() {
      return componentType;
    }

    @Override
    public boolean isReadOnly() {
      return false;
    }

    @Override
    public String getName() {
      return "<array>";
    }    
    
    @Override
    public String toString() {
      return String.valueOf(getType())+' '+getName();
    }
  }
  
  public static class AnyVar implements Var {
    private AnyVar() { 
      // enforce singleton
    }
    
    public static final AnyVar INSTANCE = new AnyVar();
    
    @Override
    public Type getType() {
      return PrimitiveType.ANY;
    }

    @Override
    public boolean isReadOnly() {
      return false;
    }
    
    @Override
    public String getName() {
      return "<any>";
    }
    
    @Override
    public String toString() {
      return String.valueOf(getType())+' '+getName();
    }
  }
}
