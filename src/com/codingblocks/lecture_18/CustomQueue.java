package com.codingblocks.lecture_18;

public class CustomQueue {

    private static final int DEFAULT_SIZE = 10;
    protected int front = 0;
    protected int end = -1;
    private int size = 0;

    protected int[] data;

    public CustomQueue(){
        data = new int[DEFAULT_SIZE];
    }

    public void enqueue(int value){
        if(isFull()){
            return;
        }
        end = (end + 1) % data.length;
        data[end] = value;
        size++;
    }

    public int dequeue(){
        if(isEmpty()){
            throw new IndexOutOfBoundsException();
        }
        int value = data[front];
        front = (front + 1) % data.length;
        size--;
        return value;
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
        for (int i = front; i < front + size; i++) {
            int index = i % data.length;
            builder.append(data[index]);
            if (i < front + size - 1){
                builder.append(", ");
            }
        }
        builder.append("]");

        return builder.toString();
    }
}
