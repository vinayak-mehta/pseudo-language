package com.googlecode.pseudo.runtime.lib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class IO {
  private IO() {
    // TODO Auto-generated constructor stub
  }
  
  private static final IOScanner SCANNER = new IOScanner(System.in);
  
  // used by instruction 'scan' 
  public static IOScanner scanner() {
    return SCANNER;
  }
  
  // --- i/o
  
  public static void open_file(String filename) throws FileNotFoundException {
    FileInputStream input = new FileInputStream(filename);
    scanner().reset(input);
  }
  
  public static void close_file()  {
    scanner().reset(System.in);
  }
  
  public static boolean has_next_line() {
    return scanner().hasNextLine();
  }
  
  public static String next_line() {
    return scanner().nextLine();
  }
  
  public static void use_delimiter(String pattern) {
    scanner().useDelimiter(pattern);
  }
  
  public static void printf(String format, Object value) {
    System.out.printf(format, value);
  }
}
