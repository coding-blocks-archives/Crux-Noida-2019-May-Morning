package com.codingblocks.lecture_17;

public class StackClient {
    public static void main(String[] args) {
        CustomStack stack = new DynamicStack();

//        stack.push(24);
//        stack.push(4);
//        stack.push(14);
//        stack.push(20);
//
//        System.out.println(stack);
//        stack.pop();
//        System.out.println(stack);
//        stack.pop();
//        System.out.println(stack);
//        stack.pop();
//        System.out.println(stack);

        for (int i = 0; i < 20; i++) {
            stack.push(i);
        }

        System.out.println(stack);


    }
}
