package org.example.java8;

public class LambdaDriver {

    public static void main(String[] args) {

        LambdaExample l1 = (a,b)->{
            System.out.println(a+b+100);
        };

        l1.checkSum(2,3);

    }

}
