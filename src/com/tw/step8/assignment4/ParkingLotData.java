package com.tw.step8.assignment4;

public class ParkingLotData {
  final int id;
  final int totalNumberOfSlots;
  final int slotsOccupied;

  public ParkingLotData(int id, int totalNumberOfSlots, int slotsOccupied) {
    this.id = id;
    this.totalNumberOfSlots = totalNumberOfSlots;
    this.slotsOccupied = slotsOccupied;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    ParkingLotData that = (ParkingLotData) o;

    if (totalNumberOfSlots != that.totalNumberOfSlots) return false;
    return slotsOccupied == that.slotsOccupied;
  }

  @Override
  public int hashCode() {
    int result = totalNumberOfSlots;
    result = 31 * result + slotsOccupied;
    return result;
  }
}
