package com.tw.step8.assignment4;

import com.tw.step8.assignment4.exception.InvalidParkingLotSizeExpection;

import java.util.ArrayList;

public class ParkingLots {

  private final ArrayList<ParkingLot> parkingLots;

  public ParkingLots() {
    this.parkingLots = new ArrayList<ParkingLot>();
  }

  public int add(int size) throws InvalidParkingLotSizeExpection {
    this.parkingLots.add(ParkingLot.create(size));
    return this.parkingLots.size();
  }

  public boolean park(int lotID, Vehicle vehicle) {
    ParkingLot parkingLot = this.parkingLots.get(lotID - 1);
    return parkingLot.park(vehicle);
  }
}
