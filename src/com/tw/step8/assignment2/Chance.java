package com.tw.step8.assignment2;

import com.tw.step8.assignment2.exception.InvalidProbabilityException;

public class Chance {
  private final double value;

  private Chance(double value) {
    this.value = value;
  }

  public static Chance create(double chance) throws InvalidProbabilityException {
    if (chance <= 1 && chance >= 0) {
      return new Chance(chance);
    }
    throw new InvalidProbabilityException(chance);
  }

  public Chance complement() throws InvalidProbabilityException {
    return Chance.create(1 - this.value);
  }

  public Chance and (Chance otherChance) throws InvalidProbabilityException {
    double probability = this.value * otherChance.value;
    return Chance.create(probability);
  }

  public Chance or(Chance otherChance) throws InvalidProbabilityException {
    return (this.complement().and(otherChance.complement())).complement();
  }

  public boolean isDifferenceWithinDelta(Chance otherChance, double delta){
    return Math.abs(otherChance.value - this.value) <= delta;
  }

}
