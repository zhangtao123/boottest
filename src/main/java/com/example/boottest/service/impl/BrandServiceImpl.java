package com.example.boottest.service.impl;

import com.example.boottest.dao.BrandMapper;
import com.example.boottest.entity.Brand;
import com.example.boottest.entity.BrandQuery;
import com.example.boottest.service.BrandService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service("brandService")
public class BrandServiceImpl implements BrandService {
    @Resource
    private BrandMapper brandMapper;

    @Override
    @Transactional(readOnly = true)
    public List<Brand> getAll() {
        BrandQuery brandQuery = new BrandQuery();
        return brandMapper.selectByExample(brandQuery);
    }
}