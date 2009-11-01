package com.googlecode.pseudo.compiler.ast;

import com.googlecode.pseudo.compiler.ast.AbstractInnerNode;
import com.googlecode.pseudo.compiler.parser.PseudoProductionEnum;

/**
 *
 *  This class is generated - please do not edit it 
 */
public abstract class ArrayCreation extends AbstractInnerNode {
  public abstract PseudoProductionEnum getKind();
  
    @Override
  public PrimaryArrayCreation getParent() {
    return (PrimaryArrayCreation)super.getParent();
  }
  }
