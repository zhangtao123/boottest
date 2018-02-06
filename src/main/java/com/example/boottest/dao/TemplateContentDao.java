package com.example.boottest.dao;

import com.example.boottest.entity.TemplateContent;

public interface TemplateContentDao {
    int deleteByPrimaryKey(Long id);

    int insert(TemplateContent record);

    int insertSelective(TemplateContent record);

    TemplateContent selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TemplateContent record);

    int updateByPrimaryKey(TemplateContent record);
}