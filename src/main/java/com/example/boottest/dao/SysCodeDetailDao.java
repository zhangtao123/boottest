package com.example.boottest.dao;

import com.example.boottest.entity.SysCodeDetail;

public interface SysCodeDetailDao {
    int deleteByPrimaryKey(Long id);

    int insert(SysCodeDetail record);

    int insertSelective(SysCodeDetail record);

    SysCodeDetail selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysCodeDetail record);

    int updateByPrimaryKey(SysCodeDetail record);
}