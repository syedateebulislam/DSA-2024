package org.example.java;

import java.util.HashMap;

public class HashMapCustomKeyDriver {

    public static void main(String[] args) {

        HashMap<HashMapCustomEmployee,String> m1 = new HashMap<>();

        HashMapCustomEmployee emp1 = new HashMapCustomEmployee("abc",101);
        HashMapCustomEmployee emp2 = new HashMapCustomEmployee("abc",102);
        HashMapCustomEmployee emp3 = new HashMapCustomEmployee("abc",103);

        m1.put(emp1,"1");
        m1.put(emp2,"1");
        m1.put(emp3,"1");

        System.out.println(m1);

    }
}

