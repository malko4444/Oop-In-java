package com.zuabir.interfaces;

public class Car implements Brake,Engine {

    @Override
    public void brake() {
        System.out.println("i brake like a normal car ");
    }

    @Override
    public void start() {
        System.out.println("i start like a normal car ");

    }

    @Override
    public void stop() {
        System.out.println("i stop like a normal car");
    }



    @Override
    public void accelerate() {
        System.out.println("i accelerate like a normal car that are");

    }
}
