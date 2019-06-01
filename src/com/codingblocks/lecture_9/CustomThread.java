package com.codingblocks.lecture_9;

public class CustomThread extends Thread {

    @Override
    public void run() {

        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }


    }
}
