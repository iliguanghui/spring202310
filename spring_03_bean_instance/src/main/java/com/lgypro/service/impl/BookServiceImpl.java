package com.lgypro.service.impl;

import com.lgypro.dao.BookDao;
import com.lgypro.service.BookService;

public class BookServiceImpl implements BookService {
    private BookDao bookDao;

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public void save() {
        System.out.println("book service save ...");
        bookDao.save();
    }
}
