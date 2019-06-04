package com.codingblocks.lecture_10;

public class Car {

    private MusicPlayer player;
    private Engine engine;
    private int failedAttempt = 0;

    public Car(){
        player = new SastaMusicPlayer();
        engine = new SastaEngine();
    }

    public Car(MusicPlayer player, Engine engine) {
        this.player = player;
        this.engine = engine;
    }

    public void start() {
        if (this.checkPass()) {
            this.engine.start();
        } else {
            failedAttempt++;
            System.out.println("failed times : " + failedAttempt);
        }

    }

    private boolean checkPass() {
        return true;
    }

    public void stop() {
        engine.stop();
    }

    public void upgrade(Engine engine){
        this.engine = engine;
    }

    public void setPlayer(MusicPlayer player) {
        this.player = player;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
