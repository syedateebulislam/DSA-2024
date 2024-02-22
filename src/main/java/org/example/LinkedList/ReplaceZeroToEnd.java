package org.example.LinkedList;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ReplaceZeroToEnd {

    public static void main(String[] args) {

        int[] arr = new int[]{0,4,0,2,6,0,1};


        int l=0;
        int r=arr.length-1;

        while(l<=r){
            if(arr[l]==0){
                int temp=arr[l];
                arr[l]=arr[r];
                arr[r]=temp;
                while(arr[--r]==0);
            }
            l++;
        }

        for(int k:arr){
            System.out.print(k+",");
        }

    }

}
