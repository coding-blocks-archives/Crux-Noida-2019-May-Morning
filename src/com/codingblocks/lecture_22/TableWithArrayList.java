package com.codingblocks.lecture_22;

import java.util.ArrayList;
import java.util.LinkedList;

public class TableWithArrayList<K, V> {

    private ArrayList<Node> array = new ArrayList<>();

    public TableWithArrayList(){
        for (int i = 0; i < 20; i++) {
            array.add(null);
        }
    }

    public void put(K key, V value){
        int index = Math.abs(key.hashCode()) % array.size();

        array.set(index, new Node(key, value));
    }

    public V get(K key){
        int index = Math.abs(key.hashCode()) % array.size();

        Node node = array.get(index);
        if (node != null && node.key.equals(key)){
            return node.value;
        }

        return null;

    }

    public V remove(K key){
        int index = Math.abs(key.hashCode()) % array.size();

        Node node = array.get(index);
        if (node != null && node.key.equals(key)){
            array.set(index, null);
            return node.value;
        } else {
            return null;
        }
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
