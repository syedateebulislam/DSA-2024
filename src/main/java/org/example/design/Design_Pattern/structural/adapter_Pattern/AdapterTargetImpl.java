package org.example.design.Design_Pattern.structural.adapter_Pattern;

import java.util.HashMap;


/*
Note : Commented xml conversion code will be used in other service,
        where json data is needed to be consumed from this service.
 */

public class AdapterTargetImpl implements AdapterTargetInterface {

//    static HashMap<String, String> xmlToJsonMap = new HashMap<>();
//    AdapteeXmlDataProcessor xmlProcessor = new AdapteeXmlDataProcessor();

    AdapteeJsonDataProcessor jsonProcessor = new AdapteeJsonDataProcessor();

    static HashMap<String, String> jsonToXmlMap = new HashMap<>();

    static {
        jsonToXmlMap.put("name:abc,", "<name>abc<name/>");
        jsonToXmlMap.put("address:xyz,", "<address>xyz<address/>");

//        xmlToJsonMap.put("<name>abc<name/>", "name:abc,");
//        xmlToJsonMap.put("<address>xyz<address/>", "address:xyz,");
    }


    @Override
    public String convertData(String data, String requiredOutputLanguage) {
        String output = "";

        if (requiredOutputLanguage.equalsIgnoreCase("xml")) {
            //json to xml

            //listen json from consumer
            jsonProcessor.consumeData(data);

            //produce json as per inp xml
            String producedJsonData = jsonProcessor.produceData(data);

            //convert produced json to xml
            output = jsonToXml(producedJsonData);

        }
//        else{
//            //xml to json
//
//            //listen xml from consumer
//            xmlProcessor.consumeData(data);
//
//            //produce xml as per inp json
//            String producedXmlData = xmlProcessor.produceData(data);
//
//            //convert produced xml into json
//            output = xmlToJson(producedXmlData);
//        }

        return output;
    }

    public String jsonToXml(String str) {
        return jsonToXmlMap.get(str);
    }

//    public String xmlToJson(String str) {
//        return xmlToJsonMap.get(str);
//    }

}
