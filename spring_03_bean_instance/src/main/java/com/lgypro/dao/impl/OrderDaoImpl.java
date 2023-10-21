package com.lgypro.dao.impl;

import com.lgypro.dao.OrderDao;

public class OrderDaoImpl implements OrderDao {
    @Override
    public void save() {
        System.out.println("order dao save ...");
    }
}
