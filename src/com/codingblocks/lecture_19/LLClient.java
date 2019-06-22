package com.codingblocks.lecture_19;

public class LLClient {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertFirst("Lalit");
        list.insertFirst("Lalit");
        list.insertFirst("Lalit");
        list.insertFirst("Lalit");
        list.insertFirst("Lalit");

        list.insert(0, "Shivam");
        list.insert(0, "Shivam");
        list.insert(0, "Shivam");
        list.insert(0, "Shivam");

        list.display();

        list.reverse();

        list.display();

    }
}
