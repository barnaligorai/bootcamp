package com.tw.step8.assignment2;

import com.tw.step8.assignment2.exception.InvalidProbability;

public class Chance {
  private final double probability;

  private Chance(double probability) {
    this.probability = probability;
  }

  public static Chance createChance(double chance) throws InvalidProbability {
    if (chance <= 1 && chance >= 0) {
      return new Chance(chance);
    }
    throw new InvalidProbability(chance);
  }

  public Chance complement() throws InvalidProbability {
    return Chance.createChance(1 - this.probability);
  }

  public Chance intersectionProbability(Chance anotherChance) throws InvalidProbability {
    double p = this.probability * anotherChance.probability;
    return Chance.createChance(p);
  }

  public Chance unionProbability(Chance anotherChance) throws InvalidProbability {
    double p = 1 - this.intersectionProbability(anotherChance).probability;
    return Chance.createChance(p);
  }

  public boolean isDifferenceWithinDelta(Chance anotherChance, double delta){
    double probability1 = this.probability;
    double probability2 = anotherChance.probability;

    return Math.abs(probability2 - probability1) <= delta;
  }

}
