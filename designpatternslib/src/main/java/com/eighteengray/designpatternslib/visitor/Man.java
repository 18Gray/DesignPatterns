package com.eighteengray.designpatternslib.visitor;

public class Man extends Person {

  @Override
  public void accept(Action visitor) {
    visitor.getManReflection(this);
  }

}
