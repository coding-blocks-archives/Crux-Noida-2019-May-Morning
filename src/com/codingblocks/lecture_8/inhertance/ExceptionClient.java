package com.codingblocks.lecture_8.inhertance;

public class ExceptionClient {

    public static void main(String[] args){


        ThreadExample one = new ThreadExample();
        ThreadExample two = new ThreadExample();

        one.start();
        two.start();


//        try {
//            danger();
//            System.out.println("Kya ye line hogi?");
//        } catch (Exception e){
//            System.out.println("Chal yaar cake kha ke aate hai");
//        } finally {
//            System.out.println();
//        }
//
//        System.out.println("Finally ye to hoga hi hoga");
    }

    public static void danger() throws Exception{
        int a = 7;
        int b = 0;

        System.out.println(a/b);

        System.out.println("ho gya khatam");
    }
}
