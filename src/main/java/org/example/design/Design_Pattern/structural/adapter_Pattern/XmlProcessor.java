package org.example.design.Design_Pattern.structural.adapter_Pattern;

import java.util.HashMap;

public class XmlProcessor implements XmlDataProcessor{

    static HashMap<String,String> xmlToJsonMap = new HashMap<>();

    static {
        xmlToJsonMap.put("<name>abc<name/>","name:abc,");
        xmlToJsonMap.put("<address>xyz<address/>","address:xyz,");
    }

    @Override
    public void consumeData(String data) {
        System.out.println("\nconsuming XML data : "+ data);
    }

    @Override
    public String produceData(String data) {
        System.out.println("producing XML data...");
        return xmlToJson(data);
    }

    public String xmlToJson(String str){
        return xmlToJsonMap.get(str);
    }

}
