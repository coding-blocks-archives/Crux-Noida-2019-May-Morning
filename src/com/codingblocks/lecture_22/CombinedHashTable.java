package com.codingblocks.lecture_22;

import java.util.ArrayList;
import java.util.LinkedList;

public class CombinedHashTable <K, V> {

    private ArrayList<LinkedList<Node>> array = new ArrayList<>();

    public CombinedHashTable(){
        for (int i = 0; i < 20; i++) {
            array.add(new LinkedList<>());
        }
    }

    public void put(K key, V value){
        int index = Math.abs(key.hashCode()) % array.size();

        LinkedList<Node> list = array.get(index);

        for (Node node : list) {
            if (node.key.equals(key)){
                node.value = value;
                return;
            }
        }

        list.add(new Node(key, value));
    }

    public V get(K key){
        int index = Math.abs(key.hashCode()) % array.size();

        LinkedList<Node> list = array.get(index);

        for (Node node : list) {
            if (node.key.equals(key)){
                return node.value;
            }
        }

        return null;

    }

    public V remove(K key){
        int index = Math.abs(key.hashCode()) % array.size();
        LinkedList<Node> list = array.get(index);

        Node target = null;
        for (Node node : list) {
            if (node.key.equals(key)){
                list.remove(node);
                return node.value;
            }
        }

        return null;

    }

    private class Node {
        K key;
        V value;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

}
