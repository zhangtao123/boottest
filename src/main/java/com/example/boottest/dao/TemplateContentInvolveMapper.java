package com.example.boottest.dao;

import com.example.boottest.entity.TemplateContentInvolve;
import com.example.boottest.entity.TemplateContentInvolveExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TemplateContentInvolveMapper {
    long countByExample(TemplateContentInvolveExample example);

    int deleteByExample(TemplateContentInvolveExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TemplateContentInvolve record);

    int insertSelective(TemplateContentInvolve record);

    List<TemplateContentInvolve> selectByExample(TemplateContentInvolveExample example);

    TemplateContentInvolve selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TemplateContentInvolve record, @Param("example") TemplateContentInvolveExample example);

    int updateByExample(@Param("record") TemplateContentInvolve record, @Param("example") TemplateContentInvolveExample example);

    int updateByPrimaryKeySelective(TemplateContentInvolve record);

    int updateByPrimaryKey(TemplateContentInvolve record);
}