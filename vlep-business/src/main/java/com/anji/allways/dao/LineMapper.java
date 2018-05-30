package com.anji.allways.dao;

import com.anji.allways.entity.Line;

public interface LineMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Line record);

    int insertSelective(Line record);

    Line selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Line record);

    int updateByPrimaryKey(Line record);
}