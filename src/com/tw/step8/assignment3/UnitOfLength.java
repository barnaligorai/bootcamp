package com.tw.step8.assignment3;

public enum UnitOfLength implements Unit {
  FEET(12.0), INCH(1.0), CM(1 / 2.5), MM(1 / 0.25);

  private final double baseValueInInch;

  UnitOfLength(double baseValueInInch) {
    this.baseValueInInch = baseValueInInch;
  }

  @Override
  public double aggregateValue(double value) {
    return this.baseValueInInch * value;
  }

  public Unit getBase() {
    return UnitOfLength.INCH;
  }
}
