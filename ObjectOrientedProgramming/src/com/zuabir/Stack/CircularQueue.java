package com.zuabir.Stack;

public class CircularQueue {
    protected int [] data;
    int size ;

    int end = 0 ;
    int start = 0 ;
    private static final int DEFAULT_SIZE = 10;
    public CircularQueue(){

        this(DEFAULT_SIZE);
    }
    public CircularQueue(int size){
        this.data = new int[size];

    }
    public boolean isEmpty(){
        return size == 0;
    }
    public boolean isFull() {

        return size== data.length;
    }
    public  boolean insert (int item ){
        if(isFull()){
            return false;

        }
        data[end++] = item;
        
    }

}
