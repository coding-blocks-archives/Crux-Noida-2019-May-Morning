package com.codingblocks.lecture_8;

import java.util.Arrays;

public class SkewedArray {
    public static void main(String[] args) {
        int[][] nums = new int[5][5];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = new int[i + 1];
        }

        int[] p = {3456, 46, 567};

        for (int i = 0; i < nums.length; i++) {
            System.out.println(Arrays.toString(nums[i]));
        }
    }
}
