package com.anji.allways.dao;

import com.anji.allways.entity.Dealer;
import java.util.List;

public interface DealerMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Dealer record);

    Dealer selectByPrimaryKey(Long id);

    List<Dealer> selectAll();

    int updateByPrimaryKey(Dealer record);
}