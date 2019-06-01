package com.codingblocks.lecture_8.inhertance;

import java.io.IOException;

public class ExceptionClient {

    public static void main(String[] args){


        // this is for sampling with git


//        ThreadExample one = new ThreadExample();
//        ThreadExample two = new ThreadExample();
//
//        one.start();
//        two.start();


        try {
            danger();
            System.out.println("Kya ye line hogi?");
        } catch (RuntimeException e){
            e.printStackTrace();
        } catch (Exception e){

        }

        System.out.println("Finally ye to hoga hi hoga");
    }

    public static void danger() throws IOException {
        int a = 7;
        int b = 0;

        throw new ArithmeticException();

//        System.out.println(a/b);

    }
}
