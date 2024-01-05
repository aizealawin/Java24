package com.java24hours.BroCode.DataStructuresAndAlgorithms;

public class BroSelectionSort {

    public static void main(String[] args) {

//        Selection sort = in place comparison sorting algorithm that keeps track of minimum value during each iteration
//                         at the end of each iteration swap variables

//                         O(n^2)
//                         Okay for small data sets bad for large data sets.

        int array[]= {9, 1, 8, 2, 7, 3, 6, 4, 5};

        selectionSort(array);

        for(int i : array){
            System.out.print(i);
        }
    }

    private static void selectionSort(int[] array) {

        for(int i = 0; i  < array.length -1; i++){
            int min = i;
            for(int j = i + 1; j < array.length; j++){
                if(array[min] > array[j]){
                    min = j;
                }
            }

            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }
}