package com.tw.step8.assignment2.exception;

public class InvalidProbabilityException extends Exception {
  private final double chance;

  public InvalidProbabilityException(double chance) {
    super();
    this.chance = chance;
  }

  @Override
  public String getMessage() {
    return "Invalid chance representation : " + this.chance;
  }
}
