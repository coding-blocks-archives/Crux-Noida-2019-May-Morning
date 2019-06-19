package com.codingblocks.lecture_18;

public class ZeroOneKnap {
    public static void main(String[] args) {
        int[] p = {5, 10, 7, 5};
        int[] w = {2, 1, 2, 2};
        int cap = 3;

        Integer[][] mem = new Integer[cap + 1][p.length + 1];

        System.out.println(zeroOneItr(w, p, 3, p.length, mem));
    }

    public static int zeroOne(int[] wts, int[] prs, int cap, int size){
        if (size == 0){
            return 0;
        }

        int acc = 0;

        if (wts[size-1] <= cap){
            acc = prs[size-1] + zeroOne(wts, prs, cap-wts[size-1], size-1);
        }

        int reject = zeroOne(wts, prs, cap, size-1);

        return Math.max(acc, reject);
    }

    public static int zeroOne(int[] wts, int[] prs, int cap, int size, Integer[][] mem){
        if (size == 0){
            return 0;
        }

        if (mem[cap][size] != null){
            return mem[cap][size];
        }

        int acc = 0;

        if (wts[size-1] <= cap){
            acc = prs[size-1] + zeroOne(wts, prs, cap-wts[size-1], size-1, mem);
        }

        int reject = zeroOne(wts, prs, cap, size-1, mem);

        mem[cap][size] = Math.max(acc, reject);

        return mem[cap][size];
    }

    // size is number of items to consider
    public static int zeroOneItr(int[] wts, int[] prs, int cap, int size, Integer[][] mem){

        for (int s = 0; s <= size ; s++) {
            for (int c = 0; c <= cap; c++) {
                if (s == 0){
                    mem[c][s] = 0;
                } else {
                    int acc = 0;
                    if (c >= wts[s-1]){
                        acc = prs[s-1] + mem[c-wts[s-1]][s-1];
                    }
                    int rej = mem[c][s-1];
                    mem[c][s] = Math.max(acc, rej);
                }

            }
        }

        return mem[cap][size];
    }
}
