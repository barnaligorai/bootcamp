package com.tw.step8.assignment4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParkingLotTest {

  @Test
  void shouldParkAVehicle() {
    ParkingLot parkingLot = new ParkingLot(2);

    assertTrue(parkingLot.park("Car1"));
  }

  @Test
  void shouldNotParkAVehicleWhenLotIsFull() {
    ParkingLot parkingLot = new ParkingLot(1);

    parkingLot.park("Car1");

    assertFalse(parkingLot.park("Car2"));
  }

  @Test
  void shouldTellIfTheLotIsNotFull() {
    ParkingLot parkingLot = new ParkingLot(1);

    assertFalse(parkingLot.isFull());
  }

  @Test
  void shouldTellWhenTheLotIsFull() {
    ParkingLot parkingLot = new ParkingLot(1);

    parkingLot.park("Car");

    assertTrue(parkingLot.isFull());
  }
}