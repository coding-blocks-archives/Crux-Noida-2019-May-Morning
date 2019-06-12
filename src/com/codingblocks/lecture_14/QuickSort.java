package com.codingblocks.lecture_14;

import com.codingblocks.lecture_5.ArrayIntroduction;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] f = {1, 13, 5, 17, 11, 34, 0};

//        int[] res = merge(f, s);

        quick(f, 0, f.length);

        System.out.println(Arrays.toString(f));
    }

    public static void quick(int[] nums, int start, int end){
        if (end - start < 2){
            return;
        }

        int pivot = piv(nums, start, end);

        quick(nums, start, pivot);
        quick(nums, pivot + 1, end);
    }

    private static int piv(int[] nums, int start, int end) {

        int val = nums[end - 1];
        int i = start;

        for (int j = start; j < end; j++) {
            if (nums[j] < val){
                swap(nums, i, j);
                i++;
            }
        }

        swap(nums, i, end - 1);
        return i;
    }

    private static void swap(int[] nums, int f, int s) {
        int t = nums[f];
        nums[f] = nums[s];
        nums[s] = t;
    }
}
