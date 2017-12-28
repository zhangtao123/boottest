package com.example.boottest;

import com.example.boottest.dao.BrandMapper;
import com.example.boottest.entity.Book;
import com.example.boottest.entity.BrandQuery;
import com.example.boottest.service.BrandService;
import com.example.boottest.util.JsonUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoottestApplicationTests {
    @Resource
    private BrandMapper brandMapper;
    @Resource
    private BrandService brandService;

    @Test
    public void contextLoads() {
        BrandQuery brandQuery = new BrandQuery();
        brandQuery.createCriteria().andDescriptionLike("23");
        brandMapper.selectByExample(brandQuery).forEach(System.out::println);
        System.out.println("service");
        brandService.getAll().forEach(System.out::println);
        Book book = new Book();
        book.setAuthor("123");
        book.setDescription("12321");
        book.setId(1213);
        book.setIsbn("q2e13");
        book.setReader("12312");
        book.setTitle("3212");
        System.out.println(JsonUtil.toJson(book));
    }
}