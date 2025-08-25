package com.zuabir.LL;

import javax.swing.*;

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
    public  void insertRec(int val ,int index ){
        head = insertRec(val,index, head);

        System.out.println(head.value);

    }
    private Node insertRec(int val , int index, Node node ){
        if(index== 0){
            Node temp = new Node(val, node);
            size++;
            return temp;
        }
        node.next = insertRec(val, index-1,node.next);
        System.out.println("the node "+node.value);
        return node;
    }

    private void reverseRecursion( Node node ){
        if(node == tail){
            head = tail;
            return;
        }

        reverseRecursion(node.next);
        tail.next = node;
        tail = node ;
        tail.next = null;
    }

private Node reverseUsingTraversal(Node head){
        Node present = head;
        Node prev = null;
        Node upcoming = head.next;
        while (present != null){
            present.next = prev;
            prev = present;
            present = upcoming;
            if(upcoming.next != null){
                upcoming = upcoming.next;
            }
        }
        head = prev;
        return head;
}
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode reverseBetween(ListNode head, int left, int right) {
    if(left == right){
        return head;
    }
    ListNode current = head;
    ListNode prev = null;
        for (int i = 0; current!=null && i < left-1; i++) {
            prev = current;
            current = current.next;

        }
        ListNode last = prev;
        ListNode newEnd = current;
        ListNode next = current.next;
        for (int i = 0; current != null && i < right-left + 1 ; i++) {
            current.next = prev;
            prev = current;
            current = next;
            if(next != null){
                next = next.next;
            }






        }
        if(last != null ){
            last.next = prev;
        }else{
            head = prev;
        }
        newEnd.next = current;
        return head;
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
//    count the cycle length in a cyclic linked list
//
//    public class Solution {
//        public boolean hasCycle(ListNode head) {
//
//            ListNode fast = head ;
//            ListNode slow = head;
//            while(fast!= null && fast.next != null){
//                fast = fast.next.next;
//                slow = slow.next;
//                if(fast == slow){
//                    int count = 1 ;
//                    slow = slow.next;
//                    while(fast != slow ){
//                        count++;
//                        slow = slow.next;
//
//                    }
//
//                    return true;
//                }
//            }
//            return false;
//
//        }
//    }
//    A  Happy number
public boolean isHappy(int n) {
    int slow = n;
    int fast = n;
    if(n == 1){
        return true;
    }
    do{
        slow = squareOfNumber(slow);
        fast = squareOfNumber(squareOfNumber(fast));

    }while (fast != slow);
    if (fast == 1){
        return true;
    }
    return false;
}
    private int squareOfNumber (int num){
        int ans = 0 ;
        while(num > 0){
            int rem = num % 10;
            ans = ans + (rem * rem);
            num = num /10;
        }
        return ans;
    }
// find the middle of the LInked LIst using slow and fast pointer
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
//    class Solution {
//        public ListNode middleNode(ListNode head) {
//            ListNode slow = head;
//            ListNode fast = head ;
//            while(fast!= null && fast.next!= null){
//                slow = slow.next ;
//                fast = fast.next.next;
//            }
//            return slow;
//
//        }
//    }

}

