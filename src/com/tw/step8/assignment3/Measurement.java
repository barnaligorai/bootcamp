package com.tw.step8.assignment3;

import java.util.Objects;

public class Measurement<U> {

  private final Unit unit;
  private final double value;

  public Measurement(Unit unit, double value) {
    this.unit = unit;
    this.value = value;
  }

  private double convertToBase() {
    return this.unit.toBase(this.value);
  }

  public int compare(Measurement<U> measurement) {
    return Double.compare(this.convertToBase(), measurement.convertToBase());
  }

  public Measurement<U> add(Measurement<U> otherMeasurement) {
    double sum = this.convertToBase() + otherMeasurement.convertToBase();
    return new Measurement<U>(this.unit.getBase(), sum);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Measurement<?> that = (Measurement<?>) o;

    if (Double.compare(that.value, value) != 0) return false;
    return Objects.equals(unit, that.unit);
  }

  @Override
  public int hashCode() {
    int result;
    long temp;
    result = unit != null ? unit.hashCode() : 0;
    temp = Double.doubleToLongBits(value);
    result = 31 * result + (int) (temp ^ (temp >>> 32));
    return result;
  }

  public boolean isEquivalent(Measurement<U> otherMeasurement, double delta) {
    return Math.abs(this.value - otherMeasurement.value) <= delta;
  }
}
