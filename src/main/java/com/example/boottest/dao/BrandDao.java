package com.example.boottest.dao;

import com.example.boottest.entity.Brand;
import com.example.boottest.entity.BrandQuery;

import java.util.List;

public interface BrandDao {
    // 查询结果集
    List<Brand> selectBrandListByQuery(BrandQuery brandQuery);

    // 查询总条数
    Integer selectCount(BrandQuery brandQuery);

    // 通过ID查询品牌
    Brand selectBrandById(Long id);

    // 修改
    void updateBrandById(Brand brand);

    // 删除
    void deletes(Long[] ids);// List<Long> ids
}
