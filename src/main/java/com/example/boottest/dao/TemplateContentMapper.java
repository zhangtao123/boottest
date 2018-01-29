package com.example.boottest.dao;

import com.example.boottest.entity.TemplateContent;
import com.example.boottest.entity.TemplateContentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TemplateContentMapper {
    long countByExample(TemplateContentExample example);

    int deleteByExample(TemplateContentExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TemplateContent record);

    int insertSelective(TemplateContent record);

    List<TemplateContent> selectByExample(TemplateContentExample example);

    TemplateContent selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TemplateContent record, @Param("example") TemplateContentExample example);

    int updateByExample(@Param("record") TemplateContent record, @Param("example") TemplateContentExample example);

    int updateByPrimaryKeySelective(TemplateContent record);

    int updateByPrimaryKey(TemplateContent record);
}