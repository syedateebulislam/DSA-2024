package org.example.sorting;

import java.util.Arrays;

public class MergeSortTry {

    void merge(int[] arr,int left,int mid,int right){

        //find length of temp arr
        //always taking from high - low,and +1 bcz itz 0th initialization in arr
        int leftArrLength = mid - left +1;
        //always taking from high - low
        int rightArrLength = right - mid;

        //create and fill tem arr
        int[] leftArr = new int[leftArrLength];
        int[] rightArr = new int[rightArrLength];

        //fill both temp arr from final arr

        for(int i=0;i<leftArrLength;i++){
            leftArr[i] = arr[left+i];//check
        }

        for(int j=0;j<rightArrLength;j++){
            rightArr[j]= arr[mid+1+j];//check
        }

        //initialize all 3 iterator
        int i=0;int j=0;int k=left;

        //compare and fill final arr from temp arr
        while(i < leftArrLength && j < rightArrLength){
            if(leftArr[i] < rightArr[j]){
                arr[k] = leftArr[i];
                i++;
            }else{
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        //fill rest element from both arr
        while(i<leftArrLength){
            arr[k]=leftArr[i];
            i++;
            k++;
        }
        while(j<rightArrLength){
            arr[k]=rightArr[j];
            j++;
            k++;
        }
    }

    void sort(int[] arr,int left,int right){
        if(left<right){
            int mid = left +(right - left)/2;

            sort(arr,left,mid);
            sort(arr,mid+1,right);
            merge(arr,left,mid,right);

        }
    }

    void printArr(int[] arr){
        System.out.println("\nArray -");
        for(int i:arr){
            System.out.print(i+",");
        }
    }

    //main sorting calling method
    public static void main(String[] args) {

        int[] arr = new int[]{3,2,5,4,1,7,9,8};

        int r = arr.length-1;

        MergeSortTry obj = new MergeSortTry();
        obj.printArr(arr);
        obj.sort(arr,0,r);
        obj.printArr(arr);

    }


}
