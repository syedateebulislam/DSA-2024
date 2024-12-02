package org.example.practice;

import org.example.java.HashMapCustomEmployee;

import java.util.Objects;

public class HashMapCustomKey {

    //1.final private fields
    private final int empid;
    private final String empName;

    public HashMapCustomKey(int empid, String empName) {
        this.empid = empid;
        this.empName = empName;
    }

    //2. getters only
    public int getEmpid() {
        return empid;
    }

    public String getEmpName() {
        return empName;
    }

    //3.equals
    @Override
    public boolean equals(Object emp){
        // same case
        if(this == emp) return true;
        //null case or diff class
        if(emp == null || emp.getClass() != this.getClass()){
            return false;
        }
        // comparison case
        HashMapCustomEmployee employee = (HashMapCustomEmployee) emp;
        return (employee.getEmpId() == ((HashMapCustomEmployee) emp).getEmpId());
    }

    //4. hashcode
    @Override
    public int hashCode(){
        return (Objects.hash(this.getEmpid()));
    }

}
