package com.tw.step8.assignment3;

public enum UnitOfVolume implements Unit {
  LITER(1.0), GALLON(3.78);

  private final double baseValueInLiter;

  UnitOfVolume(double baseValueInLiter) {
    this.baseValueInLiter = baseValueInLiter;
  }

  @Override
  public double aggregateValue(double value) {
    return this.baseValueInLiter * value;
  }

  @Override
  public Unit getBase() {
    return UnitOfVolume.LITER;
  }

}
