package com.googlecode.pseudo.runtime.lib;

import java.util.Random;

public class MathExtra {
  private MathExtra() {
    //no instance
  }
  
  private static Random RANDOM = new Random(); 
  
  /** Returns a pseudo random value, uniformly distributed between [0, max[
   * @param max the bound on the random number to be returned. Must be positive.
   * @return a pseudo random value, uniformly distributed between [0, max[
   */
  public static int random_int(int max) {
    return RANDOM.nextInt(max);
  }
  
  /** Set the seed of the current pseudo random generator.
   * @param seed the seed
   */
  public static void random_seed(int seed) {
    RANDOM = new Random(seed);
  }
}
