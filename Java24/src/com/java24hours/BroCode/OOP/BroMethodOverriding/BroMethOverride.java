package com.java24hours.BroCode.OOP.BroMethodOverriding;

public class BroMethOverride {

  public static void main(String[] args) {

    // method overriding = declaring a method in a subclass which is already present
    // in a parent class. done so that a child class can give its OWN implementation

    Animal animal = new Animal();
    Dog dog = new Dog();

    dog.speak();
    animal.speak();

  }
}
