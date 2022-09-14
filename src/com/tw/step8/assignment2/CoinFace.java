package com.tw.step8.assignment2;

public enum CoinFace {
  HEAD(0.5), TAIL(0.5);

  private final double probability;

  CoinFace(double probability) {
    this.probability = probability;
  }

  public double probabilityOfGetting() {
    return this.probability;
  }
  public double probabilityOfNotGetting() {
    return (1 - this.probability);
  }
}
