package com.tw.step8.assignment1.exception;

public class InvaidSideException extends Throwable {
  private final double length;
  private final double breadth;

  public InvaidSideException(double length, double breadth) {
    this.length = length;
    this.breadth = breadth;
  }

  @Override
  public String getMessage() {
    return "Invalid side : [" + this.length + ", " + this.breadth + "]";
  }
}
