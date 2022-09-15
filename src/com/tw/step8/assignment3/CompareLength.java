package com.tw.step8.assignment3;

public class CompareLength {
  private final double ratio;

  public CompareLength(double ratio) {
    this.ratio = ratio;
  }

  public boolean compare(double unit1, double unit2) {
    return unit1 * ratio == unit2;
  }
}
