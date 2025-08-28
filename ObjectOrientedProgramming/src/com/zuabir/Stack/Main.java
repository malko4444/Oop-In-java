package com.zuabir.Stack;

public class Main {
    public static void main(String[] args) throws Exception {
        CustomStack stack = new CustomStack(3);
//        stack.push(34);
//        stack.push(3);
//        stack.push(334);
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.peek());
          DynamicStack Dstack = new DynamicStack(2);
          Dstack.push(3435);
          Dstack.push(78437);
          Dstack.push(343547  );
          System.out.println(Dstack.pop());
          System.out.println(Dstack.pop());


    }
}
