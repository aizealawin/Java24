package com.java24hours;

public class AcousticModem extends Modem {
  public AcousticModem() {
    method = "acoustic connection";
  }

  public void connect() {
    System.out.println("Connecting to the internet ...");
    System.out.println("Using an " + method);
  }
}
