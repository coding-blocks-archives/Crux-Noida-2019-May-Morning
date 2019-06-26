package com.codingblocks.lecture_22;

public class Client {
    public static void main(String[] args) {
        BSTBalanced<Integer> tree = new BSTBalanced<>();

        tree.add(10);
        tree.add(5);
        tree.add(1);

        tree.display();

        tree.rightRotate();

        tree.display();

    }
}
