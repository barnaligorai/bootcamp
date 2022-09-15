package com.tw.step8.assignment1.exception;

public class InvalidSideException extends Exception {
  private final double length;
  private final double breadth;

  public InvalidSideException(double length, double breadth) {
    super();
    this.length = length;
    this.breadth = breadth;
  }

  @Override
  public String getMessage() {
    return "Invalid side : [" + this.length + ", " + this.breadth + "]";
  }
}
