package com.example.boottest.dao;

import com.example.boottest.entity.SysCode;
import com.example.boottest.entity.SysCodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysCodeMapper {
    long countByExample(SysCodeExample example);

    int deleteByExample(SysCodeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysCode record);

    int insertSelective(SysCode record);

    List<SysCode> selectByExample(SysCodeExample example);

    SysCode selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysCode record, @Param("example") SysCodeExample example);

    int updateByExample(@Param("record") SysCode record, @Param("example") SysCodeExample example);

    int updateByPrimaryKeySelective(SysCode record);

    int updateByPrimaryKey(SysCode record);
}