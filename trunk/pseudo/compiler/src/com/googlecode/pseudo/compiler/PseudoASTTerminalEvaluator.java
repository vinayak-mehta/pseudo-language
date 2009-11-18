/**
 * 
 */
package com.googlecode.pseudo.compiler;

import com.googlecode.pseudo.compiler.ast.BooleanLiteralToken;
import com.googlecode.pseudo.compiler.ast.CharLiteralToken;
import com.googlecode.pseudo.compiler.ast.IdToken;
import com.googlecode.pseudo.compiler.ast.Node;
import com.googlecode.pseudo.compiler.ast.StringLiteralToken;
import com.googlecode.pseudo.compiler.ast.ValueLiteralToken;
import com.googlecode.pseudo.compiler.tools.PseudoTerminalEvaluator;

import fr.umlv.tatoo.runtime.buffer.impl.LocationTracker;

public class PseudoASTTerminalEvaluator implements PseudoTerminalEvaluator<CharSequence> {
  private final LocationMap locationMap;
  private final LocationTracker tracker;

  public PseudoASTTerminalEvaluator(LocationMap locationMap,
      LocationTracker tracker) {
    this.locationMap = locationMap;
    this.tracker = tracker;
  }

  private <N extends Node> N locate(N node) {
    locationMap.setLocation(node, tracker.getLineNumber(), tracker.getColumnNumber());
    return node;
  }

  @Override
  public void comment(CharSequence data) {
    // do nothing
  }

  @Override
  public BooleanLiteralToken boolean_literal(CharSequence data) {
    return locate(new BooleanLiteralToken(Boolean.parseBoolean(data.toString())));
  }

  @Override
  public CharLiteralToken char_literal(CharSequence data) {
    return locate(new CharLiteralToken(data.charAt(0)));
  }

  @Override
  public ValueLiteralToken value_literal(CharSequence data) {
    String text = data.toString();
    Object value;
    try {
      value = Integer.parseInt(text);
    } catch(NumberFormatException e) {
      value = Double.parseDouble(text);
    }
    return locate(new ValueLiteralToken(value));
  }

  @Override
  public StringLiteralToken string_literal(CharSequence data) {
    String text = data.toString();
    return locate(new StringLiteralToken(text.substring(1, text.length() - 1)));
  }

  @Override
  public IdToken id(CharSequence data) {
    return locate(new IdToken(data.toString()));
  }
}