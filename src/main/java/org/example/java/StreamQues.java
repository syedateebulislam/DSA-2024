package org.example.java;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import java.util.*;

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


//        List<?> m1 = "abc"
//                .chars()
//                .mapToObj(c->(char)c)
//                .collect(Collectors.toList());
//        System.out.println(m1);


        Map<String, Integer> salaryMap = new HashMap<>();
        salaryMap.put("Alex", 200);
        salaryMap.put("Broski", 300);
        salaryMap.put("Bunny", 200);
        salaryMap.put("Tim", 500);
        salaryMap.put("Steve", 500);

//        salaryMap.values().stream().forEach(System.out::println);


        System.out.println("----------------");

        // Find the second-highest salary
        Optional<Integer> secondHighestSalary = salaryMap.values().stream()
                .distinct()                         // Remove duplicates
                .sorted(Comparator.reverseOrder())  // Sort in descending order
                .skip(1)                            // Skip the first element (highest salary)
                .findFirst();                       // Get the second element

        // Print the result
        if(secondHighestSalary.isPresent()) {
            System.out.println("Second highest salary is: " + secondHighestSalary.get());
        }else{
            System.out.println("No second highest salary found.");
        }

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
