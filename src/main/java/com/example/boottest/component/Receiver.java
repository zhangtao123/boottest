package com.example.boottest.component;

import com.example.boottest.entity.Message;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import com.example.boottest.util.JSONUtils;

@Component
public class Receiver {
    @KafkaListener(topics = "test")
    public void processMessage(String content) {
        System.out.println(JSONUtils.toObject(content, Message.class));
    }
}