package com.codingblocks.lecture_24;

import java.util.LinkedList;

public class EdgeListGraph <E> {

    private LinkedList<Edge> edges = new LinkedList<>();
    private LinkedList<Vertex> vertices = new LinkedList<>();

    public void addVertex(E value){
        Vertex vertex = new Vertex(value);
        vertices.add(vertex);
    }

    public void addEdge(E s_value, E e_value){
        Vertex start = find(s_value);
        Vertex end = find(e_value);

        if (start != null && end != null){
            Edge edge = new Edge(start, end);
            edges.add(edge);
        }

    }

    private Vertex find(E value){
        for (Vertex vertex: vertices) {
            if (vertex.value.equals(value)){
                return vertex;
            }
        }
        return null;
    }


    private class Edge {
        Vertex start;
        Vertex end;

        public Edge(Vertex start, Vertex end) {
            this.start = start;
            this.end = end;
        }
    }

    private class Vertex {
        E value;
        public Vertex(E value) {
            this.value = value;
        }
    }

}
