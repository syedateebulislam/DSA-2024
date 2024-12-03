package org.example.design.Design_Pattern.structural.adapter_Pattern;

public class Client {

    public static void main(String[] args) {

        // comm with json input and xml output
        String inpCommJson = "name:abc,";
        AdapterTargetInterface commTask1 = new AdapterTargetImpl();
        String outputCommXML = commTask1.convertData(inpCommJson,"xml");
        System.out.println(outputCommXML);


        // comm with xml input and json output
//        String inpComm = "<address>xyz<address/>";
//        AdapterTargetInterface commTask2 = new AdapterTargetImpl();
//        String outputCommJson = commTask2.convertData(inpComm,"json");
//        System.out.println(outputCommJson);


    }

}
