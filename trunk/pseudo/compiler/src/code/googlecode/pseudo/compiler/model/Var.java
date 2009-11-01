package code.googlecode.pseudo.compiler.model;

import com.googlecode.pseudo.compiler.Type;
import com.googlecode.pseudo.compiler.Scopes.Item;

public interface Var extends Item {
  public Type getType();
  public boolean isReadOnly();
}
