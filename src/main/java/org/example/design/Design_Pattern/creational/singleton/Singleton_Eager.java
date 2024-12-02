package org.example.design.Design_Pattern.creational.singleton;

public class Singleton_Eager {

    private static Singleton_Eager obj = new Singleton_Eager();

    private Singleton_Eager(){
    }

    public static Singleton_Eager getObj(){
        return obj;
    }
}
