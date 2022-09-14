package com.tw.step8.assignment1;

import com.tw.step8.assignment1.exception.InvaidSideException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

  @Test
  void shouldReturnAreaOfRectangle() throws InvaidSideException {
    Rectangle rectangle = Rectangle.createRectangle(10.0, 10.0);
    Rectangle square = Rectangle.createSquare(20.0);

    assertEquals(100.0, rectangle.area());
    assertEquals(400.0, square.area());
  }

  @Test
  void shouldReturnPerimeterOfRectangle() throws InvaidSideException {
    Rectangle rectangle = Rectangle.createRectangle(10.0, 10.0);
    Rectangle square = Rectangle.createSquare(20.0);

    assertEquals(40.0, rectangle.perimeter());
    assertEquals(80.0, square.perimeter());
  }

  @Test
  void shouldThrowExceptionWhenSideIsNegative() {
    String expected = "Invalid side : [-10.0, 10.0]";

    try {
      Rectangle rectangle = Rectangle.createRectangle(-10.0, 10.0);
    } catch (InvaidSideException e) {
      assertEquals(expected, e.getMessage());
    }
  }

  @Test
  void shouldThrowExceptionWhenSideIsZero() {
    String expected = "Invalid side : [0.0, 10.0]";

    try {
      Rectangle rectangle = Rectangle.createRectangle(0.0, 10.0);
    } catch (InvaidSideException e) {
      assertEquals(expected, e.getMessage());
    }
  }
}