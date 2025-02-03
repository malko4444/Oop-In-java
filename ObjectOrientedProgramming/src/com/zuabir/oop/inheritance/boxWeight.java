package com.zuabir.oop.inheritance;

public class boxWeight extends box{
    double weight ;
    boxWeight(int weight){
        this.weight = weight;
    }
    boxWeight(double l, double w, double h , double weight){
        super(l,w,h);
        this.weight = weight;
    }
    boxWeight(boxWeight other){
        super(other);

    }
    boxWeight(double side ){
        super(side);
        System.out.println("siden from the above contructor"+side);

    }
}
