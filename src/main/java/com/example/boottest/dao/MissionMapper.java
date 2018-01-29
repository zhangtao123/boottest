package com.example.boottest.dao;

import com.example.boottest.entity.Mission;
import com.example.boottest.entity.MissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MissionMapper {
    long countByExample(MissionExample example);

    int deleteByExample(MissionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Mission record);

    int insertSelective(Mission record);

    List<Mission> selectByExample(MissionExample example);

    Mission selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Mission record, @Param("example") MissionExample example);

    int updateByExample(@Param("record") Mission record, @Param("example") MissionExample example);

    int updateByPrimaryKeySelective(Mission record);

    int updateByPrimaryKey(Mission record);
}