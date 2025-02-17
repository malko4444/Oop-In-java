package com.zuabir.interfaces;

public class ElectricEngine implements Engine{
    @Override
    public void start() {
        System.out.println("electric engin start");
    }

    @Override
    public void stop() {
        System.out.println("electric engin Stop");
    }

    @Override
    public void accelerate() {
        System.out.println("electric engin acceleratet");
    }
}
