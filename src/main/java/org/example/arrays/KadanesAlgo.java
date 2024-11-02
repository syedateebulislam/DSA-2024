package org.example.arrays;

import java.util.ArrayList;
import java.util.List;

public class KadanesAlgo {

    public static void main(String[] args) {

        int[] arr = new int[]{-2, -3, 4, -1, -2, 1, 5, -3};

        System.out.println(maxSubArraySum(arr));

        //maxSubArraySumPrintArr(arr);

    }

    static void maxSubArraySumPrintArr(int[] arr){

        int currSum=0;
        int maxSum=0;

        List<Integer> l1 = new ArrayList<>();

        for(int i=0;i<arr.length-1;i++){
            if(currSum+arr[i]>=arr[i]){
                currSum = currSum+arr[i];
            }else{
                currSum = arr[i];
            }
            if(currSum>maxSum){
                l1.add(i);
            }
            maxSum = Math.max(maxSum,currSum);
        }

        if(l1.size()==1){
            System.out.println(arr[l1.get(0)]);
        }else{
            int i=l1.get(l1.size()-1);
            int j=l1.get(l1.size()-2);
            while(j<=i){
                System.out.print(arr[j]+",");
                j++;
            }
        }
    }


    static int maxSubArraySum(int[] arr)
    {
        int currSum=0;
        int maxSum=0;

        for(int i=0;i<arr.length-1;i++){
            if(currSum+arr[i]>=arr[i]){
                currSum = currSum+arr[i];
            }else{
                currSum = arr[i];
            }
            maxSum = Math.max(maxSum,currSum);
        }

        return maxSum;
    }

}
