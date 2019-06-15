package com.codingblocks.lecture_16;

import java.math.BigInteger;

public class BoardPath {
    public static void main(String[] args) {

        int target = 100000;
        int face = 6;

        BigInteger[] mem = new BigInteger[target + 1];

        System.out.println(diceDPItr(target, face, mem));

    }

    public static int dice(int target, int face){
        if (target == 0){
            return 1;
        }

        int sum = 0;
        for (int i = 1; i <= target && i <= face ; i++) {
            sum += dice(target - i, face);
        }

        return sum;
    }

    public static int diceDP(int target, int face, Integer[] mem){
        if (target == 0){
            return 1;
        }

        if (mem[target] != null){
            return mem[target];
        }

        int sum = 0;
        for (int i = 1; i <= target && i <= face ; i++) {
            sum += diceDP(target - i, face, mem);
        }

        mem[target] = sum;

        return sum;
    }

    public static int diceDPItr(int target, int face, Integer[] mem){

        for (int t = 0; t <= target ; t++) {
            if (t == 0){
                mem[t] = 1;
            } else {
                int sum = 0;
                for (int i = 1; i <= face && i <= t ; i++) {
                    sum += mem[t-i];
                }

                mem[t] = sum;
            }
        }

        return mem[target];
    }

    public static BigInteger diceDPItr(int target, int face, BigInteger[] mem){

        for (int t = 0; t <= target ; t++) {
            if (t == 0){
                mem[t] = BigInteger.ONE;
            } else {
                BigInteger sum = BigInteger.ZERO;
                for (int i = 1; i <= face && i <= t ; i++) {
                    sum = sum.add(mem[t-i]);
                }

                mem[t] = sum;
            }
        }

        return mem[target];
    }


}
