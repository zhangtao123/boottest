package com.example.boottest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.example.boottest.dao")
public class BoottestApplication extends SpringBootServletInitializer {
    /*    @Bean
        public HttpMessageConverters httpMessageConverters() {
            ByteArrayHttpMessageConverter byteArrayHttpMessageConverter = new ByteArrayHttpMessageConverter();
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
            *//*
          可在实体类对象的任意属性加上@JSONField(serialize=false)返回前端的数据没有该属性，则配置成功
         *//*
        fastConverter.setSupportedMediaTypes(mediaTypeList);
        return new HttpMessageConverters(byteArrayHttpMessageConverter, fastConverter);
    }*/
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(BoottestApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(BoottestApplication.class, args);
    }
}