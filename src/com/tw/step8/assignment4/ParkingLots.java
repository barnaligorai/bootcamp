package com.tw.step8.assignment4;

import com.tw.step8.assignment4.exception.InvalidParkingLotSizeExpection;

import java.util.ArrayList;

public class ParkingLots {

  private final ArrayList<ParkingLot> parkingLots;
  private final Notifier notifier;

  public ParkingLots(Notifier notifier) {
    this.notifier = notifier;
    this.parkingLots = new ArrayList<ParkingLot>();
  }

  public int add(int size) throws InvalidParkingLotSizeExpection {
    this.parkingLots.add(ParkingLot.create(this.parkingLots.size() + 1, size));
    return this.parkingLots.size();
  }

  public boolean parkIn(int lotID, Car car) {
    ParkingLot parkingLot = this.parkingLots.get(lotID - 1);
    this.notifier.notify(parkingLot.info());

    return parkingLot.park(car);
  }

  public boolean isFull(int lotID) {
    ParkingLot parkingLot = this.parkingLots.get(lotID - 1);
    return parkingLot.isFull();
  }

  public boolean is80PercentFull(int lotID) {
    ParkingLot parkingLot = this.parkingLots.get(lotID - 1);
    return parkingLot.is80PercentFull();
  }

  public ArrayList<ParkingLotData> info() {
    ArrayList<ParkingLotData> parkingLotsData = new ArrayList<ParkingLotData>();
    for (ParkingLot parkingLot : this.parkingLots) {
      parkingLotsData.add(parkingLot.info());
    }
    return parkingLotsData;
  }
}
