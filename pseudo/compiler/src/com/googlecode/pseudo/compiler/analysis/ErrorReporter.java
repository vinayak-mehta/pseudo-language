package com.googlecode.pseudo.compiler.analysis;

import com.googlecode.pseudo.compiler.ast.Node;

public interface ErrorReporter {
  enum ErrorKind {
    unknown_using ("unknown using %s"),
    unknown_type ("unknown type %s"), 
    unknown_function ("unknown function %s"),
    unknown_var ("unknown variable %s"),
    unknown_field ("unknown field %s"),
    unknown_record ("unknown record %s"),
    
    duplicate_field ("duplicate field %s"),
    dupricate_record ("duplicate record %s"),
    duplicate_function("duplicate function %s"),
    duplicate_member_variable("duplicate member variable %s"),
    duplicate_parameter("duplicate parameter %s"),
    duplicate_local_var("duplicate local variable %s"),
    
    scan_primitive ("scan only accept primitive type (infered type %s)"),
    typecheck_return ("try to return an incompatible type (infered type %s, expected type %s)"), 
    typecheck_assign ("try to assign an incompatible type (infered type %s, expected type %s)"),
    typecheck_call_arguments ("incompatible argument types (infered type %s, expected type %s)"), 
    typecheck_call_not_function ("can't use the function syntax on an expression that isn't a function type (infered type %s)"),
    typecheck_var_not_record_or_array ("can't use dot syntax on an expression that is neither a record nor an array (infered type %s)"),
    type_check_array_index ("incompatible expression type with an array index (infered type %s, expected type int)"),
    type_check_condition ("incompatible expression type with a condition (infered type %s, expected type boolean)"),
    type_check_operator ("no operator %s exist with the given signature %s"),
    type_check_not_testable ("type of the left operand %s is not testable with type of the right operand %s"),
    
    
    ;
    
    private final String message;
    
    private ErrorKind(String message) {
      this.message = message;
    }
    
    public String format(Object... args) {
      return String.format(message, args);
    }
  }
  
  public boolean isOnError();
  
  public void error(ErrorKind kind, Node node, Object... args);
  public void error(String message, long line, long column);
  public void warning(String message, long line, long column);
}
