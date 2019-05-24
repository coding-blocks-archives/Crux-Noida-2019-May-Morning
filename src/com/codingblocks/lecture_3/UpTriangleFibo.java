package com.codingblocks.lecture_3;

import java.util.Scanner;

public class UpTriangleFibo {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int row = 0;

        int first = 0;
        int second = 1;

        while (row < n) {

            int col = 0;

            while (col <= row) {
                System.out.print(first + " ");

                int t = first + second;
                first = second;
                second = t;

                col = col + 1;
            }

            System.out.println();

            row = row + 1;
        }
    }
}
