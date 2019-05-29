package com.codingblocks.lecture_6;

import java.util.ArrayList;

public class BuilderExample {
    public static void main(String[] args) {
        String sample = "a";

        StringBuilder builder = new StringBuilder("a");

        for (int i = 0; i < 1000000; i++) {
            builder.append("a");
        }




    }


}
