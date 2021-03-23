package com.yll.dao;

import com.yll.domain.Items;

public interface ItemsDao {
    /**
     * 根据id查询
     */
    Items findById(int id);
}
