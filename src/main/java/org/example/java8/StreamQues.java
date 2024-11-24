package org.example.java8;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamQues {

    public static void main(String[] args) {

//        freqMapFromStr("abc");

//        groupByTest(Arrays.asList(1,2,3,4,5,6));

//        partitioningByTest(Arrays.asList(1,2,3,4,5,6));

//        List<Integer> l1 = Arrays.asList(1,2,3,4,5,6,6);
//
//        Map<Integer,Long> i = l1.stream()
//                .collect(Collectors
//                        .groupingBy(Function.identity(),Collectors.counting()));
//
//        System.out.println(i);


        List<?> m1 = "abc"
                .chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.toList());
        System.out.println(m1);

    }

    static void groupByTest(List<Integer> intList) {
        Map<Boolean,List<Integer>> l1 = intList.stream().collect(Collectors.groupingBy(x->x%2==0));
        System.out.println(l1);
    }

    static void partitioningByTest(List<Integer> intList) {

        Map<Boolean,List<Integer>> l1 = intList.stream().collect(Collectors.partitioningBy(x->x%2==0));
        System.out.println(l1);

    }

    //create chars freq map from str
    static void freqMapFromStr(String str){

        Map<Character,Long> m1 = str
                .chars()
                .mapToObj(c->(char)c)
                .collect(
                        Collectors.groupingBy(Function.identity(),Collectors.counting())
                );

        System.out.printf(m1.toString());
    }
}
