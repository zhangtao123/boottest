package com.example.boottest.dao;

import com.example.boottest.entity.Department;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;
import java.util.List;

public interface DepartmentMapper {
    int insert(Department record);

    int insertSelective(Department record);

    int update(Department record);

    List<Department> selectDepartment(@Param("idList")ArrayList idList);
}