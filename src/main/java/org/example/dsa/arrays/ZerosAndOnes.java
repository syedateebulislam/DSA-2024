package org.example.dsa.arrays;

public class ZerosAndOnes {

    public static void main(String[] args) {

        int[] arr = new int[]{0,1,1,0,0,1,0,1};

        int left=0;
        int right=arr.length-1;
        printArr(arr);

        while(left<right){
            while(arr[left]==0 && left < right){
                left++;
            }
            while (arr[right]==1 && right > left){
                right--;
            }
            if(left<right){
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
            }
        }
        printArr(arr);
    }

    static void printArr(int[] arr){
        System.out.println("\n");
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
