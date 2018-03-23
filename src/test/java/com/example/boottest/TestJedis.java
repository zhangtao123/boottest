package com.example.boottest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import javax.annotation.Resource;
import java.util.Set;

@SpringBootTest
@RunWith(SpringRunner.class)
public class TestJedis {

    private static final String STRING_KEY = "testString";
    private static final Logger LOGGER = LoggerFactory.getLogger(TestJedis.class);

    @Resource
    private JedisPool jedisPool;

    @Test
    public void testString() {
        Jedis jedis = jedisPool.getResource();
        jedis.set(STRING_KEY, "中文测试");
        jedis.lpush("list", "张三");
        jedis.lpush("list", "李四");
        LOGGER.info("添加成功:" + jedis.get(STRING_KEY));
        LOGGER.info("list:" + jedis.lindex("list", 0));
        LOGGER.info("list:" + jedis.lrange("list", 0, 3));
        Set<String> keys = jedis.keys("*");
        keys.forEach(jedis::del);
        jedis.close();
    }
}