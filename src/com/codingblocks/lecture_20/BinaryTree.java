package com.codingblocks.lecture_20;

import java.util.Scanner;

public class BinaryTree {

    private Node root;

    public void add(Scanner s){
        this.root = add(s, root);
    }

    private Node add(Scanner s, Node node) {
        if (node == null){
            System.out.print("value to set ");
            int value = Integer.parseInt(s.nextLine());
            return new Node(value);
        }

        System.out.println("Enter left or right of " + node.value);
        String direction = s.nextLine();

        if (direction.equals("left")){
            node.left = add(s, node.left);
        } else {
            node.right = add(s, node.right);
        }

        return node;
    }


    private class Node {
        Integer value;
        Node left;
        Node right;

        public Node(Integer value) {
            this.value = value;
        }
    }
}
