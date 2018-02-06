package com.example.boottest.dao;

import com.example.boottest.entity.MissionSchedual;

public interface MissionSchedualDao {
    int deleteByPrimaryKey(Long id);

    int insert(MissionSchedual record);

    int insertSelective(MissionSchedual record);

    MissionSchedual selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MissionSchedual record);

    int updateByPrimaryKey(MissionSchedual record);
}