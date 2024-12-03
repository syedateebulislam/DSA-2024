package org.example.design.Design_Pattern.structural.adapter_Pattern;

public class Client {

    public static void main(String[] args) {

        // comm with xml input and xml output using JSON controller
        String inputRequestData = "<request><transactionId>101abc<transactionId/><request/>";

        AdapterTargetInterface commTask1 = new AdapterTargetImpl();

        commTask1.convertData(inputRequestData,"xml","xml");

    }

}
