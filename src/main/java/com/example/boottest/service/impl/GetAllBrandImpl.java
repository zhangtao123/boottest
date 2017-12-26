package com.example.boottest.service.impl;

import com.example.boottest.dao.BrandDao;
import com.example.boottest.entity.Brand;
import com.example.boottest.entity.BrandQuery;
import com.example.boottest.service.GetAllBrand;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("getAllBrand")
public class GetAllBrandImpl implements GetAllBrand {
    @Resource
    private BrandDao brandDao;
    @Override
    public List<Brand> getAll(){
        BrandQuery brandQuery=new BrandQuery();
        return  brandDao.selectBrandListByQuery(brandQuery);
    }
}