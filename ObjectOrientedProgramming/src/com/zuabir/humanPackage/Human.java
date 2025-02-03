package com.zuabir.humanPackage;

public class Human {
    int age ;
    String name ;
    int salary;
    boolean maried;
    static long papulation ;

    Human(String name , int age ,  int salary , boolean maried){
        this.name = name;
        this.age = age;
        this.maried = maried;
        this.salary = salary;
        Human.papulation = Human.papulation+1;

    }

}
