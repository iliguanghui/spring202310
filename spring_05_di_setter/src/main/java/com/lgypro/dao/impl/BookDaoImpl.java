package com.lgypro.dao.impl;

import com.lgypro.dao.BookDao;

public class BookDaoImpl implements BookDao {
    private int connectionNumber;
    private String databaseName;

    public void setConnectionNumber(int connectionNumber) {
        this.connectionNumber = connectionNumber;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    @Override
    public void save() {
        System.out.println("book dao save ..." + "connectionNumber=" + connectionNumber + ", databaseName=" + databaseName);
    }
}
