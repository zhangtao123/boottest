package com.example.boottest.service.impl;

import com.example.boottest.dao.BookMapper;
import com.example.boottest.entity.Book;
import com.example.boottest.service.AddBook;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service("addBook")
public class AddBookImpl implements AddBook {
    @Resource
    private BookMapper bookMapper;
    @Transactional
    @Override
    public void addBook(Book book){
        bookMapper.insertSelective(book);
    }
}