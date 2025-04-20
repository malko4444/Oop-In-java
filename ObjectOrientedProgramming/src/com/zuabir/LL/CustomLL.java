package com.zuabir.LL;

public class CustomLL {
    private Node head;
    private Node tail;
    private int size ;
    public CustomLL(){

        this.size = 0;
    }
    public void display (){
        Node temp = head;
        while(temp!= null){
            System.out.print(temp.value+"=>");
            temp = temp.next;

        }
        System.out.print("End");
    }
public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail == null){
            tail = head;
        }

        size++;
    }
    public void deleteFirst (){
        if(head == tail){
            head = head.next;
            tail = tail.next;

        }
        head = head.next;
    }
    
    public void insertInIndex (int val, int index){
        if (index >size){
//            System.out.println("the link list is not have the index that you provided");
            inserLast(val);
        }
        if(index == 0){
            insertFirst(val);
            return;
        }
        if(index == size){
            inserLast(val);
            return;
        }


        Node temp = head;
        for (int i = 1; i < index; i++) {

            temp = temp.next;


        }
        Node node = new Node(val,temp.next);
        temp.next= node;
        size++;

    }
    public void inserLast (int val){
        if (tail == null){
//            means nothing in the linked list so insert it in the first
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;

        size++;
    }


    private class Node{
        private int value;
        private Node next;
        public Node(int value){
            this.value = value;
        }

        public Node(int value , Node next){
            this.value = value;
            this.next = next;
        }
    }
}
