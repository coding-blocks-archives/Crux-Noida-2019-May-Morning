package com.codingblocks.lecture_10;

public class Singleton {

    private static Singleton instance;

    private Singleton(){

    }

    public static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }

        return instance;
    }
}
