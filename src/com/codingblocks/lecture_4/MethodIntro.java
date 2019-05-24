package com.codingblocks.lecture_4;

public class MethodIntro {
    public static void main(String[] args) {


        int x = 345;
        int y = 8765;

        System.out.println(x + " " + y);

        swap(x, y);

        System.out.println(x + " " + y);
    }

    public static void swap(int x, int y){

        int t =  y;
        y = x;
        x = t;
    }
}
