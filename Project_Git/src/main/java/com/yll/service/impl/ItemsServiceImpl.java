package com.yll.service.impl;

import com.yll.dao.ItemsDao;
import com.yll.domain.Items;
import com.yll.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemsServiceImpl implements ItemsService{

    @Autowired
    private ItemsDao itemsDao;

    /**
     * 根据id查询
     * @param id
     * @return
     */
    @Override
    public Items findById(int id) {
        return itemsDao.findById(id);
    }
}
