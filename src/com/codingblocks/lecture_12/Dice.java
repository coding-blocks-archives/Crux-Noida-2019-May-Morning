package com.codingblocks.lecture_12;

import java.util.ArrayList;

public class Dice {
    public static void main(String[] args) {
        diceMethod(5, 3);
    }

    public static void dice(String processed, int target, int face){
        if (target == 0){
            System.out.println(processed);
            return;
        }

        for (int i = 1; i <= face && i <= target ; i++) {
            dice(processed + i, target - i, face);
        }
    }


    public static ArrayList<String> diceMethod(int target, int face){
        ArrayList<String> list = new ArrayList<>();
        diceList("", 5, 3, list);
        return list;
    }

    public static void diceList(String processed, int target, int face, ArrayList<String> list){
        if (target == 0){
            list.add(processed);
            return;
        }

        for (int i = 1; i <= face && i <= target ; i++) {
            diceList(processed + i, target - i, face, list);
        }
    }


    public static ArrayList<String> diceList(String processed, int target, int face){
        if (target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <= face && i <= target ; i++) {
            ArrayList<String> temp = diceList(processed + i, target - i, face);
            list.addAll(temp);
        }

        return list;
    }





}
