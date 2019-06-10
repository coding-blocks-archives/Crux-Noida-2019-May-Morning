package com.codingblocks.lecture_13;

import java.util.ArrayList;

public class SumTarget {
    public static void main(String[] args) {
        int[] nums = {2, 3, 5, 1, 2};
        int target = 5;

        ArrayList<Integer> list = new ArrayList<>();

        sumT(list, nums, target, 0);

    }

    public static void sumT(ArrayList<Integer> list, int[] nums, int target, int index){



        if (target == 0){
            System.out.println(list);
            return;
        }

        if (index == nums.length){
            return;
        }

        // in case of append
        if (nums[index] <= target){
            list.add(nums[index]);
            sumT(list, nums, target - nums[index], index + 1);
            list.remove(list.size() - 1);
        }

        // when not added
        sumT(list, nums, target, index + 1);

    }
}
