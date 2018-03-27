package com.example.boottest.cache;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

import javax.annotation.Resource;


@Configuration
public class RedisCacheTransfer {
    @Resource
    public void setRedisTemplate(RedisTemplate<String, Object> redisTemplate) {
        MybatisRedisCache.setRedisTemplate(redisTemplate);
    }

    @Resource
    public void setValueOperations(ValueOperations<String, Object> valueOperations) {
        MybatisRedisCache.setValueOperations(valueOperations);
    }
}