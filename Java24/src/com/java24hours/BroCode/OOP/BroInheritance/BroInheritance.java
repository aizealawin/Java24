package com.java24hours.BroCode.OOP.BroInheritance;

public class BroInheritance {
  public static void main(String[] args) {
    // inheritance = the process where one class acquires the attributes and methods
    // of another.
    Car car = new Car();
    Bicycle bike = new Bicycle();

    car.go();
    bike.go();

    System.out.println(bike.speed);
    System.out.println(car.speed);

    System.out.println(car.doors);
    System.out.println(bike.pedals);
  }
}
