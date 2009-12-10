package com.googlecode.pseudo.runtime.lib;

import java.io.InputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class IOScanner {
  private Scanner scanner;
  private InputStream in;
  
  public IOScanner(InputStream in) {
    scanner = new java.util.Scanner(in);
  }

  public void reset(InputStream in) {
    if (this.in != System.in)
      scanner.close();
    else 
      if (in == System.in)
        return;
    
    scanner = new java.util.Scanner(in);
    this.in = in;
  }
  
  public boolean nextBOOLEAN() {
    return scanner.nextBoolean();
  }
  
  public char nextCHAR() {
    String s=scanner.next();
    if (s.length() != 1)
      throw new InputMismatchException(s);
    return s.charAt(0);
  }
  
  public int nextINT() {
    return scanner.nextInt();
  }
  
  public double nextDOUBLE() {
    return scanner.nextDouble();
  }
  
  public String nextSTRING() {
    return scanner.next();
  }
  
  public Object nextANY() {
    String text = scanner.next();
    
    if ("true".equals(text))
      return true;
    if ("false".equals(text))
      return false;
    
    try {
      return Integer.parseInt(text);
    } catch (NumberFormatException e) {
      // do nothing
    }
    
    try {
      return Double.parseDouble(text);
    } catch (NumberFormatException e) {
      // do nothing
    }
    
    if (text.length() == 1)
      return text.charAt(0);
    
    return text;
  }

  public boolean hasNextLine() {
    return scanner.hasNextLine();
  }

  public String nextLine() {
    return scanner.nextLine();
  }

  public void useDelimiter(String delimiters) {
    scanner.useDelimiter(delimiters);
  }
  
  /*
  public void setDelimiter(String delimiterPattern) {
    scanner.useDelimiter(delimiterPattern);
  }*/
}
