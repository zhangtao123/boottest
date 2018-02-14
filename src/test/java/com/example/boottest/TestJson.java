package com.example.boottest;

import com.example.boottest.dao.DealerDao;
import com.example.boottest.entity.Dealer;
import com.fasterxml.jackson.core.type.TypeReference;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;
import util.JSONUtils;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestJson {
    @Resource
    private DealerDao dealerDao;

    @Test
    public void testToJson(){
        String a = JSONUtils.toJson(dealerDao.selectByPrimaryKey(2L));
        System.out.println(a);
        System.out.println("------");
        List<Dealer> dealerList=dealerDao.selectAllDealers();
        List<Dealer> dealers = JSONUtils.toList(JSONUtils.toJson(dealerList), new TypeReference<List<Dealer>>() {
        });
        assert dealers != null;
        for (Dealer dealer:dealers){
            Assert.notNull(dealer,"dealer对象不能为空");
            System.out.println(dealer);
        }
    }
    @Test
    public void testToObject(){
        String a=JSONUtils.toJson(dealerDao.selectByPrimaryKey(2L));
        Dealer dealer=JSONUtils.toObject(a,Dealer.class);
        System.out.println(dealer);
    }
}
