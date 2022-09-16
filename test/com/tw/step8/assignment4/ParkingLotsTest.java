package com.tw.step8.assignment4;

import com.tw.step8.assignment4.exception.InvalidParkingLotSizeExpection;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParkingLotsTest {
  @Test
  void shouldAddAParkingLot() throws InvalidParkingLotSizeExpection {
    ParkingLots parkingLots = new ParkingLots();

    int lotID = parkingLots.add(2);

    assertEquals(1, lotID);
  }

  @Test
  void shouldParkACarInGivenParkingLot() throws InvalidParkingLotSizeExpection {
    ParkingLots parkingLots = new ParkingLots();
    int lotID = parkingLots.add(2);

    assertTrue(parkingLots.park(lotID, Vehicle.CAR));
  }
}