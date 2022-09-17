package com.tw.step8.assignment4;

import java.util.ArrayList;

public class Notifier {
  private final ArrayList<Subscriber> subscribers;

  public Notifier() {
    this.subscribers = new ArrayList<Subscriber>();
  }

  public boolean addSub(Subscriber subscriber) {
    this.subscribers.add(subscriber);
    return true;
  }

  public boolean notify(ParkingLotData parkingLotData) {
    double spaceOccupied = parkingLotData.spaceOccupied();
    for (Subscriber subscriber : this.subscribers) {
      if (isInRange(spaceOccupied, subscriber)) {
        subscriber.notifyMe(parkingLotData.id);
      }
    }
    return true;
  }

  private static boolean isInRange(double spaceOccupied, Subscriber subscriber) {
    return subscriber.minLimit >= spaceOccupied && spaceOccupied <= subscriber.maxLimit;
  }
}
