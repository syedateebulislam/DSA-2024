package org.example.java8;

public class ThreadByIntf {
    public static void main(String[] args) {

        MyCustomThreadOne t1 = new MyCustomThreadOne();
        MyCustomThreadTwo t2 = new MyCustomThreadTwo();
        MyCustomThreadThree t3 = new MyCustomThreadThree();

        Thread t11 = new Thread(t1);
        Thread t22 = new Thread(t2);
        Thread t33 = new Thread(t3);

        t11.start();
        t22.start();
        t33.start();
    }
}


class MyCustomThreadOne extends TestThread implements Runnable{
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

class MyCustomThreadTwo extends TestThread implements Runnable{
    @Override
    public void run(){
        try {
            for (int i=0;i<5;i++){
                System.out.println("Ateebul");
                Thread.sleep(1500);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class MyCustomThreadThree extends TestThread implements Runnable{
    @Override
    public void run(){
        try {
            for (int i=0;i<5;i++){
                System.out.println("Islam\n");
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}


class TestThread{

}
