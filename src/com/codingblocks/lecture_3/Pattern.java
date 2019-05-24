package com.codingblocks.lecture_3;

import java.io.File;
import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) throws Exception{
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int row = 0;

        int v_mir = 0;

        while (v_mir < 2 * n - 1) {

            // star
            int col = 0;
            int h_mir = 0;
            while (h_mir <  2 * n - 1) {
                if (col <= row) {
                    System.out.print(col + 1 + " ");
                } else {
                    System.out.print("  ");
                }
                if (h_mir < n - 1) {
                    col = col + 1;
                } else {
                    col = col - 1;
                }
                h_mir = h_mir + 1;
            }

            System.out.println();

            if (v_mir < n - 1) {
                row = row + 1;
            } else {
                row = row - 1;
            }
            v_mir = v_mir + 1;
        }
    }
}
