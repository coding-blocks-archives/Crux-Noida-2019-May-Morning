package com.codingblocks.lecture_9;

public class Human implements Comparable<Human> {
    private int age;
    private String name;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Human other) {
        return - this.name.compareTo(other.name);
    }
}
