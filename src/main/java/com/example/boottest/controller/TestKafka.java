package com.example.boottest.controller;

import com.example.boottest.component.Sender;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TestKafka {
    @Resource
    private Sender sender;
    @RequestMapping("/sendMsg")
    public String sendMsg(){
        sender.sendMessage();
        return "发送成功";
    }
}