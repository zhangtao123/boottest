package com.example.boottest.controller;

import com.example.boottest.component.Sender;
import com.example.boottest.entity.Message;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TestKafka {
    @Resource
    private Sender sender;
    @RequestMapping("/sendMsg")
    public Object sendMsg(){
        sender.sendMessage();
        return new Message();
    }
}