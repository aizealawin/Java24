package com.java24hours.BroCode.DataStructuresAndAlgorithms;

public class BroBigO {

//        Describes the performance of an algorithm as the amount of data increases
//        Machine dependent (# of steps to completion)
//        Ignore smaller operations O(n+1)-> O(n)

//        examples:

//      O(n) Linear Time:
        int addUp(int n){

            int sum = 0;
            for (int i = 0; i <= n; i++){
                sum += i;
            }
            return sum;
        }
//      if n = 1,000,000 then there are 1,000,000 steps, thus increasing the amount of steps linearly

//      O(1) constant time
        int addUpImproved(int n){
            int sum = n * (n+1)/2;
            return sum;
        }
//      The input size doesn't matter here because there are only three steps always

//    O(1) = constant time
//    random access of an element in an array
//    inserting at the beginning of a linkedlist

//    O(log n) = logarithmic time
//    binary search
//    takes increasingly less time to complete (as the data size increases this algo becomes more and more efficient)

//    O(n) = linear time
//    loop through elements in an array
//    searching through a linked list
//    as amt of data increases the time it takes increases proportionally (linearly)

//    O(n log n) = quasilinear time
//    quick sort
//    merge sort
//    heap sort
//    similar to linear time unless working with a very large data set - it starts to slow down

//    O(n^2) = quadratic time
//    insertion sort
//    selection sort
//    bubble sort
//    as the data increases the longer it takes more and more time to complete
//    if n = 1000 then our data step takes 1,000,000 steps way more than linear time

//    O(n!) = factorial time
//    Traveling salesman problem
//    EXTREMELY SLOW

//    Notation used to describe a performance of an algorith as the amount of data increases.



}
