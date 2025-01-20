package org.example.dsa.arrays;

import java.util.Arrays;
import java.util.stream.Collectors;

public class DupNums {

    public static void main(String[] args) {


        int[] nums = {1,3,4,2,3};

        int n = nums.length;

        int[] markArr = new int[n];

        for(int i=0; i<n ;i++){
            if(markArr[nums[i]-1]!=-1){
                markArr[nums[i]-1]=-1;
            }else{
                System.out.println("dup num - "+nums[i]);
            }
        }


    }

}
