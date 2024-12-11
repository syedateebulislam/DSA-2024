package org.example.practice;


import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class SynechronL3 {

    public static void main(String[] args) {

        String s1 = "abba";

        boolean p = IntStream.range(0,s1.length()/2)
                .allMatch(i -> s1.charAt(i) == s1.charAt((s1.length()-1-i)));


        //System.out.println(p);
        System.out.println(s1.length());


        for(int i=0 ; i<s1.length()/2 ;i++){
            System.out.println("s1.charAt(i) = " + s1.charAt(i));
            System.out.println("s1.charAt((s1.length()-1-i)) = " + s1.charAt((s1.length()-1-i)));
        }



    }

}
