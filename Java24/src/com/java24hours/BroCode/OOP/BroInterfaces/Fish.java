package com.java24hours.BroCode.OOP.BroInterfaces;

public class Fish implements Prey, Predator{

    @Override
    public void flee(){
        System.out.println("The fish is fleeing from larger fish.");
    }

    public void hunt(){
        System.out.println("This fish is hunting smaller fish.");
    }
}
