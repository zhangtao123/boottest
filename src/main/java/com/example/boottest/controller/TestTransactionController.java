package com.example.boottest.controller;

import com.example.boottest.bean.CommonBean;
import com.example.boottest.entity.Department;
import com.example.boottest.service.TransactionServiceA;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Description: java类作用描述
 * @Author: zhangtao
 * @CreateDate: 2019/2/15 13:32
 * @Version: 1.0
 */
@RestController
@RequestMapping("/transaction")
public class TestTransactionController {

    @Resource
    TransactionServiceA transactionServiceAImpl;

    @PostMapping("/insert")
    public String testTransaction(@RequestBody Department bean){
        return  transactionServiceAImpl.addDepartment(bean);
    }

    @PostMapping("/select")
    public List<Department> testIsolation(@RequestBody CommonBean bean){
        return  transactionServiceAImpl.testIsolation(bean.getIdList());
    }
}
