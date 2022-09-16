package com.tw.step8.assignment4;

import com.tw.step8.assignment4.exception.InvalidParkingLotSizeExpection;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParkingLotTest {

  @Test
  void shouldThrowInvalidSizeException() {
    assertThrows(InvalidParkingLotSizeExpection.class, () -> ParkingLot.create(0));
  }

  @Test
  void shouldParkAVehicle() throws InvalidParkingLotSizeExpection {
    ParkingLot parkingLot = ParkingLot.create(2);

    assertTrue(parkingLot.park(Vehicle.CAR));
  }

  @Test
  void shouldNotParkAVehicleWhenParkingLotIsFull() throws InvalidParkingLotSizeExpection {
    ParkingLot parkingLot = ParkingLot.create(1);

    parkingLot.park(Vehicle.CAR);

    assertFalse(parkingLot.park(Vehicle.CAR));
  }

  @Test
  void shouldTellIfTheParkingLotIsNotFull() throws InvalidParkingLotSizeExpection {
    ParkingLot parkingLot = ParkingLot.create(1);

    assertFalse(parkingLot.isFull());
  }

  @Test
  void shouldTellWhenTheParkingLotIsFull() throws InvalidParkingLotSizeExpection {
    ParkingLot parkingLot = ParkingLot.create(1);

    parkingLot.park(Vehicle.CAR);

    assertTrue(parkingLot.isFull());
  }
}