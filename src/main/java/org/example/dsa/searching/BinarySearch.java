package org.example.dsa.searching;


public class BinarySearch {

    public static void main(String[] args) {


        int[] arr = new int[]{1,2,3,4,5};

        int target=8;
        int index = binarySearch(arr,target);

        if(index>=0){
            System.out.println("Element is at "+(index+1)+" position.");
        }else {
            System.out.println("Element Not Found.");
        }


    }

    public static int binarySearch(int[] arr,int target){
        int low=0;
        int high=arr.length-1;

        while (low<=high) {
            int mid=(low+high)/2;
            int midElem=arr[mid];
            if (target == midElem) {
                return mid;
            } else if (target < midElem) {
                high = mid-1;
               // return high;
            } else {
                low = mid+1;
                //return low;
            }
        }
        return -1;
    }
}