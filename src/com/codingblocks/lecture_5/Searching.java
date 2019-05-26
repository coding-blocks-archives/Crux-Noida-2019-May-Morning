package com.codingblocks.lecture_5;

public class Searching {

    public static void main(String[] args) {

        int[] nums = {12, 34, 35, 56, 78, 80};

        System.out.println(binary(nums, 57));
    }

    public static int linear(int[] nums, int target){
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target){
                return i;
            }
        }

        return -1;
    }

    public static int binary(int[] nums, int target){
        int start = 0;
        int end = nums.length - 1;

        while (start <= end){
            int mid = (start + end) / 2;

            if (nums[mid] == target){
                return mid;
            } else if(nums[mid] < target){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }
}
