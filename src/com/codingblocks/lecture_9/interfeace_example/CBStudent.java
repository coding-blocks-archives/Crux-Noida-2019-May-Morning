package com.codingblocks.lecture_9.interfeace_example;

public class CBStudent implements Student {
    @Override
    public void play() {
        System.out.println("play like a Student");
    }

    @Override
    public void study() {
        System.out.println("Study like a Student");
    }
}
