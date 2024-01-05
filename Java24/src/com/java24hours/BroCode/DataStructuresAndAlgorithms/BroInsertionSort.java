package com.java24hours.BroCode.DataStructuresAndAlgorithms;

public class BroInsertionSort {
    public static void main(String[] args) {

//        insertion sort = start at index 1, compare it to index 0, then see if 0 > 1. if yes then shift all elements
//                         to the right
//                         then increase the original index.

//                         Bro Definition: after comparing elements to the left
//                                         shift elements to the right to make room to insert a value

//                         O(n^2) bad for large sets but preferred over bubble and selection
//                         Best case is O(n) compared to Selection Sort O(n^2)

        int array[]= {9, 1, 8, 2, 7, 3, 6, 4, 5};

        insertionSort(array);

        for (int i : array){
            System.out.print(i);
        }
    }

    private static void insertionSort(int[] array) {

        for(int i = 1; i < array.length; i++){
            int temp = array[i];
            int j = i-1;
            while(j >= 0 && array[j] > temp){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = temp;
        }

    }
}
