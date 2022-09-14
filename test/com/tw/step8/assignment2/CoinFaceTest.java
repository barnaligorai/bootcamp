package com.tw.step8.assignment2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoinFaceTest {

  @Test
  void shouldReturnProbabilityOfGettingTail() {
    CoinFace tail = CoinFace.TAIL;
    assertEquals(0.5, tail.probabilityOfGetting());
  }

  @Test
  void shouldReturnProbabilityOfNotGettingTail() {
    CoinFace tail = CoinFace.TAIL;
    assertEquals(0.5, tail.probabilityOfNotGetting());
  }
}