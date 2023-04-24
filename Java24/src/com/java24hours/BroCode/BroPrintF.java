package com.java24hours.BroCode;

import java.util.*;

public class BroPrintF {

  // printf() = an optional method to control, format, and display text to console
  // window.
  // two args = format string + (obj/var/val)
  // % [flags] [precision] [width] [conversion chr]
  public static void main(String[] args) {

    // System.out.printf("%d This is a format string", 123);

    boolean myBoolean = true;
    char myChar = '$';
    String myString = "Bro";
    int myInt = 12;
    double myDouble = 1000;

    System.out.printf("%b", myBoolean);
    System.out.printf("%c", myChar);
    System.out.printf("%s", myString);
    System.out.printf("%d", myInt);
    System.out.printf("%f", myDouble);
  }

}
