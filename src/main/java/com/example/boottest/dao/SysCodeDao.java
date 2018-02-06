package com.example.boottest.dao;

import com.example.boottest.entity.SysCode;

public interface SysCodeDao {
    int deleteByPrimaryKey(Long id);

    int insert(SysCode record);

    int insertSelective(SysCode record);

    SysCode selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysCode record);

    int updateByPrimaryKey(SysCode record);
}