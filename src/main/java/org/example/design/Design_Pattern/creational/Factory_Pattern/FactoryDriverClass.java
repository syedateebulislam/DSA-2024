package org.example.design.Design_Pattern.creational.Factory_Pattern;

import java.util.Arrays;
import java.util.List;

public class FactoryDriverClass {

    public static void main(String[] args) {

        List<String> deliveryPartners = Arrays.asList("Delhivery","IndiaPost","Dtdc");

        DeliveryPartnerFactory dpf = new DeliveryPartnerFactory();

        for(String value : deliveryPartners){
            DeliveryPartner partner = dpf.getInstance(value);
            partner.updateDeliveryStatusToDb(value);
        }

    }


}
