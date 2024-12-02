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


        //---------


        List<Integer> l1 = Arrays.asList(3,1,5,2,4,6,1,2);
        StreamQues c1 = new StreamQues();

        //c1.forEachMethod(l1);
        //c1.filterMethod(l1);
        //c1.mapMethod(l1);
        //c1.collectMethod(l1);
        //c1.countMethod(l1);
        //c1.sortedMethod(l1);
        //c1.sortedCompMethod(l1);
        //c1.minMethod(l1);
        //c1.maxMethod(l1);
        //c1.nagInternal(l1);
        c1.tryInt(l1);

    }

    static void groupByTest(List<Integer> intList) {
        System.out.println("");
        Map<Boolean,List<Integer>> l1 = intList.stream().collect(Collectors.groupingBy(x->x%2==0));
        System.out.println(l1);
    }

    static void partitioningByTest(List<Integer> intList) {
        System.out.println("");
        Map<Boolean,List<Integer>> l1 = intList.stream().collect(Collectors.partitioningBy(x->x%2==0));
        System.out.println(l1);
    }

    //create chars freq map from str
    static void freqMapFromStr(String str){
        System.out.println("");
        Map<Character,Long> m1 = str
                .chars()
                .mapToObj(c->(char)c)
                .collect(
                        Collectors.groupingBy(Function.identity(),Collectors.counting())
                );
        System.out.printf(m1.toString());
    }


    //---------------------


    void forEachMethod(List<Integer> l1) {
        System.out.println("forEachMethod");
        l1.stream().forEach(System.out::println);
    }

    void filterMethod(List<Integer> l1) {
        System.out.println("filterMethod");
        l1.stream().filter(i -> i % 2 == 0).forEach(System.out::println);

    }

    void mapMethod(List<Integer> l1) {
        System.out.println("mapMethod");
        l1.stream().map(i -> 2 * i).forEach(System.out::println);

    }

    void collectMethod(List<Integer> l1) {
        System.out.println("collectMethod");
        List<Integer> l2 = l1.stream().filter(i -> i % 3 == 0).collect(Collectors.toList());
        System.out.println(l2);

    }

    void countMethod(List<Integer> l1) {
        System.out.println("countMethod");
        long n = l1.stream().count();
        System.out.println(n);

    }

    void sortedMethod(List<Integer> l1) {
        System.out.println("sortedMethod");
        l1.stream().sorted().forEach(System.out::println);

    }

    void sortedCompMethod(List<Integer> l1) {
        System.out.println("");
        l1.stream().sorted((i1, i2) -> (i1 > i2) ? 1 : (i1 < i2) ? -1 : 0).forEach(System.out::println);

    }

    void minMethod(List<Integer> l1) {
        System.out.println("minMethod");
        System.out.println(l1.stream().min((i1, i2) -> i1 > i2 ? 1 : i1 < i2 ? -1 : 0).get());

    }

    void maxMethod(List<Integer> l1) {
        System.out.println("maxMethod");
        System.out.println(l1.stream().max((i1, i2) -> i1 > i2 ? 1 : i1 < i2 ? -1 : 0).get());

    }

    void nagInternal(List<Integer> l1)
    {
        System.out.println("nagInternal");
        l1.stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream()
                .filter(set -> set.getValue() > 1)
                .map(Map.Entry::getKey)
                .forEach(System.out::println);
    }

    void tryInt(List<Integer> l1) {
        System.out.println("tryInt");
        l1.stream().collect(Collectors.groupingBy(x->x)).entrySet().stream().
                filter(set -> set.getValue().size()>1).map(Map.Entry::getKey).forEach(System.out::println);

    }
}
