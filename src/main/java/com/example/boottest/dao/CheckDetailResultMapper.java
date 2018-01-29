package com.example.boottest.dao;

import com.example.boottest.entity.CheckDetailResult;
import com.example.boottest.entity.CheckDetailResultExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CheckDetailResultMapper {
    long countByExample(CheckDetailResultExample example);

    int deleteByExample(CheckDetailResultExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CheckDetailResult record);

    int insertSelective(CheckDetailResult record);

    List<CheckDetailResult> selectByExample(CheckDetailResultExample example);

    CheckDetailResult selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CheckDetailResult record, @Param("example") CheckDetailResultExample example);

    int updateByExample(@Param("record") CheckDetailResult record, @Param("example") CheckDetailResultExample example);

    int updateByPrimaryKeySelective(CheckDetailResult record);

    int updateByPrimaryKey(CheckDetailResult record);
}