package com.java24hours.BroCode.OOP.BroStatic;

import java.math.MathContext;

public class BroStaticKeyword {
  public static void main(String[] args) {
    // Static = modifier. A single copy of a variable/method is created and shared.
    // The class "owns" the static member
    Friend friend1 = new Friend("Spongebob");
    Friend friend2 = new Friend("Patrick");
    Friend friend3 = new Friend("Squidward");
    Friend friend4 = new Friend("Sandy");

    Friend.displayFriends();

  }
}
