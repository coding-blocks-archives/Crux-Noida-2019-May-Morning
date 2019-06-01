package com.codingblocks.lecture_9;

public class Client {
    public static void main(String[] args) {
        Thread one = new CustomThread();
        Thread two = new CustomThread();

        one.start();
        two.start();

//        Thread three = new Thread(new Runnable() {
////            @Override
////            public void run() {
////                for (int i = 0; i < 5; i++) {
////                    try {
////                        Thread.sleep(1000);
////                    } catch (InterruptedException e) {
////                        e.printStackTrace();
////                    }
////                    System.out.println(i);
////                }
////            }
////        });

        Thread four = new Thread(() -> {
            System.out.println("hello");
        });

        four.start();

    }
}
