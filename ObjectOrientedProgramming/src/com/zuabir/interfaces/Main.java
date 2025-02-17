package com.zuabir.interfaces;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
//        car1.accelerate();
//        car1.brake();
//        car1.stop();
//
//        Engine car2 = new Car();
//        car2.accelerate();
        NiceCar car3 = new NiceCar();
        car3.start();
        car3.stopMusic();
        car3.upgrateEngine();
        car3.start();
    }

}
