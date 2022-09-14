package com.tw.step8.assignment1;

import com.tw.step8.assignment1.exception.InvaidSideException;

public class Rectangle {
  private final double length;
  private final double breadth;

  private Rectangle(double length, double breadth) {
    this.length = length;
    this.breadth = breadth;
  }

  public static Rectangle createRectangle(double length, double breadth) throws InvaidSideException {
    if (length <= 0 || breadth <= 0) {
      throw new InvaidSideException(length, breadth);
    }
    return new Rectangle(length, breadth);
  }
  public static Rectangle createSquare(double side) throws InvaidSideException {
    return Rectangle.createRectangle(side, side);
  }

  public double area() {
     return this.length * this.breadth;
  }

  public double perimeter() {
    return 2 * (this.length + this.breadth);
  }
}
