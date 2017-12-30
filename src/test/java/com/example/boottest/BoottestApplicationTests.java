package com.example.boottest;

import com.example.boottest.dao.BrandMapper;
import com.example.boottest.entity.Book;
import com.example.boottest.entity.BrandQuery;
import com.example.boottest.entity.User;
import com.example.boottest.service.BookService;
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
    @Resource
    private BookService bookService;

    @Test
    public void contextLoads() {
        BrandQuery brandQuery = new BrandQuery();
        brandQuery.createCriteria().andDescriptionLike("23");
        brandMapper.selectByExample(brandQuery).forEach(System.out::println);
        System.out.println("service");
        brandService.getAll().forEach(System.out::println);
        User user=new User();
        user.setPassword("12312");
        user.setUserName("张三");
        System.out.println(JsonUtil.toJson(user));
    }
    @Test
    public void transactionTest(){
        Book book=new Book();
        book.setTitle("test");
        book.setAuthor("yibo");
        bookService.addBook(book);
    }
}