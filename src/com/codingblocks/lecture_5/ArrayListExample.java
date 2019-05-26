package com.codingblocks.lecture_5;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list.size());

        list.add(23);

        list.add(34);
        list.set(1, 45);


        System.out.println(list.get(1).getClass());

        System.out.println(list.size());

    }
}
