package com.codingblocks.lecture_9.interfeace_example;

public class CBTeacher implements Teacher {
    @Override
    public void teach() {
        System.out.println("Teach like a teacher");
    }

    @Override
    public void study() {
        System.out.println("Study like a teacher");
    }
}
