package com.codingblocks.lecture_4;

public class Inverse {
    public static void main(String[] args) {

        System.out.println(inverse(3142));
    }

    public static int pow(int base, int n){

        int res = 1;

        for (int i = 0; i < n; i++) {
            res = res * base;
        }

        return res;
    }

    public static int inverse(int num){
        int p = 1;

        int res = 0;

        while (num > 0){
            int v = num % 10;
            num = num / 10;

            res = res + (p * pow(10, v-1));
            p = p + 1;
        }

        return res;
    }
}
