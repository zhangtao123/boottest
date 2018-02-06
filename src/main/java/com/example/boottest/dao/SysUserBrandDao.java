package com.example.boottest.dao;

import com.example.boottest.entity.SysUserBrand;

public interface SysUserBrandDao {
    int deleteByPrimaryKey(Long id);

    int insert(SysUserBrand record);

    int insertSelective(SysUserBrand record);

    SysUserBrand selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysUserBrand record);

    int updateByPrimaryKey(SysUserBrand record);
}