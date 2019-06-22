package com.codingblocks.lecture_20;

import java.util.Scanner;

public class GenericTreeClient {
    public static void main(String[] args) {
        GenericTree tree = new GenericTree();
        Scanner s = new Scanner("1 true 2 true 3 false true 4 false true 5 false false true 6 false false");
        tree.populate(s);

//        tree.display();

        System.out.println(tree.count());
    }
}
