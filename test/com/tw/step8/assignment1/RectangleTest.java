package com.tw.step8.assignment1;

import com.tw.step8.assignment1.exception.InvalidSideException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class RectangleTest {

  @Test
  void shouldReturnAreaOfRectangle() throws InvalidSideException {
    Rectangle rectangle = Rectangle.createRectangle(10.0, 10.0);
    Rectangle square = Rectangle.createSquare(20.0);

    assertEquals(100.0, rectangle.area());
    assertEquals(400.0, square.area());
  }

  @Test
  void shouldReturnPerimeterOfRectangle() throws InvalidSideException {
    Rectangle rectangle = Rectangle.createRectangle(10.0, 10.0);
    Rectangle square = Rectangle.createSquare(20.0);

    assertEquals(40.0, rectangle.perimeter());
    assertEquals(80.0, square.perimeter());
  }

  @Test
  void shouldThrowExceptionWhenSideIsNegative() {
    assertThrows(InvalidSideException.class, ()-> Rectangle.createRectangle(-10,1));
  }

  @Test
  void shouldThrowExceptionWhenSideIsZero() {
    assertThrows(InvalidSideException.class, ()-> Rectangle.createRectangle(0,1));
  }
}