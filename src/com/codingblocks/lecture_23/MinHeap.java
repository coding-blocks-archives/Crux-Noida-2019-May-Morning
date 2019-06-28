package com.codingblocks.lecture_23;

import java.util.ArrayList;

public class MinHeap <E extends Comparable<E>> {
    private ArrayList<E> list = new ArrayList<>();

    public void add(E value){
        list.add(value);
        int index = list.size() - 1;

        upheap(index);
    }

    private void upheap(int index) {
        if (index == 0){
            return;
        }

        if (list.get(index).compareTo(list.get(parent(index))) < 0){
            swap(index, parent(index));
            upheap(parent(index));
        }
    }

    public E remove(){
        swap(0, list.size() - 1);
        E value = list.remove(list.size() - 1);

        if (list.size() > 0){
            downheap(0);
        }

        return value;
    }

    private void downheap(int index) {

        int min = index;
        int left = left(index);
        int right = right(index);

        if(left < list.size() && list.get(left).compareTo(list.get(min)) < 0){
            min = left;
        }

        if(right < list.size() && list.get(right).compareTo(list.get(min)) < 0){
            min = right;
        }

        if (index != min){
            swap(index, min);
            downheap(min);
        }
    }

    private void swap(int first, int second){
        E temp = list.get(first);
        list.set(first, list.get(second));
        list.set(second, temp);
    }

    private int left(int index){
        return 2 * index + 1;
    }

    private int right(int index){
        return 2 * index + 2;
    }

    private int parent(int index){
        return (index - 1) / 2;
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }
}
