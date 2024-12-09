package org.example.java;

/*
Functional interface - total 4 types
1. Predicate - test method -  boolean results
2. Consumer - accept method - no results(can modify data)
3. Function - apply method -  both inp & out
4. Supplier - get method -    No inp & only out
 */


import java.util.function.Consumer;
import java.util.function.Predicate;

public class FunctionalInterfaceExample {

    public static void main(String[] args) {

//        testPredicateInterface("abc");

//        TestEmp e1 = new TestEmp("John");
//        testConsumerInterface(e1);





    }

    static void testPredicateInterface(String s){
        Predicate<String> predicateImpl = str->str.length()>5;
        System.out.println(predicateImpl.test(s));
    }

    static void testConsumerInterface(TestEmp e){
        Consumer<TestEmp> consumerImpl = emp -> emp.setName(emp.getName().concat("-append"));
        consumerImpl.accept(e);
        System.out.println(e);
    }


    static TestEmp testPredicateInterface1(TestEmp s){
        s.setName(s.getName().concat("testtttt"));
        return s;
    }

}


class TestEmp{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TestEmp(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "TestEmp{" +
                "name='" + name + '\'' +
                '}';
    }
}
