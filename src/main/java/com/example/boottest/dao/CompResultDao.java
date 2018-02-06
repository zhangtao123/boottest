package com.example.boottest.dao;

import com.example.boottest.entity.CompResult;

public interface CompResultDao {
    int deleteByPrimaryKey(Long id);

    int insert(CompResult record);

    int insertSelective(CompResult record);

    CompResult selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CompResult record);

    int updateByPrimaryKey(CompResult record);
}