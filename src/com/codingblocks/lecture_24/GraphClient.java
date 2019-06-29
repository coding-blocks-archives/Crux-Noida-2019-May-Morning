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
        graph.addEdge("B", "D");
        graph.addEdge("E", "C");
        graph.addEdge("E", "D");
        graph.addEdge("F", "D");
        graph.addEdge("F", "G");

        graph.DFT("A");

//
//
//        graph.display();


    }
}
