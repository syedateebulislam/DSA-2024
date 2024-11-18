package org.example.practice;

import java.util.Arrays;
import java.util.List;

public class ImmutClassExmDriver {

    public static void main(String[] args) {

        ImmutClassExm obj = new ImmutClassExm(101, Arrays.asList("P","Q"));

        System.out.println(obj);

        List<String> l1 = obj.getProjectsMapped();

        l1.add("pqr");

        System.out.println(l1);

        System.out.println(obj);

    }

}
