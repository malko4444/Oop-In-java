package com.zuabir.Stack;

import java.util.Arrays;
import java.util.Stack;

public class Main {
    public static void main(String[] args)  {
//        CustomStack stack = new CustomStack(3);
//        stack.push(34);
//        stack.push(3);
//        stack.push(334);
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.peek());
//          DynamicStack Dstack = new DynamicStack(2);
//          Dstack.push(3435);
//          Dstack.push(78437);
//          Dstack.push(343547  );
//          System.out.println(Dstack.pop());
//          System.out.println(Dstack.pop());

        int[] a = {4,2,4,6,1};
        int[] b = {2,1,8,5};
        int x = 10;
        System.out.println(calculateNumber(x,a,b,0,0)-1);



    }
    public static boolean validPar(String s){
        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray()){
            if(ch == '[' || ch=='(' ||ch=='{'){
                stack.push(ch);
            } else if (ch == stack.peek()) {
                stack.pop();

            }else {
                return false;
            }


        }
        if(stack.isEmpty()){
            return true;
        }else{
            return false ;
        }

    }
    public  static int calculateNumber(int x, int[] a, int[] b, int sum, int count) {
        if(sum > x){
            return count;
        }
        if(a.length == 0 || b.length == 0){
            return count;
        }
        int ans1 = calculateNumber(x , Arrays.copyOfRange(a,1,a.length),b , sum+a[0],count+1);
        int ans2 = calculateNumber(x , a,Arrays.copyOfRange(b,1,b.length) , sum+b[0],count+1);
        return Math.max(ans1, ans2);

    }
}
