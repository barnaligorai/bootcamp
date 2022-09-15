package com.tw.step8.assignment3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MeasurementTest {

  @Test
  void compareLengthsInFeetAndInch() {
    Measurement<UnitOfLength> oneFeet = new Measurement<UnitOfLength>(UnitOfLength.FEET, 1);
    Measurement<UnitOfLength> twoFeet = new Measurement<UnitOfLength>(UnitOfLength.FEET, 2);
    Measurement<UnitOfLength> twentyFourInch = new Measurement<UnitOfLength>(UnitOfLength.INCH, 24);

    assertEquals(0, twoFeet.compare(twentyFourInch));
    assertEquals(1, twoFeet.compare(oneFeet));
    assertEquals(-1, oneFeet.compare(twoFeet));
  }

  @Test
  void compareLengthsInInchAndCM() {
    Measurement<UnitOfLength> oneInch = new Measurement<UnitOfLength>(UnitOfLength.INCH, 1);
    Measurement<UnitOfLength> twoInch = new Measurement<UnitOfLength>(UnitOfLength.INCH, 2);
    Measurement<UnitOfLength> twoAndHalfCM = new Measurement<UnitOfLength>(UnitOfLength.CM, 2.5);

    assertEquals(0, oneInch.compare(twoAndHalfCM));
    assertEquals(1, twoInch.compare(oneInch));
    assertEquals(-1, oneInch.compare(twoInch));
  }

  @Test
  void compareVolumes() {
    Measurement<UnitOfVolume> oneGallon = new Measurement<UnitOfVolume>(UnitOfVolume.GALLON, 1);
    Measurement<UnitOfVolume> twoGallon = new Measurement<UnitOfVolume>(UnitOfVolume.GALLON, 2);
    Measurement<UnitOfVolume> volumeInLiter = new Measurement<UnitOfVolume>(UnitOfVolume.LITER, 7.56);

    assertEquals(0, twoGallon.compare(volumeInLiter));
    assertEquals(1, twoGallon.compare(oneGallon));
    assertEquals(-1, oneGallon.compare(twoGallon));
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

  @Test
  void shouldCompareTemperature() {
    Measurement<UnitOfTemperature> celcius100 = new Measurement<>(UnitOfTemperature.CELCIUS, 100);
    Measurement<UnitOfTemperature> celcius0 = new Measurement<>(UnitOfTemperature.CELCIUS, 0);
    Measurement<UnitOfTemperature> fahrenheit32 = new Measurement<>(UnitOfTemperature.FAHRENHEIT, 32);
    Measurement<UnitOfTemperature> fahrenheit212 = new Measurement<>(UnitOfTemperature.FAHRENHEIT, 212);

    assertEquals(0, celcius100.compare(fahrenheit212));
    assertEquals(0, celcius0.compare(fahrenheit32));
    assertEquals(-1, celcius0.compare(celcius100));
    assertEquals(1, celcius100.compare(celcius0));
  }
}
