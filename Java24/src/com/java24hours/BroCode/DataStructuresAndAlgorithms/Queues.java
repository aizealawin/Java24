package com.java24hours.BroCode.DataStructuresAndAlgorithms;
import  java.util.Queue;
import  java.util.LinkedList;

public class Queues {
    public static void main(String[] args) {

//        Queue = FIFO data structure (first in first out) ex: line of people
//                A collection designed for holding elements prior to processing
//                Linear data structure
//
//                add = enqueue, offer()
//                remove - dequeue, poll()

//        We cannot instantiate the term Queue because Queue is an interface
//        this means its more of a template. Therefore, we need a class that implements queue... enter LinkedList

        Queue<String> queue = new LinkedList<String>();
//        We are only covering LinkedList features that utilize Queue interface

//        adds to the queue same as enqueue
        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");

//        System.out.println(queue.peek());

//        queue.poll();
//        queue.poll();
//        queue.poll();
//        queue.poll();

//        queue.element();
//        i can use element to remove as well but it throws an exception unlike poll.

//        the queue class also extends the Collection class meaning it inherits everything from it.

//        System.out.println(queue.isEmpty());

        System.out.println(queue.size());

//        doesn't show the index position just if it's included.
        System.out.println(queue.contains("Harold"));

        System.out.println(queue);

//        where are queues useful?
//        keyboard buffers (letters should appear on the screen in the order they're pressed)
//        printer queue (print jobs should be completed in order
//        used in linked-lists, priority-queues, breadth-first search algorithms



    }
}
