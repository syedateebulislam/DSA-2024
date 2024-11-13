package org.example.dsa.searching;

public class SortedRotatedArray {

    public static void main(String[] args) {
        int[] arr= new int[]{4,5,1,2,3};
        int target=6;
        int index=searchElem(arr,target);

        if(index!=-1){
            System.out.println("element is at "+(index+1)+" position.");
        }else {
            System.out.println("element not found.");
        }

    }

    public static int searchElem(int[] arr, int target){
        int index=0;

        //find dip index
        int pivot= findPivot(arr);

        //pass sub arr left
        int leftSearchResult=binarySearch(arr,target,0,pivot);

        //pass sub arr right
        int rightSearchResult=binarySearch(arr,target,pivot,arr.length-1);

        if (leftSearchResult ==-1 && rightSearchResult==-1){
            index=-1;
        }else if(leftSearchResult != -1){
            index=leftSearchResult;
        }else {
            index=rightSearchResult;
        }

        return index;
    }

    public static int binarySearch(int[] arr,int target,int low,int high){

        while (low<=high) {
            int mid=(low+high)/2;
            int midElem=arr[mid];
            if (target == midElem) {
                return mid;
            } else if (target < midElem) {
                high = mid-1;
            } else {
                low = mid+1;
            }
        }
        return -1;
    }

    public static int findPivot(int[] arr){
        int pivot=-1;

        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]>arr[i+1] && i!=arr.length-1){
                return i;
            }
        }

        return pivot;
    }

}
