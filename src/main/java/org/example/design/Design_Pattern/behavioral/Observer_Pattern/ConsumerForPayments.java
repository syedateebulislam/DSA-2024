package org.example.design.Design_Pattern.behavioral.Observer_Pattern;

public class ConsumerForPayments {

    private String serviceName;
    private  KafkaTopicForPayments myTopic;

    public ConsumerForPayments(String serviceName) {
        this.serviceName = serviceName;
    }

    public void subscribeTopic(KafkaTopicForPayments topic){
        myTopic = topic;
    }

    public void consumeData(){
        System.out.println("Latest data available for " + serviceName+" consumer.");
    }


}
