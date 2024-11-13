package org.example.java8;

import java.util.HashMap;
import java.util.Objects;

public class HashMapCustomKeyClass {

    public static void main(String[] args) {

        HashMap<CustomMapEmployee,String> m1 = new HashMap<>();

        CustomMapEmployee emp1 = new CustomMapEmployee("abc",101);
        CustomMapEmployee emp2 = new CustomMapEmployee("def",102);
        CustomMapEmployee emp3 = new CustomMapEmployee("abc",103);

        m1.put(emp1,"1");
        m1.put(emp2,"2");
        m1.put(emp3,"3");

        System.out.println(m1);

    }
}

class CustomMapEmployee{

    private final String name;
    private final int empId;

    public CustomMapEmployee(String name, int empId) {
        this.name = name;
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public int getEmpId() {
        return empId;
    }

    @Override
    public boolean equals(Object emp){
        if(this == emp) return true;//same case
        if(emp == null || this.getClass() != emp.getClass()) return false; // null case or diff class case
        CustomMapEmployee emp1 = (CustomMapEmployee) emp;
        return (this.getEmpId() == emp1.getEmpId());    // comparison case
    }

    @Override
    public int hashCode(){
        return Objects.hash(this.getEmpId());
    }

    @Override
    public String toString() {
        return "CustomMapEmployee{" +
                "name='" + name + '\'' +
                ", empId=" + empId +
                '}';
    }
    
}
