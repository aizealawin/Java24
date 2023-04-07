package com.java24hours;

public class CableModem extends Modem {
  public CableModem() {
    method = "cable connection";
  }

  public void connect() {
    System.out.println("Connecting to the internet ...");
    System.out.println("Using a " + method);
  }
}
