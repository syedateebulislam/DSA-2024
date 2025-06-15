package org.example.dsa.stack;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Stack;

public class SumOfSubArrMin {

    public static void main(String[] args) {

        int[] arr = new int[]{ 39, 27, 11, 4, 24, 32, 32, 1};
        System.out.println(Arrays.toString(arr));

        //left min
        int[] nse = findNextSmallerElem(arr);
        System.out.println(Arrays.toString(nse));

        //right min
        int[] pse = findPrevSmallerOrEquivalentElem(arr);
        System.out.println(Arrays.toString(pse));

        int left = 0;
        int right = 0;
        int total = 0;
        for(int i=0;i<arr.length;i++){
            left = i - pse[i];
            right = nse[i] - i;
            total += left * right * arr[i];
        }

        System.out.println("total - "+total);

    }



    public static int[] findNextSmallerElem(int[] arr){
        int n = arr.length;
        int[] nse = new int[n];
        Stack<Integer> s1 = new Stack<>();

        for(int i=n-1;i>=0;i--){
            while(!s1.isEmpty() && arr[s1.peek()]>=arr[i]){
                s1.pop();
            }
            nse[i] = (s1.isEmpty())?n:s1.peek();
            s1.push(i);
        }

        return nse;
    }

    public static int[] findPrevSmallerOrEquivalentElem(int[] arr){

        int n = arr.length;
        int[] psee = new int[n];
        Stack<Integer> s1 = new Stack<>();

        for(int i=0; i<n;i++){
            while(!s1.isEmpty() && arr[s1.peek()]>=arr[i]){
                s1.pop();
            }
            psee[i] = (s1.isEmpty())? -1:s1.peek();
            s1.push(i);
        }

        return psee;
    }



}
