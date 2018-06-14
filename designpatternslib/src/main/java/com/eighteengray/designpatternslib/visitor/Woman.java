package com.eighteengray.designpatternslib.visitor;

public class Woman extends Person {

  @Override
  public void accept(Action visitor) {
    visitor.getWomanReaction(this);
  }

}
