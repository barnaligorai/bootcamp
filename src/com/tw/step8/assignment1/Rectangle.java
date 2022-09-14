package com.tw.step8.assignment1;

public class Rectangle {
  private final int length;
  private final int breadth;

  public Rectangle(int length, int breadth) {
    this.length = length;
    this.breadth = breadth;
  }
  public int area() {
     return this.length * this.breadth;
  }
}
