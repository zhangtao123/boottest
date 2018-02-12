package com.example.boottest.dao;

import com.example.boottest.entity.Dealer;

import java.util.List;

public interface DealerDao {
    int deleteByPrimaryKey(Long id);

    int insert(Dealer record);

    int insertSelective(Dealer record);

    Dealer selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Dealer record);

    int updateByPrimaryKey(Dealer record);

    List<Dealer> selectAllDealers();
}