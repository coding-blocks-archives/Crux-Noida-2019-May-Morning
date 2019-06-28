package com.codingblocks.lecture_23;

public class Human implements Comparable<Human> {
    private int age;
    private String name;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(Human o) {
        return this.name.compareTo(o.name);
    }
}
