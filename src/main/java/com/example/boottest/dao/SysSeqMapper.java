package com.example.boottest.dao;

import com.example.boottest.entity.SysSeq;
import com.example.boottest.entity.SysSeqExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysSeqMapper {
    long countByExample(SysSeqExample example);

    int deleteByExample(SysSeqExample example);

    int deleteByPrimaryKey(String seqName);

    int insert(SysSeq record);

    int insertSelective(SysSeq record);

    List<SysSeq> selectByExample(SysSeqExample example);

    SysSeq selectByPrimaryKey(String seqName);

    int updateByExampleSelective(@Param("record") SysSeq record, @Param("example") SysSeqExample example);

    int updateByExample(@Param("record") SysSeq record, @Param("example") SysSeqExample example);

    int updateByPrimaryKeySelective(SysSeq record);

    int updateByPrimaryKey(SysSeq record);
}