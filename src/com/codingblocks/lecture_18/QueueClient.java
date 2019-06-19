package com.codingblocks.lecture_18;

public class QueueClient {
    public static void main(String[] args) {
        CustomQueue queue = new CustomQueue();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println(queue);

        queue.dequeue();
        queue.dequeue();

        System.out.println(queue);
    }
}
