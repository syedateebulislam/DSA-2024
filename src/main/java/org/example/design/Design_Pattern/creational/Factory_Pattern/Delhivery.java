package org.example.design.Design_Pattern.creational.Factory_Pattern;

public class Delhivery implements DeliveryPartner {

    @Override
    public void updateDeliveryStatusToDb(String trackingId) {
        System.out.println("Fetching Delhivery data from SFTP server file to map in DB records");
    }
}
