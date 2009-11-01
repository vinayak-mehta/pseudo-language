package com.googlecode.pseudo.compiler;

import com.googlecode.pseudo.compiler.analysis.ErrorReporter;
import com.googlecode.pseudo.compiler.ast.Node;

public class CompilerErrorReporter implements ErrorReporter {
  private final LocationMap locationMap;
  private boolean onError;
  
  public CompilerErrorReporter(LocationMap locationMap) {
    this.locationMap = locationMap;
  }

  public boolean isOnError() {
    return onError;
  }
  
  @Override
  public void error(ErrorKind kind, Node node, Object... args) {
    onError = true;
    System.out.println("error at "+locationMap.getLocation(node)+": "+kind.format(args));
  }
  @Override
  public void error(String message, long line, long column) {
    onError = true;
    System.out.println("error at "+line+','+column+": "+message);
  }
  @Override
  public void warning(String message, long line, long column) {
    System.out.println("warning at "+line+','+column+": "+message);
  }
}
