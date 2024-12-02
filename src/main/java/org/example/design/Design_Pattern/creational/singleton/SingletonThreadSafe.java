package org.example.design.Design_Pattern.creational.singleton;


public class SingletonThreadSafe {

    private static volatile SingletonThreadSafe obj;

    private SingletonThreadSafe(){
    }

    public static SingletonThreadSafe getObj(){

        if(obj == null) {
            synchronized (SingletonThreadSafe.class) {
                if (obj == null) {
                    obj = new SingletonThreadSafe();
                }
            }
        }

        return  obj;
    }
}
