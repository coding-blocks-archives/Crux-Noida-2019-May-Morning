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

        Integer[] pre = {15, 10, 5, 12, 20, 17, 25};
        Integer[] in = {5, 10, 12, 15, 17, 20, 25};

        tree.populateFromPreIn(pre, in);

        tree.display();
//        tree.add(5);
//        tree.add(1);
//        tree.add(20);
//        tree.add(25);
//        tree.add(7);
//        tree.add(10);
//        tree.add(14);
//        Integer[] nums = new Integer[20000000];
//        for (int i = 0; i < nums.length; i++) {
//            nums[i] = i;
//        }

//        for (int i = 0; i < nums.length; i++) {
//            tree.add(nums[i]);
//        }

//        tree.display();

//        tree.populateFromSorted(nums);

//        tree.display();
//
//        System.out.println("=========");
//
//        tree.inOrderRange(4, 20);
//
//        System.out.println(tree.isBST());

    }
}
