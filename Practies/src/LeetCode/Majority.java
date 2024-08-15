package LeetCode;

import TopInterview.Array;

import java.util.Arrays;

public class Majority {
    public static void main(String[] args) {
        int [] nums={2,3,3};
       int majority=nums[0];
       int count=1;
        for (int i = 1; i < nums.length ; i++) {
           if(count==0){
               majority=nums[i];
           }
           if(nums[i]==majority){
               count++;
           }else{
               count--;
           }
        }
        System.out.println(majority);
    }
}
