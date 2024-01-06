package com.java24hours.BroCode.DataStructuresAndAlgorithms;

public class BroMergeSort {
    public static void main(String[] args) {

//        Merge Sort = pass an array to a merge sort function
//                     make two subarrays -> left and right
//                     recursive function
//                     pass in the subarrays

//                     continues until there's just a size of one
//                     O(n log n) = quasilinear time
//                     O(n) = linear space
//                          Bubble, Insertion, and Selection are O(1) space

//        Bro Definition: recursively divide array in 2, sort, re-combine
//                        run-time complexity = O(n log n)
//                        space complexity = O(n)

        int[] array = {8, 2, 5, 3, 4, 7, 6, 1};

        mergeSort(array);

        for(int i = 0; i < array.length; i++){
            System.out.println(array[i] + " ");
        }
    }
    private static void mergeSort(int[] array){
        int length = array.length;
        if (length <= 1) return;

        int middle = length/2;

        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];

        int i = 0; //left array
        int j = 0; //right array

        for(; i < length; i++){
            if (i < middle){
                leftArray[i] = array[i];
            } else {
                rightArray[j] = array[i];
                j++;
            }
        }
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray, rightArray, array);
    }

    private static void merge(int[] leftArray, int[] rightArray, int[] array){
        int leftSize = array.length/2;
        int rightSize = array.length -leftSize;

        int i = 0; // original array
        int l = 0; // left array
        int r = 0; // right array

        while(l < leftSize && r < rightSize){ // while there's elements in right and left array we will continue adding elements to original array
            if (leftArray[l] < rightArray[r]){
                array[i] = leftArray[l];
                i++;
                l++;
            } else {
                array[i] = rightArray[r];
                i++;
                r++;
            }
        }

        while(l < leftSize){
            array[i] = leftArray[l];
            i++;
            l++;
        }
        while (r < rightSize){
            array[i] = rightArray[r];
            i++;
            r++;
        }
    }
}
