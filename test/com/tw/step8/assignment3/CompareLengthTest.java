package com.tw.step8.assignment3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompareLengthTest {
  @Test
  void shouldCompareForFeetAndInch() {
    CompareLength compareFeetAndInch = new CompareLength(1.0 / 12);

    assertTrue(compareFeetAndInch.compare(2, 24));
    assertFalse(compareFeetAndInch.compare(2, 20));
  }

  @Test
  void shouldCompareForInchAndFeet() {
    CompareLength compareInchAndFeet = new CompareLength(12);

    assertTrue(compareInchAndFeet.compare(24, 2));
    assertFalse(compareInchAndFeet.compare(20, 2));
  }

  @Test
  void shouldCompareForInchAndCM() {
    CompareLength compareInchAndCM = new CompareLength(2.0 / 5);

    assertTrue(compareInchAndCM.compare(2, 5));
    assertFalse(compareInchAndCM.compare(4, 11));
  }

  @Test
  void shouldCompareForCMAndInch() {
    CompareLength compareCMAndInch = new CompareLength(5.0 / 2);

    assertTrue(compareCMAndInch.compare(5, 2));
    assertFalse(compareCMAndInch.compare(11, 4));
  }
}