package com.java24hours.BroCode.DataStructuresAndAlgorithms;
import java.util.ArrayList;
import java.util.LinkedList;

public class BroLinkedListsVSArrayLists {
    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        long startTime;
        long endTime;
        long elapsedTime;

        for(int i = 0; i < 1000000; i++){
            linkedList.add(i);
            arrayList.add(i);
        }

//      *************************LinkedList*************************
        startTime = System.nanoTime();

//        linkedList.get(0); - ArrayList Faster
//        linkedList.get(500000); - ArrayList Faster
//        linkedList.get(999999); - ArrayList Faster
//        Accessing an element with an array list is always faster because we have random access of elements

//        linkedList.remove(0); - LinkedList Faster
//        linkedList.remove(500000); - ArrayList Faster
//        linkedList.remove(999999); - ArrayList Faster -

        endTime = System.nanoTime();

        elapsedTime = endTime - startTime;

        System.out.println("LinkedList: \t" + elapsedTime + " ns");


//      *************************ArrayList**************************
        startTime = System.nanoTime();

//        arrayList.get(0); - ArrayList Faster
//        arrayList.get(500000); - ArrayList Faster
//        arrayList.get(999999); - ArrayList Faster

//        arrayList.remove(0); - LinkedList Faster
//        arrayList.remove(500000); - ArrayList Faster
//        arrayList.remove(999999); - ArrayList Faster - the closer we are to the end the less elements we have to shift

        endTime = System.nanoTime();

        elapsedTime = endTime - startTime;

        System.out.println("ArrayList: \t" + elapsedTime + " ns");
    }
}
