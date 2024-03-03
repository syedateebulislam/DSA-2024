package org.example.sorting;

public class QuickSort {

    /*
    // This function takes first element as pivot,
    // places the pivot element at its correct position
    // in sorted array, and places all smaller to left
    // of pivot and all greater elements to right of pivot
    static int partition(int[] arr, int low, int high)
    {
        int i=low;
        int j=high;

        //selecting first elem from left as pivot
        int pivot = arr[low];

        //till the time i and j don't cross each other
        //during iterations
        while(i<j){

            // ith elem is less than pivot and arr is not finished on right
            while(arr[i]<=pivot && i<=high-1){
                    i++;
            }

            // jth elem is greater than pivot and arr is not finished on left
            //only greater than implemented as check for duplicate elem
            while(arr[j]>pivot && j>=low+1){
                    j--;
            }

            //if we have found ith elem which is greater
            //and belongs to right side of pivot
            //AND
            // jth elem which is smaller than pivot
            // and belongs to left side of pivot
            //AND
            //I and j still haven't crossed each other during iterations
            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        //Put pivot elem at its right place in arr
        //and return its position
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        return j;

    }
     */

    //------------------------------------------------------
    /*
    static int partition(int[] arr, int low, int high)
    {
        int i=low;
        int j=high;
        int pivot = arr[low];

        while(i<j){
            while(arr[i]<=pivot && i<=high-1){
                i++;
            }
            while(arr[j]>pivot && j>=low+1){
                j--;
            }
            if(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }

        int temp = arr[low];
        arr[low] = arr[j];
        arr[j]=temp;

        return j;
    }


    static void quickSort(int[] arr, int low, int high)
    {
        if (low < high) {

            // pi is partitioning index, arr[p]
            // is now at right place
            int pi = partition(arr, low, high);

            // Separately sort elements before
            // partition and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
    // To print sorted array
    public static void printArr(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // Driver Code
    public static void main(String[] args)
    {
        int[] arr = { 10, 7, 8, 9, 1, 5 };
        int N = arr.length;

        // Function call
        quickSort(arr, 0, N - 1);
        System.out.println("Sorted array:");
        printArr(arr);
    }
     */


}
