package com.lgypro.dao.impl;

import com.lgypro.dao.BookDao;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {

    @Override
    public void update() {
        System.out.println("book dao save...");
    }

    @Override
    public int select() {
        System.out.println("book dao select ...");
        return 100;
    }
}
