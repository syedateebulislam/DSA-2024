package org.example.practice;


//1. final class
//2. private final fields
//3. only getters
//4. set in constructors & return tempList in case of collection field


import java.util.ArrayList;
import java.util.List;

public final class ImmutClassExm {

    private final int empId;
    private final List<String> projectsMapped;

    public int getEmpId() {
        return empId;
    }

    public List<String> getProjectsMapped() {

        List<String> tempList = new ArrayList<>();
        for(String val : projectsMapped){
            tempList.add(val);
        }

        return tempList;
    }

    public ImmutClassExm(int empId, List<String> projectsMapped) {
        this.empId = empId;

        List<String> tempList = new ArrayList<>();
        for(String val : projectsMapped){
            tempList.add(val);
        }

        this.projectsMapped = tempList;
    }

    @Override
    public String toString() {
        return "hashCode="+this.hashCode()+", ImmutClassExm{" +
                "empId=" + empId +
                ", projectsMapped=" + projectsMapped +
                '}';
    }
}
