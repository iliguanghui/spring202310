package com.lgypro.service.impl;

import com.lgypro.dao.BookDao;
import com.lgypro.dao.UserDao;
import com.lgypro.service.BookService;

public class BookServiceImpl implements BookService {
    private BookDao bookDao;
    private UserDao userDao;


    public BookServiceImpl(BookDao bookDao, UserDao userDao) {
        this.bookDao = bookDao;
        this.userDao = userDao;
    }

    @Override
    public void save() {
        System.out.println("book service save ...");
        bookDao.save();
        userDao.save();
    }
}
