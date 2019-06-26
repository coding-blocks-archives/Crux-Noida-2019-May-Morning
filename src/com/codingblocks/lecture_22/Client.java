package com.codingblocks.lecture_22;

public class Client {
    public static void main(String[] args) {
        BSTBalanced<Integer> tree = new BSTBalanced<>();

//        tree.add(10);
//        tree.add(5);
//        tree.add(1);

        for (int i = 0; i < 1000000; i++) {
            tree.add(i);
        }

        System.out.println(tree.height());

//        tree.display();
//
//        tree.rightRotate();
//
//        tree.display();

        System.out.println(tree.isBalanced());

    }
}
