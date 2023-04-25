package com.java24hours.BroCode.OOP;

public class BroConstructor {
  public static void main(String[] args) {

    Human human1 = new Human("Kusal", 18, 210);
    Human human2 = new Human("Katrina", 24, 130.30);

    System.out.println(human1.name);
    System.out.println("Human2's age " + human2.age);

    human2.eat();
    human1.drink();

  }
}
