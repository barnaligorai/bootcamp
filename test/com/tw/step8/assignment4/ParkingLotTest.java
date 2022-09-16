package com.tw.step8.assignment4;

import com.tw.step8.assignment4.exception.InvalidParkingLotSizeExpection;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParkingLotTest {

  @Test
  void shouldThrowInvalidSizeException() {
    assertThrows(InvalidParkingLotSizeExpection.class, () -> ParkingLot.create(1, 0));
  }

  @Test
  void shouldParkAVehicle() throws InvalidParkingLotSizeExpection {
    ParkingLot parkingLot = ParkingLot.create(1, 2);

    Car car = new Car(1);

    assertTrue(parkingLot.park(car));
  }

  @Test
  void shouldNotParkAVehicleWhenParkingLotIsFull() throws InvalidParkingLotSizeExpection {
    ParkingLot parkingLot = ParkingLot.create(1, 1);
    Car car1 = new Car(1);
    Car car2 = new Car(2);

    parkingLot.park(car1);

    assertFalse(parkingLot.park(car2));
  }

  @Test
  void shouldTellIfTheParkingLotIsNotFull() throws InvalidParkingLotSizeExpection {
    ParkingLot parkingLot = ParkingLot.create(1, 1);

    assertFalse(parkingLot.isFull());
  }

  @Test
  void shouldTellWhenTheParkingLotIsFull() throws InvalidParkingLotSizeExpection {
    ParkingLot parkingLot = ParkingLot.create(1, 1);
    Car car = new Car(1);

    parkingLot.park(car);

    assertTrue(parkingLot.isFull());
  }

  @Test
  void shouldTellTheParkingLotIsNot80PercentFull() throws InvalidParkingLotSizeExpection {
    ParkingLot parkingLot = ParkingLot.create(1, 10);

    assertFalse(parkingLot.is80PercentFull());
  }

  @Test
  void shouldTellTheParkingLotIs80PercentFull() throws InvalidParkingLotSizeExpection {
    ParkingLot parkingLot = ParkingLot.create(1, 2);
    Car car1 = new Car(1);
    Car car2 = new Car(2);

    parkingLot.park(car1);
    parkingLot.park(car2);

    assertTrue(parkingLot.is80PercentFull());
  }

  @Test
  void shouldTellTheParkingLotIs20PercentFull() throws InvalidParkingLotSizeExpection {
    ParkingLot parkingLot = ParkingLot.create(1, 5);
    Car car = new Car(1);

    parkingLot.park(car);

    assertTrue(parkingLot.is20PercentFull());
  }

  @Test
  void shouldTellTheParkingLotIsNot20PercentFull() throws InvalidParkingLotSizeExpection {
    ParkingLot parkingLot = ParkingLot.create(1, 10);
    Car car = new Car(1);

    parkingLot.park(car);

    assertFalse(parkingLot.is20PercentFull());
  }

  @Test
  void shouldGiveParkingLotInfo() throws InvalidParkingLotSizeExpection {
    ParkingLot parkingLot = ParkingLot.create(1, 2);

    ParkingLotData expectedData = new ParkingLotData(1, 2, 0);

    assertEquals(expectedData, parkingLot.info());
  }
}