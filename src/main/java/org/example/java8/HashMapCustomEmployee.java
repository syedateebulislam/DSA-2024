package org.example.java8;


import java.util.Objects;

public class HashMapCustomEmployee{

    private final String name;
    private final int empId;

    public HashMapCustomEmployee(String name, int empId) {
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
        HashMapCustomEmployee emp1 = (HashMapCustomEmployee) emp;
        return (this.getEmpId() == emp1.getEmpId());    // comparison case
    }

    @Override
    public int hashCode(){
        return Objects.hash(this.getEmpId());
    }

}

