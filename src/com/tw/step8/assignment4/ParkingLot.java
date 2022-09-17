package com.tw.step8.assignment4;

import com.tw.step8.assignment4.exception.InvalidParkingLotSizeExpection;

import java.util.ArrayList;

public class ParkingLot {
  public static final double MAX_PERCENTAGE = 100.0;
  public static final int EIGHTY_PERCENTAGE = 80;
  public static final int TWENTY_PERCENTAGE = 20;
  private final int size;
  private final ArrayList<Car> space;
  private final int id;

  private ParkingLot(int id, int size) {
    this.size = size;
    this.space = new ArrayList<Car>(size);
    this.id = id;
  }

  public static ParkingLot create(int id, int size) throws InvalidParkingLotSizeExpection {
    if (size < 1) {
      throw new InvalidParkingLotSizeExpection(size);
    }
    return new ParkingLot(id, size);
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
    return this.spaceOccupied() >= EIGHTY_PERCENTAGE;
  }

  private double spaceOccupied() {
    return (this.space.size() * MAX_PERCENTAGE) / this.size;
  }

  public boolean is20PercentFull() {
    return this.spaceOccupied() >= TWENTY_PERCENTAGE;
  }

  public ParkingLotData info() {
    return new ParkingLotData(this.id, this.size, this.space.size());
  }
}
