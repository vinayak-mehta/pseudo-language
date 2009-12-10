package com.googlecode.pseudo.runtime.lib;

import java.util.Scanner;

public class Builtins {
  private Builtins() {
    //  no instance
  }
  
  // --- strings
  
  public static char char_at(String text, int index) {
    return text.charAt(index);
  }
  
  public static String to_string(Object any) {
    return any.toString(); // should throw a NPE
  }
  
  public static boolean is_boolean(String text) {
    return new Scanner(text).hasNextBoolean();
  }
  public static boolean is_int(String text) {
    return new Scanner(text).hasNextInt();
  }
  public static boolean is_double(String text) {
    return new Scanner(text).hasNextDouble();
  }
  
  public static boolean parse_boolean(String text) {
    return Boolean.parseBoolean(text);
  }
  public static int parse_int(String text) {
    return Integer.parseInt(text);
  }
  public static double parse_double(String text) {
    return Double.parseDouble(text);
  }
}
