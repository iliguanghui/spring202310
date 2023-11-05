package com.lgypro;

import com.lgypro.config.SpringConfig;
import com.lgypro.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookDao = context.getBean(BookDao.class);
        String name = bookDao.findName(100);
        System.out.println(name);
    }
}
