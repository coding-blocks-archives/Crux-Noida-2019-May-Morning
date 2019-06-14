package com.codingblocks.lecture_15;

import java.math.BigInteger;

public class Fibo {

    public static void main(String[] args) {

        int n = 1000;

        BigInteger[] mem = new BigInteger[n + 1];

//        System.out.println(fiboDP(n, mem));

        System.out.println(fiboDP(n, mem));
    }

    public static int fibo(int n){
        if (n < 2){
            return n;
        }

        return fibo(n-1) + fibo(n-2);
    }

    public static int fiboDPItr(int n, Integer[] mem){

        for (int i = 0; i <= n ; i++) {
            if (i < 2){
                mem[i] = i;
            } else {
                mem[i] = mem[i-1] + mem[i-2];
            }
        }

        return mem[n];
    }

    public static int fiboDP(int n, Integer[] mem){
        if (n < 2){
            return n;
        }

        if (mem[n] != null){
            return mem[n];
        }

        mem[n] =  fiboDP(n-1, mem) + fiboDP(n-2, mem);

        return mem[n];
    }

    public static BigInteger fiboDP(int n, BigInteger[] mem){
        if (n < 2){
            return new BigInteger(Integer.toString(n));
        }

        if (mem[n] != null){
            return mem[n];
        }

        mem[n] =  fiboDP(n-1, mem).add(fiboDP(n-2, mem));

        return mem[n];
    }
}
