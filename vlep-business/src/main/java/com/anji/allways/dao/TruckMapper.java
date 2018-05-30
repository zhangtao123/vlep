package com.anji.allways.dao;

import com.anji.allways.entity.Truck;
import java.util.List;

public interface TruckMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Truck record);

    Truck selectByPrimaryKey(Long id);

    List<Truck> selectAll();

    int updateByPrimaryKey(Truck record);
}