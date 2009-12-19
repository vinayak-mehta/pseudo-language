package com.googlecode.pseudo.compiler;

public class Pair<F, S> {
  private final F first;
  private final S second;
  
  public Pair(F first, S second) {
    first.getClass();
    second.getClass();
    
    this.first = first;
    this.second = second;
  }
  
  public F getFirst() {
    return first;
  }
  public S getSecond() {
    return second;
  }
  
  @Override
  public int hashCode() {
    return first.hashCode() ^ Integer.rotateLeft(second.hashCode(), 16);
  }
  
  @Override
  public boolean equals(Object o) {
    if (!(o instanceof Pair<?, ?>))
      return false;
    Pair<?, ?> pair = (Pair<?, ?>)o;
    return first.equals(pair.first) &&
           second.equals(pair.second);
  }
  
  @Override
  public String toString() {
    return first+" "+second;
  }
}
