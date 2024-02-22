package org.example;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        int num=10;
        int[] revArr=new int[10];

        int c=0;
        while(num>0){
            if(num%2==0){
                revArr[c]=0;
            }else{
                revArr[c]=1;
            }
            c++;
            num=num/2;
        }

        Arrays.stream(revArr).forEach(System.out::println);

    }

}