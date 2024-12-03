package org.example.design.Design_Pattern.structural.adapter_Pattern;

public class AdapteeJsonDataProcessor implements AdapteeJsonProcessor {

    @Override
    public void consumeData(String data) {
        System.out.println("\nconsuming JSON data : "+data);
    }

    @Override
    public String produceData(String data) {
        System.out.println("producing JSON data...");
        return data;
    }

}
