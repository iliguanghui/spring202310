package com.lgypro.factory;

import com.lgypro.dao.OrderDao;
import com.lgypro.dao.impl.OrderDaoImpl;

public class OrderDaoFactory {
    public static OrderDao getOrderDao() {
        System.out.println("create order dao with static factory method");
        return new OrderDaoImpl();
    }
}
