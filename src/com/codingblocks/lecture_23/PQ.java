package com.codingblocks.lecture_23;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PQ {
    public static void main(String[] args) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });

//        for (int i = 0; i < 20; i++) {
////            int random = (int)(Math.random() * 10);
////            heap.add(random);
////        }
////
////        while (!heap.isEmpty()){
////            System.out.println(heap.remove());
////        }

        heap.add(23);
        heap.add(223);
        heap.add(1);
        heap.add(4);

        System.out.println(heap.remove());

        heap.add(-5);

        System.out.println(heap.remove());
        System.out.println(heap.remove());


    }
}
