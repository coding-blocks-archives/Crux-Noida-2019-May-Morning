package com.codingblocks.lecture_10;

public class Client {
    public static void main(String[] args) {
//        Car car = new Car();
//
//        car.start();
//        car.stop();
//
//        NuclearEngine engine = new NuclearEngine();
//        car.upgrade(engine);
//
//        car.start();
//        car.stop();
//
//        Engine e = new NitroEngine();
//        MusicPlayer player = new SastaMusicPlayer();
//
//        Car another = new Car(player, e);

        Singleton one = Singleton.getInstance();
        Singleton two = Singleton.getInstance();

        System.out.println(one);
        System.out.println(two);


        Logger.getInstance().log("I am happy here");

    }
}
