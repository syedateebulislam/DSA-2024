package org.example.arrays;

import java.util.Arrays;

public class ThreeSum {

    public static void main(String[] args) {

        int[] arr = new int[]{-1,0,1,2,-1,-4};

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
        int n=arr.length;
        for(int i=0;i<n;i++){

            if(i!=0 && arr[i]==arr[i-1]) continue;

            int j=i+1;
            int k=n-1;

            while(j<k){
                if(arr[i]+arr[j]+arr[k]==0){
                    System.out.println("{"+arr[i]+","+arr[j]+","+arr[k]+"}");
                    j++;
                    k--;
                    while(j<k && arr[j]==arr[j-1]){j++;}
                    while(k>j && arr[k]==arr[k+1]){k--;}
                }else{
                    if(arr[i]+arr[j]+arr[k]<0){
                        j++;
                    }else{
                        k--;
                    }
                }
            }
        }

    }




}
