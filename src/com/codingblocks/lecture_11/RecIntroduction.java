package com.codingblocks.lecture_11;

public class RecIntroduction {
    public static void main(String[] args) {


        int r = powerOpti(2, 5);

        System.out.println(r);
//        int res = fact(5);
//        System.out.println(res);
//
//        int n = 5;
//        int r = 2;
//
//        int comb = fact(n) / (fact(r) * fact(n-r));
    }

    public static int fact(int n){
        if (n == 0){
            return 1;
        }

        return n * fact(n-1);
    }

    public static int power(int x, int n){
        if (n == 0){
            return 1;
        }

        return x * power(x, n-1);
    }

    public static int powerOpti(int x, int n){
        if (n == 0){
            return 1;
        }

        int half = powerOpti(x, n/2);
        int res = half * half;

        if (n%2 != 0){
            res = res * x;
        }

        return res;
    }

    public static int fibo(int n){
        if (n < 2){
            return n;
        }

        int first = fibo(n-2);
        int second = fibo(n-1);

        return first + second;
    }
}
