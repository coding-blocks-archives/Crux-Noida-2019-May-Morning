package com.codingblocks.lecture_10;

public class SastaMusicPlayer implements MusicPlayer {
    @Override
    public void start() {
        System.out.println("play ghatiya music");
    }

    @Override
    public void stop() {
        System.out.println("stop ghatiya music");
    }
}
