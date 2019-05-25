package com.codingblocks.lecture_5;

import java.util.Scanner;

public class ArrayIntroduction {

    public static void main(String[] args) {

//        Scanner s = new Scanner(System.in);
//
//        int n = s.nextInt();
//
//        int[] nums = new int[n];
//
//        for (int i = 0; i < nums.length; i++) {
//            nums[i] = s.nextInt();
//        }

        int[] nums = {12, 34, 56, 23, 78};

        display(nums);

        swap(nums, 0, 2);

        display(nums);

        int max = maxIndex(nums);

        System.out.println(nums[max]);

    }

    public static void display(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

    public static void swap(int[] nums, int first, int second){
        int t = nums[first];
        nums[first] = nums[second];
        nums[second] = t;
    }

    public static void reverse(int[] nums){
        for (int i = 0; i < nums.length/2; i++) {
            swap(nums, i, nums.length-i-1);
        }
    }

    public static int maxIndex(int[] nums){
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < nums[max]){
                max = i;
            }
        }
        return max;
    }

    public static int maxIndexRange(int[] nums, int start, int end){
        int max = start;

        for (int i = start; i <= end; i++) {
            if (nums[i] < nums[max]){
                max = i;
            }
        }
        return max;
    }
}
