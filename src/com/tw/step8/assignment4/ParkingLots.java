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

  public boolean parkIn(int lotID, Car vehicle) {
    ParkingLot parkingLot = this.parkingLots.get(lotID - 1);
    return parkingLot.park(vehicle);
  }

  public boolean isFull(int lotID) {
    ParkingLot parkingLot = this.parkingLots.get(lotID - 1);
    return parkingLot.isFull();
  }

  public boolean is80PercentFull(int lotID) {
    ParkingLot parkingLot = this.parkingLots.get(lotID - 1);
    return parkingLot.is80PercentFull();
  }
}
