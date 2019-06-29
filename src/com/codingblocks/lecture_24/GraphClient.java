package com.codingblocks.lecture_24;

public class GraphClient {
    public static void main(String[] args) {
        AdjListGraph<String> graph = new AdjListGraph<>();

        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addVertex("E");
        graph.addVertex("F");
        graph.addVertex("G");

        graph.addEdge("A", "B");
        graph.addEdge("B", "C");
        graph.addEdge("A", "C");

        graph.addEdge("F", "G");

//        graph.DFT("A");

//        System.out.println(graph.connectedComponents());

        System.out.println(graph.bipart());

//
//
//        graph.display();


    }
}
