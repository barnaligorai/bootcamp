package com.tw.step8.assignment4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParkingLotTest {

  @Test
  void shouldParkAVehicle() {
    ParkingLot parkingLot = new ParkingLot(2);

    assertTrue(parkingLot.park(Vehicle.CAR));
  }

  @Test
  void shouldNotParkAVehicleWhenParkingLotIsFull() {
    ParkingLot parkingLot = new ParkingLot(1);

    parkingLot.park(Vehicle.CAR);

    assertFalse(parkingLot.park(Vehicle.CAR));
  }

  @Test
  void shouldTellIfTheParkingLotIsNotFull() {
    ParkingLot parkingLot = new ParkingLot(1);

    assertFalse(parkingLot.isFull());
  }

  @Test
  void shouldTellWhenTheParkingLotIsFull() {
    ParkingLot parkingLot = new ParkingLot(1);

    parkingLot.park(Vehicle.CAR);

    assertTrue(parkingLot.isFull());
  }
}