package com.java24hours.BroCode.DataStructuresAndAlgorithms;

public class BroBubbleSort {
    public static void main(String[] args) {

//        Bubble Sort = A sorting algorithm that compares adjacent elements and checks to see if theyre in order
//                      continued until all elements are in order
//
//                      Imagine the data is in water, anything unsorted will bubble up to the top / surface
//                      Not very efficient - O(n^2)
//                          The larger the data set the slower the sort is

        int array[]= {9, 1, 8, 2, 7, 3, 6, 4, 5};

        bubbleSort(array);

//        Very simple to write but still very inefficient

        for(int i : array) {
            System.out.print(i);
        }
    }

    private static void bubbleSort(int array[]) {

        for(int i = 0; i  < array.length -1; i++){
            for(int j = 0; j < array.length - 1 - i; j++){
                if(array[j] < array[j+1]){
                    int temp  = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

    }
}
