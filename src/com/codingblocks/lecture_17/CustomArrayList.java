package com.codingblocks.lecture_17;

public class CustomArrayList {

    private static final int DEFAULT_SIZE = 10;

    private int[] data;
    private int size;

    public CustomArrayList(){
        this.data = new int[DEFAULT_SIZE];
        this.size = 0;
    }

    public void add(int value){
        ensureCapacity();
        data[size] = value;
        size++;
    }

    private void ensureCapacity() {
        if (size >= data.length){
            int[] temp = new int[data.length * 2];
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }

            this.data = temp;
        }
    }

    public int remove(int index){
        int value = data[index];

        for (int i = index; i < size - 1; i++) {
            data[i] = data[i+1];
        }
        size--;

        return value;
    }

    //TODO : to be updated with exception
    public void set(int index, int value){
        data[index] = value;
    }


    //TODO : to be updated with exception
    public int get(int index){
        return data[index];
    }

    public boolean isEmpty(){
        return size == 0;
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
