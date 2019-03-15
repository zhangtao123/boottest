package com.example.boottest.config;

import com.example.boottest.service.ListService;
import com.example.boottest.service.impl.LinuxListService;
import com.example.boottest.service.impl.WindowsListService;
import com.example.boottest.util.LinuxCondition;
import com.example.boottest.util.WindowsCondition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @Description: java类作用描述
 * @Author: zhangtao
 * @CreateDate: 2019/3/14 15:15
 * @Version: 1.0
 */
@Configuration
public class ConditionConfig {

    @Bean
    @Conditional(WindowsCondition.class)
    public ListService windowsListService() {
        return new WindowsListService();
    }


    @Bean
    @Conditional(LinuxCondition.class)
    public ListService linuxListService() {
        return new LinuxListService();
    }


}
