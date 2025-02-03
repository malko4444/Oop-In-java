package com.zuabir.oop.inheritance;

public class box {
    protected double l ;
    protected double h;
    double w;
    box (){
        this.l= -1;
        this.h = -1;
        this.w = -1;

    }

    box (double side){
        this.l= side;
        this.h =side;
        this.w = side;

    }

    box (box box1){
        this.l= box1.l;
        this.h =box1.h;
        this.w = box1.w;

    }
    box (double l , double w, double h){
        this.l= l;
        this.h =h;
        this.w = w;

    }
}
