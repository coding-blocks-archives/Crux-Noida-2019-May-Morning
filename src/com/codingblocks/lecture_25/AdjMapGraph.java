package com.codingblocks.lecture_25;

import java.util.*;

public class AdjMapGraph<E> {

    private Map<E, Vertex> vertexMap = new HashMap<>();

    public void addVertex(E value){
        if (!vertexMap.containsKey(value)){
            Vertex vertex = new Vertex(value);
            vertexMap.put(value, vertex);
        }
    }

    public void addEdge(E s_value, E e_value){
        Vertex start = vertexMap.get(s_value);
        Vertex end = vertexMap.get(e_value);

        if (start!=null && end!= null){
            start.addNeighbour(e_value, end);
            end.addNeighbour(s_value, start);
        }
    }

    public void display(){
        for (Vertex vertex : vertexMap.values()) {
            System.out.print(vertex.value + " -> ");
            for (Vertex padosi : vertex.neighbours.values()) {
                System.out.print(padosi.value +", ");
            }
            System.out.println();
        }
    }


    private class Vertex {
        E value;
        Map<E, Vertex> neighbours;
        public Vertex(E value) {
            this.value = value;
            this.neighbours = new HashMap<>();
        }

        public void addNeighbour(E value, Vertex vertex){
            this.neighbours.put(value, vertex);
        }
    }
}
