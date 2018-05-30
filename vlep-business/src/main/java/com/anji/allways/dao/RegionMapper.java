package com.anji.allways.dao;

import com.anji.allways.entity.Region;
import java.util.List;

public interface RegionMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Region record);

    Region selectByPrimaryKey(Long id);

    List<Region> selectAll();

    int updateByPrimaryKey(Region record);
}