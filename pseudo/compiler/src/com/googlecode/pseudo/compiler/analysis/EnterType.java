/**
 * 
 */
package com.googlecode.pseudo.compiler.analysis;

import java.util.ArrayList;

import com.googlecode.pseudo.compiler.Type;
import com.googlecode.pseudo.compiler.Scopes.Table;
import com.googlecode.pseudo.compiler.Types.ArrayType;
import com.googlecode.pseudo.compiler.Types.FunType;
import com.googlecode.pseudo.compiler.Types.PrimitiveType;
import com.googlecode.pseudo.compiler.analysis.ErrorReporter.ErrorKind;
import com.googlecode.pseudo.compiler.ast.DimsOptDims;
import com.googlecode.pseudo.compiler.ast.DimsOptEmpty;
import com.googlecode.pseudo.compiler.ast.DimsRecursive;
import com.googlecode.pseudo.compiler.ast.DimsSingleton;
import com.googlecode.pseudo.compiler.ast.Funtype;
import com.googlecode.pseudo.compiler.ast.Node;
import com.googlecode.pseudo.compiler.ast.PrimitiveTypeAny;
import com.googlecode.pseudo.compiler.ast.PrimitiveTypeBoolean;
import com.googlecode.pseudo.compiler.ast.PrimitiveTypeChar;
import com.googlecode.pseudo.compiler.ast.PrimitiveTypeDouble;
import com.googlecode.pseudo.compiler.ast.PrimitiveTypeInt;
import com.googlecode.pseudo.compiler.ast.PrimitiveTypeString;
import com.googlecode.pseudo.compiler.ast.ReturnTypeType;
import com.googlecode.pseudo.compiler.ast.ReturnTypeVoid;
import com.googlecode.pseudo.compiler.ast.TypeFuntype;
import com.googlecode.pseudo.compiler.ast.TypeFuntypeDims;
import com.googlecode.pseudo.compiler.ast.TypeId;
import com.googlecode.pseudo.compiler.ast.TypeIdDims;
import com.googlecode.pseudo.compiler.ast.TypePrimitive;
import com.googlecode.pseudo.compiler.ast.TypePrimitiveDims;
import com.googlecode.pseudo.compiler.ast.Visitor;

public class EnterType extends Visitor<Type, Table<Type>, RuntimeException> {
  private final ErrorReporter errorReporter;
  
  public EnterType(ErrorReporter errorReporter) {
    this.errorReporter = errorReporter;
  }
  
  public ErrorReporter getErrorReporter() {
    return errorReporter;
  }

  // helpers
  
  public Type arrayType(Type type, int dimension) {
    for(int i=0; i<dimension; i++) {
      type = new ArrayType(type);
    }
    return type;
  }
  
  public Type lookupType(Node node, Table<Type> typeTable, String name) {
    Type type = typeTable.lookup(name); 
    if (type == null) {
      errorReporter.error(ErrorKind.unknown_type, node, name);
      // error recovery
      return PrimitiveType.ANY;
    }
    return type;
  }
  
  // --- visit type
  
  public Type enterType(Node node, Table<Type> typeTable) {
    return node.accept(this, typeTable);
  }
  
  // ---
  
  @Override
  public Type visit(PrimitiveTypeBoolean primitiveTypeBoolean, Table<Type> typeTable) {
    return PrimitiveType.BOOLEAN;
  }
  @Override
  public Type visit(PrimitiveTypeChar primitiveTypeChar, Table<Type> typeTable) {
    return PrimitiveType.CHAR;
  }
  @Override
  public Type visit(PrimitiveTypeInt primitive_type_int, Table<Type> typeTable) {
    return PrimitiveType.INT;
  }
  @Override
  public Type visit(PrimitiveTypeDouble primitive_type_double, Table<Type> typeTable) {
    return PrimitiveType.DOUBLE;
  }
  @Override
  public Type visit(PrimitiveTypeString primitive_type_string, Table<Type> typeTable) {
    return PrimitiveType.STRING;
  }
  @Override
  public Type visit(PrimitiveTypeAny primitive_type_any, Table<Type> typeTable) {
    return PrimitiveType.ANY;
  }

  @Override
  public Type visit(Funtype funtype, Table<Type> typeTable) {
    Type returnType = enterType(funtype.getReturnType(), typeTable);
    ArrayList<Type> parameterTypes = new ArrayList<Type>();
    for(com.googlecode.pseudo.compiler.ast.Type type:funtype.getTypeStar()) {
      parameterTypes.add(enterType(type, typeTable));
    }
    return new FunType(returnType, parameterTypes);
  }

  @Override
  public Type visit(TypeId type_id, Table<Type> typeTable) {
    return lookupType(type_id, typeTable, type_id.getId().getValue());
  }

  @Override
  public Type visit(TypePrimitive type_primitive, Table<Type> typeTable) {
    return enterType(type_primitive.getPrimitiveType(), typeTable);
  }

  @Override
  public Type visit(TypeFuntype type_funtype, Table<Type> typeTable) {
    return enterType(type_funtype.getFuntype(), typeTable);
  }

  @Override
  public Type visit(TypeIdDims type_id_dims, Table<Type> typeTable) {
    Type type = lookupType(type_id_dims, typeTable, type_id_dims.getId().getValue());
    int dimension = dimension(type_id_dims.getDims());
    return arrayType(type, dimension);
  }

  @Override
  public Type visit(TypePrimitiveDims type_primitive_dims, Table<Type> typeTable) {
    Type type = enterType(type_primitive_dims.getPrimitiveType(), typeTable);
    int dimension = dimension(type_primitive_dims.getDims());
    return arrayType(type, dimension);
  }

  @Override
  public Type visit(TypeFuntypeDims type_funtype_dims, Table<Type> typeTable) {
    Type type = enterType(type_funtype_dims.getFuntype(), typeTable);
    int dimension = dimension(type_funtype_dims.getDims());
    return arrayType(type, dimension);
  }
  
  
  // --- return type
  
  @Override
  public Type visit(ReturnTypeType returnTypeType, Table<Type> typeTable) {
    return enterType(returnTypeType.getType(), typeTable);
  }
  
  @Override
  public Type visit(ReturnTypeVoid returnTypeVoid, Table<Type> typeTable) {
    return PrimitiveType.VOID;
  }
  
  
  // --- dimension visitor
  
  public int dimension(Node node) {
    //XXX: bug in javac: this unecessary cast is needed
    return (Integer)node.accept(dimensionVisitor, null);
  }
  
  private final Visitor<Integer, Void, RuntimeException> dimensionVisitor =
    new Visitor<Integer, Void, RuntimeException>() {
    
    @Override
    public Integer visit(DimsOptDims dims_opt_dims, Void notUsed) {
      return dimension(dims_opt_dims.getDims());
    }
    @Override
    public Integer visit(DimsOptEmpty dims_opt_empty, Void notUsed) {
      return 0;
    }
    @Override
    public Integer visit(DimsRecursive dims_recursive, Void notUsed) {
      return 1 + dimension(dims_recursive.getDims());
    }
    @Override
    public Integer visit(DimsSingleton dims_singleton, Void notUsed) {
      return 1;
    }
  };
}