package com.googlecode.pseudo.runtime.lib;

public class Bits {
  public Bits() {
    // no instance
  }
  
  public static int bits_neg(int bits) {
    return ~bits;
  }
  public static int bits_or(int bits1, int bits2) {
    return bits1 | bits2;
  }
  public static int bits_and(int bits1, int bits2) {
    return bits1 & bits2;
  }
  public static int bits_xor(int bits1, int bits2) {
    return bits1 ^ bits2;
  }
  
  
  public static int bits_shift_left(int bits, int shift) {
    return bits << shift;
  }
  public static int bits_shift_right(int bits, int shift) {
    return bits >> shift;
  }
  public static int bits_shift_right_unsigned(int bits, int shift) {
    return bits >>> shift;
  }
  
  public static int bits_rotate_left(int bits, int distance) {
    return Integer.rotateLeft(bits, distance);
  }
  public static int bits_rotate_right(int bits, int distance) {
    return Integer.rotateRight(bits, distance);
  }
}
