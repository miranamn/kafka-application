package com.example.demo.event;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Event {
    String key;
    String message;
}
