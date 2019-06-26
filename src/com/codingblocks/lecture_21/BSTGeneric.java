package com.codingblocks.lecture_21;

import java.util.Arrays;

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

    public void populateFromSorted(T[] nums) {
        this.root = populateFromSorted(nums, 0, nums.length - 1);
    }

    private Node populateFromSorted(T[] nums, int start, int end) {
        if (start > end){
            return null;
        }

        int mid = (start + end) / 2;
        Node node = new Node(nums[mid]);
        node.left = populateFromSorted(nums, start, mid - 1);
        node.right = populateFromSorted(nums, mid + 1, end);
        return node;
    }

    public void populateFromPreIn(T[] pre, T[] in){
        this.root = populateFromPreInRec(pre, in);
    }

    private Node populateFromPreInRec(T[] pre, T[] in) {

        if(pre.length == 0){
            return null;
        }

        T value = pre[0];
        int index = find(in, value);
        T[] in_left = Arrays.copyOfRange(in, 0, index);
        T[] in_right = Arrays.copyOfRange(in, index+1  , in.length);

        T[] pre_left = Arrays.copyOfRange(pre, 1, index + 1);
        T[] pre_right = Arrays.copyOfRange(pre, index+1  , pre.length);

        Node node = new Node(value);
        node.left = populateFromPreInRec(pre_left, in_left);
        node.right = populateFromPreInRec(pre_right, in_right);

        return node;
    }

    private int find(T[] array, T value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].compareTo(value) == 0){
                return i;
            }
        }
        return -1;
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
