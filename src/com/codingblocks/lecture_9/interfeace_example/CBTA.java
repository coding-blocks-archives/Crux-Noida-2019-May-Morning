package com.codingblocks.lecture_9.interfeace_example;

public class CBTA implements TA {
    @Override
    public void teach() {
        System.out.println("Teach like a TA");
    }

    @Override
    public void play() {
        System.out.println("Play like a TA");
    }

    @Override
    public void study() {
        System.out.println("Study like a TA");
    }
}
