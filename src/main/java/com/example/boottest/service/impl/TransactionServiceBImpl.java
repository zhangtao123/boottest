package com.example.boottest.service.impl;

import com.example.boottest.dao.LogsMapper;
import com.example.boottest.entity.Logs;
import com.example.boottest.service.TransactionServiceB;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import javax.annotation.Resource;

/**
 * @Description: java类作用描述
 * @Author: zhangtao
 * @CreateDate: 2019/2/15 13:36
 * @Version: 1.0
 */
@Service("transactionServiceBImpl")
public class TransactionServiceBImpl implements TransactionServiceB {

    @Resource
    LogsMapper logsMapper;

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public String updateDepartment(Logs log) throws RuntimeException {
        logsMapper.insert(log);
        //Assert.isTrue(1 == 2, "更新失败");
        return "UPDATE SUCCESS";
    }
}
