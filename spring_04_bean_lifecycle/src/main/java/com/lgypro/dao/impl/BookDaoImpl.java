package com.lgypro.dao.impl;

import com.lgypro.dao.BookDao;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BookDaoImpl implements BookDao, InitializingBean, DisposableBean {

    @Override
    public void save() {
        System.out.println("book dao save ...");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("after properties set");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy");
    }
}
