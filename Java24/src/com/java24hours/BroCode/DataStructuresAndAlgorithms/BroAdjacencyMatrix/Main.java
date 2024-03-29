package com.java24hours.BroCode.DataStructuresAndAlgorithms.BroAdjacencyMatrix;

public class Main {
    public static void main(String[] args) {

//        Adjacency Matrix = A 2D array to store 1's/)'s to reprewsent edges
//                           # of rows = # of unique nodes
//                           # of columns = # unique nodes

//                           runtime complexity to check an Edge: O(1)
//                           space complexity: O(v^2)

        Graph graph = new Graph(5);

        graph.addNode(new Node('A'));
        graph.addNode(new Node('B'));
        graph.addNode(new Node('C'));
        graph.addNode(new Node('D'));
        graph.addNode(new Node('E'));

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);
        graph.addEdge(4, 0);
        graph.addEdge(4, 2);

        graph.print();

        System.out.println(graph.checkEdge(0, 1));
        System.out.println(graph.checkEdge(3, 2));

    }
}
