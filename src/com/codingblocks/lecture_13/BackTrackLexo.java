package com.codingblocks.lecture_13;

import java.util.Arrays;

public class BackTrackLexo {
    public static void main(String[] args) {
        String line = "Hello";

        int[] freq = flist(line);

        lexo("", freq, line.length());

//        System.out.println(Arrays.toString(freq));
    }

    private static int[] flist(String line) {
        int[] list = new int[26];

        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);

            list[ch - 'a']++;
        }

        return list;
    }

    public static void lexo(String processed, int[] freq, int len){
        if (processed.length() == len){
            System.out.println(processed);
            return;
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0){
                char ch = (char)('a' + i);
                freq[i]--;
                lexo(processed + ch, freq, len);
                freq[i]++;
            }
        }
    }

    public static void subseq(StringBuilder processed, String unprocessed, int index){
        if (index == unprocessed.length()){
            System.out.println(processed);
            return;
        }

        char ch = unprocessed.charAt(index);

        // add extra
        processed.append(ch);
        subseq(processed, unprocessed, index + 1);
        processed.deleteCharAt(processed.length() - 1);

        // not add
        subseq(processed, unprocessed, index + 1);
    }
}
