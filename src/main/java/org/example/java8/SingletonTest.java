package org.example.java8;

public class SingletonTest{
    public static void main(String[] args) {

        SingletonExample s1 =  SingletonExample.getObj();
        System.out.println(s1.hashCode());

        SingletonExample s2 = SingletonExample.getObj();
        System.out.println(s2.hashCode());
    }
}

class SingletonExample {

    private static volatile SingletonExample obj;

    private SingletonExample(){
    }

    public static SingletonExample getObj(){

        if(obj == null) {
            synchronized (SingletonExample.class) {
                if (obj == null) {
                    obj = new SingletonExample();
                }
            }
        }


        return  obj;
    }
}

