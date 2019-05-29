package com.codingblocks.lecture_7;

import java.util.Arrays;

public class CountSort {
    public static void main(String[] args) {
//        int[] nums = {0,1, 1, 4, 3, 0, 3, 0, 1, 4};
//
//        countsort(nums, 4);
//
//        System.out.println(Arrays.toString(nums));

        String word = "hello";

        String res = sort(word);

        System.out.println(res);
    }

    public static void zerosandones(int[] nums){
        int zeros = 0;
        int ones = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0){
                zeros++;
            }
            else if (nums[i] == 1){
                ones++;
            }
        }

        for (int i = 0; i < zeros; i++) {
            nums[i] = 0;
        }

        for (int i = zeros; i < nums.length; i++) {
            nums[i] = 1;
        }
    }

    public static void countsort(int[] nums, int end){
        int[] counts = new int[end + 1];

        for (int i = 0; i < nums.length; i++) {
            counts[nums[i]]++;
        }

        int index = 0;
        for (int i = 0; i < counts.length; i++) {
            for (int j = 0; j < counts[i]; j++) {
                nums[index] = i;
                index++;
            }
        }
    }

    public static String sort(String word){
        int[] counts = new int[26];

        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'a';
            counts[index]++;
        }

//        System.out.println(Arrays.toString(counts));


        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < counts.length; i++) {
            for (int j = 0; j < counts[i]; j++) {
                builder.append((char)(i + 'a'));
            }
        }

        return builder.toString();
    }

}
