package com.codingblocks.lecture_20;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GenericTree {

    private Node root;

    public void populate(Scanner s){
        System.out.print("Enter value of root : ");
        int value = s.nextInt();
        this.root = new Node(value);
        populate(s, root);
    }

    private void populate(Scanner s, Node node) {
        while (true){
            System.out.println("Do you want to add child for " + node.value);
            boolean yes = s.nextBoolean();
            if (yes){
                System.out.println("Enter value for child of " + node.value);
                int value = s.nextInt();
                Node child = new Node(value);
                node.children.add(child);
                populate(s, child);
            } else {
                break;
            }
        }
    }

    public void display(){
        display(root, "");
    }

    private void display(Node node, String indent) {

        System.out.println(indent + node.value);
        for (int i = 0; i < node.children.size(); i++) {
            display(node.children.get(i), indent + "\t");
        }
    }


    public void levelOrder(){
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            Node front = queue.remove();
            System.out.println(front.value);
            for (Node child : front.children) {
                queue.add(child);
            }
        }
    }

    public int count(){
        return count(root);
    }

    private int count(Node node) {

        int counter = 1;

        for (int i = 0; i < node.children.size(); i++) {
            counter += count(node.children.get(i));
        }

        return counter;
    }

    private class Node {
        Integer value;
        ArrayList<Node> children;

        public Node(Integer value) {
            this.value = value;
            children = new ArrayList<>();
        }
    }
}
