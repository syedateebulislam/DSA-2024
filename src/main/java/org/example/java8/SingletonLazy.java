package org.example.java8;

public class SingletonLazy {

    //1.private static variable(without creation)
    private static SingletonLazy obj;

    //2.private constructor
    private SingletonLazy(){
    }

    //3.public method to check null,create object and access object
    public SingletonLazy getObj(){
        if(obj != null){
            obj = new SingletonLazy();
        }
        return obj;
    }
}
