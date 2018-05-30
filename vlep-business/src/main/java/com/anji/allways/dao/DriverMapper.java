package com.anji.allways.dao;

import com.anji.allways.entity.Driver;

public interface DriverMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Driver record);

    int insertSelective(Driver record);

    Driver selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Driver record);

    int updateByPrimaryKey(Driver record);
}