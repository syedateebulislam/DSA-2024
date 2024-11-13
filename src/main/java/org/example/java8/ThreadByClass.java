package org.example.java8;

public class ThreadByClass {

    public static void main(String[] args) {
        MyCustomThreadA t1 = new MyCustomThreadA();
        MyCustomThreadB t2 = new MyCustomThreadB();
        MyCustomThreadC t3 = new MyCustomThreadC();
        t1.start();
        t2.start();
        t3.start();
    }

}


class MyCustomThreadA extends Thread{

    @Override
    public void run(){
        try {
            for (int i=0;i<5;i++){
                System.out.println("Syed ");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}


class MyCustomThreadB extends Thread{

    @Override
    public void run(){
        try {
            for (int i=0;i<5;i++){
                System.out.println("Ateebul ");
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}

class MyCustomThreadC extends Thread{

    @Override
    public void run(){
        try {
            for (int i=0;i<5;i++){
                System.out.printf("Islam\n\n");
                Thread.sleep(3000);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}