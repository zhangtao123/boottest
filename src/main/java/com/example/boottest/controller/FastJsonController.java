package com.example.boottest.controller;

import com.example.boottest.entity.Dealer;
import com.example.boottest.service.DealerService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class FastJsonController {
    @Resource
    private DealerService dealerService;
    @RequestMapping("/getAllDealers")
    public List<Dealer> getAllDealers(){
        return dealerService.getAllDealers();
    }
}