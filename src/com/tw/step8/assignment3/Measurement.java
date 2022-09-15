package com.tw.step8.assignment3;

public class Measurement {

  private final Unit unit;
  private final double value;

  public Measurement(Unit unit, double value) {
    this.unit = unit;
    this.value = value;
  }

  private double convertToBase() {
    return this.value * this.unit.getBaseValue();
  }

  public int compare(Measurement measurement) {
    return Double.compare(this.convertToBase(), measurement.convertToBase());
  }
}
