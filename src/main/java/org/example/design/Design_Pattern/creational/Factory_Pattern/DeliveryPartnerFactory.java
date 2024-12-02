package org.example.design.Design_Pattern.creational.Factory_Pattern;

public class DeliveryPartnerFactory {

    public DeliveryPartner getInstance(String partnerName){
        if("IndiaPost".equalsIgnoreCase(partnerName)){
            return new IndiaPost();
        } else if ("Delhivery".equalsIgnoreCase(partnerName)) {
            return new Delhivery();
        }else {
            return new Dtdc();
        }
    }

}
