package com.codingblocks.lecture_21;

public class BSTClient {
    public static void main(String[] args) {
//        BST tree = new BST();
//        tree.add("rajat");
//        tree.add("mohit");
//        tree.add("shourya");
//        tree.add("zuber");
//        tree.add("anuj");
//
//
//        tree.display();

        BSTGeneric<Integer> tree = new BSTGeneric<>();
        tree.add(5);
        tree.add(1);
        tree.add(20);
        tree.add(25);
        tree.add(7);
        tree.add(10);
        tree.add(14);

        tree.display();

        System.out.println("=========");

        tree.inOrderRange(4, 20);

        System.out.println(tree.isBST());

    }
}
