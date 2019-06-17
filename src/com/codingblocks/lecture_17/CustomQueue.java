package com.codingblocks.lecture_17;

public class CustomQueue {

    private static final int DEFAULT_SIZE = 10;

    protected int[] data;
    private int size;

    private int front;
    private int end;

    public CustomQueue(){
        data = new int[DEFAULT_SIZE];

        size = 0;
        front = 0;
        end = -1;
    }

    public void enqueue(int value){
        end = (end + 1)% data.length;
        data[end] = value;
        size++;
    }

    public int dequeue(){
        front = (front + 1)% data.length;
        size--;
        return data[front];
    }

}
