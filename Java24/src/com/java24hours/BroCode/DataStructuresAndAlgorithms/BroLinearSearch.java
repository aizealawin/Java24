package com.java24hours.BroCode.DataStructuresAndAlgorithms;

public class BroLinearSearch {
    public static void main(String[] args) {

        // linear search = Iterate through a collection of one element at a time

        //                 runtime complexity = O(n)

        //                 Disadvantages:
        //                 Slow for large data sets

        //                 Advantages:
        //                 Fast for searches of small to medium data sets
        //                 Does not need to be sorted (over Binary Searches and Interpolation Searches)
        //                 Useful for data structures that do not have random access (Linked List)

        int[] array = {9, 3, 12, 1, 5, 6, 2, 4};

        int index = linearSearch(array, 10);
        if (index != -1){
            System.out.println("Element found at index: " + index);
        } else System.out.println("Element not found");
    }

    private static int linearSearch(int[] array, int value) {

        for(int i = 0; i < array.length; i++){
            if(array[i] == value) return i;
        }
        return -1;
    }

//    We iterate through some collection one element at a time (slow for large but fast for medium - small data sets)
//    HUGE ADVANTAGE = not needing to be sorted
}
