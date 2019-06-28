package com.codingblocks.lecture_23;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        int[] nums = {1111, 13, 111, 10, 0, 0, 1};

        Set<Integer> set = uniques(nums);

        System.out.println(set);
    }

    private static Set<Integer> uniques(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (Integer item : nums) {
            set.add(item);
        }

        return set;
    }
}
