package com.tw.step8.assignment3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompareUnitTest {
  @Test
  void shouldCompareForFeetAndInch() {
    CompareUnit compareFeetAndInch = new CompareUnit(1.0 / 12);

    assertTrue(compareFeetAndInch.compare(2, 24));
    assertTrue(compareFeetAndInch.compare(3.1, 37.2));
    assertFalse(compareFeetAndInch.compare(2, 20));
  }

  @Test
  void shouldCompareForInchAndFeet() {
    CompareUnit compareInchAndFeet = new CompareUnit(12);

    assertTrue(compareInchAndFeet.compare(24, 2));
    assertTrue(compareInchAndFeet.compare(30, 2.5));
    assertFalse(compareInchAndFeet.compare(20, 2));
  }

  @Test
  void shouldCompareForInchAndCM() {
    CompareUnit compareInchAndCM = new CompareUnit(2.0 / 5);

    assertTrue(compareInchAndCM.compare(2, 5));
    assertTrue(compareInchAndCM.compare(2.5, 6.25));
    assertFalse(compareInchAndCM.compare(4, 11));
  }

  @Test
  void shouldCompareForCMAndInch() {
    CompareUnit compareCMAndInch = new CompareUnit(5.0 / 2);

    assertTrue(compareCMAndInch.compare(5, 2));
    assertTrue(compareCMAndInch.compare(7.5, 3));
    assertFalse(compareCMAndInch.compare(11, 4));
  }

  @Test
  void shouldCompareForCMAndMM() {
    CompareUnit compareCMAndMM = new CompareUnit(1.0 / 10);

    assertTrue(compareCMAndMM.compare(1, 10));
    assertTrue(compareCMAndMM.compare(2.2, 22));
    assertFalse(compareCMAndMM.compare(2, 10));
  }
}