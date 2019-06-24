package com.codingblocks.lecture_21;

public class BSTGeneric <T extends Comparable<T>>{

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

        return node;
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

    public void inOrderRange(T start, T end){
       inOrderRange(root, start, end);
    }

    private void inOrderRange(Node node, T start, T end) {
        if (node == null){
            return;
        }
        if (node.value.compareTo(start) > 0) {
            inOrderRange(node.left, start, end);
        }

        if (node.value.compareTo(start)>= 0
                && node.value.compareTo(end) <= 0) {
            System.out.println(node.value);
        }

        if (node.value.compareTo(end) < 0) {
            inOrderRange(node.right, start, end);
        }
    }

    public boolean isBST(){
        return isBST(root, null, null);
    }

    private boolean isBST(Node node, T start, T end){
        if (node == null){
            return true;
        }

        boolean present = true;

        if (start != null && start.compareTo(node.value) >= 0){
            present = false;
        }
        if (end != null && end.compareTo(node.value) <= 0){
            present = false;
        }

        boolean left = isBST(node.left, start, node.value);
        boolean right = isBST(node.right, node.value, end);

        return present && left && right;
    }

    private class Node {
        T value;
        Node left;
        Node right;

        public Node(T value) {
            this.value = value;
        }
    }
}
