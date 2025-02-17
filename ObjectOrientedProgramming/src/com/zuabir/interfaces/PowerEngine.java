package com.zuabir.interfaces;

public class PowerEngine implements Engine{
    @Override
    public void start() {
        System.out.println("the power engin started");
    }

    @Override
    public void stop() {
        System.out.println("the engin stoped");
    }



    @Override
    public void accelerate() {
        System.out.println("the engin accelerated");
    }
}
