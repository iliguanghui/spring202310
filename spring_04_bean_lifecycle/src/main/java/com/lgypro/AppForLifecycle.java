package com.lgypro;

import com.lgypro.dao.BookDao;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForLifecycle {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        context.registerShutdownHook();
        BookDao bookDao = context.getBean(BookDao.class);
        bookDao.save();
    }
}
