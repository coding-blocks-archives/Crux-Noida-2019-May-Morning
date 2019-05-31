package com.codingblocks.lecture_8;

public class Spiral {
    public static void main(String[] args) {
        int[][] nums = {
                {1, 2, 3, 4, 5},
                {11, 12, 13, 14, 15},
                {21, 22, 23, 24, 25},
                {31, 32, 33, 34, 35},
        };

        clockSpiral(nums);
    }

    public static void clockSpiral(int[][] nums){

        int left = 0;
        int top = 0;
        int right = nums[0].length - 1;
        int bottom = nums.length - 1;

        while (left <= right && top <= bottom) {
            for (int col = left; col <= right && top <= bottom ; col++) {
                System.out.println(nums[top][col]);
            }
            top++;

            for (int row = top; row <= bottom && left <= right; row++) {
                System.out.println(nums[row][right]);
            }
            right--;

            for (int col = right; col >= left && top <= bottom; col--) {
                System.out.println(nums[bottom][col]);
            }
            bottom--;

            for (int row = bottom; row >= top && left <= right; row--) {
                System.out.println(nums[row][left]);
            }
            left++;
        }
    }
}
