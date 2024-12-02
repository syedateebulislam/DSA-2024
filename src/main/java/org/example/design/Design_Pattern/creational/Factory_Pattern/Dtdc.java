package org.example.design.Design_Pattern.creational.Factory_Pattern;

public class Dtdc implements DeliveryPartner {


    @Override
    public void updateDeliveryStatusToDb(String trackingId) {
        System.out.println("Fetching Dtdc data from SFTP server file to map in DB records");
    }
}
