package com.example.boottest.dao;

import com.example.boottest.entity.CheckDetailResult;

public interface CheckDetailResultDao {
    int deleteByPrimaryKey(Long id);

    int insert(CheckDetailResult record);

    int insertSelective(CheckDetailResult record);

    CheckDetailResult selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CheckDetailResult record);

    int updateByPrimaryKey(CheckDetailResult record);
}