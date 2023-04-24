package com.java24hours.BroCode;

import java.util.ArrayList;

public class GroceryArrayList {
  public static void main(String[] args) {

    ArrayList<ArrayList<String>> groceryList = new ArrayList();

    ArrayList<String> bakeryList = new ArrayList();
    bakeryList.add("pasta");
    bakeryList.add("garlic bread");
    bakeryList.add("donuts");

    // System.out.println(bakeryList);

    ArrayList<String> produceList = new ArrayList();
    produceList.add("tomatoes");
    produceList.add("zucchini");
    produceList.add("peppers");

    // System.out.println(produceList);

    ArrayList<String> drinksList = new ArrayList();
    drinksList.add("soda");
    drinksList.add("coffee");

    // System.out.println(drinksList);

    groceryList.add(bakeryList);
    groceryList.add(produceList);
    groceryList.add(drinksList);

    System.out.println(groceryList);
    System.out.println(groceryList.get(2).get(1));

  }
}
