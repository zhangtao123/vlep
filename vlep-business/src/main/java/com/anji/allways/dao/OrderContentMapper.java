package com.anji.allways.dao;

import com.anji.allways.entity.OrderContent;

public interface OrderContentMapper {
    int deleteByPrimaryKey(Long id);

    int insert(OrderContent record);

    int insertSelective(OrderContent record);

    OrderContent selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OrderContent record);

    int updateByPrimaryKey(OrderContent record);
}