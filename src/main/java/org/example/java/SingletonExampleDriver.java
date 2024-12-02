package org.example.java;

public class SingletonExampleDriver{
    public static void main(String[] args) {

        SingletonThreadSafe s1 =  SingletonThreadSafe.getObj();
        System.out.println(s1.hashCode());

        SingletonThreadSafe s2 = SingletonThreadSafe.getObj();
        System.out.println(s2.hashCode());
    }
}

