package com.tw.step8.assignment3;

public enum UnitOfTemperature implements Unit {
  CELCIUS, FAHRENHEIT;

  @Override
  public double aggregateValue(double value) {
    if (this == CELCIUS) {
      return value;
    }

    return (value - 32) / 1.8;
  }

  @Override
  public Unit getBase() {
    return UnitOfTemperature.CELCIUS;
  }
}
