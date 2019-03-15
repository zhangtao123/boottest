package com.example.boottest.service;

import com.example.boottest.entity.Department;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: java类作用描述
 * @Author: zhangtao
 * @CreateDate: 2019/2/15 13:33
 * @Version: 1.0
 */
public interface TransactionServiceA {
    String addDepartment(Department bean) throws RuntimeException;

    List<Department> testIsolation(ArrayList idList);
}
