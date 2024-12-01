package org.example.interview.test;

public class ExceptionTestAdvanced {
    public static void main(String[] args) {
        try {
            System.out.println(methodWithExceptions());
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }

    public static int methodWithExceptions() {
        try {
            throw new RuntimeException("Initial Exception");
        } finally {
            return 42;
        }
    }
}
