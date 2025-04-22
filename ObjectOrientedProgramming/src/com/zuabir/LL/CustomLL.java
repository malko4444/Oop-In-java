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
    public int deleteFirst (){
        int val = head.value;
        head = head.next;

        if(head == null){
            head = null;
            tail = null;

        }

        return val;
    }
    public int deleteLast (){
        if (size <= 1){
            return deleteFirst();
        }
        Node secondLastNode = getNode(size-2);
        int val = tail.value;
        tail.value = secondLastNode.value;
        tail.next = null;
        return val;
    }
    public Node getNode (int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }
    public Node find (int value){
        Node node = head;
        while (node != null){
            if(node.value == value){
                return node;
            }
            node = node.next;
        }
        return null;
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
    public int delete (int index){
        if(index == 0 ){
            return deleteFirst();
        }
        if (index == size-1){
            return deleteLast();
        }
        Node pre = getNode(index-1 );
        int val = pre.next.value;
        pre.next = pre.next.next;

        return val;
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
