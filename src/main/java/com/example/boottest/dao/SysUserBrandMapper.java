package com.example.boottest.dao;

import com.example.boottest.entity.SysUserBrand;
import com.example.boottest.entity.SysUserBrandExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysUserBrandMapper {
    long countByExample(SysUserBrandExample example);

    int deleteByExample(SysUserBrandExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysUserBrand record);

    int insertSelective(SysUserBrand record);

    List<SysUserBrand> selectByExample(SysUserBrandExample example);

    SysUserBrand selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysUserBrand record, @Param("example") SysUserBrandExample example);

    int updateByExample(@Param("record") SysUserBrand record, @Param("example") SysUserBrandExample example);

    int updateByPrimaryKeySelective(SysUserBrand record);

    int updateByPrimaryKey(SysUserBrand record);
}