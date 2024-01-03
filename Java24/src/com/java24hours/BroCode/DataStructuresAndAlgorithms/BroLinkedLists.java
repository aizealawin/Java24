package com.java24hours.BroCode.DataStructuresAndAlgorithms;
import java.util.*;
public class BroLinkedLists {
    public static void main(String[] args) {

//        LinkedList = stores nodes in 2 parts (data + address)
//                     Nodes are in non-consecutive memory locations
//                     Elements are linked using pointers

//                                  Singly Linked List
//                      Node                Node                Node
//                 [data | address] -> [data | address] -> [data | address]

//                                  Doubly Linked List
//  [address | data | address] <-> [address | data | address] <-> [address | data | address]

//        advantages?
//        Dynamic Data Structure (allocates needed memory while running)
//        Insertion and Deletion of Nodes is easy O(1)
//        No/Low memory waste

//        disadvantages?
//        Greater memory Usage ( additional pointer) even more so with doubly linked list
//        No random access of elements (no index[i]) need to begin at one end and make our way to the other end
//        Accessing / searching elements is more time-consuming. O(n) Linear

//        uses?
//        Implement Stacks/Queues
//        GPS navigation
//        Music playlist



        LinkedList<String> linkedlist = new LinkedList<String>();

//        linkedlist.push("A");
//        linkedlist.push("B");
//        linkedlist.push("C");
//        linkedlist.push("D");
//        linkedlist.push("F");

//        removes the tail
//        linkedlist.pop();

//        we use offer here to add to the end of the linkedlist. if we used push it would emulate a queue (LIFO)
        linkedlist.offer("A");
        linkedlist.offer("B");
        linkedlist.offer("C");
        linkedlist.offer("D");
        linkedlist.offer("F");

//        removes the head
//        linkedlist.poll();

        linkedlist.add(4, "E");

        linkedlist.remove("E");

//        there's no random access to a linked list

        System.out.println(linkedlist.indexOf("F"));

        System.out.println(linkedlist.peekFirst());
        System.out.println(linkedlist.peekLast());

        linkedlist.addFirst("0");
        linkedlist.addLast("G");

        String first = linkedlist.removeFirst();
        String last = linkedlist.removeLast();

        System.out.println(linkedlist);
    }
}
