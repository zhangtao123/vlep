package com.anji.allways.dao;

import com.anji.allways.entity.OrderContent;
import java.util.List;

public interface OrderContentMapper {
    int deleteByPrimaryKey(Long id);

    int insert(OrderContent record);

    OrderContent selectByPrimaryKey(Long id);

    List<OrderContent> selectAll();

    int updateByPrimaryKey(OrderContent record);
}