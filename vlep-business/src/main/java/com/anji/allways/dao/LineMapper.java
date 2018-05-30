package com.anji.allways.dao;

import com.anji.allways.entity.Line;
import java.util.List;

public interface LineMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Line record);

    Line selectByPrimaryKey(Long id);

    List<Line> selectAll();

    int updateByPrimaryKey(Line record);
}