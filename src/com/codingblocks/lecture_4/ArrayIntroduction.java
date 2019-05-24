package com.codingblocks.lecture_4;

import java.util.Scanner;

public class ArrayIntroduction {
    public static void main(String[] args) {

//        System.out.println(nums[7]);
//
//        System.out.println(nums.length);

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = s.nextInt();
        }

        display(nums);
    }

    public static void display(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
