package com.anji.allways.dao;

import com.anji.allways.entity.Driver;
import java.util.List;

public interface DriverMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Driver record);

    Driver selectByPrimaryKey(Long id);

    List<Driver> selectAll();

    int updateByPrimaryKey(Driver record);
}