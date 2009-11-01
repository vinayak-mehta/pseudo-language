package com.googlecode.pseudo.compiler;

import java.util.Collection;
import java.util.LinkedHashMap;

public class Scopes {
  public interface Item {
    public String getName();
  }
  
  public static class Table<I extends Item> {
    private final LinkedHashMap<String, I> map =
      new LinkedHashMap<String, I>();
    
    public I register(I item) {
      String name = item.getName();
      I result = map.get(name);
      if (result != null) {
        return result;
      }
      
      map.put(name, item);
      return null;
    }
    
    public I lookup(String name) {
      return map.get(name);
    }
    
    public Collection<I> items() {
      return map.values();
    }
    
    @Override
    public String toString() {
      return map.toString();
    }
  }
  
  public static class Scope<I extends Item, T extends I> {
    private final Scope<? extends I, ?> parent;
    private final Table<T> table;
    
    public Scope(Table<T> table, Scope<? extends I, ?> parent) {
      this.parent = parent;
      this.table = table;
    }
    
    public Table<T> getTable() {
      return table;
    }
    
    public T tableLookup(String name) {
      return table.lookup(name);
    }
    
    public I lookup(String name) {
      I item = tableLookup(name);
      if (item == null && parent != null) {
        return parent.lookup(name);
      }
      return item;
    }
    
    public T register(T item) {
      return table.register(item);
    }
    
    @Override
    public String toString() {
      return table.toString() + ((parent!=null)? " -> "+parent.toString(): "");
    }
  }
  
  public static class RootScope<I extends Item> extends Scope<I, I> {
    public RootScope(Table<I> table) {
      super(table, null);
    }
  }
}
