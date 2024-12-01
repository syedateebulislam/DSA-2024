package org.example.interview.test;

import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestProgram {

    public static void main(String[] args) {
        System.out.println("Test");


        String str = "aaaabbbcccca";

        Map<Character,Long> m1 = str.chars().mapToObj(x->(char)x)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(m1);


        Set<Character> ch = m1.keySet();
        Long init = -1L;

        char currChar = ' ';
        Long currCount = 0L;

        char prevChar = ' ';
        Long prevCount = 0L;


        for(Character c: ch){


            currChar = c;
            currCount =  m1.get(c);

            System.out.println( "currChar = "+currChar +", currCount = "+currCount);
            System.out.println( "prevChar = "+prevChar +", prevCount = "+prevCount);
            System.out.println();

            // compare with prev
            if(currCount > prevCount){

            }

            prevCount = currCount;
            prevChar = currChar;

        }




    }
}
