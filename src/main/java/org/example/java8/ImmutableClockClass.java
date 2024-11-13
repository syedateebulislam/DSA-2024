package org.example.java8;




//1.final class
public final class ImmutableClockClass {

    //2.private final variables
    final private String clockBrandName;
    final private String time;

    public ImmutableClockClass(String clockBrandName, String time) {
        this.clockBrandName = clockBrandName;
        this.time = time;
    }

    //3.only getters
    public String getClockBrandName() {
        return clockBrandName;
    }

    public String getTime() {
        return time;
    }


    @Override
    public String toString() {
        return "ImmutableClock{" +
                "clockBrandName='" + clockBrandName + '\'' +
                ", time='" + time + '\'' +", hashCode="+ this.hashCode()+
                '}';
    }
}

