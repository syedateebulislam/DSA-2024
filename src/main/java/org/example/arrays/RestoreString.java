package org.example.arrays;


import java.util.Arrays;

public class RestoreString {

    public static void main(String[] args) {
        String str = "codeleet";
        int[] strIndexArr = {4,5,6,7,0,2,1,3};

        char[] strCharArray = str.toCharArray();
        char[] finalArr = new char[strCharArray.length];

        for(int i=0 ; i<strIndexArr.length ; i++){
            finalArr[strIndexArr[i]] = strCharArray[i];
        }

        System.out.println(Arrays.toString(finalArr));
    }

}
