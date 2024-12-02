package org.example.design.Design_Pattern.behavioral.Observer_Pattern;

public class KafkaExampleDriver {

    public static void main(String[] args) {

        //consumers created for diff services
        ConsumerForPayments service1 = new ConsumerForPayments("accountUpdate");
        ConsumerForPayments service2 = new ConsumerForPayments("customerEmailNotification");
        ConsumerForPayments service3 = new ConsumerForPayments("customerEmailNotification");

        //topic initialized and services are added
        KafkaTopicForPayments paymentsTopic = new KafkaTopicForPayments();

        //consumers and services are getting mapped with each other
        service1.subscribeTopic(paymentsTopic);
        paymentsTopic.registerConsumer(service1);

        service2.subscribeTopic(paymentsTopic);
        paymentsTopic.registerConsumer(service2);

        service3.subscribeTopic(paymentsTopic);
        paymentsTopic.registerConsumer(service3);

        paymentsTopic.addNewDataInTopic("transaction id - 123XYZ");

    }

}
