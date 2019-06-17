package com.codingblocks.lecture_17;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {

        ArrayList<Integer> blah = new ArrayList<>();
        blah.add(55);
        System.out.println(blah);

        CustomArrayList list = new CustomArrayList();

        System.out.println(list);

        list.add(5);

        System.out.println(list);
        list.add(54);

        System.out.println(list);
        list.add(51);
        System.out.println(list);

        list.remove(0);

        System.out.println(list);
    }
}
