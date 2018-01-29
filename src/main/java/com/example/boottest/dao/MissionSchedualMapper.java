package com.example.boottest.dao;

import com.example.boottest.entity.MissionSchedual;
import com.example.boottest.entity.MissionSchedualExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MissionSchedualMapper {
    long countByExample(MissionSchedualExample example);

    int deleteByExample(MissionSchedualExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MissionSchedual record);

    int insertSelective(MissionSchedual record);

    List<MissionSchedual> selectByExample(MissionSchedualExample example);

    MissionSchedual selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MissionSchedual record, @Param("example") MissionSchedualExample example);

    int updateByExample(@Param("record") MissionSchedual record, @Param("example") MissionSchedualExample example);

    int updateByPrimaryKeySelective(MissionSchedual record);

    int updateByPrimaryKey(MissionSchedual record);
}