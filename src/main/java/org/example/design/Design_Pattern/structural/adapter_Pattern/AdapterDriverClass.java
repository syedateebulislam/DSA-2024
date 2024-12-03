package org.example.design.Design_Pattern.structural.adapter_Pattern;

public class AdapterDriverClass {

    public static void main(String[] args) {

        // comm with json input and xml output
        String inpCommJson = "name:abc,";
        DataProcessor commTask1 = new AppDataProcessor();
        String outputCommXML = commTask1.convertData(inpCommJson,"xml");
        System.out.println(outputCommXML);


        // comm with xml input and json output
        String inpComm = "<address>xyz<address/>";
        DataProcessor commTask2 = new AppDataProcessor();
        String outputCommJson = commTask2.convertData(inpComm,"json");
        System.out.println(outputCommJson);


    }

}
