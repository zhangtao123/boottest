package com.example.boottest.dao;

import com.example.boottest.entity.Department;

public interface DepartmentMapper {
    int insert(Department record);

    int insertSelective(Department record);

    int update(Department record);
}