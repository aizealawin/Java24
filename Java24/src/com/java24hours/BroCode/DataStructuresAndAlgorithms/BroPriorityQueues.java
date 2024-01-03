package com.java24hours.BroCode.DataStructuresAndAlgorithms;
import java.util.*;

public class BroPriorityQueues {
    public static void main(String[] args) {

//        Priority Queue = FIFO data structure that serves elements
//                         with the highest priorities first
//                         before elements with lower priority


//        this is how a standard queue functions
//        Queue<Double> queue = new LinkedList<>();
//
//        queue.offer(3.0);
//        queue.offer(4.0);
//        queue.offer(1.5);
//        queue.offer(2.0);
//        queue.offer(2.5);
//
//        while(!queue.isEmpty()){
//            System.out.println(queue.poll());
//        }

//        we changed LinkedList when intializing the Queue to PriorityQueue
//        Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());
//        we need to pass a constructor within the method ()
//        we used a prebuilt one that is available in the Collections class within java
//
//        queue.offer(3.0);
//        queue.offer(4.0);
//        queue.offer(1.5);
//        queue.offer(2.0);
//        queue.offer(2.5);
//
//
//        while(!queue.isEmpty()){
//            System.out.println(queue.poll());
//        }

        Queue<String> queue = new PriorityQueue<>(Collections.reverseOrder());

        queue.offer("B");
        queue.offer("C");
        queue.offer("A");
        queue.offer("F");
        queue.offer("D");


        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }

//        this is like a queue but sorted via certain priority


    }
}
