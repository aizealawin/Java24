package com.java24hours.BroCode.OOP;

public class BroOOPOne {
  public static void main(String[] args) {

    // object = an instance of a class that may contain attributes and methods
    // example: (phone, desk, computer, coffee cup)

    Car myCar1 = new Car();
    Car myCar2 = new Car();

    System.out.println(myCar1.make);
    System.out.println(myCar1.model);

    System.out.println();

    myCar2.model = "Malibu";
    System.out.println(myCar2.make);
    System.out.println(myCar2.model);

    // myCar.drive();
    // myCar.brake();

  }

}
