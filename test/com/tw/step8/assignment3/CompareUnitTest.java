package com.tw.step8.assignment3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompareUnitTest {
  @Test
  void shouldCompareForFeetAndInch() {
    CompareUnit compareFeetAndInch = new CompareUnit(1.0 / 12);

    assertEquals(0, compareFeetAndInch.compare(2, 24));
    assertEquals(-1, compareFeetAndInch.compare(2, 25));
    assertEquals(1, compareFeetAndInch.compare(2, 20));
  }

  @Test
  void shouldCompareForInchAndCM() {
    CompareUnit compareInchAndCM = new CompareUnit(2.0 / 5);

    assertEquals(0, compareInchAndCM.compare(2, 5));
    assertEquals(-1, compareInchAndCM.compare(2, 6.25));
    assertEquals(1, compareInchAndCM.compare(5, 11));
  }

  @Test
  void shouldCompareForCMAndMM() {
    CompareUnit compareCMAndMM = new CompareUnit(1.0 / 10);

    assertEquals(0, compareCMAndMM.compare(1, 10));
    assertEquals(-1, compareCMAndMM.compare(2.2, 25));
    assertEquals(1, compareCMAndMM.compare(2.2, 20));
  }

  @Test
  void shouldCompareForMMAndInch() {
    CompareUnit compareMMAndInch = new CompareUnit(100.0 / 4);

    assertEquals(0, compareMMAndInch.compare(100, 4));
    assertEquals(-1, compareMMAndInch.compare(99, 4.1));
    assertEquals(1, compareMMAndInch.compare(101, 3.9));
  }

}