package com.lgypro.dao.impl;

import com.lgypro.dao.BookDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {

    @Value("${jdbc.url}")
    private String jdbcUrl;

    @Override
    public void save() {
        System.out.println("book dao save ..." + jdbcUrl);
    }
}
