package org.example.java8;

import java.util.Objects;


//HashMapCustomEmployee ->
//1.private final variables
//2. only getters(due to already final variables)
//3. override equals method
//4. override hashCode method


public class HashMapCustomEmployee{

    //1.private final variables
    private final String name;
    private final int empId;

    public HashMapCustomEmployee(String name, int empId) {
        this.name = name;
        this.empId = empId;
    }

    //2. only getters(due to already final variables)
    public String getName() {
        return name;
    }

    public int getEmpId() {
        return empId;
    }



    //3. override equals method
    @Override
    public boolean equals(Object emp){
        if(this == emp) return true;//same case
        if(emp == null || this.getClass() != emp.getClass()) return false; // null case or diff class case
        HashMapCustomEmployee emp1 = (HashMapCustomEmployee) emp;
        return (this.getEmpId() == emp1.getEmpId());    // comparison case
    }

    //4. override hashCode method
    @Override
    public int hashCode(){
        return Objects.hash(this.getEmpId());
    }

    @Override
    public String toString() {
        return "HashMapCustomEmployee{" +
                "name='" + name + '\'' +
                ", empId=" + empId +
                '}';
    }
}

