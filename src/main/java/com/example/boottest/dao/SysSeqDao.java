package com.example.boottest.dao;

import com.example.boottest.entity.SysSeq;

public interface SysSeqDao {
    int deleteByPrimaryKey(String seqName);

    int insert(SysSeq record);

    int insertSelective(SysSeq record);

    SysSeq selectByPrimaryKey(String seqName);

    int updateByPrimaryKeySelective(SysSeq record);

    int updateByPrimaryKey(SysSeq record);
}