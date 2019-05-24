package com.codingblocks.lecture_3;

import java.util.Scanner;

public class MethodExample {
    public static void main(String[] args) {

//        System.out.println("executed before");
//
//        happy();
//
//        System.out.println("executed later");
//
//        happy();


        Scanner s = new Scanner(System.in);

        int a = 56;
        int b = 67;

        swap(a, b, s);

        System.out.println(a);
        System.out.println(b);
    }

    public static void happy(){
        System.out.println("I am so happy here");
    }

    public static void swap(int a, int b, Scanner s){

        s = new Scanner(System.in);

        int t = a;
        a = b;
        b = t;
    }
}
