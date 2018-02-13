package com.example.boottest.service.impl;

import com.example.boottest.dao.DealerDao;
import com.example.boottest.entity.Dealer;
import com.example.boottest.service.DealerService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("dealerService")
@Transactional(rollbackFor = Exception.class)
public class DealerServiceImpl implements DealerService {
    @Resource
    private DealerDao dealerDao;

    @Transactional(readOnly = true)
    @Override
    public List<Dealer> getAllDealers() {
        return dealerDao.selectAllDealers();
    }
    @Transactional(readOnly = true)
    @Override
    public Map<String,Dealer> getDealerMap(){
        Map<String,Dealer> dealerMap=new HashMap<>();
        List<Dealer> dealerList = dealerDao.selectAllDealers();
        dealerList.forEach(dealer -> dealerMap.put(dealer.getCode(),dealer));
        return dealerMap;
    }
}