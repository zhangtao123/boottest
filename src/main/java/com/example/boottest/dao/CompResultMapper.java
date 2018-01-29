package com.example.boottest.dao;

import com.example.boottest.entity.CompResult;
import com.example.boottest.entity.CompResultExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CompResultMapper {
    long countByExample(CompResultExample example);

    int deleteByExample(CompResultExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CompResult record);

    int insertSelective(CompResult record);

    List<CompResult> selectByExample(CompResultExample example);

    CompResult selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CompResult record, @Param("example") CompResultExample example);

    int updateByExample(@Param("record") CompResult record, @Param("example") CompResultExample example);

    int updateByPrimaryKeySelective(CompResult record);

    int updateByPrimaryKey(CompResult record);
}