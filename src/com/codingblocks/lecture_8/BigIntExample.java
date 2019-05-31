package com.codingblocks.lecture_8;

import java.math.BigInteger;

public class BigIntExample {
    public static void main(String[] args) {

        int n = 100000;


//        BigInteger fact = new BigInteger("1");

        BigInteger fact = BigInteger.ONE;

        for (int i = n; i >= 1; i--) {
            fact = fact.multiply(new BigInteger(Integer.toString(i)));
        }

        System.out.println(fact.toString().length());
    }
}
