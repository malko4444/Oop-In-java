package com.zuabir.ArrayListCreate;

import java.util.Arrays;

public class CustomArrayList {
    private int[] data;
    private static int defaultSize = 10;
    private int size = 0;

    public CustomArrayList() {
        this.data = new int[defaultSize];
    }

    public void add(int num) {
        if (isFull()) {
            reSize();
        }
        data[size++] = num;
    }

    private void reSize() {
        int[] temp = new int[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    public int size() {
        return size;
    }

    public void set(int index, int value) {
        data[index] = value;
    }

    public int value(int index) {
        return data[index];
    }

    private boolean isFull() {
        return size == data.length;
    }

    // Overriding toString method to return a readable format of the list
    @Override
    public String toString() {
        return "CustomArrayList: " + Arrays.toString(Arrays.copyOf(data, size));
    }

    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList();
        list.add(3);
        list.add(9);
        System.out.println(list.value(1));
        list.set(1, 3);
        list.add(5);
        list.add(5);
        System.out.println(list); // Now prints the contents of the list
    }
}
