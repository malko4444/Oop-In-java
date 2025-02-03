package com.zuabir.humanPackage;

public class Main {
    public static void main(String[] args) {
        Human human1 = new Human("zubair", 17 , 4000, false);
        Human human2 = new Human("zain", 17 , 4000, true);
        Human human3 = new Human("ammar", 17 , 4000, true);


        System.out.println(human1.name);
        System.out.println(human1.maried);
        System.out.println(Human.papulation);
        fun();

    }
    static void fun(){
        Main obj = new Main();

        obj.greeting();
    }
    void greeting() {
        System.out.println("hello greeting");
    }
}
