package com.java24hours.BroCode.DataStructuresAndAlgorithms.BroDynamicArray;

public class Main {
    public static void main(String[] args) {

//        The ArrayList class exists as basically a dynamic array already.
//        Prebuilt and should be used in normal cases.
//        Building our own dynamic array for learning purposes though.

        DynamicArray dynamicArray = new DynamicArray(5);


        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");
        dynamicArray.add("D");
        dynamicArray.add("E");
        dynamicArray.add("F");

        dynamicArray.delete("A");
        dynamicArray.delete("B");
        dynamicArray.delete("C");


//        dynamicArray.insert(0, "X");
//        dynamicArray.delete("A");
//        System.out.println(dynamicArray.search("C"));

        System.out.println("size: " + dynamicArray.size);
        System.out.println("capacity: " + dynamicArray.capacity);
        System.out.println("empty: " + dynamicArray.isEmpty());


        System.out.println(dynamicArray);


    }
}
