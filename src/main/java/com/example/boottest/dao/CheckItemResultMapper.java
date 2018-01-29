package com.example.boottest.dao;

import com.example.boottest.entity.CheckItemResult;
import com.example.boottest.entity.CheckItemResultExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CheckItemResultMapper {
    long countByExample(CheckItemResultExample example);

    int deleteByExample(CheckItemResultExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CheckItemResult record);

    int insertSelective(CheckItemResult record);

    List<CheckItemResult> selectByExample(CheckItemResultExample example);

    CheckItemResult selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CheckItemResult record, @Param("example") CheckItemResultExample example);

    int updateByExample(@Param("record") CheckItemResult record, @Param("example") CheckItemResultExample example);

    int updateByPrimaryKeySelective(CheckItemResult record);

    int updateByPrimaryKey(CheckItemResult record);
}