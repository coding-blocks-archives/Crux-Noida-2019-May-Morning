package com.codingblocks.lecture_13;

public class Queens {
    public static void main(String[] args) {

        int n = 8;
        boolean[][] board = new boolean[n][n];

        queens(board, 0);
    }

    public static int queens(boolean[][] board, int row){
        if (row == board.length){
            display(board);
//            System.out.println("we have found one");
            return 1;
        }

        int count = 0;

        for (int col = 0; col < board.length; col++) {

            if(isSafe(row, col, board)){
                board[row][col] = true;
                count += queens(board, row + 1);
                board[row][col] = false;
            }
        }

        return count;
    }

    private static void display(boolean[][] board) {

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j]){
                    System.out.print("Q ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }

        System.out.println();
    }

    private static boolean isSafe(int row, int col, boolean[][] board) {

        // vertically up
        for (int r = 0; r < row; r++) {
            if (board[r][col]){
                return false;
            }
        }

        int s_left = Math.min(row, col);

        for (int i = 1; i <= s_left; i++) {
            if (board[row - i][col - i]){
                return false;
            }
        }

        int s_right = Math.min(row, board.length - col - 1);

        for (int i = 1; i <= s_right; i++) {
            if (board[row - i][col + i]){
                return false;
            }
        }

        return true;

    }
}
