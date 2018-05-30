package com.anji.allways.dao;

import com.anji.allways.entity.Supplier;
import java.util.List;

public interface SupplierMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Supplier record);

    Supplier selectByPrimaryKey(Long id);

    List<Supplier> selectAll();

    int updateByPrimaryKey(Supplier record);
}