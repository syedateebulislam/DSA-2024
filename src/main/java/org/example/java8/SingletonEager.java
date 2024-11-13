package org.example.java8;

public class SingletonEager {

    //1.private static variable creation
    private static SingletonEager obj = new SingletonEager();

    //2.private constructor
    private SingletonEager(){
    }

    //3.public method to access object
    public SingletonEager getObj(){
        return obj;
    }

}
