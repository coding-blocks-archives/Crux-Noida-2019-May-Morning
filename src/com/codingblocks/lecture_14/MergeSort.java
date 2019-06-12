package com.codingblocks.lecture_14;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] f = {1, 13, 5, 17, 11, 34, 0};

//        int[] res = merge(f, s);

        System.out.println(Arrays.toString(mergeSort(f)));
    }

    public static int[] mergeSort(int[] nums){
        if (nums.length < 2){
            return nums;
        }

        int mid = nums.length/2;

        int[] first = Arrays.copyOfRange(nums, 0, mid);
        int[] second = Arrays.copyOfRange(nums, mid, nums.length);

        first = mergeSort(first);
        second = mergeSort(second);

        return merge(first, second);
    }

    private static int[] merge(int[] first, int[] second) {
        int i = 0;
        int j = 0;
        int k = 0;

        int[] third = new int[first.length + second.length];

        while (i < first.length && j < second.length){
            if (first[i] < second[j]){
                third[k++] = first[i++];
            } else {
                third[k++] = second[j++];
            }
        }

        while (i < first.length){
            third[k++] = first[i++];
        }

        while (j < second.length){
            third[k++] = second[j++];
        }

        return third;
    }
}
