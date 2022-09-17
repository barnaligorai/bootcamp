package com.tw.step8.assignment4;

public enum Subscriber {
  ATTENDANT(0, 20), MANAGER(80, 100), CIVIC(80, 100);

  final double minLimit;
  final double maxLimit;

  Subscriber(double minLimit, double maxLimit) {
    this.minLimit = minLimit;
    this.maxLimit = maxLimit;
  }

  public void notifyMe(Integer lotId) {
    System.out.println(this.toString() + " notified for lot number :" + lotId);
  }
}
