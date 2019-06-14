package com.codingblocks.lecture_15;

public class RecAssignment {

    public static void main(String[] args) {
        System.out.println('{' - '}');
        System.out.println('(' - ')');
        System.out.println('[' - ']');

    }

    public static int up_pascal(int row, int col){
        if (row == 0){
            System.out.println(1);
            return 1;
        }

        if (row == col){

            up_pascal(row - 1, 0);
            if (row > 1) {
                System.out.println();
            }
            System.out.print(1 + " ");
            return 1;
        }

        int ncrplus = up_pascal(row, col + 1);

        int ncr = ncrplus * (col + 1) / (row - col);

        System.out.print(ncr + " ");

        return ncr;

    }


    public static int a7q1(String line, int index){
        if (index == line.length()){
            return 0;
        }

        int digit = line.charAt(index) - '0';
        return digit + a7q1(line, index + 1);
    }

    public static int a7q2(String line, int index){
        if (index < 0){
            return 0;
        }

        int digit = line.charAt(index) - '0';

        return digit + 10 * a7q2(line, index - 1);
    }

    public static void a7q5(StringBuilder builder, String line, int index){
        if (index == line.length() - 1){
            builder.append(line.charAt(index));
            System.out.println(builder);
            return;
        }

        char present = line.charAt(index);
        char next = line.charAt(index + 1);

        builder.append(present);
        if (present == next){
            builder.append("*");
        }
        a7q5(builder, line, index + 1);
    }

    public static void a7q6(StringBuilder builder, String line, int index){
        if (index == line.length() - 1){
            builder.append(line.charAt(index));
            System.out.println(builder);
            return;
        }

        char present = line.charAt(index);
        char next = line.charAt(index + 1);

        if (present != next){
            builder.append(present);
        }
        a7q6(builder, line, index + 1);
    }

    public static void a7q8(String line, int index, int count){
        if (index == line.length() - 1){
            System.out.println(count);
            return;
        }

        char present = line.charAt(index);
        char next = line.charAt(index + 1);

        if (present == 'h' && next == 'i'){
           a7q8(line, index + 1, count + 1);

        } else {
            a7q8(line, index + 1, count);
        }
    }


    public static void a7q12(String processed, String unprocessed){
        if (unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        int one = Integer.parseInt(unprocessed.substring(0, 1)) - 1;

        if (one  >= 0){
            a7q12(processed + (char)(one + 'a'), unprocessed.substring(1));
        }

        if (unprocessed.length() >= 2) {
            int two = Integer.parseInt(unprocessed.substring(0, 2)) - 1;
            if (two >= 0 && two < 26) {
                a7q12(processed + (char) (two + 'a'), unprocessed.substring(2));
            }
        }

    }

}
