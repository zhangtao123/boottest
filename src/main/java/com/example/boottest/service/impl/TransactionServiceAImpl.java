package com.example.boottest.service.impl;

import com.example.boottest.dao.DepartmentMapper;
import com.example.boottest.entity.Department;
import com.example.boottest.entity.Logs;
import com.example.boottest.service.TransactionServiceA;
import com.example.boottest.service.TransactionServiceB;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Random;

/**
 * @Description: java类作用描述
 * @Author: zhangtao
 * @CreateDate: 2019/2/15 13:36
 * @Version: 1.0
 */
@Service("transactionServiceAImpl")
public class TransactionServiceAImpl implements TransactionServiceA {

    @Resource
    DepartmentMapper departmentMapper;

    @Resource
    TransactionServiceB transactionServiceBImpl;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public String addDepartment(Department bean) throws RuntimeException {
        departmentMapper.insert(bean);
        bean.setName("test");
        Logs log = new Logs();
        log.setNum(new Random().nextInt()*10);
        try {
            transactionServiceBImpl.updateDepartment(log);
        } catch (RuntimeException e) {
            e.printStackTrace();
            System.out.println("方法2抛出异常：" + e.getMessage());
        }
        //Assert.isTrue(1 == 2, "抛出异常");
        return "INSERT SUCCESS";
    }
}
