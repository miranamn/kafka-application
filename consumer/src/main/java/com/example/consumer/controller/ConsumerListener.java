package com.example.consumer.controller;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
@Component
public class ConsumerListener {
    @KafkaListener(topics = "intercessor", containerFactory = "kafkaListenerContainerFactoryString", groupId = "${group2}")
    public void listenGroupTopic(String message) {
        System.out.println("DATA FROM PRODUCER^ " + message);
    }
}
