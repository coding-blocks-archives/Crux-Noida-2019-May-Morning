package com.codingblocks.lecture_8;

import java.util.Arrays;
import java.util.Scanner;

public class LongInput {
    public static void main(String[] args) {

        input();
        input();
//        Scanner s = new Scanner(System.in);
//        String[] temp = s.nextLine().trim().split(" ");
//
////        String[] temp = line.;
//
////        System.out.println(Arrays.toString(temp));
//        int[] nums = new int[temp.length];
//
//        for (int i = 0; i < nums.length; i++) {
//            nums[i] = Integer.parseInt(temp[i]);
//        }
    }

    public static void input(){
        Scanner s = new Scanner(System.in);

        String line = s.nextLine();

        Scanner temp = new Scanner(line);

        int[] nums = new int[5];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = temp.nextInt();
        }

        System.out.println(Arrays.toString(nums));
    }
}
