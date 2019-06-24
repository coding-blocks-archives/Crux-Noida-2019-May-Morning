package com.codingblocks.lecture_21;

public class BST {

    private Node root;

    public void add(String value){
        this.root = add(root, value);
    }

    private Node add(Node node, String value) {
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


    private void inOrderRange(Node node, String start, String end) {
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

    private class Node {
        String value;
        Node left;
        Node right;

        public Node(String value) {
            this.value = value;
        }
    }
}
