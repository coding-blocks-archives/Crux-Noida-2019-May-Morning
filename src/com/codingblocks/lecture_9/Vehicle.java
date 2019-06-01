package com.codingblocks.lecture_9;

public abstract class Vehicle {


    private int policy = 24534;


    public void start(){
        System.out.println("Start like a generic Vehicle");
    }

    public void stop(){
        System.out.println("Stop like a generic Vehicle");
    }
    public void brake(){
        System.out.println("Brake like a generic Vehicle");
    }

    public abstract void pollution();

}
