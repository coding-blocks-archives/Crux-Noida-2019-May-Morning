package com.codingblocks.lecture_18;

public class LLClient {
    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();

        list.insertFirst("Mohini");



        list.insertFirst("rajat");

        list.display();

        list.insertLast("Tanmay");
        list.display();

        list.removeFirst();
        list.display();

        list.removeLast();
        list.display();

        System.out.println(list.removeLast());

        list.display();
    }
}
