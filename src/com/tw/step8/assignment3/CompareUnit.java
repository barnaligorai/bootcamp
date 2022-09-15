package com.tw.step8.assignment3;

public class CompareUnit {
  private final double ratio;

  public CompareUnit(double ratio) {
    this.ratio = ratio;
  }

  public boolean compare(double unit1Value, double unit2Value) {
    return unit1Value / this.ratio == unit2Value;
  }
}
