package com.java24hours.BroCode.DataStructuresAndAlgorithms.BroAdjacencyList;

import java.util.ArrayList;
import java.util.LinkedList;

public class Graph {

    ArrayList<LinkedList<Node>> alist;

    Graph(){
        alist = new ArrayList<>();
    }

    public void addNode(Node node){
        LinkedList<Node> currentList = new LinkedList<>();
        currentList.add(node);
        alist.add(currentList);
    }

    public void addEdge(int src, int dst){
        LinkedList<Node> currentList = alist.get(src); // this will return a linkedlist
        Node dstNode = alist.get(dst).get(0); // gets the head of the linked list
        currentList.add(dstNode); // taking a node then adding it to a linked list

//        alist.get(src).add(dstNode); // alternatively works but harder to read.
    }

    public boolean checkEdge(int src, int dst) {
        LinkedList<Node> currentList = alist.get(src);
        Node dstNode = alist.get(dst).get(0);

        for (Node node : currentList) {
            if (node == dstNode) return true;
        }
        return false;
    }

    public void print(){
        for(LinkedList<Node> currentList : alist){
            for(Node node : currentList){
                System.out.print(node.data + " -> ");
            }
            System.out.println();
        }
    }
}
