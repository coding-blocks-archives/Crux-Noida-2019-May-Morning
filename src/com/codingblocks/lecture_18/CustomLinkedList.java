package com.codingblocks.lecture_18;

public class CustomLinkedList {

    private Node head;

    public void insertFirst(String value){
        Node node = new Node(value); // step 1 : create node
        node.next = head; // step 2 : node next point to head
        head = node; // step 3 : now node in new head
    }

    public void insertLast(String value){
        if (head == null){
            insertFirst(value);
            return;
        }

        Node tail = head;
        while (tail.next != null){
            tail = tail.next;
        }

        Node node = new Node(value);
        tail.next = node;
    }

    public void insert(int index, String value){
        if (index == 0){
            insertFirst(value);
            return;
        }

        Node prev = head;
        for (int i = 1; i < index; i++) {
            prev = prev.next;
        }

        Node node = new Node(value);
        node.next = prev.next;
        prev.next = node;
    }

    public String removeFirst(){
        String value = head.value;
        head = head.next;
        return value;
    }

    public String removeLast(){
        if (head.next == null){
            return removeFirst();
        }

        Node s_tail = head;
        while (s_tail.next.next != null){
            s_tail = s_tail.next;
        }

        String value = s_tail.next.value;
        s_tail.next = null;

        return value;
    }

    public void display(){
        Node node = head;

        while (node != null){
            System.out.print(node.value + " -> ");
            node = node.next;
        }
        System.out.println("End");
    }


    private class Node {
        private String value;
        private Node next;

        public Node(String value) {
            this.value = value;
        }

        public Node(String value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
