package com.tw.step8.assignment3;

public enum UnitOfLength implements Unit {
  FEET(60.0), INCH(5.0), CM(1.0), MM(0.1);

  private final double baseValueInCM;

  UnitOfLength(double baseValueInCM) {
    this.baseValueInCM = baseValueInCM;
  }

  public double getBaseValue() {
    return baseValueInCM;
  }
}
