package com.codingblocks.lecture_5;

import java.io.File;
import java.util.Scanner;

public class ReadExample {
    public static void main(String[] args) throws Exception{

        File f = new File("hello.txt");

        Scanner s = new Scanner("45      546 ");

        int a = s.nextInt();



        System.out.println(a);

        int b = s.nextInt();

        System.out.println(b);

        Integer data = 67;

        System.out.println(data.getClass());
    }
}
