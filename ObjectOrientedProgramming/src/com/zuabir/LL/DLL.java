package com.zuabir.LL;

public class DLL {
    Node head;
    public void insertFirst (int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head != null){
//            only set the head.pre node if its not null if it null already means our LL is alreadu emoty
            head.prev = node;
        }
        head = node ;
    }
    public void display (){
        Node temp = head;
        Node last = null;
        while (temp != null){
            System.out.print(temp.val+" -> ");
            last = temp ;
            temp = temp.next;
        }
        System.out.println("END");
        System.out.println("print in the reverse order ");
        while (last != null){
            System.out.print(last.val+" -> ");
            last = last.prev;
        }
        System.out.print("END");
    }
//    my own code
//    public void insertLast (int val){
//        Node temp = head;
//        Node last = null;
//        while (temp != null){
//            if(temp.next == null){
//                last = temp;
//            }
//            temp = temp.next;
//        }
//        Node node = new Node(val, null,last);
//        last.next = node ;
//        node = last ;
//    }
public void insertLast(int val) {
    Node node = new Node(val);  // create node with no next/prev

    if (head == null) {
        head = node;  // if list is empty, new node becomes head
        return;
    }

    Node temp = head;
    while (temp.next != null) {
        temp = temp.next;
    }

    temp.next = node;
    node.prev = temp;
}
public void inserIndex (int val , int index){
        if(index < 1){
            insertFirst(val);
            return;
        }

        Node pre = getNode(index);
        Node node = new Node(val);
        node.next = pre.next;

        pre.next = node;
        node.prev = pre;
}
    public Node getNode (int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }


    private class Node {
        private int val;
        private Node next ;
        private Node prev;
        public Node (int val ){
            this.val = val;

        }
        public Node (int val , Node next , Node prev){
            this.val = val;
            this.prev = prev;
            this.next = next;
        }
    }
}
