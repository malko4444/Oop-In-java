package com.zuabir.oop.inheritance;

public class Main {
    public static void main(String[] args) {
        box box0 = new box();
        box box1 = new box(box0);
        boxWeight box3  = new boxWeight(10);
        boxWeight box4  = new boxWeight(10,4,4,5);
        boxWeight box5  = new boxWeight(20,40,40,50);
        boxWeight box6 = new boxWeight(box5);
        boxPrice box7 = new boxPrice(3,40000);
        System.out.println("side"+box7.l+"  "+box7.price+"  "+box7.h);

//        System.out.println("height "+box6.h+" width "+box6.w+" length "+box6.l+" weight "+box6.weight);
    }
}
