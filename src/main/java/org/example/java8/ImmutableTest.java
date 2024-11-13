package org.example.java8;

public class ImmutableTest {
    public static void main(String[] args) {

        ImmutableClock obj1 = new ImmutableClock("HMT","23:00");
        System.out.println(obj1);

    }

}


//1.final class
final class ImmutableClock {

    //2.private final variables
    final private String clockBrandName;
    final private String time;

    public ImmutableClock(String clockBrandName, String time) {
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
