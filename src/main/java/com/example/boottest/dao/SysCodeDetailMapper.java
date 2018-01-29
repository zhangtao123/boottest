package com.example.boottest.dao;

import com.example.boottest.entity.SysCodeDetail;
import com.example.boottest.entity.SysCodeDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysCodeDetailMapper {
    long countByExample(SysCodeDetailExample example);

    int deleteByExample(SysCodeDetailExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysCodeDetail record);

    int insertSelective(SysCodeDetail record);

    List<SysCodeDetail> selectByExample(SysCodeDetailExample example);

    SysCodeDetail selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysCodeDetail record, @Param("example") SysCodeDetailExample example);

    int updateByExample(@Param("record") SysCodeDetail record, @Param("example") SysCodeDetailExample example);

    int updateByPrimaryKeySelective(SysCodeDetail record);

    int updateByPrimaryKey(SysCodeDetail record);
}