package com.java24hours.BroCode.OOP.BroObjArgs;

public class Garage {

  void park(Car car) {
    System.out.println("The " + car.name + " is parked in the garage.");
  }

  void park(Motorcycle motorcycle) {
    System.out.println("The " + motorcycle.name + " is parked in the garage.");
  }
}
