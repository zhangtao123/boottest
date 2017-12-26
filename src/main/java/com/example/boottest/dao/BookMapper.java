package com.example.boottest.dao;

import com.example.boottest.entity.Book;
import com.example.boottest.entity.BookQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BookMapper {
    long countByExample(BookQuery example);

    int deleteByExample(BookQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(Book record);

    int insertSelective(Book record);

    List<Book> selectByExample(BookQuery example);

    Book selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Book record, @Param("example") BookQuery example);

    int updateByExample(@Param("record") Book record, @Param("example") BookQuery example);

    int updateByPrimaryKeySelective(Book record);

    int updateByPrimaryKey(Book record);
}