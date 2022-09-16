package com.tw.step8.assignment4;

import java.util.ArrayList;

public class ParkingLot {
  private final int size;
  private final ArrayList<Vehicle> space;

  public ParkingLot(int size) {
    this.size = size;
    this.space = new ArrayList<Vehicle>(size);
  }

  public boolean park(Vehicle vehicle) {
    if (!this.isFull()) {
      this.space.add(vehicle);
      return true;
    }

    return false;
  }

  public boolean isFull() {
    return this.space.size() >= this.size;
  }

}
