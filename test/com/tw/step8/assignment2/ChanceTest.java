package com.tw.step8.assignment2;

import com.tw.step8.assignment2.exception.InvalidProbabilityException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChanceTest {
  @Test
  void shouldThrowExceptionForInvalidProbability() {
    try {
      Chance chance = Chance.create(5.9);
    } catch (InvalidProbabilityException e) {
      assertEquals("Invalid chance representation : 5.9", e.getMessage());
    }
  }

  @Test
  void shouldReturnComplementOfProbability() throws InvalidProbabilityException {
    Chance chance = Chance.create(0.9);
    Chance expected = Chance.create(0.1);

    Chance actual = chance.complement();

    assertTrue(actual.isDifferenceWithinDelta(expected, 0.1));
  }

  @Test
  void shouldReturnAndOfProbability() throws InvalidProbabilityException {
    Chance chanceOfGettingOneInDice = Chance.create(1.0 / 6);
    Chance chanceOfGettingTails = Chance.create(0.5);
    Chance expected = Chance.create(0.08);

    Chance actual = chanceOfGettingOneInDice.and(chanceOfGettingTails);

    assertTrue(actual.isDifferenceWithinDelta(expected, 0.1));
  }

  @Test
  void shouldReturnOrOfProbability() throws InvalidProbabilityException {
    Chance chanceOfGettingTwoInDice = Chance.create(1.0 / 6);
    Chance chanceOfGettingTails = Chance.create(0.5);
    Chance expectedChance1 = Chance.create(7.0 / 12);
    Chance expectedChance2 = Chance.create(11.0 / 36);

    Chance actualChance1 = chanceOfGettingTwoInDice.or(chanceOfGettingTails);
    Chance actualChance2 = chanceOfGettingTwoInDice.or(chanceOfGettingTwoInDice);

    assertTrue(actualChance1.isDifferenceWithinDelta(expectedChance1, 0.1));
    assertTrue(expectedChance2.isDifferenceWithinDelta(expectedChance2, 0.01));
  }
}