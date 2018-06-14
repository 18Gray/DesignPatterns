package com.eighteengray.designpatternslib.visitor;

public abstract class Person {
  public abstract void accept(Action visitor);
}
