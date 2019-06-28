package com.codingblocks.lecture_23;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        String line = "hello world";
        Map<Character, Integer> map = countChars(line);

        for (Character ch : map.keySet()) {

        }
    }

    private static Map<Character, Integer> countChars(String line){
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);
            if (map.containsKey(ch)){
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        return map;
    }
}
