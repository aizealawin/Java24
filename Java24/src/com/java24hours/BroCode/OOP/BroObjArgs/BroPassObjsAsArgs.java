package com.java24hours.BroCode.OOP.BroObjArgs;

public class BroPassObjsAsArgs {
  public static void main(String[] args) {

    Garage garage = new Garage();

    Car car1 = new Car("BMW");
    Car car2 = new Car("Bentley");

    garage.park(car1);
    garage.park(car2);
  }
}
