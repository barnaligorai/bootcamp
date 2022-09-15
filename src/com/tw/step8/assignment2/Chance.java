package com.tw.step8.assignment2;

import com.tw.step8.assignment2.exception.InvalidChanceException;

public class Chance {
  public static final int CERTAINTY = 1;
  public static final int IMPOSSIBILITY = 0;
  private final double value;

  private Chance(double value) {
    this.value = value;
  }

  public static Chance create(double chance) throws InvalidChanceException {
    if (chance <= CERTAINTY && chance >= IMPOSSIBILITY) {
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
