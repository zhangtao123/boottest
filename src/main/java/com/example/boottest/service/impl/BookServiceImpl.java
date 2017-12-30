package com.example.boottest.service.impl;

import com.example.boottest.dao.BookMapper;
import com.example.boottest.entity.Book;
import com.example.boottest.service.BookService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service("bookService")
@Transactional
public class BookServiceImpl implements BookService {
    @Resource
    private BookMapper bookMapper;
    @Override
    public void addBook(Book book){
        bookMapper.insertSelective(book);
    }
}