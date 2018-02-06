package com.example.boottest.dao;

import com.example.boottest.entity.TemplateContentDetail;

public interface TemplateContentDetailDao {
    int deleteByPrimaryKey(Long id);

    int insert(TemplateContentDetail record);

    int insertSelective(TemplateContentDetail record);

    TemplateContentDetail selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TemplateContentDetail record);

    int updateByPrimaryKey(TemplateContentDetail record);
}