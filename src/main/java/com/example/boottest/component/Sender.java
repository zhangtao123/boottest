package com.example.boottest.component;

import com.example.boottest.entity.Message;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import com.example.boottest.util.JSONUtils;

import javax.annotation.Resource;
import java.util.Date;
import java.util.UUID;

@Component
public class Sender {
    @Resource
    private KafkaTemplate<String,String> kafkaTemplate;

    public void sendMessage(){
        Message m = new Message();
        m.setId(System.currentTimeMillis());
        m.setMessage(UUID.randomUUID().toString());
        m.setSendTime(new Date());
        kafkaTemplate.send("test", JSONUtils.toJson(m));
    }
}