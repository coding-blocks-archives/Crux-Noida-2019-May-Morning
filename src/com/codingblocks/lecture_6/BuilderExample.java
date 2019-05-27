package com.codingblocks.lecture_6;

import java.util.ArrayList;

public class BuilderExample {
    public static void main(String[] args) {
        String sample = "a";

        StringBuilder builder = new StringBuilder("a");

        for (int i = 0; i < 1000000; i++) {
            builder.append("a");
        }




        System.out.println(builder.length());

        arms(200, 400);


    }


    public static void arms(int start, int end){

        for (int i = start; i <= end ; i++) {
            if (isArm(i)){
                System.out.println(i);
            }
        }

    }

    public static boolean isArm(int num){
        return true;
    }
}
