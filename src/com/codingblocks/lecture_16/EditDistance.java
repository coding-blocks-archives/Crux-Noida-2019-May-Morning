package com.codingblocks.lecture_16;

public class EditDistance {
    public static void main(String[] args) {

    }

    public static int edit(String first, String second, int f, int s){
        if (f == 0){
            return s;
        }

        if (s == 0){
            return f;
        }



        char fch = first.charAt(f - 1);
        char sch = second.charAt(s - 1);

        int res = 0;
        if (fch == sch){
            res = edit(first, second, f-1, s-1);
        } else {
            int rmf = edit(first, second, f-1, s);
            int rms = edit(first, second, f, s - 1);
            int rmb = edit(first, second, f-1, s - 1);

            res =  1 + Math.min(Math.min(rmf, rms), rmb);
        }



        return res;
    }
}
