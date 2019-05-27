package com.codingblocks.lecture_6;

public class TwoDIntro {
    public static void main(String[] args) {
        int[][] nums = {
                {1, 2, 3, 4},
                {11, 12, 13, 14},
                {21, 22, 23, 24}
        };

        h_wave(nums);


    }

    public static void display(int[][] nums){
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j] + " ");
            }

            System.out.println();
        }
    }

    public static void h_wave(int[][] nums){
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (i % 2 == 0){
                    System.out.print(nums[i][j] + " ");
                } else {
                    System.out.print(nums[i][nums[i].length - j - 1] + " ");
                }
            }
        }
    }

    public static void v_wave(int[][] nums){
        for (int col = 0; col < nums[0].length; col++) {
            for (int row = 0; row < nums.length; row++) {
                if (col % 2 == 0){
                    System.out.print(nums[row][col] + " ");
                } else {
                    System.out.print(nums[nums.length - row - 1][col] + " ");
                }
            }
        }
    }
}
