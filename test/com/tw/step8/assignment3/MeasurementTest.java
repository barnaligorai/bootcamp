package com.tw.step8.assignment3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MeasurementTest {

  @Test
  void compareLengths() {
    Measurement twoFeet = new Measurement(UnitOfLength.FEET, 2);
    Measurement twentyFourInch = new Measurement(UnitOfLength.INCH, 24);

    assertEquals(0, twoFeet.compare(twentyFourInch));
  }

  @Test
  void compareVolumes() {
    Measurement twoGallon = new Measurement(UnitOfVolume.GALLON, 2);
    Measurement volumeInLiter = new Measurement(UnitOfVolume.LITER, 7.56);

    assertEquals(0, twoGallon.compare(volumeInLiter));
  }


}