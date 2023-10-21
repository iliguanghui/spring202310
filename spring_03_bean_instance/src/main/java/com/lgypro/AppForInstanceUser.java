package com.lgypro;

import com.lgypro.dao.OrderDao;
import com.lgypro.dao.UserDao;
import com.lgypro.factory.UserDaoFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForInstanceUser {
    public static void main(String[] args) {
        UserDaoFactory userDaoFactory = new UserDaoFactory();
        UserDao userDao = userDaoFactory.getUserDao();
        userDao.save();

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao2 = (UserDao) context.getBean("userDao2");
        userDao2.save();

        userDao = context.getBean(UserDao.class);
        userDao.save();

    }
}
