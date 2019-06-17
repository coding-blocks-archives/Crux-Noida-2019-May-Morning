package com.codingblocks.lecture_17;

public class CustomStack {
    private static final int DEFAULT_SIZE = 10;

    protected int[] data;
    private int size;

    public CustomStack(){
        data = new int[DEFAULT_SIZE];
        size = 0;
    }

    public void push(int value){
        data[size++] = value;
    }

    public int pop(){
        int value =  data[size-1];
        size--;
        return value;
    }

    public int top(){
        return data[size - 1];
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean isFull(){
        return size == data.length;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            builder.append(data[i]);
            if (i < size-1) {
                builder.append(", ");
            }
        }
        builder.append("]");

        return builder.toString();
    }
}
