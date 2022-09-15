package com.tw.step8.assignment2.exception;

public class InvalidChanceException extends Exception {
  private final double chance;

  public InvalidChanceException(double chance) {
    super();
    this.chance = chance;
  }

  @Override
  public String getMessage() {
    return "Invalid chance representation : " + this.chance;
  }
}
