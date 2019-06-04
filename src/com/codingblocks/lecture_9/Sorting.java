package com.codingblocks.lecture_9;

import java.util.Arrays;
import java.util.Comparator;

public class Sorting {
    public static void main(String[] args) {
//        int[] nums = {23, 546, 3,456, 3546};

        Human[] hoomans = new Human[4];

        hoomans[0] = new Human(15, "Mohit");
        hoomans[1] = new Human(25, "Ram");
        hoomans[2] = new Human(20, "Rahul");
        hoomans[3] = new Human(22, "Mohan");


//        Arrays.sort(hoomans);

        Arrays.sort(hoomans, new Comparator<Human>() {
            @Override
            public int compare(Human o1, Human o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        System.out.println(Arrays.toString(hoomans));
    }
}
