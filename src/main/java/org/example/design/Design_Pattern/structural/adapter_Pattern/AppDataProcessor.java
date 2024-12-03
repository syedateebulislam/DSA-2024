package org.example.design.Design_Pattern.structural.adapter_Pattern;



public class AppDataProcessor implements DataProcessor{

    JsonProcessor jsonProcessor = new JsonProcessor();
    XmlProcessor xmlProcessor = new XmlProcessor();


    @Override
    public String convertData(String data, String requiredOutputLanguage) {
        String output = "";

        if(requiredOutputLanguage.equalsIgnoreCase("xml")){
            //json to xml

            //listen json from consumer
            jsonProcessor.consumeData(data);

            //produce json as per inp xml AND convert produced json to xml
            output = jsonProcessor.produceData(data);

        }else{
            //xml to json

            //listen xml from consumer
            xmlProcessor.consumeData(data);

            //produce xml as per inp json AND convert produced xml into json
            output = xmlProcessor.produceData(data);

        }

        return output;
    }

}
