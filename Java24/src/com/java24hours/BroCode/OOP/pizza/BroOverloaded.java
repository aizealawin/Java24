package com.java24hours.BroCode.OOP.pizza;

public class BroOverloaded {
  public static void main(String[] args) {

    // Overloaded Constructors = Multiple constructors within a class with the same
    // name,
    // BUT they have different parameters
    // name + parameters = signatures

    Pizza pizza = new Pizza();

    System.out.println("Here are the ingredients of your pizza: ");
    System.out.println(pizza.bread);
    System.out.println(pizza.sauce);
    System.out.println(pizza.cheese);
    System.out.println(pizza.topping);
  }
}
