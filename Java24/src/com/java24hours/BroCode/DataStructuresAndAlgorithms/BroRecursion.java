package com.java24hours.BroCode.DataStructuresAndAlgorithms;

public class BroRecursion {

//    recursion = When a thing is defined in terms of itself - wikipedia
//                Apply the result of a procedure, to a procedure.
//                A recursive method calls itself. Can be a substitute for iteration.
//                Divide a problem into sub-problems of the same type as the original.
//                Commonly used with advanced sorting algorithms and navigating trees

//                Advantages
//                ----------
//                Easier to read/write
//                Easier to debug

//                Disadvantages
//                ----------
//                Sometimes slower
//                Uses more memory

//                Programs have a data structures called a "call stack"
//                  Keeps track of the order in which our program needs to function
//                  LIFO data structure
//                  We're adding more frames to the call stack
//                  It is possible to run out of memory
//

    public static void main(String[] args) {

//        recursiveWalk(5);
        System.out.println(factorial(7));
        System.out.println(power(2, 8));
    }

    private static int power(int base, int exponent) {
        if(exponent < 1) return 1;
        return base*power(base, exponent-1);
    }

    private static int factorial(int num) {
        if (num < 1) return 1;

        return num*factorial(num-1);
    }


    private static void walk(int steps) {
        for(int i = 0; i < steps; i++){
            System.out.println("You take a step!");
        }
    }

    private static void recursiveWalk(int steps){
        if (steps < 1) return;

        System.out.println("You take a step!");

        recursiveWalk(steps-1);
    }
}
