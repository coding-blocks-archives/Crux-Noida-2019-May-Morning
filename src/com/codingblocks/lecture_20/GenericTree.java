package com.codingblocks.lecture_20;

import java.util.ArrayList;
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

    private class Node {
        Integer value;
        ArrayList<Node> children;

        public Node(Integer value) {
            this.value = value;
            children = new ArrayList<>();
        }
    }
}
