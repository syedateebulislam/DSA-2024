package org.example.java;

/*
Functional interface - total 4 types
1. Predicate - test method -  boolean results
2. Consumer - accept method - no results(can modify data)
3. Function - apply method -  both inp & out
4. Supplier - get method -    No inp & only out
 */


import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaceExample {

    public static void main(String[] args) {

        //1. Predicate - test method -  boolean results
        testPredicateInterface("abc");

        //2. Consumer - accept method - no results(can modify data)
//        TestEmp e1 = new TestEmp("John");
//        testConsumerInterface(e1);

        //3. Function - apply method -  both inp & out
//        String s = "abc";
//        System.out.println(testFunctionInterface(s));

        //4. Supplier - get method -    No inp & only out
//        System.out.println(testSupplierInterface());


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


    static String  testFunctionInterface(String s){
        Function<String,String > funcIntf = (x)-> s.concat(" method lambda executed");
        return funcIntf.apply(s);
    }

    static Double  testSupplierInterface(){
        Supplier<Double> number = () -> Math.random();
        return number.get();
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
