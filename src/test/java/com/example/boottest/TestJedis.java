package com.example.boottest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import redis.clients.jedis.Jedis;

import javax.annotation.Resource;

@SpringBootTest
@RunWith(SpringRunner.class)
public class TestJedis {

    private static final String STRING_KEY = "testString";
    private static final Logger LOGGER = LoggerFactory.getLogger(TestJedis.class);

    @Resource
    private Jedis jedis;

    @Test
    public void testString() {
        jedis.del(STRING_KEY);
        LOGGER.info("删除成功");
    }
}