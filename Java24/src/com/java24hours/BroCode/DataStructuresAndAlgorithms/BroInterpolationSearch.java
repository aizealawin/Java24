package com.java24hours.BroCode.DataStructuresAndAlgorithms;

public class BroInterpolationSearch {
    public static void main(String[] args) {

//        interpolation search = improvement over binary search best used for "uniformly" distributed data
//                               "guesses" where a value might be based on calculated probe results
//                               if prove is incorrect, search area is narrowed, and a new probe is calculated

//                               average case: O(log(log(n)))
//                               worst case: O(n) [values increase exponentially

//        works very well with uniformly distributed data, meaning that each value is increasing by the same amount

//        int[] array = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024};

//        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int[] array = {1, 4, 6, 21, 24, 58, 65, 69, 70};

        int index = interpolationSearch(array, 58);

        if(index != -1) System.out.println("Element found at index: " + index);
        else System.out.println("Element not found.");


    }

    private static int interpolationSearch(int[] array, int value) {

        int high = array.length -1;
        int low = 0;

        while(value >= array[low] && value <= array[high] && low <= high){

//            the size of our current searchable area (high - low)
//            9 elements times the value we're searching for - the value at lower bound (8-1)
//            divided by the value at the higher bound - the array at the lower bound
//            at the end tacking on what the lower bound is.

            int probe = low + (high - low) * (value - array[low]) /
                    (array[high] - array[low]);

            System.out.println("Probe: " + probe);

            if(array[probe] == value) return probe;
            else if (array[probe] < value) low = probe + 1;
            else high = probe - 1;
        }
        return -1;

    }
}
