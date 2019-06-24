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

    public int height(){
        return height(root);
    }

    public int diameter(){
        return diameter(root);
    }

    private int diameter(Node node) {
        if (node == null){
            return 0;
        }

        int current = 1 + height(node.left) + height(node.right);

        int max = Math.max(diameter(node.left), diameter(node.right));

        return Math.max(current, max);
    }



    private int max(Node node) {
        if (node == null){
            return Integer.MIN_VALUE;
        }

        int current = node.value;

        int max = Math.max(max(node.left), max(node.right));

        return Math.max(current, max);
    }

    public boolean find(int target){
        return find(root, target);
    }

    private boolean find(Node node, int target) {
        if (node == null){
            return false;
        }

        return node.value == target || find(node.left, target) || find(node.right, target);
    }

    private void mirror(Node node){
        if (node == null){
            return;
        }

        Node temp = node.left;
        node.left = node.right;
        node.right = temp;

        mirror(node.left);
        mirror(node.right);
    }


    private int height(Node node) {
        if (node == null){
            return 0;
        }

        return 1 + Math.max(height(node.left), height(node.right));
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
