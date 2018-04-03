package com.example.boottest.controller;

import com.example.boottest.entity.Dealer;
import com.example.boottest.service.DealerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
public class TestJsonController {
    @Resource
    private DealerService dealerService;

    @GetMapping("/getAllDealers")
    public List<Dealer> getAllDealers() {
        return dealerService.getAllDealers();
    }

    @GetMapping("/getDealerMap")
    public Map<String, Dealer> getDealerMap() {
        return dealerService.getDealerMap();
    }
}