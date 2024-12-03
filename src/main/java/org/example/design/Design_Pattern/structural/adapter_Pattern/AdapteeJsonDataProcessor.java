package org.example.design.Design_Pattern.structural.adapter_Pattern;

public class AdapteeJsonDataProcessor{

    public void consumeData(String data) {
        System.out.println("consuming JSON data : "+data);
    }

    public String produceData(String data) {

        //business logic written as per txn ID
        if(data.contains("transactionId:101abc")){
            data = "response:{transactionStatus:Success}";
        }
        System.out.println("producing JSON data : "+data);

        return data;
    }

}
