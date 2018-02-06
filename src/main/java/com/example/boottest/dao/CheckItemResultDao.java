package com.example.boottest.dao;

import com.example.boottest.entity.CheckItemResult;

public interface CheckItemResultDao {
    int deleteByPrimaryKey(Long id);

    int insert(CheckItemResult record);

    int insertSelective(CheckItemResult record);

    CheckItemResult selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CheckItemResult record);

    int updateByPrimaryKey(CheckItemResult record);
}