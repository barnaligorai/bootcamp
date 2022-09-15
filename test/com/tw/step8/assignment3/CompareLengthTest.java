package com.tw.step8.assignment3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompareLengthTest {
  @Test
  void shouldReturnTrueWhenComparisonIsRight() {
    CompareLength compareFeetAndInch = new CompareLength(12);

    assertTrue(compareFeetAndInch.compare(2, 24));
    assertFalse(compareFeetAndInch.compare(2, 20));
  }
}