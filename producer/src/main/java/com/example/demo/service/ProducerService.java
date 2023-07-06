package com.example.demo.service;

import com.example.demo.event.Event;
import lombok.AllArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProducerService {
    private final KafkaTemplate<String, String> template;
    public void addEvent(Event event){
        template.send("intercessor", event.getKey(), event.getMessage());
    }
}
