//
//
//
//
//import java.util.*;
//        import java.io.*;
//
//class BiCycle{
//    String define_me(){
//        return "a vehicle with pedals.";
//    }
//}
//
//class MotorCycle extends BiCycle{
//    String define_me(){
//        return "a cycle with an engine.";
//    }
//
//    MotorCycle(){
//        System.out.println("Hello I am a motorcycle, I am "+ define_me());
//
//        String temp= super.define_me(); //Fix this line
//
//        System.out.println("My ancestor is a cycle who is "+ temp );
//    }
//
//}
//class Solution{
//    public static void main(String []args){
//        MotorCycle M=new MotorCycle();
//    }
//}

//import java.util.Arrays;

////Hello I am a motorcycle, I am a cycle with an engine.
////My ancestor is a cycle who is a vehicle with pedals.
///
package com.zuabir.oop.HackerRankProblem;

import java.util.Arrays;

class Solution {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length ;
        for (int x = 0; x < n; x++) {
            int count = 0 ;
            for (int num : nums){
                if(num >= x){
                    count++;
                }
            }
            if(count== x){
                return x;
            }

        }
        return -1;
    }
}