package com.example.boottest;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.example.boottest.dao")
public class BoottestApplication {
    @Bean
    public HttpMessageConverters fastjsonHttpMessageConverter() {
        //定义一个转换消息的对象
        FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();
        //添加fastjson的配置信息 比如 ：是否要格式化返回的json数据
        FastJsonConfig fastJsonConfig = new FastJsonConfig();
        fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat, SerializerFeature.WriteDateUseDateFormat, SerializerFeature.WriteNullStringAsEmpty);
        //在转换器中添加配置信息
        fastConverter.setFastJsonConfig(fastJsonConfig);
        List<MediaType> mediaTypeList = new ArrayList<>();
        mediaTypeList.add(MediaType.valueOf("application/json"));
        mediaTypeList.add(MediaType.valueOf("text/json"));
        mediaTypeList.add(MediaType.valueOf("text/html;charset=UTF-8"));
        fastConverter.setSupportedMediaTypes(mediaTypeList);
        return new HttpMessageConverters((HttpMessageConverter<?>) fastConverter);
    }

    public static void main(String[] args) {
        SpringApplication.run(BoottestApplication.class, args);
    }
}