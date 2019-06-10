package com.codingblocks.lecture_13;

public class Maze {

    public static void main(String[] args) {
        System.out.println(mazeCount(3, 3));
    }

    public static int mazeCount(int row, int col){
        if (row == 1 || col == 1){
            return 1;
        }

        return mazeCount(row - 1, col) + mazeCount(row, col - 1);
    }

    public static int mazeCountDiag(int row, int col){
        if (row == 1 || col == 1){
            return 1;
        }

        return mazeCountDiag(row - 1, col)
                + mazeCountDiag(row, col - 1)
                + mazeCountDiag(row - 1, col - 1);
    }

    public static void mazePath(String path, int row, int col){
        if (row == 1 && col == 1){
            System.out.println(path);
            return;
        }

        if (row > 1){
            mazePath(path + "D", row - 1, col);
        }

        if (col > 1){
            mazePath(path + "R", row, col - 1);
        }
    }

    public static void mazePathDiag(String path, int row, int col){
        if (row == 1 && col == 1){
            System.out.println(path);
            return;
        }

        if (row > 1){
            mazePathDiag(path + "V", row - 1, col);
        }

        if (col > 1){
            mazePathDiag(path + "H", row, col - 1);
        }

        if (col > 1 && row > 1){
            mazePathDiag(path + "D", row - 1, col - 1);
        }
    }

}
