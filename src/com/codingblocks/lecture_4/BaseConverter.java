package com.codingblocks.lecture_4;

public class BaseConverter {
    public static void main(String[] args) {

        int kuchbhi = 110;

        int ans = any2any(100100, 2, 8);
//        int ans = any2deci(kuchbhi, 10);

        System.out.println(ans);
    }

    public static int bin2deci(int bin){
        int deci = 0;
        int place = 1;

        while (bin > 0){
            int rem = bin % 10;
            bin = bin / 10;

            deci = deci + rem * place;
            place = place * 2;
        }

        return deci;
    }

    public static int deci2bin(int dec){
        int bin = 0;
        int place = 1;

        while (dec > 0){
            int rem = dec % 2;
            dec = dec / 2;

            bin = bin + rem * place;
            place = place * 10;
        }

        return bin;
    }

    public static int deci2any(int dec, int base){
        int any = 0;
        int place = 1;

        while (dec > 0){
            int rem = dec % base;
            dec = dec / base;

            any = any + rem * place;
            place = place * 10;
        }

        return any;
    }

    public static int any2deci(int any, int base){
        int deci = 0;
        int place = 1;

        while (any > 0){
            int rem = any % 10;
            any = any / 10;

            deci = deci + rem * place;
            place = place * base;
        }

        return deci;
    }

    public static int any2any(int source, int sbase, int tbase){
        int dec = any2deci(source, sbase);

        return deci2any(dec, tbase);
    }
}
