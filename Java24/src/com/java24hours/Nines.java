package com.java24hours;

public class Nines {
  public static void main(String[] arguements) {
    for (int i = 0; i <= 400; i++) {
      int multiple = 0;
      if (i % 13 == 0) {
        multiple = i;
      } else {
        continue;
      }
      System.out.print(multiple + " ");
    }
  }
}
