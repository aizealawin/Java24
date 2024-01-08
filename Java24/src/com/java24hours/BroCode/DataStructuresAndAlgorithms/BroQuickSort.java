package com.java24hours.BroCode.DataStructuresAndAlgorithms;

public class BroQuickSort {
    public static void main(String[] args) {

//        Quick Sort = Pick a pivot (either at the beginning middle or end) most start at the end of array
//                     find final resting place of the pivot
//                     Declare two indicies
//                              i = 1 less the beginning of array
//                              j = start of array
//                              temp
//                     is value at j < pivot otherwise we ignore it
//                     if it is swap two values using temp

//        Bro Definition: moves smaller elements to left of a pivot.
//                        recursively divide array in 2 partitions

//        run-time complexity = Best case O(n log(n))
//                              Average case O(n log(n))
//                              Worst case O(n^2) if already sorted

//        space complexity = O(log(n)) due to recursion

        int[] array = {8, 2, 5, 3, 9, 4, 7, 6, 1};

        quickSort(array, 0, array.length-1);

        for(int i : array){
            System.out.print(i + " ");
        }
    }

    private static void quickSort(int[] array, int start, int end) {

        if(end <= start) return; //base case

        int pivot = partition(array, start, end);
        quickSort(array, start, pivot -1);
        quickSort(array, pivot+1, end);
    }

    public static int partition(int[] array, int start, int end) {
        int pivot = array[end];
        int i = start-1;
        for(int j = start; j <= end-1; j++){
            if(array[j]>pivot){
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        i++;
        int temp = array[i];
        array[i] = array[end];
        array[end] = temp;
        return i;
    }
}
