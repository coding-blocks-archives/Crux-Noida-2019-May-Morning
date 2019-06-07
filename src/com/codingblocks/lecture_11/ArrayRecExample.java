package com.codingblocks.lecture_11;

import java.util.Arrays;

public class ArrayRecExample {
    public static void main(String[] args) {
        int[] nums = {11, 33, 11, 44, 11};

//        boolean res = isSorted(nums, 0);
//
//        System.out.println(res);

        int[] locs = allIndex(nums, 11, 0, 0);

        System.out.println(Arrays.toString(locs));
    }

    public static boolean isSorted(int[] nums, int index){
        if (index == nums.length - 1){
            return true;
        }

        boolean present = nums[index] <= nums[index + 1];

        return present && isSorted(nums, index + 1);
    }

    public static boolean contains(int[] nums, int target, int index){
        if (index == nums.length){
            return false;
        }

        boolean present = nums[index] == target;
        return present || contains(nums, target, index + 1);

    }

    public static int indexOf(int[] nums, int target, int index){
        if (index == nums.length){
            return -1;
        }

        if(nums[index] == target){
            return index;
        }

        return indexOf(nums, target, index + 1);

    }

    public static int[] allIndex(int[] nums, int target, int index, int count){
        if (index == nums.length){
            int[] loc =  new int[count];
            return loc;
        }

        if(nums[index] == target){
            int[] locs = allIndex(nums, target, index + 1, count + 1);
            locs[count] = index;
            return locs;
        } else {
            return allIndex(nums, target, index + 1, count);
        }
    }
}
