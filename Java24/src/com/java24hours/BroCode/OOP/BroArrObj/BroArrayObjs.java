package com.java24hours.BroCode.OOP.BroArrObj;

public class BroArrayObjs {
  public static void main(String[] args) {

    // the fridge can hold 3 foods
    // Food[] refrigerator = new Food[3];

    Food food1 = new Food("Pizza");
    Food food2 = new Food("Hamburger");
    Food food3 = new Food("Hotdog");

    Food[] refrigerator = { food1, food2, food3 };

    // refrigerator[0] = food1;
    // refrigerator[1] = food2;
    // refrigerator[2] = food3;

    System.out.println(refrigerator[0]);
    System.out.println(refrigerator[2]);
    System.out.println(refrigerator[1]);
  }
}
