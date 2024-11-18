package org.example.java8;


//ImmutableClass ->
//1.final class
//2.private final variables
//3.only getters
//4.return temp list from getters if any field is list/collection
//5.initialize any list in constructors with deep copy


import java.util.ArrayList;
import java.util.List;

//1.final class
public final class ImmutableClockClass {

    //2.private final variables
    final private String clockBrandName;
    final private String time;
    final private List<String> cellSupport;

    public ImmutableClockClass(String clockBrandName, String time, List<String> cellSupport) {
        this.clockBrandName = clockBrandName;
        this.time = time;
        List<String> l2 = new ArrayList<>();
        for (String val : cellSupport){
            l2.add(val);
        }
        this.cellSupport = l2;
    }

    //3.only getters
    public String getClockBrandName() {
        return clockBrandName;
    }

    public String getTime() {
        return time;
    }

    public List<String> getCellSupport(){
        List<String> tempList = new ArrayList<>();
        for (String val : cellSupport){
            tempList.add(val);
        }
        return tempList;
    }

}

