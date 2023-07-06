package com.example.demo.controller;

import com.example.demo.service.ProducerService;
import com.example.demo.event.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/event")
public class ProducerController {
    @Autowired
    private ProducerService producerService;
    @PostMapping
    public void addEvent(@RequestBody Event event){
        producerService.addEvent(event);
    }
}
