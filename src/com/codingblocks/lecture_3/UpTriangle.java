package com.codingblocks.lecture_3;

import java.util.Scanner;

public class UpTriangle {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int row = 0;

        while (row < n) {

            int col = 0;

            while (col <= row) {
                if (col == 0 || col == row) {
                    if (row == 0){
                        System.out.print("1");
                    } else {
                        System.out.print(row + "");
                    }
                } else {
                    System.out.print("0");
                }
                col = col + 1;
            }

            System.out.println();

            row = row + 1;
        }
    }
}
