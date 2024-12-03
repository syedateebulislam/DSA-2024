package org.example.design.Design_Pattern.structural.adapter_Pattern;

import java.util.HashMap;

public class JsonProcessor implements JsonDataProcessor{

    static HashMap<String,String> jsonToXmlMap = new HashMap<>();

    static {
        jsonToXmlMap.put("name:abc,","<name>abc<name/>");
        jsonToXmlMap.put("address:xyz,","<address>xyz<address/>");
    }

    @Override
    public void consumeData(String data) {
        System.out.println("\nconsuming JSON data : "+data);
    }

    @Override
    public String produceData(String data) {
        System.out.println("producing JSON data...");
        return jsonToXml(data);
    }

    public String jsonToXml(String str){
        return jsonToXmlMap.get(str);
    }

}
