package com.codingblocks.lecture_5;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {

        int[] nums = {65, 45, 67, 32, 687};

        bubble(nums);

        System.out.println(Arrays.toString(nums));
    }

    public static void bubble(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j+1]){
                    ArrayIntroduction.swap(nums, j, j+1);
                }
            }
        }
    }

    public static void selection(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            int end = nums.length - i - 1;
            int max = ArrayIntroduction.maxIndexRange(nums, 0, end);
            ArrayIntroduction.swap(nums, max, end);
        }
    }

    public static void insertion(int[] nums){
        for (int i = 1; i < nums.length; i++) {
            for (int j = i; j > 0; j--) {
                if (nums[j] < nums[j-1]){
                    ArrayIntroduction.swap(nums, j, j-1);
                } else {
                    break;
                }
            }
        }
    }

    public static int[] inverse(int[] nums){

        int[] res = new int[nums.length];

        for (int p = 0; p < nums.length-1; p++) {
            int v = nums[p];

            res[v] = p;
        }

        return res;
    }
}
