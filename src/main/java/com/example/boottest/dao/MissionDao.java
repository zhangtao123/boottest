package com.example.boottest.dao;

import com.example.boottest.entity.Mission;

import java.util.List;

public interface MissionDao {
    int deleteByPrimaryKey(Long id);

    int insert(Mission record);

    int insertSelective(Mission record);

    Mission selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Mission record);

    int updateByPrimaryKey(Mission record);

    List<Mission> selectAllMissions();
}