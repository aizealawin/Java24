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

    // System.out.printf("%b", myBoolean);
    // System.out.printf("%c", myChar);
    // System.out.printf("%s", myString);
    // System.out.printf("%d", myInt);
    // System.out.printf("%f", myDouble);

    // [width]
    // minimum number of characters to be written as output
    // negative left justifies the text

    // System.out.printf("Hello %10s", myString);

    // [precision]
    // sets a number of digits of preciison when outputting floating-point values

    // System.out.printf("You have this much money %.2f", myDouble);

    // [flags]
    // adds an effect to output based on flag added to format specifier
    // - : left justify
    // + : output a + or - sign for numeric value
    // 0 : numeric values are zero-padded
    // , : comma grouping separator if numbers > 1000

    System.out.printf("You have this much money %,.2f", myDouble);

  }

}
