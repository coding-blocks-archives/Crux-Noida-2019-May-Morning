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

    public void addEdge(E s_value, E e_value, int weight){
        Vertex start = vertexMap.get(s_value);
        Vertex end = vertexMap.get(e_value);

        if (start!=null && end!= null){
            start.addNeighbour(e_value, end, weight);
            end.addNeighbour(s_value, start, weight);
        }
    }

    public int minSpanningTree(){
        ArrayList<Edge> list = new ArrayList<>();
        for (Vertex start : vertexMap.values()) {
            for (Vertex end : start.neighbours.values()) {
                int weight = start.weights.get(end.value);
                list.add(new Edge(start, end, weight));
            }
        }

        list.sort((o1, o2) -> o1.weight - o2.weight);

        Map<E, E> parents = populateParents();

        int result = 0;

        for (Edge e : list) {
            if (union(e.start.value, e.end.value, parents)){
                result += e.weight;
            }
        }

        return result;

    }

    public AdjMapGraph<E> minSpanningTreeGraph(){
        ArrayList<Edge> list = new ArrayList<>();
        for (Vertex start : vertexMap.values()) {
            for (Vertex end : start.neighbours.values()) {
                int weight = start.weights.get(end.value);
                list.add(new Edge(start, end, weight));
            }
        }

        list.sort((o1, o2) -> o1.weight - o2.weight);

        Map<E, E> parents = populateParents();

        AdjMapGraph<E> spanning = new AdjMapGraph<>();
        for (E element : vertexMap.keySet()) {
            spanning.addVertex(element);
        }

        for (Edge e : list) {
            if (union(e.start.value, e.end.value, parents)){
                spanning.addEdge(e.start.value, e.end.value, e.weight);
            }
        }

        return spanning;
    }

    public int prims(){
        Vertex first = vertexMap.values().iterator().next();
        Set<Vertex> visited = new HashSet<>();
        PriorityQueue<Edge> queue = new PriorityQueue<>((o1, o2) -> o1.weight - o2.weight);
        for (Vertex padosi : first.neighbours.values()) {
            int weight = first.weights.get(padosi.value);
            queue.add(new Edge(first, padosi, weight));
        }
        visited.add(first);

        int sum = 0;

        while (!queue.isEmpty()){
            Edge front = queue.remove();
            if (!visited.contains(front.end)){
               sum += front.weight;
               Vertex end = front.end;
               visited.add(end);
                for (Vertex padosi : end.neighbours.values()) {
                    if (!visited.contains(padosi)){
                        int weight = end.weights.get(padosi.value);
                        queue.add(new Edge(end, padosi, weight));
                    }
                }
            }
        }

        return sum;

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

    private Map<E, E> populateParents(){
        Map<E, E> map = new HashMap<>();
        for (E key : vertexMap.keySet()) {
            map.put(key, null);
        }
        return map;
    }

    private E find(E element, Map<E, E> parents){
        while (parents.get(element) != null){
            element = parents.get(element);
        }
        return element;
    }

    private boolean union(E first, E second, Map<E, E> parents){
        first = find(first, parents);
        second = find(second, parents);

        if (!first.equals(second)){
            parents.put(first, second);
            return true;
        } else {
            return false;
        }
    }

    private class Edge{
        Vertex start;
        Vertex end;
        int weight;

        public Edge(Vertex start, Vertex end, int weight) {
            this.start = start;
            this.end = end;
            this.weight = weight;
        }
    }

    private class Vertex {
        E value;
        Map<E, Vertex> neighbours;
        Map<E, Integer> weights;
        public Vertex(E value) {
            this.value = value;
            this.neighbours = new HashMap<>();
            this.weights = new HashMap<>();
        }

        public void addNeighbour(E value, Vertex vertex, int weight){
            this.neighbours.put(value, vertex);
            this.weights.put(value, weight);
        }
    }
}
