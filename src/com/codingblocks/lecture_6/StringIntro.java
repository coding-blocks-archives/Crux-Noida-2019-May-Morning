package com.codingblocks.lecture_6;

public class StringIntro {
    public static void main(String[] args) {
        String greet = "hello";

        String second = "hello";

        System.out.println(greet.equals(second));


        System.out.println(greet.indexOf("lo"));
//        System.out.println(greet + second);
//        System.out.println(greet.concat(Integer.toString(1)));
//
//        String another = new String("hello");

//        substrings(greet);

//        System.out.println(greet.substring(0, 1));
//        display(greet);


    }

    public static void display(String text){
        for (int i = 0; i < text.length(); i++) {
            System.out.println(text.charAt(i));
        }
    }

    public static void substrings(String text){
        for (int i = 0; i < text.length(); i++) {
            for (int j = i + 1; j <= text.length(); j++) {
                String res = text.substring(i, j);
                if (StringUtil.isPallin(res)) {
                    System.out.println(res);
                }
            }
        }
    }

    public static String concat(String first, String second){

        char[] f = first.toCharArray();
        char[] s = second.toCharArray();

        char[] res = new char[f.length + s.length];

        for (int i = 0; i < f.length; i++) {
            res[i] = f[i];
        }

        for (int i = f.length; i < f.length + s.length; i++) {
            res[i] = s[i - f.length];
        }

        String out = new String(res);

        return out;
    }
}
