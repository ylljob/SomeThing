package com.yll.service;

import com.yll.domain.Items;

public interface ItemsService {
    /**
     * 根据id查询
     */
    Items findById(int id);
}
