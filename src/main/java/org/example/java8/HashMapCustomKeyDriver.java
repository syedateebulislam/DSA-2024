package org.example.java8;

import java.util.HashMap;

public class HashMapCustomKeyDriver {

    public static void main(String[] args) {

        HashMap<HashMapCustomEmployee,String> m1 = new HashMap<>();

        HashMapCustomEmployee emp1 = new HashMapCustomEmployee("abc",101);
        HashMapCustomEmployee emp2 = new HashMapCustomEmployee("def",102);
        HashMapCustomEmployee emp3 = new HashMapCustomEmployee("abc",103);

        m1.put(emp1,"1");
        m1.put(emp2,"2");
        m1.put(emp3,"3");

        System.out.println(m1);

    }
}

