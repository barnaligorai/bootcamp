package com.tw.step8.assignment4;

import com.tw.step8.assignment4.exception.InvalidParkingLotSizeExpection;

import java.util.ArrayList;

public class ParkingLot {
  private final int size;
  private final ArrayList<Car> space;

  private ParkingLot(int size) {
    this.size = size;
    this.space = new ArrayList<Car>(size);
  }

  public static ParkingLot create(int size) throws InvalidParkingLotSizeExpection {
    if (size < 1) {
      throw new InvalidParkingLotSizeExpection(size);
    }
    return new ParkingLot(size);
  }

  public boolean park(Car vehicle) {
    if (!this.isFull()) {
      this.space.add(vehicle);
      return true;
    }

    return false;
  }

  public boolean isFull() {
    return this.space.size() >= this.size;
  }

  public boolean is80PercentFull() {
    return this.spaceOccupied() >= 80;
  }

  private int spaceOccupied() {
    return (this.space.size() / this.size) * 100;
  }
}
