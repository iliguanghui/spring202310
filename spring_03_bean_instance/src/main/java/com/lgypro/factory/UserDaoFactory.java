package com.lgypro.factory;

import com.lgypro.dao.UserDao;
import com.lgypro.dao.impl.UserDaoImpl;

public class UserDaoFactory {
    public UserDao getUserDao() {
        System.out.println("create user dao with instance factory method");
        return new UserDaoImpl();
    }
}
