package org.example.interview.test;

import java.util.ArrayList;
import java.util.List;

public class CollectionTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        for (String item : list) {
            if (item.equals("B")) {
                list.remove(item);
            }
        }

        System.out.println(list);
    }
}
