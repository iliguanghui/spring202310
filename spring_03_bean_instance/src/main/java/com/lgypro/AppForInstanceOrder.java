package com.lgypro;

import com.lgypro.dao.BookDao;
import com.lgypro.dao.OrderDao;
import com.lgypro.factory.OrderDaoFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForInstanceOrder {
    public static void main(String[] args) {
        OrderDao orderDao = OrderDaoFactory.getOrderDao();
        orderDao.save();
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        orderDao = context.getBean(OrderDao.class);
        orderDao.save();
    }
}
