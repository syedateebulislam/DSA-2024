package org.example.design.Design_Pattern.creational.singleton;

public class Singleton_Lazy {

    private static Singleton_Lazy obj;

    private Singleton_Lazy(){
    }

    public static Singleton_Lazy getObj(){
        if(obj == null){
            obj = new Singleton_Lazy();
        }
        return obj;
    }
}
