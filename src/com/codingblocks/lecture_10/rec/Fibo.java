package com.codingblocks.lecture_10.rec;

public class Fibo {
    public static void main(String[] args) {

    }

    public static int fibo(int n){
        if (n == 0 || n == 1){
            return n;
        }

        return fibo(n-1) + fibo(n-2);
    }
}
