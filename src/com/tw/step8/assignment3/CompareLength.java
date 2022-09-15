package com.tw.step8.assignment3;

public class CompareLength {
  private final double ratio;

  public CompareLength(double ratio) {
    this.ratio = ratio;
  }

  public boolean compare(double unit1Value, double unit2Value) {
    return unit1Value / this.ratio == unit2Value;
  }
}
