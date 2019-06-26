package com.codingblocks.lecture_22;

import java.util.Arrays;

public class BSTBalanced<T extends Comparable<T>>{

    private Node root;

    public void add(T value){
        this.root = add(root, value);
    }

    private Node add(Node node, T value) {
        if (node == null){
            return new Node(value);
        } else if (value.compareTo(node.value) < 0){
            node.left = add(node.left, value);
        } else if (value.compareTo(node.value) > 0){
            node.right = add(node.right, value);
        }

        node.height = 1 + Math.max(height(node.left), height(node.right));

        return node;
    }

    public boolean isBalanced(){
        return isBalanced(root);
    }

    private boolean isBalanced(Node node) {
        if (node == null){
            return true;
        }

        boolean present = Math.abs(height(node.left) - height(node.right)) <= 1;

        return present && isBalanced(node.left) && isBalanced(node.right);
    }

    private int height(Node node){
        if (node == null){
            return 0;
        }

        return node.height;
    }

    public void display(){
        display(root, "", "root");
    }

    private void display(Node node, String indent, String type) {
        if (node == null){
            return;
        }

        System.out.println(indent + node.value + " " + type);

        display(node.left, indent + "\t", "left");
        display(node.right, indent + "\t", "right");
    }

    public void leftRotate(){
        this.root = leftRotate(root);
    }

    private Node leftRotate(Node y) {
        Node x = y.right;
        Node t2 = x.left;

        x.left = y;
        y.right = t2;

        return x;
    }

    public void rightRotate(){
        this.root = rightRotate(root);
    }

    private Node rightRotate(Node x) {
        Node y = x.left;
        Node t2 = y.right;

        y.right = x;
        x.left = t2;

        return y;
    }

    private class Node {
        T value;
        Node left;
        Node right;
        int height;

        public Node(T value) {
            this.value = value;
            height = 1;
        }
    }
}
