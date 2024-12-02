package org.example.design.Design_Pattern.creational.singleton;

public class SingletonDriver {

    public static void main(String[] args) {

        System.out.println("---Singleton_Lazy---");
        Singleton_Lazy s11 = Singleton_Lazy.getObj();
        System.out.println(s11.hashCode());
        Singleton_Lazy s12 = Singleton_Lazy.getObj();
        System.out.println(s12.hashCode());


        System.out.println("---Singleton_Eager---");
        Singleton_Eager s21 = Singleton_Eager.getObj();
        System.out.println(s21.hashCode());
        Singleton_Eager s22 = Singleton_Eager.getObj();
        System.out.println(s22.hashCode());


        System.out.println("---SingletonThreadSafe---");
        SingletonThreadSafe s31 = SingletonThreadSafe.getObj();
        System.out.println(s31.hashCode());
        SingletonThreadSafe s32 = SingletonThreadSafe.getObj();
        System.out.println(s32.hashCode());

    }
}
