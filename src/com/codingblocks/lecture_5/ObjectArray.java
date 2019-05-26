package com.codingblocks.lecture_5;

import java.util.Arrays;
import java.util.Scanner;

public class ObjectArray {
    public static void main(String[] args) {
//        Integer[] nums = new Integer[10];

        int[][] nums = new int[4][5];


//        System.out.println(nums.length);
//
//        System.out.println(nums[0].length);
//
//

        Scanner s = new Scanner(System.in);

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = s.nextInt();
            }
        }


        System.out.println(Arrays.toString(nums));
    }
}
