package com.googlecode.pseudo.compiler;

import java.util.HashMap;

import com.googlecode.pseudo.compiler.ast.Node;

public class LocationMap {
  public static class Location {
    private final int line;
    private final int column;
    
    public Location(int line, int column) {
      this.line = line;
      this.column = column;
    }
    
    public int getLine() {
      return line;
    }
    public int getColumn() {
      return column;
    }
    
    @Override
    public String toString() {
      return line+","+column;
    }
    
    public int encode() {
      if (line > MAXLINE || column > MAXCOLUMN) {
        return NOPOS;
      }
      return (line << LINESHIFT) + column;
    }
    
    public static int decodeLine(int encodedPosition) {
      if (encodedPosition == NOPOS)
        return 0;
      return encodedPosition >>> LINESHIFT;
    }
    
    public static int decodeColumn(int encodedPosition) {
      if (encodedPosition == NOPOS)
        return 0;
      return encodedPosition & MAXCOLUMN;
    }
    
    private static final int NOPOS        = -1;
    private static final int LINESHIFT    = 10;
    private static final int MAXCOLUMN    = (1<<LINESHIFT) - 1;
    private static final int MAXLINE      = (1<<(Integer.SIZE-LINESHIFT)) - 1;
  }
  
  private final HashMap<Node, Location> locationMap =
    new HashMap<Node, Location>();
  
  public void setLocation(Node node, int line, int column) {
    setLocation(node, new Location(line, column));
  }
  
  public void setLocation(Node node, Location location) {
    locationMap.put(node, location);
  }
  
  public Location getLocation(Node node) {
    return locationMap.get(node);
  }

  
}
