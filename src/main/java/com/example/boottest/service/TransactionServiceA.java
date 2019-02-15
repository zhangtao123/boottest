package com.example.boottest.service;

import com.example.boottest.entity.Department;

/**
 * @Description: java类作用描述
 * @Author: zhangtao
 * @CreateDate: 2019/2/15 13:33
 * @Version: 1.0
 */
public interface TransactionServiceA {
    String addDepartment(Department bean) throws RuntimeException;
}
