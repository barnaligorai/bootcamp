package com.tw.step8.assignment4;

import com.tw.step8.assignment4.exception.InvalidParkingLotSizeExpection;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ParkingLotsTest {
  @Test
  void shouldAddAParkingLot() throws InvalidParkingLotSizeExpection {
    ParkingLots parkingLots = new ParkingLots(new Notifier());

    int lotID = parkingLots.add(2);

    assertEquals(1, lotID);
  }

  @Test
  void shouldParkACarInGivenParkingLot() throws InvalidParkingLotSizeExpection {
    ParkingLots parkingLots = new ParkingLots(new Notifier());
    int lotID = parkingLots.add(2);
    Car car = new Car(1);

    assertTrue(parkingLots.parkIn(lotID, car));
  }

  @Test
  void shouldTellTheGivenParkingLotIsFull() throws InvalidParkingLotSizeExpection {
    ParkingLots parkingLots = new ParkingLots(new Notifier());
    int lotID = parkingLots.add(1);
    Car car = new Car(1);

    parkingLots.parkIn(lotID, car);

    assertTrue(parkingLots.isFull(lotID));
  }

  @Test
  void shouldTellTheGivenParkingLotIsNotFull() throws InvalidParkingLotSizeExpection {
    ParkingLots parkingLots = new ParkingLots(new Notifier());
    int lotID = parkingLots.add(1);

    assertFalse(parkingLots.isFull(lotID));
  }

  @Test
  void shouldTellTheGivenParkingLotIsNot80PercentFull() throws InvalidParkingLotSizeExpection {
    ParkingLots parkingLots = new ParkingLots(new Notifier());
    int lotID = parkingLots.add(1);

    assertFalse(parkingLots.is80PercentFull(lotID));
  }

  @Test
  void shouldTellTheGivenParkingLotIs80PercentFull() throws InvalidParkingLotSizeExpection {
    ParkingLots parkingLots = new ParkingLots(new Notifier());
    int lotID = parkingLots.add(1);
    Car car = new Car(1);

    parkingLots.parkIn(lotID, car);

    assertTrue(parkingLots.is80PercentFull(lotID));
  }

  @Test
  void shouldGiveParkingLotsInfo() throws InvalidParkingLotSizeExpection {
    ParkingLots parkingLots = new ParkingLots(new Notifier());
    int lot1 = parkingLots.add(1);
    ParkingLotData parkingLotData = new ParkingLotData(1, 1, 0);
    ArrayList<ParkingLotData> expectedParkingLotsData = new ArrayList<>(Arrays.asList(parkingLotData));

    assertEquals(expectedParkingLotsData, parkingLots.info());
  }
}