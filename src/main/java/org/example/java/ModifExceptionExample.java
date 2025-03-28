package org.example.java;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;



public class ModifExceptionExample {

    public static void main(String[] args) {

//        fixedExcep();

        testExcep();

    }


    public static void fixedExcep(){
        List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C"));

        Iterator<String> iter = list.iterator();
        while (iter.hasNext()){
            if(iter.next().equalsIgnoreCase("A")){
                iter.remove();
            }
        }
        list.stream().forEach(System.out::println);
    }


    public static void testExcep(){
        List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C"));

        for(String s: list){
            System.out.println("value - "+s);
            if(s.equalsIgnoreCase("A")){
                list.remove(s);
            }
        }
        //list.stream().forEach(System.out::println);
    }
}

/*
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        for (String item : list) {
            if (item.equals("B")) {
                list.remove(item);
            }
        }

        System.out.println(list);
    }
}
*/