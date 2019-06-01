package com.codingblocks.lecture_8.inhertance;

public class WonderCar extends Car {

    public int door  = 2;
    public int wings = 2;

    public void fly(){
        System.out.println("udta hi firu");
    }

    @Override
    public void start() {
        System.out.println("Start like a wonder car");
        fly();
    }

    public static  void bakwas(){
        System.out.println("bakwas of wonder");
    }
}
