package org.example.java8;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamQues {

    public static void main(String[] args) {

        freqMapFromStr("abc");

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
