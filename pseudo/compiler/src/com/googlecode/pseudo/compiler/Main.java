package com.googlecode.pseudo.compiler;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.ListIterator;
import java.util.Set;

import code.googlecode.pseudo.compiler.model.Script;

import com.googlecode.pseudo.compiler.analysis.Enter;
import com.googlecode.pseudo.compiler.analysis.TailCall;
import com.googlecode.pseudo.compiler.analysis.TypeCheck;
import com.googlecode.pseudo.compiler.ast.Start;
import com.googlecode.pseudo.compiler.gen.Gen;
import com.googlecode.pseudo.compiler.tools.PseudoAnalyzers;

import fr.umlv.tatoo.runtime.buffer.impl.LocationTracker;
import fr.umlv.tatoo.runtime.buffer.impl.ReaderWrapper;

public class Main {
  private static Set<Option> parse(ListIterator<String> it) {
    EnumSet<Option> optionSet = EnumSet.noneOf(Option.class);
    while (it.hasNext()) {
      String word = it.next();  
      
      if (word.startsWith("-")) {
        Option option = Option.parse(word.substring(1));
        optionSet.add(option);
      } else {
        it.previous();
        return optionSet;
      }
    }
    return optionSet;
  }
  
  public static void main(String[] args) throws IOException {
    ListIterator<String> it = Arrays.asList(args).listIterator();
    Set<Option> optionSet = parse(it);
    
    Reader reader;
    String scriptFileName;
    String scriptName;
    if (it.hasNext()) {
      scriptFileName = it.next();
      reader = new FileReader(scriptFileName);
      int index = scriptFileName.lastIndexOf('.');
      if (index != -1)
        scriptName = scriptFileName.substring(0, index);
      else
        scriptName = scriptFileName;
    } else {
      scriptFileName = scriptName = "script";
      reader = new InputStreamReader(System.in);
    }
    
    final LocationMap locationMap = new LocationMap();
    final LocationTracker tracker = new LocationTracker();
    ReaderWrapper buffer = new ReaderWrapper(reader, tracker);
    
    PseudoEvaluator evaluator = new PseudoEvaluator(locationMap, tracker);
    
    // lexer + parser
    PseudoAnalyzers.run(buffer, evaluator, evaluator, null, null);
    
    Start start = evaluator.getStart();
    //System.out.println(start);
    
    // compiler
    Script script = new Script(scriptName, scriptFileName);
    CompilerErrorReporter errorReporter = new CompilerErrorReporter(locationMap);
    Enter enter = new Enter(script, errorReporter, locationMap);
    enter.enter(start);
    
    TypeCheck typeCheck = new TypeCheck(script, errorReporter);
    typeCheck.typeCheck();
    
    if (errorReporter.isOnError()) {
      return;
    }
    
    if (optionSet.contains(Option.tailcall)) {
      TailCall tailCall = new TailCall(script, typeCheck);
      tailCall.tailCall();
    }
    
    Gen genVisitor = new Gen(script, errorReporter, locationMap, typeCheck);
    genVisitor.gen(start);
  }
}
