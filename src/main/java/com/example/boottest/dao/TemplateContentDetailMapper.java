package com.example.boottest.dao;

import com.example.boottest.entity.TemplateContentDetail;
import com.example.boottest.entity.TemplateContentDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TemplateContentDetailMapper {
    long countByExample(TemplateContentDetailExample example);

    int deleteByExample(TemplateContentDetailExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TemplateContentDetail record);

    int insertSelective(TemplateContentDetail record);

    List<TemplateContentDetail> selectByExample(TemplateContentDetailExample example);

    TemplateContentDetail selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TemplateContentDetail record, @Param("example") TemplateContentDetailExample example);

    int updateByExample(@Param("record") TemplateContentDetail record, @Param("example") TemplateContentDetailExample example);

    int updateByPrimaryKeySelective(TemplateContentDetail record);

    int updateByPrimaryKey(TemplateContentDetail record);
}