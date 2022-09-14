package com.tw.step8.assignment1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

  @Test
  void shouldReturnTheAreaOfTheRectangle() {
    Rectangle rectangle = new Rectangle(10,10);
    assertEquals(100,rectangle.area());
  }
}