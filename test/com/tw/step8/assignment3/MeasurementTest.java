package com.tw.step8.assignment3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MeasurementTest {

  @Test
  void compareLengthsInFeetAndInch() {
    Measurement<UnitOfLength> twoFeet = new Measurement<UnitOfLength>(UnitOfLength.FEET, 2);
    Measurement<UnitOfLength> twentyFourInch = new Measurement<UnitOfLength>(UnitOfLength.INCH, 24);

    assertEquals(0, twoFeet.compare(twentyFourInch));
  }

  @Test
  void compareVolumes() {
    Measurement<UnitOfVolume> twoGallon = new Measurement<UnitOfVolume>(UnitOfVolume.GALLON, 2);
    Measurement<UnitOfVolume> volumeInLiter = new Measurement<UnitOfVolume>(UnitOfVolume.LITER, 7.56);

    assertEquals(0, twoGallon.compare(volumeInLiter));
  }

  @Test
  void shouldAddTwoInches() {
    Measurement<UnitOfLength> twoInch = new Measurement<UnitOfLength>(UnitOfLength.INCH, 2);
    Measurement<UnitOfLength> threeInch = new Measurement<UnitOfLength>(UnitOfLength.INCH, 3);
    Measurement<UnitOfLength> expectedMeasurement = new Measurement<UnitOfLength>(UnitOfLength.INCH, 5);

    Measurement<UnitOfLength> actualMeasurement = twoInch.add(threeInch);

    assertEquals(expectedMeasurement, actualMeasurement);
  }

  @Test
  void shouldAddInchAndCM() {
    Measurement<UnitOfLength> twoInch = new Measurement<UnitOfLength>(UnitOfLength.INCH, 2);
    Measurement<UnitOfLength> twoAndHalfCM = new Measurement<UnitOfLength>(UnitOfLength.CM, 2.5);
    Measurement<UnitOfLength> expectedMeasurement = new Measurement<UnitOfLength>(UnitOfLength.INCH, 3);

    Measurement<UnitOfLength> actualMeasurement = twoInch.add(twoAndHalfCM);

    assertEquals(expectedMeasurement, actualMeasurement);
  }

  @Test
  void shouldAddGallonAndLiters() {
    Measurement<UnitOfVolume> twoGallon = new Measurement<UnitOfVolume>(UnitOfVolume.GALLON, 1);
    Measurement<UnitOfVolume> oneLiter = new Measurement<UnitOfVolume>(UnitOfVolume.LITER, 1);
    Measurement<UnitOfVolume> expectedVolume = new Measurement<UnitOfVolume>(UnitOfVolume.LITER, 4.78);

    Measurement<UnitOfVolume> actualVolume = twoGallon.add(oneLiter);

    assertTrue(actualVolume.isEquivalent(expectedVolume, 0.01));
  }

}
