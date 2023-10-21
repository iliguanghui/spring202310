package com.lgypro.dao.impl;

import com.lgypro.dao.BookDao;

public class BookDaoImpl implements BookDao {
    private int connectionNumber;
    private String databaseName;

    public BookDaoImpl(int connectionNumber, String databaseName) {
        this.connectionNumber = connectionNumber;
        this.databaseName = databaseName;
    }

    @Override
    public void save() {
        System.out.println("book dao save ..." + "connectionNumber=" + connectionNumber + ", databaseName=" + databaseName);
    }
}
