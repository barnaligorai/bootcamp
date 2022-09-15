package com.tw.step8.assignment3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompareLengthTest {
  @Test
  void shouldReturnTrueWhenComparisonIsRightForFeetAndInch() {
    CompareLength compareFeetAndInch = new CompareLength(12);

    assertTrue(compareFeetAndInch.compare(2, 24));
    assertFalse(compareFeetAndInch.compare(2, 20));
  }

  @Test
  void shouldReturnTrueWhenComparisonIsRightForInchAndCM() {
    CompareLength compareInchAndCM = new CompareLength(5.0 / 2);

    assertTrue(compareInchAndCM.compare(2, 5));
    assertFalse(compareInchAndCM.compare(4, 11));
  }
}