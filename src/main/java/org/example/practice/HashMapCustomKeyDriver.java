package org.example.practice;

import org.example.java8.HashMapCustomEmployee;

import java.util.HashMap;
import java.util.Map;

public class HashMapCustomKeyDriver {

    public static void main(String[] args) {

        Map<HashMapCustomEmployee, Integer> m1 = new HashMap<>();

        HashMapCustomEmployee e1 = new HashMapCustomEmployee("test1",101);
        HashMapCustomEmployee e2 = new HashMapCustomEmployee("test2",102);

        m1.put(e1,201);
        m1.put(e2,202);

        System.out.println(m1);

        m1.put(e1,202);
        System.out.println(m1);

    }

}
