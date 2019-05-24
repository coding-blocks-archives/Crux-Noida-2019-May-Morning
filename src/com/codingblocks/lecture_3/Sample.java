package com.codingblocks.lecture_3;

import java.util.Scanner;

public class Sample {

    public static void main(String[] args) {
        System.out.println("hello");

        Scanner akshay = new Scanner(System.in);

        Scanner baby = akshay;

        int year = baby.nextInt();

        if (year % 4 == 0) {
            System.out.println("leap year");
        } else {
            System.out.println("not leap");
        }

    }
}
