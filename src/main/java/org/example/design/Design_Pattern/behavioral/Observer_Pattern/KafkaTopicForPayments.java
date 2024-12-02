package org.example.design.Design_Pattern.behavioral.Observer_Pattern;

import java.util.ArrayList;
import java.util.List;

public class KafkaTopicForPayments {

    private List<ConsumerForPayments> consumersList = new ArrayList<>();
    private String newPaymentsData;

    public void registerConsumer(ConsumerForPayments consumer){
        consumersList.add(consumer);
    }

    public void removeConsumer(ConsumerForPayments consumer){
        consumersList.remove(consumer);
    }

    private void produce(){
        for (ConsumerForPayments consumer : consumersList){
            consumer.consumeData();
        }
    }

    public void addNewDataInTopic(String paymentsData){
        this.newPaymentsData = paymentsData;
        System.out.println("New Data - " + paymentsData + " is produced.");
        produce();
    }



}
