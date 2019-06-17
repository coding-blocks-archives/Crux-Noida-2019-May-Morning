package com.codingblocks.lecture_17;

public class DynamicStack extends CustomStack {

    @Override
    public void push(int value) {
        if (isFull()){
            // change the size
            int[] temp = new int[data.length * 2];
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }

        super.push(value);
    }
}
