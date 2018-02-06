package com.example.boottest.dao;

import com.example.boottest.entity.TemplateContentInvolve;

public interface TemplateContentInvolveDao {
    int deleteByPrimaryKey(Long id);

    int insert(TemplateContentInvolve record);

    int insertSelective(TemplateContentInvolve record);

    TemplateContentInvolve selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TemplateContentInvolve record);

    int updateByPrimaryKey(TemplateContentInvolve record);
}