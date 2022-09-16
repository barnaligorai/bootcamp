package com.tw.step8.assignment4.exception;

public class InvalidParkingLotSizeExpection extends Exception {
  private final int size;

  public InvalidParkingLotSizeExpection(int size) {
    super();
    this.size = size;
  }

  @Override
  public String getMessage() {
    return "Given size of parking lot is invalid : " + this.size;
  }
}
