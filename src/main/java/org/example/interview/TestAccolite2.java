package org.example.interview;


/*
Input:  1 0 0 1 0 1 0
Output: 0 0 0 0 1 1 1
Tc: O(n)
 */

import java.util.Arrays;

public class TestAccolite2 {

    public static void main(String[] args) {

        int[] arr = {1,0,0,1,0,1,0};

        int left =0;
        int right = arr.length-1;

        while(left<right){

            //if already zero
            if(arr[left] == 0){
                left++;
            } else if (arr[right] == 1) {
                //if already 1
                right--;
            }else {
                //or swap
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }

        System.out.println(Arrays.toString(arr));

    }
}
