package com.example.boottest.service.impl;

import com.example.boottest.service.ListService;

/**
 * @Description: java类作用描述
 * @Author: zhangtao
 * @CreateDate: 2019/3/14 15:13
 * @Version: 1.0
 */
public class WindowsListService implements ListService {

    @Override
    public String showListCmd() {
        return "dir";
    }
}
