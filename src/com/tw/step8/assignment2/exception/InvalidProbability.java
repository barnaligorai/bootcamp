package com.tw.step8.assignment2.exception;

public class InvalidProbability extends Exception {
  private final double chance;

  public InvalidProbability(double chance) {
    this.chance = chance;
  }

  @Override
  public String getMessage() {
    return "Invalid chance representation : " + this.chance;
  }
}
