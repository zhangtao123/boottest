package com.example.boottest.dao;

import com.example.boottest.entity.TemplateSkoda;

public interface TemplateSkodaDao {
    int deleteByPrimaryKey(Long id);

    int insert(TemplateSkoda record);

    int insertSelective(TemplateSkoda record);

    TemplateSkoda selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TemplateSkoda record);

    int updateByPrimaryKey(TemplateSkoda record);
}