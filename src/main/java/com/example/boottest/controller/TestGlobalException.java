package com.example.boottest.controller;

import com.example.boottest.service.ListService;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Description: java类作用描述
 * @Author: zhangtao
 * @CreateDate: 2019/2/19 13:57
 * @Version: 1.0
 */
@RestController
@RequestMapping("test")
public class TestGlobalException {
    @GetMapping("/globalException")
    public void testException() {
        //int i = 1 / 0;
        Assert.isTrue(1 == 2, "异常信息");
    }


    @Resource
    private ListService listService;

    @GetMapping("/testCondition")
    public String testCondition() {
        return listService.showListCmd();
    }
}
