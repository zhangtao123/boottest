package com.example.boottest.service;

import com.example.boottest.entity.Dealer;

import java.util.List;
import java.util.Map;

public interface DealerService {
    List<Dealer> getAllDealers();
    Map<String,Dealer> getDealerMap();
}