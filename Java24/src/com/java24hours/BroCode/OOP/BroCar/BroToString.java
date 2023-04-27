package com.java24hours.BroCode.OOP.BroCar;

public class BroToString {
  public static void main(String[] args) {

    // toString() = Special method that all objects inherit,
    // that returns a string that "textually represents" an object
    // can be used both implicitly and explicitly

    Car car = new Car();
    Car camero = new Car("Chevy", "Camero", "Blue", 2021);

    // System.out.println(car.toString());
    System.out.println(car);
    // System.out.println(camero);
  }
}