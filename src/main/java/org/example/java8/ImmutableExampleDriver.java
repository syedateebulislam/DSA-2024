package org.example.java8;


import java.util.Arrays;

public class ImmutableExampleDriver {

    public static void main(String[] args) {

        ImmutableClockClass obj1 = new ImmutableClockClass("HMT","23:00",
                Arrays.asList("nippon","duracell"));

        System.out.println(obj1);

    }

}

