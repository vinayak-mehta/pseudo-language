package com.googlecode.pseudo.compiler.gen;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.URI;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Queue;

import javax.tools.JavaFileManager;
import javax.tools.SimpleJavaFileObject;
import javax.tools.JavaFileObject.Kind;

import code.googlecode.pseudo.compiler.model.Constant;
import code.googlecode.pseudo.compiler.model.Invocation;
import code.googlecode.pseudo.compiler.model.Record;
import code.googlecode.pseudo.compiler.model.Script;
import code.googlecode.pseudo.compiler.model.Symbol;
import code.googlecode.pseudo.compiler.model.Functions.NamedFunction;
import code.googlecode.pseudo.compiler.model.Functions.UserFunction;
import code.googlecode.pseudo.compiler.model.Vars.ParameterVar;

import com.googlecode.pseudo.compiler.LocationMap;
import com.googlecode.pseudo.compiler.Type;
import com.googlecode.pseudo.compiler.LocationMap.Location;
import com.googlecode.pseudo.compiler.Types.ArrayType;
import com.googlecode.pseudo.compiler.Types.FunType;
import com.googlecode.pseudo.compiler.Types.PrimitiveType;
import com.googlecode.pseudo.compiler.analysis.ErrorReporter;
import com.googlecode.pseudo.compiler.analysis.TypeCheck;
import com.googlecode.pseudo.compiler.ast.Arguments;
import com.googlecode.pseudo.compiler.ast.ArrayAccessId;
import com.googlecode.pseudo.compiler.ast.ArrayAccessPrimary;
import com.googlecode.pseudo.compiler.ast.ArrayCreationPrimitive;
import com.googlecode.pseudo.compiler.ast.ArrayCreationRecord;
import com.googlecode.pseudo.compiler.ast.Assignation;
import com.googlecode.pseudo.compiler.ast.Block;
import com.googlecode.pseudo.compiler.ast.ConditionalIf;
import com.googlecode.pseudo.compiler.ast.ConditionalIfElse;
import com.googlecode.pseudo.compiler.ast.ConstDef;
import com.googlecode.pseudo.compiler.ast.DeclarationId;
import com.googlecode.pseudo.compiler.ast.DeclarationIdInit;
import com.googlecode.pseudo.compiler.ast.DimExpr;
import com.googlecode.pseudo.compiler.ast.Expr;
import com.googlecode.pseudo.compiler.ast.ExprBooleanLiteral;
import com.googlecode.pseudo.compiler.ast.ExprCharLiteral;
import com.googlecode.pseudo.compiler.ast.ExprId;
import com.googlecode.pseudo.compiler.ast.ExprNullLiteral;
import com.googlecode.pseudo.compiler.ast.ExprPrimary;
import com.googlecode.pseudo.compiler.ast.ExprStringLiteral;
import com.googlecode.pseudo.compiler.ast.ExprValueLiteral;
import com.googlecode.pseudo.compiler.ast.Field;
import com.googlecode.pseudo.compiler.ast.FieldAccessId;
import com.googlecode.pseudo.compiler.ast.FieldAccessPrimary;
import com.googlecode.pseudo.compiler.ast.ForLoopIncr;
import com.googlecode.pseudo.compiler.ast.ForLoopIncrAssignation;
import com.googlecode.pseudo.compiler.ast.ForLoopIncrFuncall;
import com.googlecode.pseudo.compiler.ast.ForLoopInit;
import com.googlecode.pseudo.compiler.ast.ForLoopInitAssignation;
import com.googlecode.pseudo.compiler.ast.ForLoopInitDeclaration;
import com.googlecode.pseudo.compiler.ast.ForLoopInitFuncall;
import com.googlecode.pseudo.compiler.ast.FuncallId;
import com.googlecode.pseudo.compiler.ast.FuncallPrimary;
import com.googlecode.pseudo.compiler.ast.FunctionDef;
import com.googlecode.pseudo.compiler.ast.FunctionRtype;
import com.googlecode.pseudo.compiler.ast.IdToken;
import com.googlecode.pseudo.compiler.ast.InstrAssignation;
import com.googlecode.pseudo.compiler.ast.InstrBlock;
import com.googlecode.pseudo.compiler.ast.InstrBreak;
import com.googlecode.pseudo.compiler.ast.InstrConditional;
import com.googlecode.pseudo.compiler.ast.InstrContinue;
import com.googlecode.pseudo.compiler.ast.InstrDeclaration;
import com.googlecode.pseudo.compiler.ast.InstrFuncall;
import com.googlecode.pseudo.compiler.ast.InstrLoop;
import com.googlecode.pseudo.compiler.ast.InstrPrint;
import com.googlecode.pseudo.compiler.ast.InstrReturn;
import com.googlecode.pseudo.compiler.ast.InstrScan;
import com.googlecode.pseudo.compiler.ast.InstrThrow;
import com.googlecode.pseudo.compiler.ast.Lhs;
import com.googlecode.pseudo.compiler.ast.LhsArrayAccess;
import com.googlecode.pseudo.compiler.ast.LhsFieldAccess;
import com.googlecode.pseudo.compiler.ast.LhsId;
import com.googlecode.pseudo.compiler.ast.LoopDowhile;
import com.googlecode.pseudo.compiler.ast.LoopFor;
import com.googlecode.pseudo.compiler.ast.LoopLabel;
import com.googlecode.pseudo.compiler.ast.LoopWhile;
import com.googlecode.pseudo.compiler.ast.Node;
import com.googlecode.pseudo.compiler.ast.Parameter;
import com.googlecode.pseudo.compiler.ast.ParameterTyped;
import com.googlecode.pseudo.compiler.ast.Parameters;
import com.googlecode.pseudo.compiler.ast.Primary;
import com.googlecode.pseudo.compiler.ast.PrimaryAllocation;
import com.googlecode.pseudo.compiler.ast.PrimaryArrayAccess;
import com.googlecode.pseudo.compiler.ast.PrimaryArrayCreation;
import com.googlecode.pseudo.compiler.ast.PrimaryFieldAccess;
import com.googlecode.pseudo.compiler.ast.PrimaryFuncall;
import com.googlecode.pseudo.compiler.ast.PrimaryNoArrayCreation;
import com.googlecode.pseudo.compiler.ast.PrimaryParens;
import com.googlecode.pseudo.compiler.ast.PrimaryPrimaryNoArrayCreation;
import com.googlecode.pseudo.compiler.ast.RecordDef;
import com.googlecode.pseudo.compiler.ast.RecordInit;
import com.googlecode.pseudo.compiler.ast.ScriptMember;
import com.googlecode.pseudo.compiler.ast.ScriptMemberBlock;
import com.googlecode.pseudo.compiler.ast.ScriptMemberConstDef;
import com.googlecode.pseudo.compiler.ast.ScriptMemberFunctionDef;
import com.googlecode.pseudo.compiler.ast.ScriptMemberRecordDef;
import com.googlecode.pseudo.compiler.ast.Start;
import com.googlecode.pseudo.compiler.ast.Visitor;
import com.googlecode.pseudo.compiler.parser.PseudoProductionEnum;
import com.googlecode.pseudo.runtime.Runtimes;
import com.googlecode.pseudo.runtime.lib.IO;
import com.sun.tools.javac.code.Flags;
import com.sun.tools.javac.code.TypeTags;
import com.sun.tools.javac.comp.AttrContext;
import com.sun.tools.javac.comp.Env;
import com.sun.tools.javac.comp.Todo;
import com.sun.tools.javac.file.JavacFileManager;
import com.sun.tools.javac.main.JavaCompiler;
import com.sun.tools.javac.tree.JCTree;
import com.sun.tools.javac.tree.Pretty;
import com.sun.tools.javac.tree.TreeMaker;
import com.sun.tools.javac.tree.JCTree.JCAnnotation;
import com.sun.tools.javac.tree.JCTree.JCBlock;
import com.sun.tools.javac.tree.JCTree.JCCatch;
import com.sun.tools.javac.tree.JCTree.JCClassDecl;
import com.sun.tools.javac.tree.JCTree.JCCompilationUnit;
import com.sun.tools.javac.tree.JCTree.JCExpression;
import com.sun.tools.javac.tree.JCTree.JCExpressionStatement;
import com.sun.tools.javac.tree.JCTree.JCFieldAccess;
import com.sun.tools.javac.tree.JCTree.JCIdent;
import com.sun.tools.javac.tree.JCTree.JCLiteral;
import com.sun.tools.javac.tree.JCTree.JCMethodDecl;
import com.sun.tools.javac.tree.JCTree.JCMethodInvocation;
import com.sun.tools.javac.tree.JCTree.JCModifiers;
import com.sun.tools.javac.tree.JCTree.JCNewClass;
import com.sun.tools.javac.tree.JCTree.JCStatement;
import com.sun.tools.javac.tree.JCTree.JCTry;
import com.sun.tools.javac.tree.JCTree.JCTypeParameter;
import com.sun.tools.javac.tree.JCTree.JCVariableDecl;
import com.sun.tools.javac.util.Context;
import com.sun.tools.javac.util.List;
import com.sun.tools.javac.util.ListBuffer;
import com.sun.tools.javac.util.Name;
import com.sun.tools.javac.util.Names;
import com.sun.tools.javac.util.Options;
import com.sun.tools.javac.util.Position;

public class Gen extends Visitor<JCTree, GenEnv, RuntimeException> {
  private final Script script;
  private final ErrorReporter errorReporter;
  private final LocationMap locationMap;
  private final TypeCheck typeCheck;
  
  private final Context context;
  private final SimpleJavaFileObject sourceFile;
  private final TreeMaker maker;
  private final Names names;
  
  private final HashSet<String> functionLiteralSet =
    new HashSet<String>();
  private final ListBuffer<JCTree> functionLiteralBuffer =
    ListBuffer.lb();
  
  private static final String RUNTIME_CLASS = Runtimes.class.getName();
  private static final String IO_CLASS = IO.class.getName();
  
  public Gen(final Script script, ErrorReporter errorReporter, LocationMap locationMap, TypeCheck typeCheck) {
    this.script = script;
    this.errorReporter = errorReporter;
    this.locationMap = locationMap;
    this.typeCheck = typeCheck;
    
    this.context=new Context();
    
    // gen generate indy bytecode
    Options.instance(context).put("invokedynamic",  "invokedynamic");
    
    // fake source object, needed by enter pass
    sourceFile = new SimpleJavaFileObject(URI.create(""), Kind.OTHER) {
      @Override
      public Reader openReader(boolean ignoreEncodingErrors) {
        throw new UnsupportedOperationException();
      }
      @Override
      public Writer openWriter() {
        throw new UnsupportedOperationException();
      }
      
      @Override
      public String toString() {
        return script.getScriptName();
      }
    };
    
    // create a redirection log
    new RedirectionLog(context, sourceFile, errorReporter);
    
    // if fileManager not already set, register the JavacFileManager to be used
    if (context.get(JavaFileManager.class) == null)
        JavacFileManager.preRegister(context);
    
    this.maker=TreeMaker.instance(context);
    this.names=Names.instance(context);
  }
  
  // --- 
  
  Name nameFromString(String name) {
    return names.fromString(name);
  }
  
  JCExpression identifier(Node node, String name) {
    return maker(node).Ident(nameFromString(name));
  }
  
  JCExpression qualifiedIdentifier(Node node, String name) {
    String[] names = name.split("\\.");
    JCExpression type = identifier(node, names[0]);
    for(int i=1; i<names.length; i++) {
      type = maker(node).Select(type, nameFromString(names[i]));
    }
    return type;
  }
  
  JCExpression asType(Node node, Type type) {
    if (type instanceof PrimitiveType) {
      switch((PrimitiveType)type) {
      case BOOLEAN:
        return maker(node).TypeIdent(TypeTags.BOOLEAN);
      case CHAR:
        return maker(node).TypeIdent(TypeTags.CHAR);
      case INT:
        return maker(node).TypeIdent(TypeTags.INT);
      case DOUBLE:
        return maker(node).TypeIdent(TypeTags.DOUBLE);
      case STRING:
        return qualifiedIdentifier(node, "java.lang.String");
      case VOID:
        return maker(node).TypeIdent(TypeTags.VOID);  
      case NULL:
      case ANY:
        return qualifiedIdentifier(node, "java.lang.Object");
      }
      throw new AssertionError("unknown primitive type "+type);
    }
    if (type instanceof ArrayType) {
      return maker(node).TypeArray(asType(node, ((ArrayType)type).getComponentType()));
    }
    if (type instanceof FunType) {
      return qualifiedIdentifier(node, "java.dyn.MethodHandle");
    }
    if (type instanceof Record) {
      Record record = (Record)type;
      return identifier(node, record.getName());
    }
    throw new AssertionError("unknown type "+type);
  }
  
  
  
  JCExpression asBoxedType(Node node, Type type) {
    if (type instanceof PrimitiveType) {
      switch((PrimitiveType)type) {
      case BOOLEAN:
        return qualifiedIdentifier(node, "java.lang.Boolean");
      case CHAR:
        return qualifiedIdentifier(node, "java.lang.Character");
      case INT:
        return qualifiedIdentifier(node, "java.lang.Integer");
      case DOUBLE:
        return qualifiedIdentifier(node, "java.lang.Double");
      case STRING:
        return qualifiedIdentifier(node, "java.lang.String");
      case ANY:
        return qualifiedIdentifier(node, "java.lang.Object");
      default:
      }
      throw new AssertionError("invalid primitive type "+type);
    }
    return asType(node, type);
  }
  
  private JCExpression asType(Node node) {
    Type type = typeCheck.getTypeMap().get(node);
    if (type == null)
      throw new AssertionError("no type for node "+node);
    return asType(node, type);
  }
  
  private JCModifiers modifiers(Node node, long flags) {
    return maker(node).Modifiers(flags);
  }
  
  // --- javac tree maker
  
  TreeMaker maker(Node node) {
    Location location = locationMap.getLocation(node);
    if (location == null) {
      throw new AssertionError("no location for node "+node.getClass().getName());
    }
    
    return maker.at(Position.encodePosition(1+location.getLine(), 1+location.getColumn()));
  }
  
  
  // -- dynamic cast
  
  JCExpression retype(Node lhsNode, Node rhsNode, JCExpression expr) {
    Type lhsType = typeCheck.getTypeMap().get(lhsNode);
    Type rhsType = typeCheck.getTypeMap().get(rhsNode);
    return retype(lhsType, rhsNode, rhsType, expr);
  }
  
  private JCExpression retype(Type lhsType, Node rhsNode, JCExpression expr) {
    Type rhsType = typeCheck.getTypeMap().get(rhsNode);
    return retype(lhsType, rhsNode, rhsType, expr);
  }
  
  private JCExpression retype(Type lhsType, Node rhsNode, Type rhsType, JCExpression expr) {
    if (lhsType == null || rhsType == null)
      throw new AssertionError("retype "+lhsType+" "+rhsType+" rhsNode "+rhsNode);
    
    if (lhsType != PrimitiveType.ANY && rhsType == PrimitiveType.ANY) {
      // dynamic cast
      JCFieldAccess method = maker(rhsNode).Select(qualifiedIdentifier(rhsNode, "java.dyn.InvokeDynamic"), nameFromString("__cast__"));
      return maker(rhsNode).Apply(List.of(asType(rhsNode, lhsType)), method, List.of(expr));
    }
    return expr;
  }
  
  private List<JCExpression> retypeAll(java.util.List<Expr> exprStar, java.util.List<Type> parameterTypes, List<JCExpression> exprs) {
    Iterator<Expr> nodeIterator = exprStar.iterator();
    Iterator<Type> typeIterator = parameterTypes.iterator();
    Iterator<JCExpression> expressionIterator = exprs.iterator();
    ListBuffer<JCExpression> buffer=ListBuffer.lb();
    while(nodeIterator.hasNext()) {
      Expr node = nodeIterator.next();
      Type nodeType = typeCheck.getTypeMap().get(node);
      Type type = typeIterator.next();
      JCExpression expression = expressionIterator.next();
      buffer.append(retype(type, node, nodeType, expression));
    }
    return buffer.toList();
  }
  
  
  // --- helpers
  
  private JCTree gen(Node node, GenEnv genEnv) {
    return node.accept(this, genEnv);
  }
  
  <T extends JCTree> T gen(Node node, Class<T> tClass, GenEnv genEnv) {
    return tClass.cast(gen(node, genEnv));
  }
  
  
  private <T extends JCTree> List<T> genAllSubNodes(java.util.List<? extends Node> nodeList, Class<T> tClass, Type expectedType) {
    return genAllSubNodes(nodeList, tClass, Collections.<Type>nCopies(nodeList.size(), expectedType));
  }
  
  private <T extends JCTree> List<T> genAllSubNodes(java.util.List<? extends Node> nodeList, Class<T> tClass, java.util.List<Type> expectedTypes) {
    assert nodeList.size() == expectedTypes.size();
    
    ListBuffer<T> buffer = ListBuffer.lb();
    Iterator<Type> expectedTypeIt = expectedTypes.iterator();
    for(Node subNode:nodeList) {
      Type expectedType = expectedTypeIt.next();
      JCTree result = gen(subNode, new GenEnv(expectedType));
      if (result != null)
        buffer.append(tClass.cast(result));
    }
    return buffer.toList();
  }
  
  
  
  // --- default visit
  
  /*@Override
  protected JCTree visit(Node node, GenEnv genEnv) {
    genAllSubNodes(node, genEnv);
    return null;
  }*/
  
// --- entry point
  
  public void gen(Start start) throws IOException {
    JavaCompiler compiler=new JavaCompiler(context);
    Todo todo=Todo.instance(context);
    
    JCCompilationUnit compilationUnit=genCompilationUnit(start);
    compilationUnit.sourcefile=sourceFile;
    
    Queue<Env<AttrContext>> queue;
    try {
      // enter, attribute and flow
      compiler.enterTrees(List.of(compilationUnit));
      queue = compiler.flow(compiler.attribute(todo));

    } catch(RuntimeException e) {
      System.err.println("javac tree attribution crash ...");
      debug(compilationUnit);
      throw e;
    }
    
    // report errors
    compiler.reportDeferredDiagnostics();
    
    // debug
    if (errorReporter.isOnError()) {
      debug(compilationUnit);
    }
    
    // generate code if no error
    if (!errorReporter.isOnError()) {
      compiler.generate(compiler.desugar(queue));
    }
  }
  
  private void debug(JCCompilationUnit compilationUnit) throws IOException {
    OutputStreamWriter writer = new OutputStreamWriter(System.out);
    try {
      new Pretty(writer, false).printUnit(compilationUnit, null);
      writer.flush();
    } finally {
      writer.close();
    }
  }
  
  private JCCompilationUnit genCompilationUnit(Start start) {
    GenEnv genEnv = new GenEnv(null);
    
    // gen records and functions
    ListBuffer<JCTree> memberBuffer = ListBuffer.lb(); 
    for(ScriptMember scriptMember:start.getScriptMemberStar()) {
      JCTree member = gen(scriptMember, genEnv);
      if (member == null) { // if it's a block, skip it
        continue;
      }
      memberBuffer.append(member);
    }
    
    // gen main block
    JCBlock mainBlock = gen(script.getMainBlock(), JCBlock.class, genEnv);
    
    JCVariableDecl args = maker(start).VarDef(modifiers(start, Flags.FINAL),
        nameFromString("ARGS"),
        asType(start, new ArrayType(PrimitiveType.STRING)),
        null);
    
    JCMethodDecl main = maker(start).MethodDef(modifiers(start, Flags.PUBLIC|Flags.STATIC|Flags.FINAL),
        nameFromString("main"),
        asType(start, PrimitiveType.VOID),
        List.<JCTypeParameter>nil(),
        List.of(args),
        List.of(qualifiedIdentifier(start, "java.lang.Throwable")),
        mainBlock,
        null);
    memberBuffer.append(main);
    memberBuffer.appendList(functionLiteralBuffer);
    
    ListBuffer<JCStatement> constBuffer = ListBuffer.lb();
    for(Constant constant:script.getConstantTable().items()) {
      ConstDef constDef = constant.getConstDef();
      
      JCExpression expression = gen(constDef.getExpr(), JCExpression.class, new GenEnv(constant.getType()));
      constBuffer.append(
          maker(constDef).Exec(
              maker(constDef).Assign(identifier(constDef, constant.getName()), expression)));
    }
    
    memberBuffer.append(genStaticBlock(start, constBuffer.toList()));
    
    JCClassDecl topLevelClass = maker(start).ClassDef(modifiers(start, 0),
        nameFromString(script.getScriptName()),
        List.<JCTypeParameter>nil(),
        null,
        List.<JCExpression>nil(),
        memberBuffer.toList());
    
    return maker(start).TopLevel(List.<JCAnnotation>nil(), null, List.<JCTree>of(topLevelClass));
  }
  
  private JCBlock genStaticBlock(Node node, List<JCStatement> instrList) {
    JCFieldAccess runtimesClass = maker(node).Select(qualifiedIdentifier(node, RUNTIME_CLASS), names._class);
    JCStatement registerBootstrapInstr = maker(node).Exec(
        maker(node).Apply(List.<JCExpression>nil(),
            maker(node).Select(qualifiedIdentifier(node, "java.dyn.Linkage"),
                nameFromString("registerBootstrapMethod")),
                           List.<JCExpression>of(runtimesClass,
                               maker(node).Literal(
                               TypeTags.CLASS,
                               "bootstrapMethod"))));
    
    List<JCStatement> instrs;
    if (!instrList.isEmpty()) {
      JCStatement stat = maker(node).Throw(
          maker(node).Apply(List.<JCExpression>nil(),
              maker(node).Select(qualifiedIdentifier(node, RUNTIME_CLASS),
                  nameFromString("escapeThrow")),
                  List.<JCExpression>of(identifier(node, "t"))));

      JCCatch _catch = maker(node).Catch(
          maker(node).VarDef(modifiers(node, 0),
              nameFromString("t"),
              qualifiedIdentifier(node, "java.lang.Throwable"),
              null),
              maker(node).Block(0, List.of(stat))
      );

      JCTry _try = maker(node).Try(
          maker(node).Block(0, instrList),
          List.of(_catch),
          null);
      
      instrs = List.of(registerBootstrapInstr, _try);
    } else {
      instrs = List.of(registerBootstrapInstr);
    }
    
    return maker(node).Block(Flags.STATIC, instrs);
  }
  
  
  // --- top level members
  
  @Override
  public JCTree visit(ScriptMemberRecordDef scriptMemberRecordDef, GenEnv genEnv) {
    return gen(scriptMemberRecordDef.getRecordDef(), genEnv);
  }
  @Override
  public JCTree visit(ScriptMemberFunctionDef scriptMemberFunctionDef, GenEnv genEnv) {
    return gen(scriptMemberFunctionDef.getFunctionDef(), genEnv);
  }
  @Override
  public JCTree visit(ScriptMemberConstDef scriptMemberConstDef, GenEnv genEnv) {
    return gen(scriptMemberConstDef.getConstDef(), genEnv);
  }
  @Override
  public JCTree visit(ScriptMemberBlock scriptMemberBlock, GenEnv param) {
    // member blocks are generated via the main block
    return null;
  }
  
  @Override
  public JCTree visit(RecordDef recordDef, GenEnv  genEnv) {
    String recordName = recordDef.getId().getValue();
    
    JCModifiers mods=maker(recordDef).Modifiers(Flags.PUBLIC|Flags.STATIC);
    Name name=nameFromString(recordName);
    List<JCTree> members = genAllSubNodes(recordDef.getFieldStar(), JCTree.class, PrimitiveType.VOID);
    
    // generate init
    Record record = script.getRecordTable().lookup(recordName);
    RecordInit initOptional = recordDef.getRecordInitOptional();
    JCTree initFunction;
    if (initOptional == null) {
      initFunction = genUserFunction(recordDef, true, record.getInitFunction(), null, null, genEnv);
    } else {
      initFunction = genUserFunction(initOptional, true, record.getInitFunction(), initOptional.getParameters(), null, genEnv);
      members = members.prepend(genStaticBlock(recordDef, List.<JCStatement>nil()));
    }
    members = members.prepend(initFunction);
    
    return maker(recordDef).ClassDef(mods, name, List.<JCTypeParameter>nil(), null, List.<JCExpression>nil(), members);
  }
  
  private JCTree genUserFunction(Node functionNode, boolean constructor, UserFunction function, /*maybenull*/Parameters parameters, /*maybenull*/Node returnTypeNode, GenEnv genEnv) {
    JCModifiers mods=modifiers(functionNode, (constructor)?0:Flags.PUBLIC|Flags.STATIC);
    
    JCExpression returnType;
    if (constructor) {
      returnType = null;
    } else {
      FunType functionType = function.getType();
      returnType = asType((returnTypeNode==null)?functionNode:returnTypeNode, functionType.getReturnType());
    }
    
    ListBuffer<JCVariableDecl> parameterBuffer = ListBuffer.lb();
    Iterator<Parameter> parameterIterator = (parameters!=null)?parameters.getParameterStar().iterator():null;
    for(ParameterVar parameterVar:function.getParameterTable().items()) {
      Node parameter = (parameterIterator!=null)?parameterIterator.next():functionNode;
      parameterBuffer.append(genParameter(parameter, parameterVar));
    }
    
    JCBlock block = gen(function.getBlock(), JCBlock.class, genEnv);
    
    return maker(functionNode).MethodDef(mods,
        constructor?names.init:nameFromString(function.getName()),
        returnType,
        List.<JCTypeParameter>nil(),
        parameterBuffer.toList(),
        List.of(qualifiedIdentifier(functionNode, "java.lang.Throwable")),
        block,
        null);
  }
  
  private JCVariableDecl genParameter(Node parameter, ParameterVar parameterVar) {
    Name name = nameFromString(parameterVar.getName());
    Node typeNode = (parameter instanceof ParameterTyped)?((ParameterTyped)parameter).getId():parameter;
    return maker(parameter).VarDef(modifiers(parameter, Flags.FINAL),
        name, asType(typeNode, parameterVar.getType()), null);
  }
  
  @Override
  public JCTree visit(FunctionDef functionDef, GenEnv genEnv) {
    String functionName = functionDef.getId().getValue();
    UserFunction function = script.getFunctionTable().lookup(functionName);
    FunctionRtype functionRtypeOptional = functionDef.getFunctionRtypeOptional();
    Node returnTypeNode = (functionRtypeOptional==null)?functionDef:functionRtypeOptional;
    return genUserFunction(functionDef, false, function, functionDef.getParameters(), returnTypeNode, genEnv);
  }
  
  @Override
  public JCTree visit(ConstDef constDef, GenEnv genEnv) {
    String name = constDef.getId().getValue();
    Constant constant = script.getConstantTable().lookup(name);
    
    // Initialization of constant fields is done when generating the static block
    // during generation of compilation unit
    return maker(constDef).VarDef(modifiers(constDef, Flags.PRIVATE|Flags.STATIC|Flags.FINAL),
        nameFromString(name),
        asType(constDef, constant.getType()),
        null);
  }
  
  @Override
  public JCTree visit(Field field, GenEnv genEnv) {
    JCExpression type = asType(field);
    return maker(field).VarDef(modifiers(field, Flags.PUBLIC),
        nameFromString(field.getId().getValue()), type, null);
  }
  
  
  // --- instructions
  
  @Override
  public JCTree visit(Block block, GenEnv genEnv) {
    List<JCStatement> instructions = genAllSubNodes(block.getInstrStar(), JCStatement.class, PrimitiveType.VOID);
    return maker(block).Block(0, instructions);
  }
  
  @Override
  public JCTree visit(InstrBlock instrBlock, GenEnv genEnv) {
    return gen(instrBlock.getBlock(), genEnv);
  }
  
  @Override
  public JCTree visit(InstrDeclaration instrDeclaration, GenEnv genEnv) {
    return gen(instrDeclaration.getDeclaration(), genEnv);
  }
  @Override
  public JCTree visit(InstrAssignation instrAssignation, GenEnv genEnv) {
    return gen(instrAssignation.getAssignation(), genEnv);
  }
  
  @Override
  public JCTree visit(InstrBreak instrBreak, GenEnv genEnv) {
    Name label = null;
    IdToken idOptional = instrBreak.getIdOptional();
    if (idOptional != null) {
      label = nameFromString(idOptional.getValue());
    }
    return maker(instrBreak).Break(label);
  }
  @Override
  public JCTree visit(InstrContinue instrContinue, GenEnv genEnv) {
    Name label = null;
    IdToken idOptional = instrContinue.getIdOptional();
    if (idOptional != null) {
      label = nameFromString(idOptional.getValue());
    }
    return maker(instrContinue).Continue(label);
  }
  
  @Override
  public JCTree visit(InstrReturn instrReturn, GenEnv genEnv) {
    JCExpression expr = null;
    Expr exprOptional = instrReturn.getExprOptional();
    if (exprOptional != null) {
      // get expected function return type
      Type functionReturnType = typeCheck.getTypeMap().get(instrReturn);
      expr = gen(exprOptional, JCExpression.class, new GenEnv(functionReturnType));
      
      expr = retype(instrReturn, exprOptional, expr);
    }
    return maker(instrReturn).Return(expr);
  }
  
  // --- 
  
  @Override
  public JCTree visit(InstrPrint instrPrint, GenEnv genEnv) {
    JCExpression expr = gen(instrPrint.getExpr(), JCExpression.class, new GenEnv(PrimitiveType.ANY));
    JCFieldAccess println = maker(instrPrint).Select(qualifiedIdentifier(instrPrint, "System.out"),
        nameFromString("println"));
    return maker(instrPrint).Exec(
        maker(instrPrint).Apply(List.<JCExpression>nil(), println, List.of(expr)));
  }
  
  @Override
  public JCTree visit(InstrScan instrScan, GenEnv genEnv) {
    Lhs lhsNode = instrScan.getLhs();
    Type lhsType = typeCheck.getTypeMap().get(lhsNode);
    String scannerFunction = "next"+lhsType.getName();
    
    JCFieldAccess scanner = maker(instrScan).Select(qualifiedIdentifier(instrScan, IO_CLASS), nameFromString("scanner"));
    JCMethodInvocation scannerExpr = maker(instrScan).Apply(List.<JCExpression>nil(), scanner, List.<JCExpression>nil());
    JCFieldAccess next = maker(lhsNode).Select(scannerExpr, nameFromString(scannerFunction));
    JCMethodInvocation nextExpr = maker(lhsNode).Apply(List.<JCExpression>nil(), next, List.<JCExpression>nil());
    
    // declaration or assignation
    if (typeCheck.getAutoDeclarationSet().contains(lhsNode)) {
      LhsId lhsId = (LhsId)lhsNode;
      return maker(instrScan).VarDef(modifiers(instrScan, 0),
          nameFromString(lhsId.getId().getValue()),
          asType(instrScan),
          nextExpr);
    }
    
    JCExpression assign = genLhs(lhsNode, new LhsGenEnv(PrimitiveType.ANY, instrScan, nextExpr));
    return maker(instrScan).Exec(assign);  
    
  }
  
  @Override
  public JCTree visit(InstrThrow instrThrow, GenEnv genEnv) {
    Expr exprNode = instrThrow.getExpr();
    JCExpression expr = gen(exprNode, JCExpression.class, new GenEnv(PrimitiveType.ANY));
    
    JCNewClass newClass = maker(exprNode).NewClass(null, List.<JCExpression>nil(),
        qualifiedIdentifier(exprNode, "java.lang.AssertionError"),
        List.of(expr),
        null);
    return maker(instrThrow).Throw(newClass);
  }
  
  // --- conditional
  
  @Override
  public JCTree visit(InstrConditional instrConditional, GenEnv genEnv) {
    return gen(instrConditional.getConditional(), genEnv);
  }
  @Override
  public JCTree visit(ConditionalIf conditionalIf, GenEnv genEnv) {
    JCExpression condition = gen(conditionalIf.getExpr(), JCExpression.class, new GenEnv(PrimitiveType.BOOLEAN));
    condition = retype(PrimitiveType.BOOLEAN, conditionalIf.getExpr(), condition);
    JCBlock block = gen(conditionalIf.getBlock(), JCBlock.class, genEnv);
    
    return maker(conditionalIf).If(condition, block, null);
  }
  @Override
  public JCTree visit(ConditionalIfElse conditionalIfElse, GenEnv genEnv) {
    JCExpression condition = gen(conditionalIfElse.getExpr(), JCExpression.class, new GenEnv(PrimitiveType.BOOLEAN));
    condition = retype(PrimitiveType.BOOLEAN, conditionalIfElse.getExpr(), condition);
    JCBlock thenPart = gen(conditionalIfElse.getBlock(), JCBlock.class, genEnv);
    JCBlock elsePart = gen(conditionalIfElse.getBlock2(), JCBlock.class, genEnv);
    
    return maker(conditionalIfElse).If(condition, thenPart, elsePart);
  }
  
  
  // --- loop
  
  @Override
  public JCTree visit(InstrLoop instrLoop, GenEnv genEnv) {
    JCStatement loop = gen(instrLoop.getLoop(), JCStatement.class, genEnv);
    
    LoopLabel labelOptional = instrLoop.getLoopLabelOptional();
    if (labelOptional != null) {
      String label = labelOptional.getId().getValue();
      return maker(labelOptional).Labelled(nameFromString(label), loop);
    }
    return loop;
  }
  
  @Override
  public JCTree visit(LoopDowhile loopDowhile, GenEnv genEnv) {
    JCBlock block = gen(loopDowhile.getBlock(), JCBlock.class, genEnv); 
    JCExpression condition = gen(loopDowhile.getExpr(), JCExpression.class, new GenEnv(PrimitiveType.BOOLEAN));
    condition = retype(PrimitiveType.BOOLEAN, loopDowhile.getExpr(), condition);
    
    return maker(loopDowhile).DoLoop(block, condition);
  }
  
  @Override
  public JCTree visit(LoopWhile loopWhile, GenEnv genEnv) {
    JCBlock block = gen(loopWhile.getBlock(), JCBlock.class, genEnv); 
    JCExpression condition = gen(loopWhile.getExpr(), JCExpression.class, new GenEnv(PrimitiveType.BOOLEAN));
    condition = retype(PrimitiveType.BOOLEAN, loopWhile.getExpr(), condition);
    
    return maker(loopWhile).WhileLoop(condition, block);
  }
  
  @Override
  public JCTree visit(LoopFor loopFor, GenEnv genEnv) {
    List<JCStatement> init = List.nil();
    ForLoopInit initOptional = loopFor.getForLoopInitOptional();
    if (initOptional != null) {
      init = List.of(gen(initOptional, JCStatement.class, new GenEnv(PrimitiveType.VOID)));
    }
    
    JCExpression condition = null;
    Expr exprOptional = loopFor.getExprOptional();
    if (exprOptional != null) {
      condition = gen(exprOptional, JCExpression.class, new GenEnv(PrimitiveType.BOOLEAN));
      condition = retype(PrimitiveType.BOOLEAN, loopFor.getExprOptional(), condition);
    }
    
    List<JCExpressionStatement> incr = List.nil();
    ForLoopIncr incrOptional = loopFor.getForLoopIncrOptional();
    if (incrOptional != null) {
      incr = List.of(gen(incrOptional, JCExpressionStatement.class, new GenEnv(PrimitiveType.VOID)));
    }
     
    JCBlock block = gen(loopFor.getBlock(), JCBlock.class, genEnv); 
    
    return maker(loopFor).ForLoop(init, condition, incr, block);
  }
  
  @Override
  public JCTree visit(ForLoopInitAssignation forLoopInitAssignation, GenEnv genEnv) {
    return gen(forLoopInitAssignation.getAssignation(), genEnv);
  }
  @Override
  public JCTree visit(ForLoopInitDeclaration forLoopInitDeclaration, GenEnv genEnv) {
    return gen(forLoopInitDeclaration.getDeclaration(), genEnv);
  }
  @Override
  public JCTree visit(ForLoopInitFuncall forLoopInitFuncall, GenEnv genEnv) {
    return maker(forLoopInitFuncall).Exec(gen(forLoopInitFuncall.getFuncall(), JCExpression.class, genEnv));
  }
  
  @Override
  public JCTree visit(ForLoopIncrAssignation forLoopIncrAssignation, GenEnv genEnv) {
    return gen(forLoopIncrAssignation.getAssignation(), genEnv);
  }
  @Override
  public JCTree visit(ForLoopIncrFuncall forLoopIncrFuncall, GenEnv genEnv) {
    // loop increment is an expression statement
    return maker(forLoopIncrFuncall).Exec(gen(forLoopIncrFuncall.getFuncall(), JCExpression.class, genEnv));
  }
  
  // --- declaration/assignation
  
  @Override
  public JCTree visit(DeclarationId declarationId, GenEnv genEnv) {
    String name = declarationId.getId().getValue();
    return maker(declarationId).VarDef(modifiers(declarationId, 0),
        nameFromString(name),
        asType(declarationId),
        null);
  }
  
  @Override
  public JCTree visit(DeclarationIdInit declarationIdInit, GenEnv genEnv) {
    JCExpression expr = gen(declarationIdInit.getExpr(), JCExpression.class, new GenEnv(PrimitiveType.ANY));
    String name = declarationIdInit.getId().getValue();
    return maker(declarationIdInit).VarDef(modifiers(declarationIdInit, 0),
        nameFromString(name),
        asType(declarationIdInit),
        retype(declarationIdInit, declarationIdInit.getExpr(), expr));
  }
  
  @Override
  public JCTree visit(Assignation assignation, GenEnv genEnv) {
    Lhs lhsNode = assignation.getLhs();
    Type lhsType = typeCheck.getTypeMap().get(lhsNode);
    JCExpression rhs = gen(assignation.getExpr(), JCExpression.class, new GenEnv(lhsType));
    
    // declaration ?
    if (typeCheck.getAutoDeclarationSet().contains(lhsNode)) {
      String name = ((LhsId)lhsNode).getId().getValue();
      return maker(assignation).VarDef(modifiers(assignation, 0),
          nameFromString(name),
          asType(assignation, PrimitiveType.ANY),
          rhs);
    }
    
    // lhs nodes will do the assignation
    return maker(assignation).Exec(
        genLhs(lhsNode, new LhsGenEnv(genEnv.getExpectedReturnType(), assignation, rhs)));
  }
  
  
  // --- lhs
  
  JCExpression genLhs(Node node, LhsGenEnv genEnv) {
    return (JCExpression)node.accept(lhsVisitor, genEnv);
  }
  
  static class LhsGenEnv extends GenEnv {
    final JCExpression rhs;
    final Node assignation;
    
    public LhsGenEnv(Type expectedReturnType, Node assignation, JCExpression rhs) {
      super(expectedReturnType);
      this.assignation = assignation;
      this.rhs = rhs;
    }
  }
  
  private final Visitor<JCTree, LhsGenEnv, RuntimeException> lhsVisitor =
    new Visitor<JCTree, LhsGenEnv, RuntimeException>() {
      @Override
      public JCTree visit(LhsId lhsId, LhsGenEnv genEnv) {
        String name = lhsId.getId().getValue();
        JCIdent ident = maker(lhsId).Ident(nameFromString(name));
        
        Node assignation = genEnv.assignation;
        Node expr = assignation.nodeList().get(assignation.nodeList().size() - 1);
        return maker(assignation).Assign(ident, retype(lhsId, expr, genEnv.rhs));
      }
    
      @Override
      public JCTree visit(LhsFieldAccess lhs_field_access, LhsGenEnv genEnv) {
         return genLhs(lhs_field_access.getFieldAccess(), genEnv);
      }
      @Override
      public JCTree visit(FieldAccessId fieldAccessId, LhsGenEnv genEnv) {
        IdToken selectNode = fieldAccessId.getId();
        String name = selectNode.getValue();
        JCIdent ident = maker(selectNode).Ident(nameFromString(name));
        return genFieldAccess(fieldAccessId, ident, selectNode, fieldAccessId.getId2().getValue(), genEnv.assignation, genEnv.rhs, genEnv);
      }
      @Override
      public JCTree visit(FieldAccessPrimary fieldAccessPrimary, LhsGenEnv genEnv) {
        Primary selectNode = fieldAccessPrimary.getPrimary();
        JCExpression primary = gen(selectNode, JCExpression.class, genEnv);
        return genFieldAccess(fieldAccessPrimary, primary, selectNode, fieldAccessPrimary.getId().getValue(), genEnv.assignation, genEnv.rhs, genEnv);
      }
    
      @Override
      public JCTree visit(LhsArrayAccess lhsArrayAccess, LhsGenEnv genEnv) {
        return genLhs(lhsArrayAccess.getArrayAccess(), genEnv);
      }
      @Override
      public JCTree visit(ArrayAccessId arrayAccessId, LhsGenEnv genEnv) {
        IdToken indexableNode = arrayAccessId.getId();
        JCExpression indexable = identifier(indexableNode, indexableNode.getValue());
        JCExpression index = gen(arrayAccessId.getExpr(), JCExpression.class, new GenEnv(PrimitiveType.INT));
        return genArrayAccess(arrayAccessId, indexable, indexableNode, index, genEnv.assignation, genEnv.rhs, genEnv);
      }
      @Override
      public JCTree visit(ArrayAccessPrimary arrayAccessPrimary, LhsGenEnv genEnv) {
        PrimaryNoArrayCreation indexableNode = arrayAccessPrimary.getPrimaryNoArrayCreation();
        JCExpression indexable = gen(indexableNode, JCExpression.class, genEnv);
        JCExpression index = gen(arrayAccessPrimary.getExpr(), JCExpression.class, new GenEnv(PrimitiveType.INT));
        return genArrayAccess(arrayAccessPrimary, indexable, indexableNode, index, genEnv.assignation, genEnv.rhs, genEnv);
      }
  };
  
  
  @Override
  public JCTree visit(PrimaryArrayAccess primaryArrayAccess, GenEnv genEnv) {
    return gen(primaryArrayAccess.getArrayAccess(), genEnv);
  }
  
  JCTree genArrayAccess(Node node, JCExpression indexable, Node indexableNode, JCExpression index, /*maybenull*/Node assignation, /*maybenull*/JCExpression rhs, GenEnv genEnv) {
    Type type = typeCheck.getTypeMap().get(indexableNode);
    if (type == PrimitiveType.ANY) {
      
      // try to adjust the return type to the expected return type
      Type expectedReturnType = genEnv.getExpectedReturnType();
      if (expectedReturnType != PrimitiveType.ANY) {
        type = expectedReturnType;
        // fix computed type
        typeCheck.getTypeMap().put(node, type);
      }
      
      String protocol;
      List<JCExpression> args;
      if (rhs == null) {
        args = List.of(indexable, index);
        protocol = "__array_get__";
      } else {
        Node expr = assignation.nodeList().get(assignation.nodeList().size() - 1);
        args = List.of(indexable, index, retype(node, expr, rhs));
        protocol = "__array_set__";
      }
      
      JCFieldAccess method = maker(node).Select(qualifiedIdentifier(node, "java.dyn.InvokeDynamic"), nameFromString(protocol));
      return maker(node).Apply(List.of(asType(node, type)), method, args); 
    }
    
    JCExpression lhs = maker(node).Indexed(indexable, index);
    if (rhs == null)
      return lhs;
    
    return maker(node).Assign(lhs, retype(node, assignation.nodeList().get(0), rhs));
  }
  
  @Override
  public JCTree visit(ArrayAccessId arrayAccessId, GenEnv genEnv) {
    IdToken indexableNode = arrayAccessId.getId();
    JCExpression indexable = identifier(indexableNode, indexableNode.getValue());
    JCExpression index = gen(arrayAccessId.getExpr(), JCExpression.class, new GenEnv(PrimitiveType.INT));
    return genArrayAccess(arrayAccessId, indexable, indexableNode, index, null, null, genEnv);
  }
  
  @Override
  public JCTree visit(ArrayAccessPrimary arrayAccessPrimary, GenEnv genEnv) {
    PrimaryNoArrayCreation indexableNode = arrayAccessPrimary.getPrimaryNoArrayCreation();
    JCExpression indexable = gen(indexableNode, JCExpression.class, genEnv);
    JCExpression index = gen(arrayAccessPrimary.getExpr(), JCExpression.class, new GenEnv(PrimitiveType.INT));
    return genArrayAccess(arrayAccessPrimary, indexable, indexableNode, index, null, null, genEnv);
  }
  
  
  @Override
  public JCTree visit(PrimaryFieldAccess primaryFieldAccess, GenEnv genEnv) {
    return gen(primaryFieldAccess.getFieldAccess(), genEnv);
  }
  
  JCTree genFieldAccess(Node node, JCExpression select, Node selectNode, String fieldName, /*maybenull*/Node assignation, /*maybenull*/JCExpression rhs, GenEnv genEnv) {
    Type type = typeCheck.getTypeMap().get(selectNode);
    if (type == PrimitiveType.ANY) {
      
      // try to adjust the return type to the expected return type
      Type expectedReturnType = genEnv.getExpectedReturnType();
      if (expectedReturnType != PrimitiveType.ANY) {
        type = expectedReturnType;
        // fix computed type
        typeCheck.getTypeMap().put(node, type);
      }
      
      String protocol;
      List<JCExpression> args;
      if (rhs == null) {
        args = List.of(select);
        protocol = "__field_get__:";
      } else {
        Node expr = assignation.nodeList().get(assignation.nodeList().size() - 1);
        args = List.of(select, retype(node, expr, rhs));
        protocol = "__field_set__:";
      }
      
      JCFieldAccess method = maker(node).Select(qualifiedIdentifier(node, "java.dyn.InvokeDynamic"), nameFromString(protocol+fieldName));
      return maker(node).Apply(List.of(asType(node, type)), method, args); 
    }
    
    JCExpression lhs = maker(node).Select(select, nameFromString(fieldName));
    if (rhs == null)
      return lhs;
    
    return maker(node).Assign(lhs, retype(node, assignation.nodeList().get(0), rhs));
  }
  
  @Override
  public JCTree visit(FieldAccessId fieldAccessId, GenEnv genEnv) {
    IdToken selectNode = fieldAccessId.getId();
    JCExpression select = identifier(selectNode, selectNode.getValue());
    return genFieldAccess(fieldAccessId, select, selectNode, fieldAccessId.getId2().getValue(), null, null, genEnv);
  }
  
  @Override
  public JCTree visit(FieldAccessPrimary fieldAccessPrimary, GenEnv genEnv) {
    Primary selectNode = fieldAccessPrimary.getPrimary();
    JCExpression select = gen(selectNode, JCExpression.class, genEnv);
    return genFieldAccess(fieldAccessPrimary, select, selectNode, fieldAccessPrimary.getId().getValue(), null, null, genEnv);
  }
  
  @Override
  public JCTree visit(PrimaryParens primaryParens, GenEnv genEnv) {
   return gen(primaryParens.getExpr(), genEnv);
  }
  
  
  // --- funcall
  
  @Override
  public JCTree visit(PrimaryFuncall primaryFuncall, GenEnv genEnv) {
    return gen(primaryFuncall.getFuncall(), genEnv);
  }
  @Override
  public JCTree visit(InstrFuncall instrFuncall, GenEnv genEnv) {
    return maker(instrFuncall).Exec(gen(instrFuncall.getFuncall(), JCExpression.class, genEnv));
  }
  
  
  private JCTree genInvocation(Node invocationNode, boolean constructor, JCExpression funExpr, Arguments arguments, GenEnv genEnv) {
    Invocation invocation = (Invocation)typeCheck.getSymbolMap().get(invocationNode);
    FunType funType = invocation.getFunType();
    
    // try to adjust the return type to the expected return type
    Type returnType = funType.getReturnType();
    Type expectedReturnType = genEnv.getExpectedReturnType();
    if (returnType == PrimitiveType.ANY && expectedReturnType != PrimitiveType.ANY) {
      returnType = expectedReturnType;
      // fix computed type
      typeCheck.getTypeMap().put(invocationNode, returnType);
    }
    
    java.util.List<Expr> exprStar = arguments.getExprStar();
    List<JCExpression> args = genAllSubNodes(exprStar, JCExpression.class, funType.getParameterTypes());
    args = retypeAll(exprStar, funType.getParameterTypes(), args);
    
    NamedFunction function = invocation.getFunction();
    if (function == null) {
      assert (!constructor);
      // cast is needed because backport doesn't support java.dyn classes in indy signature
      args = args.prepend(
          maker(invocationNode).TypeCast(qualifiedIdentifier(invocationNode, "java.lang.Object"), funExpr));
      
      JCFieldAccess method = maker(invocationNode).Select(qualifiedIdentifier(invocationNode, "java.dyn.InvokeDynamic"), nameFromString("__call__"));
      return maker(invocationNode).Apply(List.of(asType(invocationNode, returnType)), method, args);
    } else {
      if (constructor)
        return maker(invocationNode).NewClass(null, List.<JCExpression>nil(), funExpr, args, null);
      
      // prepend the owner class name for builtin
      String ownerClassName = function.getOwnerClassName();
      if (ownerClassName != null) {
         funExpr = maker(invocationNode).Select(qualifiedIdentifier(invocationNode, ownerClassName),
             ((JCIdent)funExpr).getName());
      }
      return maker(invocationNode).Apply(List.<JCExpression>nil(), funExpr, args);
    }
  }
  
  @Override
  public JCTree visit(FuncallId funcallId, GenEnv genEnv) {
    String name = funcallId.getId().getValue();
    JCExpression funExpr = identifier(funcallId.getId(), name);
    return genInvocation(funcallId, false, funExpr, funcallId.getArguments(), genEnv);
  }

  @Override
  public JCTree visit(FuncallPrimary funcallPrimary, GenEnv genEnv) {
    JCExpression funExpr = gen(funcallPrimary.getPrimary(), JCExpression.class, genEnv);
    return genInvocation(funcallPrimary, false, funExpr, funcallPrimary.getArguments(), genEnv);
  }
  
  
  // --- primary
  
  @Override
  public JCTree visit(PrimaryPrimaryNoArrayCreation primaryPrimaryNoArrayCreation, GenEnv genEnv) {
    return gen(primaryPrimaryNoArrayCreation.getPrimaryNoArrayCreation(), genEnv);
  }
  
  @Override
  public JCTree visit(PrimaryAllocation primaryAllocation, GenEnv genEnv) {
    IdToken primaryAllocationId = primaryAllocation.getId();
    JCExpression classId = identifier(primaryAllocationId, primaryAllocationId.getValue());
    return genInvocation(primaryAllocation, true, classId, primaryAllocation.getArguments(), genEnv);
  }
  
  @Override
  public JCTree visit(PrimaryArrayCreation primaryArrayCreation, GenEnv genEnv) {
    return gen(primaryArrayCreation.getArrayCreation(), genEnv);
  }
  
  private Type componentType(Type type, int dimension) {
    for(int i=0; i<dimension; i++) {
      ArrayType arrayType = (ArrayType)type;
      type = arrayType.getComponentType();
    }
    return type;
  }
  
  @Override
  public JCTree visit(ArrayCreationPrimitive arrayCreationPrimitive, GenEnv genEnv) {
    Type type = typeCheck.getTypeMap().get(arrayCreationPrimitive);
    type = componentType(type, arrayCreationPrimitive.getDimExprPlus().size());
    JCExpression elemtype = asType(arrayCreationPrimitive,type);
    
    List<JCExpression> dims = genAllSubNodes(arrayCreationPrimitive.getDimExprPlus(), JCExpression.class, PrimitiveType.INT);
    return maker(arrayCreationPrimitive).NewArray(elemtype, dims, null);
  }
  
  @Override
  public JCTree visit(ArrayCreationRecord arrayCreationRecord, GenEnv genEnv) {
    Type type = typeCheck.getTypeMap().get(arrayCreationRecord);
    type = componentType(type, arrayCreationRecord.getDimExprPlus().size());
    JCExpression elemtype = asType(arrayCreationRecord,type);
    
    List<JCExpression> dims = genAllSubNodes(arrayCreationRecord.getDimExprPlus(), JCExpression.class, PrimitiveType.INT);
    return maker(arrayCreationRecord).NewArray(elemtype, dims, null);
  }
  
  @Override
  public JCTree visit(DimExpr dimExpr, GenEnv genEnv) {
    return gen(dimExpr.getExpr(), genEnv);
  }
  
  // --- expression
  
  @Override
  public JCTree visit(ExprBooleanLiteral exprBooleanLiteral, GenEnv unused) {
    return maker(exprBooleanLiteral).Literal(
        TypeTags.BOOLEAN,
        exprBooleanLiteral.getBooleanLiteral().getValue()?1:0);
  }
  
  @Override
  public JCTree visit(ExprCharLiteral exprCharLiteral, GenEnv unused) {
    return maker(exprCharLiteral).Literal(
        TypeTags.CHAR,
        (int)exprCharLiteral.getCharLiteral().getValue());
  }
  
  @Override
  public JCTree visit(ExprValueLiteral exprValueLiteral, GenEnv unused) {
    Object value = exprValueLiteral.getValueLiteral().getValue();
    return maker(exprValueLiteral).Literal((value instanceof Integer)?TypeTags.INT:TypeTags.DOUBLE,value);
  }
  
  @Override
  public JCTree visit(ExprStringLiteral exprStringLiteral, GenEnv unused) {
    return maker(exprStringLiteral).Literal(
        TypeTags.CLASS,
        exprStringLiteral.getStringLiteral().getValue());
  }
  
  @Override
  public JCTree visit(ExprNullLiteral exprNullLiteral, GenEnv unused) {
    return maker(exprNullLiteral).Literal(
        TypeTags.BOT,
        null);
  }
  
  private JCExpression asClassLiteral(Node node, Type type) {
    return maker(node).Select(asType(node, type), names._class);
  }
  
  @Override
  public JCTree visit(ExprId exprId, GenEnv genEnv) {
    String name = exprId.getId().getValue();
    Type type = typeCheck.getTypeMap().get(exprId);
    Symbol symbol = typeCheck.getSymbolMap().get(exprId);
    
    if (type instanceof FunType &&
        symbol instanceof NamedFunction &&
        !functionLiteralSet.contains(name)) {
      FunType funType = (FunType)type;
      
      JCFieldAccess lookup = maker(exprId).Select(
          qualifiedIdentifier(exprId, "java.dyn.MethodHandles"),
          nameFromString("lookup"));
      JCExpression lookupApply = maker(exprId).Apply(List.<JCExpression>nil(), lookup, List.<JCExpression>nil());
      
      
      ListBuffer<JCExpression> argsBuffer = ListBuffer.lb();
      argsBuffer.append(asClassLiteral(exprId, funType.getReturnType()));
      for(Type parameterType: funType.getParameterTypes()) {
        argsBuffer.append(asClassLiteral(exprId, parameterType));
      }
      
      JCFieldAccess methodTypeMake = maker(exprId).Select(
          qualifiedIdentifier(exprId, "java.dyn.MethodType"),
          nameFromString("make"));
      JCExpression methodTypeMakeApply = maker(exprId).Apply(List.<JCExpression>nil(), methodTypeMake, argsBuffer.toList());
      
      JCFieldAccess findStatic = maker(exprId).Select(
          lookupApply,
          nameFromString("findStatic"));
      
      
      NamedFunction function = (NamedFunction)symbol;
      String ownerName = function.getOwnerClassName();
      if (ownerName == null) {
        ownerName = script.getScriptName();
      }
      
      JCFieldAccess currentClass = maker(exprId).Select(identifier(exprId, ownerName), names._class);
      JCLiteral nameLit = maker(exprId).Literal(TypeTags.CLASS,name);
      JCExpression init = maker(exprId).Apply(List.<JCExpression>nil(), findStatic, List.of(currentClass, nameLit, methodTypeMakeApply));
      
      JCTree functionLiteral = maker(exprId).VarDef(
          modifiers(exprId, Flags.PRIVATE|Flags.STATIC|Flags.FINAL),
          nameFromString(name),
          qualifiedIdentifier(exprId, "java.dyn.MethodHandle"),
          init);
      
      functionLiteralBuffer.append(functionLiteral);
      functionLiteralSet.add(name);
    }
    return maker(exprId).Ident(nameFromString(name));
  }
  
  @Override
  public JCTree visit(ExprPrimary exprPrimary, GenEnv genEnv) {
    return gen(exprPrimary.getPrimary(), genEnv);
  }
  
  
  
  static class Operator {
    final int opcode;
    final String name;
    
    public Operator(int opcode, String name) {
      this.opcode = opcode;
      this.name = name;
    }
  }
  
  private static final EnumMap<PseudoProductionEnum, Operator> exprOperatorMap;
  static {
    EnumMap<PseudoProductionEnum, Operator> map =
      new EnumMap<PseudoProductionEnum, Operator>(PseudoProductionEnum.class);
    
    // unary
    map.put(PseudoProductionEnum.expr_neg, new Operator(JCTree.NOT, "!"));
    map.put(PseudoProductionEnum.expr_unary_minus, new Operator(JCTree.NEG, "-"));
    map.put(PseudoProductionEnum.expr_unary_plus, new Operator(JCTree.POS, "+"));
    
    // binary
    map.put(PseudoProductionEnum.expr_eq, new Operator(JCTree.EQ, "=="));
    map.put(PseudoProductionEnum.expr_ne, new Operator(JCTree.NE, "!="));
    map.put(PseudoProductionEnum.expr_band, new Operator(JCTree.AND, "&&"));
    map.put(PseudoProductionEnum.expr_bor, new Operator(JCTree.OR, "||"));
    
    map.put(PseudoProductionEnum.expr_gt, new Operator(JCTree.GT, ">"));
    map.put(PseudoProductionEnum.expr_ge, new Operator(JCTree.GE, ">="));
    map.put(PseudoProductionEnum.expr_lt, new Operator(JCTree.LT, "<"));
    map.put(PseudoProductionEnum.expr_le, new Operator(JCTree.LE, "<="));
    
    map.put(PseudoProductionEnum.expr_minus, new Operator(JCTree.MINUS, "-"));
    map.put(PseudoProductionEnum.expr_plus, new Operator(JCTree.PLUS, "+"));
    map.put(PseudoProductionEnum.expr_star, new Operator(JCTree.MUL, "*"));
    map.put(PseudoProductionEnum.expr_slash, new Operator(JCTree.DIV, "/"));
    map.put(PseudoProductionEnum.expr_mod, new Operator(JCTree.MOD, "%"));
    
    exprOperatorMap = map;
  }
  
  private JCExpression staticExpression(Expr expr, Operator operator, JCExpression left, JCExpression right) {
    PseudoProductionEnum kind = expr.getKind();
    TreeMaker treeMaker = maker(expr);
    int opcode = operator.opcode;
    
    // unary
    switch(kind) {
      case expr_neg:
      case expr_unary_minus:
      case expr_unary_plus:
        return treeMaker.Unary(opcode, left);
      default:
    }
    
    // binary
    switch(kind) {
      case expr_eq:
      case expr_ne:
      case expr_band:
      case expr_bor:
    
      case expr_gt:
      case expr_ge:
      case expr_lt:
      case expr_le:
        
      case expr_plus:
      case expr_minus:
      case expr_star:
      case expr_slash:
      case expr_mod:
        return treeMaker.Binary(opcode, left, right);  
      default:
    }
    throw new AssertionError("Unknown staticExpression "+kind);
  }
  
  @Override
  protected JCTree visit(Expr expr, GenEnv genEnv) {
    java.util.List<Node> nodeList = expr.nodeList();
    int size = nodeList.size();
    
    Node leftNode = nodeList.get(0);
    Type leftType = typeCheck.getTypeMap().get(leftNode);
    boolean isDynamic = leftType == PrimitiveType.ANY;
    JCExpression left = gen(leftNode, JCExpression.class, new GenEnv(leftType));
    Node rightNode = null;
    JCExpression right = null;
    Type rightType = null;
    if (size == 2) {
      rightNode = nodeList.get(nodeList.size() - 1);
      rightType = typeCheck.getTypeMap().get(rightNode);
      isDynamic = isDynamic || rightType == PrimitiveType.ANY;
      right = gen(rightNode, JCExpression.class, new GenEnv(rightType));
    }
    
    PseudoProductionEnum kind = expr.getKind();
    Operator operator = exprOperatorMap.get(kind);
    if (!isDynamic) {
      // special cases: test with strings
      // l <= r is converted to l.compareTo(v) <= 0
      if (leftType == PrimitiveType.STRING &&
          rightType == PrimitiveType.STRING &&
          (kind == PseudoProductionEnum.expr_gt ||
           kind == PseudoProductionEnum.expr_ge ||
           kind == PseudoProductionEnum.expr_lt ||
           kind == PseudoProductionEnum.expr_le ||
           kind == PseudoProductionEnum.expr_eq ||
           kind == PseudoProductionEnum.expr_ne)) {
        left = maker(expr).Apply(List.<JCExpression>nil(),
            maker(expr).Select(left, nameFromString("compareTo")),
            List.of(right));
        right = maker(expr).Literal(TypeTags.INT, 0);
      }
      
      return staticExpression(expr, operator, left, right);
    }
    
    Invocation invocation = (Invocation)typeCheck.getSymbolMap().get(expr);
    FunType funType = invocation.getFunType();
    
    // try to adjust the return type to the expected return type
    Type returnType = funType.getReturnType();
    Type expectedReturnType = genEnv.getExpectedReturnType();
    if (returnType == PrimitiveType.ANY && expectedReturnType != PrimitiveType.ANY) {
      returnType = expectedReturnType;
      // fix computed type
      typeCheck.getTypeMap().put(expr, returnType);
    }
    
    // evaluation of && and || is never dynamic
    if (kind == PseudoProductionEnum.expr_band ||
        kind == PseudoProductionEnum.expr_bor) {
      return staticExpression(expr, operator,
          retype(PrimitiveType.BOOLEAN, leftNode, leftType, left),
          retype(PrimitiveType.BOOLEAN, rightNode, rightType, right));
    }
    
    // evaluation of a!=b is translated to !(a==b)  [step 1]
    if (kind == PseudoProductionEnum.expr_ne) {
      operator = exprOperatorMap.get(PseudoProductionEnum.expr_eq);
    }
    
    List<JCExpression> exprs = (size == 1)?List.of(left):List.of(left, right);
    JCFieldAccess method = maker(expr).Select(qualifiedIdentifier(expr, "java.dyn.InvokeDynamic"),
        nameFromString("__operator__:"+operator.name));
    JCExpression result = maker(expr).Apply(List.of(asType(expr, returnType)), method, exprs);
    
    // evaluation of a!=b is translated to !(a==b) [step 2]
    if (kind == PseudoProductionEnum.expr_ne) {
      result = maker(expr).Unary(JCTree.NOT, result);
    }
    return result;
  }
}
