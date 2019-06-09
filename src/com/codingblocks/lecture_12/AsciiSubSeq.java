package com.codingblocks.lecture_12;

public class AsciiSubSeq {
    public static void main(String[] args) {

        asciisub("", "ab");
    }

    public static void asciisub(String processed, String unprocessed){
        if (unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        char ch = unprocessed.charAt(0);
        unprocessed = unprocessed.substring(1);

        asciisub(processed + ch, unprocessed);
        asciisub(processed + (int)ch, unprocessed);
        asciisub(processed, unprocessed);
    }
}
