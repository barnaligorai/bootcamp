package com.tw.step8.assignment1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

  @Test
  void shouldReturnAreaOfRectangle() {
    Rectangle rectangle = Rectangle.createRectangle(10.0,10.0);
    Rectangle square = Rectangle.createSquare(20.0);

    assertEquals(100.0,rectangle.area());
    assertEquals(400.0,square.area());
  }

  @Test
  void shouldReturnPerimeterOfRectangle() {
    Rectangle rectangle = Rectangle.createRectangle(10.0,10.0);
    Rectangle square = Rectangle.createSquare(20.0);

    assertEquals(40.0, rectangle.perimeter());
    assertEquals(80.0, square.perimeter());
  }
}