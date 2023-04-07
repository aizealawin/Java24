package com.java24hours;

public class ModemTester {
  public static void main(String[] arguments) {
    CableModem surfBoard = new CableModem();
    DslModem gateway = new DslModem();
    AcousticModem roadrunner = new AcousticModem();
    surfBoard.speed = 500_000;
    gateway.speed = 400_000;
    roadrunner.speed = 500;
    System.out.println("Trying the cable modem:");
    surfBoard.displaySpeed();
    surfBoard.connect();
    surfBoard.disconnect();
    System.out.println("Trying the DSL modem:");
    gateway.displaySpeed();
    gateway.connect();
    gateway.disconnect();
    System.out.println("Trying the Acoustic modem:");
    roadrunner.displaySpeed();
    roadrunner.connect();
    roadrunner.disconnect();
  }
}
