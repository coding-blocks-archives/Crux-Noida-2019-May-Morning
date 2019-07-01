package com.codingblocks.extra;


public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        size = 0;
    }

    public void insertfirst(int element) {

        Node node = new Node(element);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void insertlast(int element) {
        if (size == 0) {
            insertfirst(element);
            return;
        }

        Node node = new Node(element);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int index, int item) {

        if (index == 0) {
            insertfirst(item);
            return;
        }
        if (index == size) {
            insertlast(item);
            return;
        }
        Node prev = get(index - 1);
        Node node = new Node(item);
        node.next = prev.next;
        prev.next = node;
        size++;
    }

    public int deletefirst() {

        int temp = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return temp;
    }

    public int deletelast() {

        if (size < 2) {
            return deletefirst();
        }

        Node node = get(size - 2);

//        while(node.next!=tail){
//            node=node.next;
//        }
        int temp = tail.value;
        tail = node;
        tail.next = null;
        size--;
        return temp;
    }

    public int delete(int index) {

        if (index == 0) {
            return deletefirst();
        }
        if (index == size - 1) {
            return deletelast();
        }

        Node prev = get(index - 1);
        int temp = prev.next.value;
        prev.next = prev.next.next;
        size--;

        return temp;

    }

    public void duplicates() {
        Node node = head;

        while (node.next != null) {
            if (node.next.value == node.value) {
                node.next = node.next.next;
                size--;
            } else {
                node = node.next;
            }
        }

    }


    public Node get(int index) {

        Node node = head;

        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public void display() {

        Node node = head;

        while (node != null) {
            System.out.print(node.value + "->");
            node = node.next;
        }
        System.out.println("End");
    }


    public Node find(int element) {

        Node node = head;

        while (node != null) {

            if (node.value == element) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void reverse() {
        reverse(head);
    }

    private void reverse(Node node) {

        if (node == tail) {
            head = tail;
            return;
        }
        reverse(node.next);

        tail.next = node;
        tail = node;
        tail.next = null;

    }


    private class Node {

        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        @Override
        public String toString() {
            return super.toString();
        }
    }
}