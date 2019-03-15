package com.example.boottest.service.impl;

import com.example.boottest.dao.DepartmentMapper;
import com.example.boottest.entity.Department;
import com.example.boottest.entity.Logs;
import com.example.boottest.service.TransactionServiceA;
import com.example.boottest.service.TransactionServiceB;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

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
        log.setNum((int) (Math.random() * 10));
        try {
            transactionServiceBImpl.updateDepartment(log);
        } catch (RuntimeException e) {
            e.printStackTrace();
            System.out.println("方法2抛出异常：" + e.getMessage());
        }
        Assert.isTrue(1 == 2, "抛出异常");
        return "INSERT SUCCESS";
    }

    @Resource
    private Environment env;

    @Override
    public List<Department> testIsolation(ArrayList idList) {
        List<Department> departmentList = departmentMapper.selectDepartment(idList);
        try {
            System.out.println(env.getProperty("server.port"));
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return departmentList;
    }
}
