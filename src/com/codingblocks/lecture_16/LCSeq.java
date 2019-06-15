package com.codingblocks.lecture_16;

public class LCSeq {
    public static void main(String[] args) {
        System.out.println(lcs("aman", "manan", 4, 5));
    }

    public static int lcs(String first, String second, int f, int s){
        if (f == 0 || s == 0){
            return 0;
        }

        char fch = first.charAt(f - 1);
        char sch = second.charAt(s - 1);

        int res = 0;

        if (fch == sch){
            res = 1 + lcs(first, second, f - 1, s - 1);
        } else {
            res = Math.max(lcs(first, second, f-1, s), lcs(first, second, f, s-1));
        }

        return res;
    }

    public static int lcsItr(String first, String second, Integer[][] mem){

        for (int f = 0; f <= first.length(); f++) {
            for (int s = 0; s <= second.length() ; s++) {
                if (f == 0 || s == 0){
                    mem[f][s] = 0;
                } else {
                    char fch = first.charAt(f-1);
                    char sch = second.charAt(s-1);

                    int res = 0;
                    if (fch == sch){
                        res = 1 + mem[f-1][s-1];
                    } else {
                        res = Math.max(mem[f-1][s], mem[f][s-1]);
                    }

                    mem[f][s] = res;
                }

            }
        }

        return mem[first.length()][second.length()];
    }

}
