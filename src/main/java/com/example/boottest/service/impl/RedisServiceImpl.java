package com.example.boottest.service.impl;

import com.example.boottest.entity.RedisModel;
import com.example.boottest.service.IRedisService;
import org.springframework.stereotype.Service;

@Service
public class RedisServiceImpl extends IRedisService<RedisModel> {
    private static final String REDIS_KEY = "TEST_REDIS_KEY";
    @Override
    protected String getRedisKey() {
        return REDIS_KEY;
    }
}