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

    public LinkedList<LinkedList<E>> connectedComponents(){
        Set<Vertex> set = new HashSet<>();
        Stack<Vertex> stack = new Stack<>();

        LinkedList<LinkedList<E>> components = new LinkedList<>();

        for (Vertex vertex : vertexMap.values()) {

            if (set.contains(vertex)){
                continue;
            }

            LinkedList<E> component = new LinkedList<>();

            set.add(vertex);
            stack.push(vertex);

            while (!stack.empty()){
                Vertex top = stack.pop();
                component.add(top.value);
                for (Vertex padosi : top.neighbours) {
                    if (!set.contains(padosi)){
                        set.add(padosi);
                        stack.push(padosi);
                    }
                }
            }

            components.add(component);
        }

        return components;
    }

    public boolean isConnected(){
        return connectedComponents().size() <= 1;
    }


    public boolean DFS(E value, E target){
        Set<Vertex> set = new HashSet<>();
        Stack<Vertex> stack = new Stack<>();

        Vertex vertex = vertexMap.get(value);
        set.add(vertex);
        stack.push(vertex);

        while (!stack.empty()){
            Vertex top = stack.pop();
            if (target.equals(top.value)){
                return true;
            }

            for (Vertex padosi : top.neighbours) {
                if (target.equals(padosi.value)){
                    return true;
                }

                if (!set.contains(padosi)){
                    set.add(padosi);
                    stack.push(padosi);
                }
            }
        }

        return false;
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

    public int BFT(E value, E target){
        Set<Vertex> set = new HashSet<>();
        Queue<Vertex> queue = new LinkedList<>();

        Vertex vertex = vertexMap.get(value);
        set.add(vertex);
        queue.add(vertex);
        queue.add(null);

        int distance = 0;

        while (queue.size() > 1){
            Vertex top = queue.remove();

            if (top == null){
                distance++;
                queue.add(null);
                continue;
            }

            if(top.value.equals(target)){
                return distance;
            }

            for (Vertex padosi : top.neighbours) {
                if (!set.contains(padosi)){
                    set.add(padosi);
                    queue.add(padosi);
                }
            }
        }

        return -1;
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
