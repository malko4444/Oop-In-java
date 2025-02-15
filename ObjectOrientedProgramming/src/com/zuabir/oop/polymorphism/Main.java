package com.zuabir.oop.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        circle.area();
        Shapes newShape = new Circle();
    }
}
