package com.example.boottest.dao;

import com.example.boottest.entity.DealerRegion;

public interface DealerRegionDao {
    int deleteByPrimaryKey(Long id);

    int insert(DealerRegion record);

    int insertSelective(DealerRegion record);

    DealerRegion selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DealerRegion record);

    int updateByPrimaryKey(DealerRegion record);
}