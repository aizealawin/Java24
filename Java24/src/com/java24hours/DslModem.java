package com.java24hours;

public class DslModem extends Modem {
  public DslModem() {
    method = "DSL phone connection";
  }

  public void connect() {
    System.out.println("Connecting to the Internet ...");
    System.out.println("Using a " + method);
  }
}
