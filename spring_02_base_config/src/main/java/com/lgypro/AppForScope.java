package com.lgypro;

import com.lgypro.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForScope {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookDao bookDao = context.getBean(BookDao.class);
        BookDao bookDao2 = context.getBean(BookDao.class);
        BookDao bookDao3 = context.getBean(BookDao.class);
        System.out.println(bookDao);
        System.out.println(bookDao2);
        System.out.println(bookDao3);
    }
}
