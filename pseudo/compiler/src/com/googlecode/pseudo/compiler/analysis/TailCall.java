package com.googlecode.pseudo.compiler.analysis;

import java.util.HashSet;

import code.googlecode.pseudo.compiler.model.Invocation;
import code.googlecode.pseudo.compiler.model.Script;
import code.googlecode.pseudo.compiler.model.Functions.UserFunction;

import com.googlecode.pseudo.compiler.ast.Block;
import com.googlecode.pseudo.compiler.ast.ConditionalIf;
import com.googlecode.pseudo.compiler.ast.ConditionalIfElse;
import com.googlecode.pseudo.compiler.ast.Expr;
import com.googlecode.pseudo.compiler.ast.ExprPrimary;
import com.googlecode.pseudo.compiler.ast.Funcall;
import com.googlecode.pseudo.compiler.ast.Instr;
import com.googlecode.pseudo.compiler.ast.InstrBlock;
import com.googlecode.pseudo.compiler.ast.InstrConditional;
import com.googlecode.pseudo.compiler.ast.InstrFuncall;
import com.googlecode.pseudo.compiler.ast.InstrLoop;
import com.googlecode.pseudo.compiler.ast.InstrReturn;
import com.googlecode.pseudo.compiler.ast.Node;
import com.googlecode.pseudo.compiler.ast.PrimaryFuncall;
import com.googlecode.pseudo.compiler.ast.PrimaryPrimaryNoArrayCreation;
import com.googlecode.pseudo.compiler.ast.Visitor;

public class TailCall extends Visitor<Void, TailCallEnv, RuntimeException> {
  private final Script script;
  private final TypeCheck typeCheck;
  
  public TailCall(Script script, TypeCheck typeCheck) {
    this.script = script;
    this.typeCheck = typeCheck;
  }

  public void tailCall() {
    for(UserFunction function:script.getFunctionTable().items()) {
      tailCall(function);
    }
  }
  
  private void tailCall(UserFunction function) {
    TailCallEnv tailCallEnv = new TailCallEnv(function);
    tailCall(function.getBlock(), tailCallEnv);
    
    // if invocation is at the end of a void function block, no return needed 
    for(Invocation invocation:tailCallEnv.getInvocationSet()) {
      invocation.setTailCall();
    }
  }
  
  private Invocation getInvocation(Funcall funcall) {
    Invocation invocation = (Invocation)typeCheck.getSymbolMap().get(funcall);
    if (invocation.getFunction() == null)
      return null;
    return invocation;
  }
  
  private void tailCall(Node node, TailCallEnv tailCallEnv) {
    node.accept(this, tailCallEnv);
  }
  
  @Override
  protected Void visit(Node node, TailCallEnv tailCallEnv) {
    for(Node n:node.nodeList()) {
      if (n.isToken())
        continue;
      tailCall(n, tailCallEnv); 
    }
    return null;
  }
  
  /*
  @Override
  public Void visit(Block block, TailCallEnv tailCallEnv) {
    for(Instr instr:block.getInstrStar()) {
      tailCall(instr, tailCallEnv); 
    }
    return null;
  }*/
  
  @Override
  protected Void visit(Instr instr, TailCallEnv tailCallEnv) {
    tailCallEnv.clearInvocationSet();
    return null;
  }
  
  @Override
  public Void visit(InstrBlock instr_block, TailCallEnv tailCallEnv) {
    tailCall(instr_block.getBlock(), tailCallEnv);
    return null;
  }
  
  @Override
  public Void visit(InstrConditional instr_conditional, TailCallEnv tailCallEnv) {
    tailCall(instr_conditional.getConditional(), tailCallEnv);
    return null;
  }
  @Override
  public Void visit(ConditionalIf conditional_if, TailCallEnv tailCallEnv) {
    tailCallEnv.clearInvocationSet();
    tailCall(conditional_if.getBlock(), tailCallEnv);
    return null;
  }
  @Override
  public Void visit(ConditionalIfElse conditional_if_else, TailCallEnv tailCallEnv) {
    tailCallEnv.clearInvocationSet();
    
    HashSet<Invocation> invocationSet = new HashSet<Invocation>(); 
    TailCallEnv thenEnv = new TailCallEnv(tailCallEnv.getDeclaringFunction());
    tailCall(conditional_if_else.getBlock(), thenEnv);
    invocationSet.addAll(thenEnv.getInvocationSet());
    
    TailCallEnv elseEnv = new TailCallEnv(tailCallEnv.getDeclaringFunction());
    tailCall(conditional_if_else.getBlock2(), elseEnv);
    invocationSet.addAll(elseEnv.getInvocationSet());
    
    tailCallEnv.getInvocationSet().addAll(invocationSet);
    return null;
  }
  
  @Override
  public Void visit(InstrLoop instr_loop, TailCallEnv tailCallEnv) {
    tailCallEnv.clearInvocationSet();
    for(Node n: instr_loop.getLoop().nodeList()) {
      if (n instanceof Block) {
        tailCall(n, new TailCallEnv(tailCallEnv.getDeclaringFunction()));
      }
    }
    return null;
  }
  
  @Override
  public Void visit(InstrFuncall instr_funcall, TailCallEnv tailCallEnv) {
    tailCallEnv.clearInvocationSet();
    
    Invocation invocation = getInvocation(instr_funcall.getFuncall());
    if (invocation == null)
      return null;
    
    //if (invocation.getFunction() == tailCallEnv.getDeclaringFunction()) {
      tailCallEnv.addInvocation(invocation);
    //}
    return null;
  }
  
  @Override
  public Void visit(InstrReturn instr_return, TailCallEnv tailCallEnv) {
    Expr expr = instr_return.getExprOptional();
    if (expr != null) {
      tailCall(expr, tailCallEnv);
    } else {
      for(Invocation invocation:tailCallEnv.getInvocationSet()) {
        invocation.setTailCall();
      }
    }
    tailCallEnv.clearInvocationSet();
    return null;
  }
  
  @Override
  protected Void visit(Expr expr, TailCallEnv notUsed) {
    return null;
  }
  
  @Override
  public Void visit(PrimaryPrimaryNoArrayCreation primary_primary_no_array_creation, TailCallEnv tailCallEnv) {
    tailCall(primary_primary_no_array_creation.getPrimaryNoArrayCreation(), tailCallEnv);
    return null;
  }
  
  @Override
  public Void visit(ExprPrimary expr_primary, TailCallEnv tailCallEnv) {
    tailCall(expr_primary.getPrimary(), tailCallEnv);
    return null;
  }
  
  @Override
  public Void visit(PrimaryFuncall primary_funcall, TailCallEnv tailCallEnv) {
    Invocation invocation = getInvocation(primary_funcall.getFuncall());
    if (invocation == null)
      return null;
    
    //if (invocation.getFunction() == tailCallEnv.getDeclaringFunction()) {
      invocation.setTailCall();
    //}
    return null;
  }
}
