package com.java24hours.BroCode.DataStructuresAndAlgorithms;
import java.util.Arrays;

public class BroBinarySearch {
//    binary search = Search algorithm that finds the position of a target val within a sorted array.
//                    Half of the array is eliminated during each step.

    public static void main(String[] args) {
        int array[] = new int[10000000];
        int target = 777777;

        for (int i = 0; i < array.length; i++){
            array[i] = i;
        }

//        int index = Arrays.binarySearch(array, target);
//        built in binary search function from Java.util
        int index = recursiveBinarySearch(array, target);


        if (index == -1){
            System.out.println(target + " not found.");
        } else System.out.println("Element found at: " + index);
    }

//    private static int binarySearch(int[] array, int target) {
//
//        int low = 0;
//        int high = array.length -1;
//
//        while (low <= high){
//            int middle = (low + high) / 2;
//            int value = array[middle];
//
//            System.out.println("middle :" + value);
//
//            if(value < target) low = middle + 1;
//            else if (value > target) high = middle -1;
//            else return middle;
//        }
//        return -1;
//    }

    private static int recursiveBinarySearch(int[] array, int target){
        return search(array, target, 0, array.length -1);
    }

    private static int search(int[] array, int target, int leftI, int rightI){
        if (leftI > rightI) return -1;

        int middle = (leftI + rightI) / 2;
        System.out.println("middle :" + middle);

        if(target == middle) return middle;
        else if (target > middle) return search(array, target, middle + 1, rightI);
        else return search(array, target, leftI, middle -1);
    }
}
