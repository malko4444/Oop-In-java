package com.zuabir.LL;

public class CLL {
    Node head ;
    Node tail;
    int size ;
    public CLL(){
        size = 0;
    }
    public void insert(int val){
        Node node = new Node(val);
        if (head == null){
            head = node;
            tail= node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail  = node;

    }
    private class Node {
        int val;
        Node next;
        public Node (int val){
            this.val = val;
        }
    }
}
