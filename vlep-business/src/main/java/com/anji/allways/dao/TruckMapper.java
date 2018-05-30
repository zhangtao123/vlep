package com.anji.allways.dao;

import com.anji.allways.entity.Truck;

public interface TruckMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Truck record);

    int insertSelective(Truck record);

    Truck selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Truck record);

    int updateByPrimaryKey(Truck record);
}