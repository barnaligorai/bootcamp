package com.tw.step8.assignment3.exception;

import com.tw.step8.assignment3.Unit;

public class MisMatchedUnitException extends Throwable {
  private final Unit unit1;
  private final Unit unit2;

  public MisMatchedUnitException(Unit unit1, Unit unit2) {
    super();
    this.unit1 = unit1;
    this.unit2 = unit2;
  }

  @Override
  public String getMessage() {
    return "Mis Matched Units : [" + unit1 + ", " + unit2 + "]";
  }
}
