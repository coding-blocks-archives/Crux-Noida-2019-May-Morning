package com.codingblocks.lecture_13;

public class Rec_Assignment {
    public static void main(String[] args) {
        up_triang(5, 0);
    }

    public static void down_triang(int row, int col){
        if (row == 0){
            return;
        }

        if (row == col){
            System.out.println();
            down_triang(row - 1, 0);
            return;
        }

        System.out.print("* ");
        down_triang(row, col + 1);
    }

    public static void up_triang(int row, int col){
        if (row == 0){
            return;
        }

        if (row == col){

            up_triang(row - 1, 0);
            if (row > 1) {
                System.out.println();
            }
            return;
        }

        up_triang(row, col + 1);
        System.out.print("* ");

    }
}
