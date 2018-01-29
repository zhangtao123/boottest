package com.example.boottest.dao;

import com.example.boottest.entity.TemplateSkoda;
import com.example.boottest.entity.TemplateSkodaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TemplateSkodaMapper {
    long countByExample(TemplateSkodaExample example);

    int deleteByExample(TemplateSkodaExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TemplateSkoda record);

    int insertSelective(TemplateSkoda record);

    List<TemplateSkoda> selectByExample(TemplateSkodaExample example);

    TemplateSkoda selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TemplateSkoda record, @Param("example") TemplateSkodaExample example);

    int updateByExample(@Param("record") TemplateSkoda record, @Param("example") TemplateSkodaExample example);

    int updateByPrimaryKeySelective(TemplateSkoda record);

    int updateByPrimaryKey(TemplateSkoda record);
}