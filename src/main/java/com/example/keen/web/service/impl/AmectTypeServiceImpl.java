package com.example.keen.web.service.impl;

import com.example.keen.web.db.dao.TbAmectTypeDao;
import com.example.keen.web.db.pojo.TbAmectType;
import com.example.keen.web.service.AmectTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class AmectTypeServiceImpl implements AmectTypeService {
    @Autowired
    private TbAmectTypeDao amectTypeDao;

    @Override
    public ArrayList<TbAmectType> searchAllAmectType() {
        ArrayList<TbAmectType> list = amectTypeDao.searchAllAmectType();
        return list;
    }
}