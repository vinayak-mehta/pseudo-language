package com.googlecode.pseudo.runtime;

import java.util.InputMismatchException;

public class Scanner {
  private final java.util.Scanner scanner;
  
  public Scanner() {
    scanner = new java.util.Scanner(System.in);
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
  
  /*
  public void setDelimiter(String delimiterPattern) {
    scanner.useDelimiter(delimiterPattern);
  }*/
}
