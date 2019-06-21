package com.codingblocks.lecture_19;

public class LLClient {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertFirst("Lalit");
        list.insertFirst("Mohini");
        list.insertLast("Neha");

        list.display();

        list.insert(1, "Shivam");

        list.display();

        list.oddEven();

        list.display();
    }
}
