package com.codingblocks.lecture_12;

public class Permutation {
    public static void main(String[] args) {

//        System.out.println("a".substring(1, 1));
        permute2("", "abcd");
    }

    public static void permute(String processed, String unprocessed){
        if (unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        for (int i = 0; i < unprocessed.length(); i++) {
            char ch = unprocessed.charAt(i);
            String first = unprocessed.substring(0, i);
            String second = unprocessed.substring(i+1);

            permute(processed + ch, first + second);
        }
    }

    public static void permute2(String processed, String unprocessed){
        if (unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }


        char ch = unprocessed.charAt(0);
        unprocessed = unprocessed.substring(1);

        for (int i = 0; i <= processed.length(); i++) {
            String first = processed.substring(0, i);
            String second = processed.substring(i);

            permute2(first + ch + second, unprocessed);
        }
    }

}
