package com.googlecode.pseudo.compiler.gen;

import java.util.Locale;

import javax.tools.JavaFileObject;

import com.googlecode.pseudo.compiler.LocationMap.Location;
import com.googlecode.pseudo.compiler.analysis.ErrorReporter;
import com.sun.tools.javac.util.Context;
import com.sun.tools.javac.util.DiagnosticSource;
import com.sun.tools.javac.util.JCDiagnostic;
import com.sun.tools.javac.util.Log;


public class RedirectionLog extends Log {
  private final ErrorReporter errorReporter;
  
  protected RedirectionLog(Context context, JavaFileObject sourceFile, ErrorReporter errorReporter) {
    super(context);
    useSource(sourceFile);
    this.errorReporter = errorReporter;
  }  
  
  @Override
  protected DiagnosticSource getSource(JavaFileObject file) {
    return new DiagnosticSource(file, this) {
      @Override
      public String getLine(int pos) {
        return null;
      }
      
      @Override
      public int getLineNumber(int pos) {
        return Location.decodeLine(pos);
      }
      @Override
      public int getColumnNumber(int pos, boolean expandTabs) {
        return Location.decodeColumn(pos);
      }
    };
  }
  
  @Override
  public void report(JCDiagnostic diagnostic) {
    //System.out.println("=> "+diagnostic);
    long lineNumber = diagnostic.getLineNumber();
    long columnNumber = diagnostic.getColumnNumber();
    
    String message = diagnostic.getMessage(Locale.ENGLISH);
    
    switch(diagnostic.getKind()) {
      case ERROR:
        errorReporter.error(message, lineNumber, columnNumber);
        return;
      case MANDATORY_WARNING:
      case WARNING:
        errorReporter.warning(message, lineNumber, columnNumber);
        return;
      default:
    }
  }
}
