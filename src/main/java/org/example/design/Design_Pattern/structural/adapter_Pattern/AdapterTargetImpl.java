package org.example.design.Design_Pattern.structural.adapter_Pattern;

import java.util.HashMap;


public class AdapterTargetImpl implements AdapterTargetInterface {

    AdapteeJsonDataProcessor jsonProcessor = new AdapteeJsonDataProcessor();

    static HashMap<String, String> xmlToJsonMap = new HashMap<>();
    static HashMap<String, String> jsonToXmlMap = new HashMap<>();

    static {
        jsonToXmlMap.put("response:{transactionStatus:Success}", "<response><transactionStatus>Success<transactionStatus/><response/>");
        xmlToJsonMap.put("<request><transactionId>101abc<transactionId/><request/>", "request:{transactionId:101abc}");
    }


    @Override
    public String convertData(String data, String inputDataLanguage, String outputDataLanguage) {
        String output = "";

        if (outputDataLanguage.equalsIgnoreCase(inputDataLanguage)
        && (inputDataLanguage.equalsIgnoreCase("xml"))) {

            System.out.println("input data : \n"+data);

            //xml to json
            data = xmlToJson(data);

            //listen json converted xml from consumer
            jsonProcessor.consumeData(data);

            //produce json as per inp xml
            String producedJsonData = jsonProcessor.produceData(data);

            //convert produced json to xml
            output = jsonToXml(producedJsonData);

            System.out.println("output data : \n"+output);
        }

        return output;
    }

    public String jsonToXml(String str) {
        return jsonToXmlMap.get(str);
    }

    public String xmlToJson(String str) {
        return xmlToJsonMap.get(str);
    }

}
