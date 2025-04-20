package com.zuabir.LL;

public class Main {
    public static void main(String[] args) {

        CustomLL list = new CustomLL();
        list.insertFirst(45);
        list.insertFirst(5);
        list.insertFirst(25);
        System.out.println("the link list ");
        list.inserLast(89);
        list.insertFirst(25);
        list.insertInIndex(10,7);
        list.display();

    }
}
