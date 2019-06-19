package com.codingblocks.lecture_18;

public class DynamicQueue extends CustomQueue {

    @Override
    public void enqueue(int value) {

        if (isFull()){
            int[] temp = new int[data.length * 2];
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[(front + i) % data.length];
            }

            front = 0;
            end = data.length - 1;
            data = temp;
        }

        super.enqueue(value);
    }
}
