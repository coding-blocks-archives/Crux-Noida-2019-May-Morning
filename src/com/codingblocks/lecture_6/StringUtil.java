package com.codingblocks.lecture_6;

public class StringUtil {
    public static void main(String[] args) {

    }

    public static boolean isPallin(String line){
        for (int i = 0; i < line.length()/2; i++) {
            if (line.charAt(i) != line.charAt(line.length() - i - 1)){
                return false;
            }
        }

        return true;
    }

    public static int pallins(String text){

        int counter = 0;

        for (int i = 0; i < text.length(); i++) {
            int left = i;
            int right = i;

            while (left >= 0 && right < text.length()){
                if (text.charAt(left) == text.charAt(right)){
                    counter++;
                    left--;
                    right++;
                } else {
                    break;
                }
            }

            left = i;
            right = i + 1;

            while (left >= 0 && right < text.length()){
                if (text.charAt(left) == text.charAt(right)){
                    counter++;
                    left--;
                    right++;
                } else {
                    break;
                }
            }
        }



        return counter;
    }
}
