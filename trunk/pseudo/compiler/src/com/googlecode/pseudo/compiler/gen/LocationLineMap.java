/**
 * 
 */
package com.googlecode.pseudo.compiler.gen;

import com.googlecode.pseudo.compiler.LocationMap.Location;
import com.sun.tools.javac.util.Position;

class LocationLineMap implements Position.LineMap {
  @Override
  public int getLineNumber(int pos) {
    return Location.decodeLine(pos);
  }
  
  // --- unsupported operations
  
  @Override
  public long getStartPosition(long line) {
    throw new UnsupportedOperationException();
  }

  @Override
  public long getPosition(long line, long column) {
    throw new UnsupportedOperationException();
  }

  @Override
  public long getLineNumber(long pos) {
    throw new UnsupportedOperationException();
  }

  @Override
  public long getColumnNumber(long pos) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int getStartPosition(int line) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int getPosition(int line, int column) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int getColumnNumber(int pos) {
    throw new UnsupportedOperationException();
  }
}