package com.java24hours.BroCode;

import java.util.*;

public class BroForEach {
  public static void main(String[] args) {
    // String[] animals = { "cat", "dog", "rat", "bird" };

    ArrayList<String> animals = new ArrayList<String>();
    animals.add("cat");
    animals.add("rat");
    animals.add("dog");
    animals.add("bird");

    for (String i : animals) {
      System.out.println(i);
    }
  }
}
