package com.tw.step8.assignment2;

import com.tw.step8.assignment2.exception.InvalidProbability;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChanceTest {
  @Test
  void shouldThrowExceptionForInvalidProbability() {
    try {
      Chance chance = Chance.createChance(5.9);
    } catch (InvalidProbability e) {
      assertEquals("Invalid chance representation : 5.9", e.getMessage());
    }
  }

  @Test
  void shouldReturnComplementOfProbability() throws InvalidProbability {
    Chance chance = Chance.createChance(0.9);
    Chance expected = Chance.createChance(0.1);

    Chance actual = chance.complement();

    assertTrue(actual.isDifferenceWithinDelta(expected,0.1));
  }


}
