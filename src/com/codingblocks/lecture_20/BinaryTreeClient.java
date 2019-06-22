package com.codingblocks.lecture_20;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BinaryTreeClient {
    public static void main(String[] args) throws FileNotFoundException {
        BinaryTree tree = new BinaryTree();

        File file = new File("tree.txt");
        Scanner s = new Scanner(file);

        tree.add(s);
        tree.add(s);
        tree.add(s);
        tree.add(s);
        tree.add(s);
    }
}
