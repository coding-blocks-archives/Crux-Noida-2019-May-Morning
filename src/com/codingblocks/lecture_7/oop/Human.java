package com.codingblocks.lecture_7.oop;

public class Human {

    public String name;
    int age;
    int money = 3000;

    int[] nums = new int[1000000];

    Human son;

    public Human(){
        System.out.println("Created");
    }

    private Human(String name){
        this.name = name;
    }

    public Human(Human other){
        this.name = other.name;
        this.age = other.age;
        this.money = other.money;
        this.son = other.son;
    }

    public Human(String name, int age, int money){
        this.name = name;
        this.age = age;
        this.money = money;
    }


    private void createSon(String name){
        son = new Human(name);
        son.age = 0;
        son.money = 0;
    }

    public void udhaar(){
        money = money - 500;
    }


    @Override
    protected void finalize() throws Throwable {
        System.out.println("destroyed");
    }
}
