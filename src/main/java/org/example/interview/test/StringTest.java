package org.example.interview.test;

public class StringTest {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = new String("hello");
        String s3 = "hello";

        System.out.println(s1 == s2); // Line 1 //false
        System.out.println(s1.equals(s2)); // Line 2 //true
        System.out.println(s1 == s3); // Line 3 //true
    }
}