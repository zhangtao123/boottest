package com.example.boottest;

import com.example.boottest.dao.DealerDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoottestApplicationTests {
    @Resource
    private DealerDao dealerDao;

    @Test
    public void testDealerDao() {
        System.out.println(dealerDao.selectByPrimaryKey(1L));
    }
}