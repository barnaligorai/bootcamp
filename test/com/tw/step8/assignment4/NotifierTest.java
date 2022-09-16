package com.tw.step8.assignment4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotifierTest {

  @Test
  void shouldAddSub() {
    Notifier notifier = new Notifier();

    assertTrue(notifier.addSub(Subscriber.ATTENDANT));
  }

  @Test
  void shouldNotify() {
    Notifier notifier = new Notifier();
    notifier.addSub(Subscriber.MANAGER);
    notifier.addSub(Subscriber.ATTENDANT);
    notifier.addSub(Subscriber.CIVIC);

    ParkingLotData parkingLotData = new ParkingLotData(1, 5, 4);

    assertTrue(notifier.notify(parkingLotData));
  }
}