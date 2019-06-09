package com.codingblocks.lecture_12;

public class KeyPad {
    public static void main(String[] args) {
//        System.out.println((int)'0');
        keypad("", "123");
    }

    public static void keypad(String processed, String unprocessed){
        if (unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        int digit = unprocessed.charAt(0) - '0';
        unprocessed = unprocessed.substring(1);

        for (int i = (digit - 1) * 3; i < digit * 3; i++) {

            if (i == 26){
                continue;
            }

            char ch = (char)('a' + i);
            keypad(processed + ch, unprocessed);
        }
    }

    public static void sasta(String processed, String unprocessed){
        if (unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        int digit = unprocessed.charAt(0) - '0';
        unprocessed = unprocessed.substring(1);

        String[] items = {"", "abc", "def", "ghi"};

        String line = items[digit];

        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);
            keypad(processed + ch, unprocessed);
        }
    }

}
