package org.example.design.Design_Pattern.creational.singleton;

public class SingletonDriver {

    public static void main(String[] args) {

        //example-1
//        Singleton_Lazy s1 = Singleton_Lazy.getObj();
//        System.out.println(s1.hashCode());

        Singleton_Eager s2 = Singleton_Eager.getObj();
        System.out.println(s2.hashCode());


    }
}
