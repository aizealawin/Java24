package com.java24hours.BroCode.OOP.BroAbstract;

public class BroAbstract {
  public static void main(String[] args) {
    // abstract = abstract class CANNOT be instantiated, but can have a subclass
    // abstract methods are declared without an implementation

    // Vehicle vehicle = new Vehicle();

    Car car = new Car();

    car.go();
  }

}
