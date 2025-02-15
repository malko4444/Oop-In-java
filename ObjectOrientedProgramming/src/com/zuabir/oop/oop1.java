package com.zuabir.oop;

import static com.zuabir.oop.Message.message;

public class oop1 {
    protected String name = "Zuabir shehzad";


    public static void main(String[] args) {
        System.out.println("the hello word and the main data ");
        Student zubair = new Student(13,"zuabir shehzad",5.5f);
        Student zain = new Student();
        System.out.println(zain.name);


//        System.out.println(zubair.name);
//        System.out.println(zubair.marks);
//        System.out.println(zubair.rno);
        //change the name of zuabnir

//        Student random = new Student(zubair);
//        System.out.println(random.name);
//        System.out.println(random.marks);
        message();
//
    }
}
class Student {
    int rno;
    String name ;
    float marks;
    void changeName(String changename) {
        this.name = changename;
    }

    Student (Student other){
        this.name = other.name ;
        this.rno = other.rno;
        this.marks= other.marks;

    }
    //using this we call the other constructer in a class

    Student(){
        // internally it replaces it with new Student(12,"zain Azhar",10)
        this (2,"Zain Azhar",10);
    }
    Student(int rno, String name ,float marks){
        this.rno = rno;
        this.marks = marks;
        this.name = name;

    }


}
class subClase extends oop1{
    public subClase (String name, int age){
        System.out.println("name "+name);
    }
}

