package code.googlecode.pseudo.compiler.model;

import java.util.ArrayList;

import code.googlecode.pseudo.compiler.model.Functions.NamedFunction;
import code.googlecode.pseudo.compiler.model.Functions.UserFunction;

import com.googlecode.pseudo.compiler.Type;
import com.googlecode.pseudo.compiler.Scopes.Scope;
import com.googlecode.pseudo.compiler.Scopes.Table;
import com.googlecode.pseudo.compiler.ast.Block;
import com.googlecode.pseudo.compiler.ast.Instr;

public class Script {
  private final String scriptName;
  private final Table<Type> typeScope =
    new Table<Type>();
  private final Table<Record> recordScope =
    new Table<Record>();
  private final Scope<NamedFunction, UserFunction> functionScope =
    new Scope<NamedFunction, UserFunction>(
      new Table<UserFunction>(), null);
  
  private final Block mainBlock =
    new Block(new ArrayList<Instr>());
  
  public Script(String scriptName) {
    this.scriptName = scriptName;
  }
  
  public String getScriptName() {
    return scriptName;
  }
  
  public Table<Type> getTypeTable() {
    return typeScope;
  }
  public Table<Record> getRecordTable() {
    return recordScope;
  }
  public Scope<NamedFunction, UserFunction> getFunctionScope() {
    return functionScope;
  }
  
  public Block getMainBlock() {
    return mainBlock;
  }
}
