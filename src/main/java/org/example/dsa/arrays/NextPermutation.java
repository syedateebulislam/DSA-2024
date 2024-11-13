package org.example.dsa.arrays;

import java.util.Arrays;

public class NextPermutation {

    public static void main(String[] args) {

        int[] arr = new int[]{2,1,5,4,3,0,0};

        int index=0;

        //find dip
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                index=i;
                break;
            }

        }

        //swap with adjacent max num
        for(int j=arr.length-1;j>index;j--){
            //System.out.println(arr[j]);
            if(arr[j]>arr[index]){
                int t=arr[j];
                arr[j]=arr[index];
                arr[index]=t;
                break;
            }
        }

        //sort the left part in reverse order
        for(int i=index+1;i<=arr.length-1;i++){
            for(int j=index+1;j<=arr.length-1;j++){
                if(arr[i]<arr[j]){
                    int t=arr[i];
                    arr[i]=arr[j];
                    arr[j]=t;
                }
            }
        }

        System.out.println(Arrays.toString(arr));


    }

}
