package com.example.boottest.cache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;


@Component
public class RedisCacheTransfer {
    @Autowired
    public void setRedisTemplate(RedisTemplate<String, Object> redisTemplate) {
        MybatisRedisCache.setRedisTemplate(redisTemplate);
    }

    @Autowired
    public void setValueOperations(ValueOperations<String, Object> valueOperations) {
        MybatisRedisCache.setValueOperations(valueOperations);
    }
}