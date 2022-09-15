package com.tw.step8.assignment3;

public class CompareUnit {
  private final double ratio;

  public CompareUnit(double ratio) {
    this.ratio = ratio;
  }

  public int compare(double unit1Value, double unit2Value) {
    double convertedValueOfUnit1 = unit1Value / this.ratio;
    return Double.compare(convertedValueOfUnit1, unit2Value);
  }
}
