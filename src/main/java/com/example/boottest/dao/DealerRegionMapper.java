package com.example.boottest.dao;

import com.example.boottest.entity.DealerRegion;
import com.example.boottest.entity.DealerRegionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DealerRegionMapper {
    long countByExample(DealerRegionExample example);

    int deleteByExample(DealerRegionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(DealerRegion record);

    int insertSelective(DealerRegion record);

    List<DealerRegion> selectByExample(DealerRegionExample example);

    DealerRegion selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") DealerRegion record, @Param("example") DealerRegionExample example);

    int updateByExample(@Param("record") DealerRegion record, @Param("example") DealerRegionExample example);

    int updateByPrimaryKeySelective(DealerRegion record);

    int updateByPrimaryKey(DealerRegion record);
}