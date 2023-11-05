package com.lgypro.dao.impl;

import com.lgypro.dao.BookDao;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public class BookDaoImpl implements BookDao {

    @Override
    public void save() {
        System.out.println("now: " + new Date());
        System.out.println("book dao save...");
    }

    @Override
    public void update() {
        System.out.println("book dao update...");
    }
}
