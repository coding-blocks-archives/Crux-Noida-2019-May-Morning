package com.codingblocks.lecture_7;

import java.util.Map;

public class BuilderExample {
    public static void main(String[] args) {

        String line = "He is a very Good Boy.";

        String upper = toUpper(line);

        System.out.println(line);
        System.out.println(upper);



    }

    public static String toUpper(String line){

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);

            if (ch >= 'a' && ch <= 'z'){
                ch = (char)(ch - 'a' + 'A');
            }

            builder.append(ch);
        }

        return builder.toString();
    }

    public static String toggle(String line){

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);

            if (ch >= 'a' && ch <= 'z'){
                ch = (char)(ch - 'a' + 'A');
            } else if (ch >= 'A' && ch <= 'Z'){
                ch = (char)(ch - 'A' + 'a');
            }

            builder.append(ch);
        }

        return builder.toString();
    }

    public static String oddeven(String line){

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);

            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
                if (i % 2 == 0){
                    ch = (char)(ch - 1);
                } else {
                    ch = (char)(ch + 1);
                }
            }

            builder.append(ch);
        }

        return builder.toString();
    }


    public static String diff(String line){

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < line.length() - 1; i++) {
            char present = line.charAt(i);

            char next = line.charAt(i+1);

            builder.append(present);

            builder.append(Math.abs(present - next));
        }

        builder.append(line.charAt(line.length() - 1));

        return builder.toString();
    }




}
