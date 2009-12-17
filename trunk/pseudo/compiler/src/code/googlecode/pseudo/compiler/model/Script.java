package code.googlecode.pseudo.compiler.model;

import java.util.ArrayList;

import code.googlecode.pseudo.compiler.model.Functions.Builtin;
import code.googlecode.pseudo.compiler.model.Functions.UserFunction;
import code.googlecode.pseudo.compiler.model.Vars.MemberVar;

import com.googlecode.pseudo.compiler.Type;
import com.googlecode.pseudo.compiler.Scopes.Scope;
import com.googlecode.pseudo.compiler.Scopes.Table;
import com.googlecode.pseudo.compiler.ast.Block;
import com.googlecode.pseudo.compiler.ast.Instr;

public class Script {
  private final String scriptName;
  private final String scriptFileName;
  
  private final Table<Type> typeTable =
    new Table<Type>();
  private final Table<Builtin> usingTable =
    new Table<Builtin>();
  private final Table<Record> recordScope =
    new Table<Record>();
  private final Table<UserFunction> functionTable =
    new Table<UserFunction>();
  private final Table<Constant> constantTable =
    new Table<Constant>();
  
  Scope<MemberVar, ? extends MemberVar> globalScope;
  
  private final Block mainBlock =
    new Block(new ArrayList<Instr>());
  
  public Script(String scriptName, String scriptFileName) {
    this.scriptName = scriptName;
    this.scriptFileName = scriptFileName;
  }
  
  public String getScriptName() {
    return scriptName;
  }
  public String getScriptFileName() {
    return scriptFileName;
  }
  
  public Table<Type> getTypeTable() {
    return typeTable;
  }
  public Table<Builtin> getUsingTable() {
    return usingTable;
  }
  public Table<Record> getRecordTable() {
    return recordScope;
  }
  public Table<UserFunction> getFunctionTable() {
    return functionTable;
  }
  public Table<Constant> getConstantTable() {
    return constantTable;
  }
  
  public Scope<MemberVar, ? extends MemberVar> getGlobalScope() {
    return globalScope;
  }
  public void setGlobalScope(Scope<MemberVar, ? extends MemberVar> memberVarScope) {
    this.globalScope = memberVarScope;
  }
  
  public Block getMainBlock() {
    return mainBlock;
  }
}
