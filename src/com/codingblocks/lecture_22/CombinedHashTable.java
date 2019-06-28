package com.codingblocks.lecture_22;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class CombinedHashTable <K, V> {

    private ArrayList<LinkedList<Node>> array = new ArrayList<>();
    private int count = 0;
    private int factor = 5;

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
        count++;
        if (array.size()*factor < count){
            rehash();
        }
    }

    private void rehash() {
        ArrayList<LinkedList<Node>> old = array;
        array = new ArrayList<>();
        for (int i = 0; i < old.size()*2; i++) {
            array.add(new LinkedList<>());
        }
        count = 0;

        for (LinkedList<Node> list: old) {
            for (Node node: list) {
                put(node.key, node.value);
            }
        }
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

    public boolean containsKey(K key){
        int index = Math.abs(key.hashCode()) % array.size();

        LinkedList<Node> list = array.get(index);

        for (Node node : list) {
            if (node.key.equals(key)){
                return true;
            }
        }

        return false;
    }

    public Set<K> keySet(){
        Set<K> keys = new HashSet<>();

        for (LinkedList<Node> list: array) {
            for (Node node: list) {
                keys.add(node.key);
            }
        }

        return keys;
    }

    public V remove(K key){
        int index = Math.abs(key.hashCode()) % array.size();
        LinkedList<Node> list = array.get(index);

        Node target = null;
        for (Node node : list) {
            if (node.key.equals(key)){
                list.remove(node);
                count--;
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
