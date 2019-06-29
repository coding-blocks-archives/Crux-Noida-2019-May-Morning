package com.codingblocks.lecture_24;

import com.codingblocks.lecture_9.Vehicle;

import java.util.*;

public class AdjListGraph <E> {

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
            start.neighbours.add(end);
            end.neighbours.add(start);
        }
    }

    public void DFT(E value){
        Set<Vertex> set = new HashSet<>();
        Stack<Vertex> stack = new Stack<>();

        Vertex vertex = vertexMap.get(value);
        set.add(vertex);
        stack.push(vertex);

        while (!stack.empty()){
            Vertex top = stack.pop();
            System.out.println(top.value);
            for (Vertex padosi : top.neighbours) {
                if (!set.contains(padosi)){
                    set.add(padosi);
                    stack.push(padosi);
                }
            }
        }
    }

    public void BFT(E value){
        Set<Vertex> set = new HashSet<>();
        Queue<Vertex> queue = new LinkedList<>();

        Vertex vertex = vertexMap.get(value);
        set.add(vertex);
        queue.add(vertex);

        while (!queue.isEmpty()){
            Vertex top = queue.remove();
            System.out.println(top.value);
            for (Vertex padosi : top.neighbours) {
                if (!set.contains(padosi)){
                    set.add(padosi);
                    queue.add(padosi);
                }
            }
        }
    }

    public void display(){
        for (Vertex vertex : vertexMap.values()) {
            System.out.print(vertex.value + " -> ");
            for (Vertex padosi : vertex.neighbours) {
                System.out.print(padosi.value +", ");
            }
            System.out.println();
        }
    }


    private class Vertex {
        E value;
        LinkedList<Vertex> neighbours;
        public Vertex(E value) {
            this.value = value;
            neighbours = new LinkedList<>();
        }
    }
}
