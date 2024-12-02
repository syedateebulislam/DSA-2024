package org.example.design.Design_Pattern.creational.Factory_Pattern;

public class IndiaPost implements DeliveryPartner {


    @Override
    public void updateDeliveryStatusToDb(String trackingId) {
        System.out.println("Fetching IndiaPost data from SFTP server file to map in DB records");
    }
}
