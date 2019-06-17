package com.codingblocks.lecture_17;

public class EggDrop {
    public static void main(String[] args) {

        int floor = 100;
        int egg = 3;

        Integer[][] mem = new Integer[egg+1][floor + 1];

        System.out.println(eggDrop(egg, floor));
        System.out.println(eggDrop(egg, floor, mem));
    }

    public static int eggDrop(int egg, int floor){
        if (floor == 0){
            return 0;
        }

        if (egg == 1){
            return floor;
        }

        int best = floor;
        for (int f = 1; f <= floor; f++) {

            int broke = eggDrop(egg - 1, f-1);
            int intact = eggDrop(egg, floor - f);

            int pos = 1 + Math.max(broke, intact);

            if (pos < best){
                best = pos;
            }
        }

        return best;
    }


    public static int eggDrop(int egg, int floor, Integer[][] mem){
        if (floor == 0){
            return 0;
        }

        if (egg == 1){
            return floor;
        }

        if (mem[egg][floor] != null){
            return mem[egg][floor];
        }

        int best = floor;
        for (int f = 1; f <= floor; f++) {

            int broke = eggDrop(egg - 1, f-1, mem);
            int intact = eggDrop(egg, floor - f, mem);

            int pos = 1 + Math.max(broke, intact);

            if (pos < best){
                best = pos;
            }
        }

        mem[egg][floor] = best;

        return best;
    }
}
