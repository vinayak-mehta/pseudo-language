package com.googlecode.pseudo.compiler.model;

import java.util.ArrayList;


import com.googlecode.pseudo.compiler.Type;
import com.googlecode.pseudo.compiler.Scopes.Table;
import com.googlecode.pseudo.compiler.Types.FunType;
import com.googlecode.pseudo.compiler.ast.Block;
import com.googlecode.pseudo.compiler.ast.Expr;
import com.googlecode.pseudo.compiler.model.Vars.MemberVar;
import com.googlecode.pseudo.compiler.model.Vars.ParameterVar;

public class Functions {
  public static abstract class AbstractFunction implements Function {
    private final FunType type;
    
    public AbstractFunction(FunType type) {
      this.type = type;
    }

    @Override
    public FunType getType() {
      return type;
    }
  }
  
  public static abstract class NamedFunction extends AbstractFunction implements MemberVar {
    private final String name;
    
    public NamedFunction(String name, FunType type) {
      super(type);
      this.name = name;
    }

    @Override
    public String getName() {
      return name;
    }
    
    public abstract /*maybenull*/String getOwnerClassName();
    
    @Override
    public boolean isReadOnly() {
      return false;
    }
    
    @Override
    public String toString() {
      return getName()+getType();
    }
  }
  
  public static class Builtin extends NamedFunction {
    private final String ownerClassName;

    public Builtin(String name, FunType funType, String ownerClassName) {
      super(name, funType);
      this.ownerClassName = ownerClassName;
    }

    @Override
    public String getOwnerClassName() {
      return ownerClassName;
    }
  }
  
  static FunType extractFunctionType(Table<ParameterVar> parameterTable, Type returnType) {
    ArrayList<Type> parameterTypes = new ArrayList<Type>();
    for(ParameterVar parameter:parameterTable.items()) {
      parameterTypes.add(parameter.getType());
    }
    return new FunType(returnType, parameterTypes);
  }
  
  public static class UserFunction extends NamedFunction {
    private final Table<ParameterVar> parameterTable;
    private final Block block;
    
    public UserFunction(String name, Table<ParameterVar> parameterTable, Type returnType, Block block) {
      super(name, extractFunctionType(parameterTable, returnType));
      this.parameterTable = parameterTable;
      this.block = block;
    }

    public Table<ParameterVar> getParameterTable() {
      return parameterTable;
    }
    public Block getBlock() {
      return block;
    }
    
    @Override
    public String getOwnerClassName() {
      return null;
    }
  }
  
  public static class Lambda extends AbstractFunction {
    private final Table<ParameterVar> parameterTable;
    private final Expr expr;
    
    public Lambda(Table<ParameterVar> parameterTable, Type returnType, Expr expr) {
      super(extractFunctionType(parameterTable, returnType));
      this.parameterTable = parameterTable;
      this.expr = expr;
    }
    
    public Table<ParameterVar> getParameterTable() {
      return parameterTable;
    }
    public Expr getExpr() {
      return expr;
    }
    
    @Override
    public String toString() {
      return "lambda"+getType();
    }
  }
}
