/**
 * 
 */
package com.googlecode.pseudo.compiler;

import java.util.List;

import com.googlecode.pseudo.compiler.LocationMap.Location;
import com.googlecode.pseudo.compiler.ast.ASTGrammarEvaluator;
import com.googlecode.pseudo.compiler.ast.BooleanLiteralToken;
import com.googlecode.pseudo.compiler.ast.CharLiteralToken;
import com.googlecode.pseudo.compiler.ast.IdToken;
import com.googlecode.pseudo.compiler.ast.Node;
import com.googlecode.pseudo.compiler.ast.StringLiteralToken;
import com.googlecode.pseudo.compiler.ast.ValueLiteralToken;
import com.googlecode.pseudo.compiler.tools.PseudoTerminalEvaluator;

import fr.umlv.tatoo.runtime.buffer.impl.LocationTracker;

class PseudoEvaluator extends ASTGrammarEvaluator implements PseudoTerminalEvaluator<CharSequence> {
  private final LocationMap locationMap;
  private final LocationTracker tracker;

  PseudoEvaluator(LocationMap locationMap,
      LocationTracker tracker) {
    this.locationMap = locationMap;
    this.tracker = tracker;
  }

  @Override
  public void line_comment(CharSequence data) {
    // do nothing
  }
  @Override
  public void multiline_comment(CharSequence data) {
    // do nothing
  }

  @Override
  public BooleanLiteralToken boolean_literal(CharSequence data) {
    return computeTokenNodeAnnotation(new BooleanLiteralToken(Boolean.parseBoolean(data.toString())));
  }

  @Override
  public CharLiteralToken char_literal(CharSequence data) {
    // data at index 1 because 0 and 2 are quotes
    return computeTokenNodeAnnotation(new CharLiteralToken(data.charAt(1)));
  }

  @Override
  public ValueLiteralToken value_literal(CharSequence data) {
    String text = data.toString();
    Object value;
    
    // heaxdecimal
    if (text.startsWith("0x") || text.startsWith("0X")) {
      long longValue = Long.parseLong(text.substring(2), 16);
      value = (int)longValue;
    } else {
      try {
        value = Integer.parseInt(text);
      } catch(NumberFormatException e) {
        value = Double.parseDouble(text);
      }
    }
    return computeTokenNodeAnnotation(new ValueLiteralToken(value));
  }

  @Override
  public StringLiteralToken string_literal(CharSequence data) {
    String text = data.toString();
    return computeTokenNodeAnnotation(new StringLiteralToken(text.substring(1, text.length() - 1)));
  }

  @Override
  public IdToken id(CharSequence data) {
    return computeTokenNodeAnnotation(new IdToken(data.toString()));
  }
  
  
  
  private Location currentLocation() {
    return new Location(tracker.getDiscardedLineNumber(), tracker.getDiscardedColumnNumber());
  }
  
  private <N extends Node> N computeTokenNodeAnnotation(N node) {
    locationMap.setLocation(node, currentLocation());
    return node;
  }

  @Override
  protected void computeAnnotation(Node node) {
    Location location; 
    List<Node> nodeList = node.nodeList();
    if (nodeList.isEmpty()) {
      location = currentLocation();
    } else {
      location = locationMap.getLocation(nodeList.get(0));
      assert location != null;
    }
    locationMap.setLocation(node, location);
  }
}