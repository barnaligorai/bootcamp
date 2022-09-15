package com.tw.step8.assignment2;

import com.tw.step8.assignment2.exception.InvalidChanceException;

public class Chance {
  private final double value;

  private Chance(double value) {
    this.value = value;
  }

  public static Chance create(double chance) throws InvalidChanceException {
    if (chance <= 1 && chance >= 0) {
      return new Chance(chance);
    }
    throw new InvalidChanceException(chance);
  }

  public Chance not() throws InvalidChanceException {
    return Chance.create(1 - this.value);
  }

  public Chance and(Chance otherChance) throws InvalidChanceException {
    double probability = this.value * otherChance.value;
    return Chance.create(probability);
  }

  public Chance or(Chance otherChance) throws InvalidChanceException {
    return this.not()
            .and(otherChance.not())
            .not();
  }

  public boolean isDifferenceWithinDelta(Chance otherChance, double delta) {
    return Math.abs(otherChance.value - this.value) <= delta;
  }

}
